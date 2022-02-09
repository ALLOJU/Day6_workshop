package com.bridgelabz.day6.workshop;

class SavingsAccount {

	private static double annualInterestRate=0.0f;
	
	private double savingsBalance=0.0f;
	
	

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}
	
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	public double getMonthlyInterest() {
		return monthlyInterest;
	}
	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	double monthlyInterest;
	
	public void calculateMonthlyInterest() {
		
		savingsBalance+=(savingsBalance*annualInterestRate)/12;
	}
	 public static void modifyInterestRate(double newInterestRate){
	        // check for negative interest rates
	        if(newInterestRate >= 0.0f)
	            annualInterestRate = newInterestRate;
	        else
	            throw new IllegalArgumentException("interest rate must be >= 0.0f");
}
}
class SavingsAccountTest{
	
	public static void main(String[] args) {
		
		 //Instantiate 2 saving account objects saver1 and saver2
		SavingsAccount saver1,saver2;
		saver1 = new SavingsAccount(2000.0);
        saver2= new SavingsAccount(3000.0);
        
      //Set the annual interest rate to 4%=0.04
        SavingsAccount.modifyInterestRate(0.04);
        
      //Calculate monthly interest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
		
        //Print out the new balances for both savers
        System.out.println("This month:\nSaver 1 balance= "+ saver1.getSavingsBalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());
        
        //Set the annual interest rate to 5%=0.04
        SavingsAccount.modifyInterestRate(0.05);
        
      //Calculate next month interest 
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
		
        //Print out the new balances for both savers
        System.out.println("Next month:\nSaver 1 balance= "+ saver1.getSavingsBalance());
        System.out.println("Saver 2 balance= "+ saver2.getSavingsBalance());

		
		
	}
}
