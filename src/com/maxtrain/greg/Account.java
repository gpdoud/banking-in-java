package com.maxtrain.greg;

public class Account {

	private static int nextId = 1;
	private int id;
	private String description;
	private double balance;
	
	public int getId() {
		return this.id;
	}
	private void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account(String description) {
		//this.id = Account.nextId++;
		this.setId(Account.nextId++);
		this.setDescription(description);
		this.setBalance(0);
	}
	public Account() {
		this("New Account");
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			return false;
		}
		this.setBalance(this.getBalance() + amount);
		return true;
	}
	public boolean withdraw(double amount) {
		if(amount <= 0) {
			return false;
		}
		if(amount > this.getBalance()) {
			return false;
		}
		this.setBalance(this.getBalance() - amount);
		return true;
	}
	
	public boolean transfer(double amount, Account toAccount) {
		var withdrawOk = this.withdraw(amount);
		if(withdrawOk) {
			toAccount.deposit(amount);
			return true;
		}
		return false;
	}
	
}
