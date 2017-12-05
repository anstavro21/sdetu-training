package basics;

public class Weather {
	public static void main (String[] args) {
		//This programm will give suggestions of what to wear based on the weather(temperature and sunCondition)
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's a pleasant. Wear shorts and t-shirts");
		}
		else if((temperature > 65) && (sunCondition != "Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear a long sleeve shirt and jeans");
			System.out.println("Wear a hat to kep the sun out of your eyes.");
		}
		else if((temperature > 50) || (sunCondition == "Overcast")) {
			System.out.println("It's a cool day. Make sure to wear warmer clothes");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater");
		}
		System.out.println("The programm is ending");
	}
}
