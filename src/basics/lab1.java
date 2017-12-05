package basics;

public class lab1 {

	public static void main(String[] args) {
	
		System.out.println(sum(3));
	}
	
	public static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n;i++) {
			sum = sum + i;
		}
		return sum;
	}
}
