package lab2;

public class StudentDatabase {

	public static void main(String[] args) {

		Student stu1 = new Student ("Tony", "349185475");
		//Student stu2 = new Student ("George", "490812745");
		
		stu1.enroll("Math");
		stu1.enroll("Physics");
		
		stu1.showCourses();
		stu1.checkBalance();
		stu1.pay(500);
		stu1.checkBalance();
		System.out.println(stu1.toString());


	}
	
}

class Student {
	
	private static int ID = 0;        // internal ID
	private String idNumber;        // ID + random 4-digit number + last 4 of SSN
	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String city;
	private String state;

	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public Student(String name, String SSN) {
		
		this.name = name;
		this.SSN = SSN;
		System.out.println("New Student: " + name + " \nSSN: " + SSN + " \nEmail: " + setEmail() + " \nID Number: " + setIdNumber());
		ID++;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	private String setEmail () {
		return name.toLowerCase() + "@uth.gr";
	}
	
	private String setIdNumber() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		random = random + min; 
		idNumber = ID + "" + random + "" + SSN.substring(5,9);
		return idNumber;
		//System.out.println("Your ID Number is: " + idNumber);
	}
	
	public void enroll(String courses) {
		this.courses = this.courses + " " + courses;
		//System.out.println("Courses: " + courses);
		balance = balance + costOfCourse;	
	}
	
	public void pay(int amount) {
		balance = balance - amount;
		System.out.println("Payment: " + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println("Courses: " + courses);
	}
	
	public String toString() {
		return "[NAME: " + name + "]" + "\n" + "[SSN: " + SSN + "]" + "\n" + "[EMAIL: " + setEmail() + "]" + "\n" + "[ID NUMBER: " + setIdNumber() + "]";
	}
	
	
	
	
	
	
}
