package com.rakesh.inheritance;

public class CurrentAccount extends BankAccount{
	
	
	public static void main(String[] args)
	{
		BankAccount account1=new BankAccount();
		account1.deposit(100);
		
		System.out.println(account1);	
	}

}
