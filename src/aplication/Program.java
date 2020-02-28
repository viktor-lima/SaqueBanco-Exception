package aplication;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("number: ");
		int nunber = sc.nextInt();
		System.out.print("holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(nunber, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
		
			account.withdraw(amount);
			System.out.println("new balance: " + String.format("%.2f", account.getBalance()));
		
		}
		catch(DomainException e){
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Error: input nunber please!");
		}
		
		
		
		sc.close();
	}
}
