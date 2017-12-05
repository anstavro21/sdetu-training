package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount("435698123" , 1000.50);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}
}
	
class BankAccount implements IInterest {
		
	private static int ID = 1000;        // internal ID
	private String accountNumber; // ID + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	
	public BankAccount(String SSN, double initDeposit) {
		
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();	
	}
	
	public void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = ID + "" + random + SSN.subSequence(0, 2);
		System.out.println("Your account number " + accountNumber);	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying Bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	@Override
	public void accrue() {
		balance = balance + (1 + rate/100);	
		showBalance();
	}
	
	public String toString() {
		return "[Name: " + name + " ]\n[AccountNumber: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance +"]";
	}
}
