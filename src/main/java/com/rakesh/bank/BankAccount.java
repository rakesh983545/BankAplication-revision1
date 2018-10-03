package com.rakesh.bank;


/** this comment is for documentation based comment
 * 
 * @author rpandey2
 *@since 03-10-2018
 */

public class BankAccount {
	
  	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	{
		accountNo=++autoAccountNoGen;
	}
	
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public static int getAutoAccountNoGen() {
		return autoAccountNoGen;
	}
	public static void setAutoAccountNoGen(int autoAccountNoGen) {
		BankAccount.autoAccountNoGen = autoAccountNoGen;
	}

	public BankAccount() {
		accountNo=++autoAccountNoGen;
		accountHolderName="Unknown";
		accountBalance=0;
	}
	/**
	 * public BankAccount(int accountNo, String accountHolderName, double accountBalance) {
	 * super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	 */
		
	
	public BankAccount(String accountHolderName, double accountBalance) {
		super();
		accountNo=++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	public void withdraw(double amount)
	{
		accountBalance-=amount;
	}
	
	public void deposit(double amount)
	{
		accountBalance+=amount;
	}
	
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	public static void main(String args[])
	{
		BankAccount acc1=new BankAccount();
		BankAccount acc2=new BankAccount();
		BankAccount acc4=new BankAccount();
		BankAccount acc3=acc2;
		
		acc1.withdraw(5000);
		acc2.deposit(1000);
		
		System.out.println("Bankaccount 1"+acc1);
		System.out.println("Bankaccount 2"+acc2);
		System.out.println("Bankaccount 3"+acc3);
		System.out.println("Bankaccount 4"+acc4);
	}
	
	
}
