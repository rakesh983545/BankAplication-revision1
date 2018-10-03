package com.rakesh.insurance;

public class CurrentAccount implements Insurance {

	public void getInsuranceName() {
		System.out.println("This is current Insurance name");

	}

	public void getInsurancePolicy() {
		System.out.println("This is current Insurance Policy");

	}

	public void getInsuranceBenefits() {
		System.out.println("This is current Insurance Benefits");
	}
	public static void main(String[] args)
	{
		CurrentAccount insuranceinformation=new CurrentAccount();
		insuranceinformation.getInsuranceName();
		insuranceinformation.getInsurancePolicy();
		insuranceinformation.getInsuranceBenefits();
		
		System.out.println(insuranceinformation);
	}

}
