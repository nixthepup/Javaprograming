package com.zachlatta.depositandwithdrawalfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class DepositAndWithdrawalFiles {
	public static void main(String[] args) throws Exception
	{
		Scanner userInput = new Scanner(System.in);
		
		
		BufferedReader deposits = new BufferedReader(new FileReader("Deposits.txt"));
		BufferedReader withdrawals = new BufferedReader(new FileReader("Withdrawals.txt"));
		
		
		
		SavingsAccount account = new SavingsAccount(500);
		
		
		System.out.print("Enter the annual interest rate (decimal): ");
		account.setAnnualInterestRate(userInput.nextDouble());
		
		
		double deposit, withdraw;
		String depositString, withdrawString;
		int count = 1;
		
		depositString = deposits.readLine();
		withdrawString = withdrawals.readLine();
		while(depositString != null && withdrawString != null)
		{
			deposit = Double.parseDouble(depositString);
			withdraw = Double.parseDouble(withdrawString);
			
			
			System.out.println("\n-----MONTH " + count + "-----");
				
			
			System.out.printf("Deposits: $%.2f\n", deposit);  
			account.deposit(deposit);
				
			
			
			System.out.printf("Withdrawals: $%.2f\n", withdraw);
			account.withdraw(withdraw);
				
			
			System.out.printf("Interest: $%.2f\n", account.getMonthlyInterest());
			account.addMonthlyInterest();
			
			count++;
			depositString = deposits.readLine();
			withdrawString = withdrawals.readLine();
		}
		
		System.out.printf("\nEnding balance: $%.2f", account.getBalance());
		System.out.printf("\nTotal deposits: $%.2f", account.getAccumulativeDeposits());
		System.out.printf("\nTotal withdrawals: $%.2f", account.getAccumulativeWithdrawals());
		System.out.printf("\nTotal interest: $%.2f", account.getAccumulativeInterest());
		
		
		userInput.close();
		deposits.close();
		withdrawals.close();
	}
}
