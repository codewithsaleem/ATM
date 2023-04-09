package com.atm;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		AtmOperationImpl op=new AtmOperationImpl();
		int atmNumber=12345;
		int atmPin=123;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine!");
		System.out.println("Enter ATM Nmber : ");
		int ATMNumber=sc.nextInt();
		System.out.println("Enter ATM Pin : ");
		int ATMPin=sc.nextInt();
		
		if((atmNumber==ATMNumber)&&(atmPin==ATMPin)) {
			while(true) {
				System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Ministatement\n 5.Exit");
				System.out.println("Enter Choice : ");
				int ch=sc.nextInt();
				if(ch==1) {
					op.viewBalance();
				}
				else if(ch==2) {
					System.out.println("Enter Amount to Withdraw ");
					double withdrawAmount=sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) {
					System.out.println("Enter Amount to Deposit : ");
				    double depositAmount=sc.nextDouble();
				    op.depositAmount(depositAmount);
				}
				else if(ch==4) {
					op.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("Collect Your ATM Card!\n Thank You For Using ATM Machine!");
					System.exit(0);
				}
				else {
					System.out.println("Please Enter Correct Choice!");
				}
			}
		}else {
			System.out.println("Incorrect ATM Number...");
			System.exit(0);
		}
	}
}
