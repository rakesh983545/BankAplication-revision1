package com.rakesh.inheritance;

public class SavingAccount extends BankAccount {
	
	
	/*public SavingAccount(int accountNo, String accountName, String accountBalance) {
		super(accountNo, accountName, accountBalance);
		// TODO Auto-generated constructor stub
	}*/
	
	public static void main(String[] args)
	{
		BankAccount account1=new BankAccount();
		account1.withdraw(5000);
		
		System.out.println(account1);                               	
	}
	
	

}
