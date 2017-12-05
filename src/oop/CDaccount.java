package oop;

public class CDaccount extends BankAccount implements IRate {
	
	String interestRate;
	
	void compound() {
		System.out.println("Compounding Interest");
	}

}
