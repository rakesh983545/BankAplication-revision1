package com.rakesh.insurance;

public class SavingAccount implements Insurance {

	public void getInsuranceName() {
		System.out.println("This is Insurance name");

	}

	public void getInsurancePolicy() {
		System.out.println("This is Insurance Policy");


	}

	public void getInsuranceBenefits() {
		System.out.println("This is Insurance Benefits");

	}
		
	public static void main(String[] args)
	{
		SavingAccount insuranceinformation=new SavingAccount();
		insuranceinformation.getInsuranceName();
		insuranceinformation.getInsurancePolicy();
		insuranceinformation.getInsuranceBenefits();
		
		System.out.println(insuranceinformation);
	}
}
