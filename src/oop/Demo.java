package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking ");
	}
	
	void email() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping ");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name = "Joe";
		person1.email = "joe@testemail.com";
		person1.phone = "32432131213";
		
		//abstraction
		person1.walk();
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@testemail.com";
		person2.phone = "2334231231";
		
		person2.sleep();

	}

}
