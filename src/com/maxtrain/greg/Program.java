package com.maxtrain.greg;

public class Program {

	public static void main(String[] args) {

		var acct1 = new Savings("Primary savings account");
		var acct2 = new Account("Secondary account");
		
		acct1.deposit(500);
		var success = acct1.transfer(200, acct2);
		if(success) {
			System.out.println("Acct1 balance is " + acct1.getBalance());
			System.out.println("Acct2 balance is " + acct2.getBalance());
		}
		acct1.setIntRate(.12);
		acct1.PayInterest(1);
		System.out.println("Acct1 balance after interest is " + acct1.getBalance());

	}

}
