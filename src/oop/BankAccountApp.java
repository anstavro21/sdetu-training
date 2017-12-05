package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Roger Hue";
		//With encapsulation : public API method
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSsn("2413324234");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.accountNumber = "012312432";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);
		//acc1.deposit(1500);
		//acc1.deposit(1500);
		//acc1.withdraw(2000);

		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "012312432";

		
		BankAccount acc3 = new BankAccount("Savings account", 5000);
		acc3.accountNumber = "012312432";
		
		/*
		acc3.checkBalance();
		
		//Demo for inheritance
		CDaccount cd1 = new CDaccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD account";
		System.out.println(cd1.toString());
		cd1.compound();
		*/
		
	}

}
