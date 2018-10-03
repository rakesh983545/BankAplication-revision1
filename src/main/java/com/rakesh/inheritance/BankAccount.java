package com.rakesh.inheritance;

public class BankAccount {

	int AccountNo;
	String AccountName;
	double accountBalance;
	
	static int autoAccountNoGen;
	
	

	public BankAccount() {
		super();
	}


	public int getAccountNo() {
		return AccountNo;
	}


	public String getAccountName() {
		return AccountName;
	}


	public double getAmount() {
		return accountBalance;
	}



	public static int getAutoAccountNoGen() {
		return autoAccountNoGen;
	}



	public static void setAutoAccountNoGen(int autoAccountNoGen) {
		BankAccount.autoAccountNoGen = autoAccountNoGen;
	}



	public BankAccount(int accountNo, String accountName, double accountBalance) {
		super();
		AccountNo = accountNo;
		AccountName = accountName;
		this.accountBalance = accountBalance;
	}
	
	
	
	@Override
	public String toString() {
		return "BankAccount [AccountNo=" + AccountNo + ", AccountName=" + AccountName + ", accountBalance="
				+ accountBalance + "]";
	}


	public void deposit(double amount)
	{
	
		accountBalance+=amount;
	}
	
	public void withdraw(double amount)
	{
		accountBalance-=amount;
	}
	
	
	
}
