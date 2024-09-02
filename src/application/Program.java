package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		String holder = sc.next();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double limit = sc.nextDouble();
		Account acc = new Account(number, holder, initialBalance, limit);

		System.out.println();

		System.out.print("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		try {
			acc.withdraw(amount);
			System.out.println("New balance: " + acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error! ");
		}

		sc.close();
	}

}
