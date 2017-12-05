package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle = "Lord of the Rings";
		String wordChoice = "Ring";
		
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " +wordChoice);
		}
		
		String browser = "Chrome";
		//if(browser == "chrome")
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "21343254";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.");
		
		//Print the initials plus 4 last digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(" " + SSN.substring(4));

		

	}

}
