package com.greatlearning.corejava;

class Account{
	String customerName;
	int accountNo;
	
	Account(String customerName, int accountNo){
		this.accountNo = accountNo;
		this.customerName = customerName;
	}
	
	void display()
	{
		System.out.println("Account Number :" + accountNo);
		System.out.println("Customer Name :" + customerName);
	}
}

class CurrentAccount extends Account{
	
	int currentBalance;
	
	CurrentAccount(String customerName, int accountNo, int currentBalance) {
		super(customerName,accountNo);
		this.currentBalance = currentBalance;
	}
	
	void display() {
		System.out.println("Account Number :" + super.accountNo);
		System.out.println("Customer Name :" + super.customerName);
		System.out.println("Current Balance :" + currentBalance);
	}
}

class AccountDetails extends CurrentAccount{
	int depositAmount, withdrawalAmount;
	
	AccountDetails(String customerName, int accountNo, int currentBalance, int depositAmount, int withdrawalAmount){
		super(customerName, accountNo, currentBalance);
		this.withdrawalAmount = withdrawalAmount;
		this.depositAmount = depositAmount;
	}
	
	void display()
	{
		System.out.println("Account Number :" + super.accountNo);
		System.out.println("Customer Name :" + super.customerName);
		System.out.println("Current Balance :" + super.currentBalance);
		System.out.println("Deposit Amount :" + depositAmount);
		System.out.println("withdrawal Amount :" + withdrawalAmount);
		
	}
}

public class InterfaceChallenge {
	
	public static void main(String args[]) {
		
		AccountDetails acnt = new AccountDetails("Hammad",111,121,10,20);
		acnt.display();
		
		
	}

}
