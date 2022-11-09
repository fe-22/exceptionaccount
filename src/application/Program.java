package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("Informe o numero da conta");
		System.out.print("Numero:   ");
		int number = sc.nextInt();
		System.out.print("Titular:    ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo Inicial:   ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque:   ");
		double withdrawLimit = sc.nextDouble();
		
	
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Informe uma quantia a sacar?    ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("Novo Saldo: %.2f%n", acc.getBalance());
		}
		catch(BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		sc.close();
		
		
	}

}
