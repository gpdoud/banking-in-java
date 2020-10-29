package com.maxtrain.greg;

public class Savings extends Account {
	
	private double intRate = 0.01;

	public double getIntRate() {
		return intRate;
	}

	public void setIntRate(double intRate) {
		if(intRate < 0) {
			return;
		}
		this.intRate = intRate;
	}
	
	public double PayInterest(int months) {
		var interest = this.getBalance() * (this.getIntRate() / 12) * months;
		this.deposit(interest);
		return interest;
	}
	
	public Savings(String description) {
		super(description);
	}
	public Savings() {
		super();
	}

}
