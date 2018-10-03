package com.rakesh.insurance;

public class SavingAccountV2  extends SavingAccount implements Insurance {

	public void getInsuranceName() {
		System.out.println("This is Insurance name");	
	}

	public void getInsurancePolicy() {
		System.out.println("This is Insurance Policy");
	}

	public void getInsuranceBenefits() {
		System.out.println("This is Insurance Benefits");

	}
	
	public void getInsuranceBenefits2() {
		System.out.println("This is Insurance Benefits VERSION2");

	}
	public static void main(String[] args)
	{
		SavingAccountV2 insuranceinformation=new SavingAccountV2();
		insuranceinformation.getInsuranceName();
		insuranceinformation.getInsurancePolicy();
		insuranceinformation.getInsuranceBenefits();
		insuranceinformation.getInsuranceBenefits2();
		
		System.out.println(insuranceinformation);
	}

}
