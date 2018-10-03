package com.rakesh.cust;

import com.rakesh.bank.BankAccount;
import com.rakesh.bank.CurrentAccount;
import com.rakesh.bank.SavingAccount;

public class Customer {
	
	public static void main(String args[])
	{
		BankAccount acc=null;
		//acc=new SavingAccount();
		
		acc=new CurrentAccount();
		
		acc.withdraw(5000);
		//acc.isSalaryAccount();
		//SavingAccount acc1=new SavingAccount();
		
	/*	BankAccount acc1=new BankAccount();
		BankAccount acc2=new BankAccount();
		BankAccount acc4=new BankAccount();
		BankAccount acc3=acc2;
		
		//BankAccount acc4=new BankAccount();
		
		acc1.withdraw(5000);
		acc2.deposit(1000);
		
		System.out.println("Bankaccount 1"+acc1);
		System.out.println("Bankaccount 2"+acc2);
		System.out.println("Bankaccount 3"+acc3);
		System.out.println("Bankaccount 4"+acc4);*/
	}

}
