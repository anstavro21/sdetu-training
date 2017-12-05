package basics;

public class lab3 {

	public static void main(String[] args) {
		
		int[] num = {3, 0, -213, 9, 1};
		System.out.println(min(num));
		System.out.println(max(num));
		System.out.println(avg(num));

	}
	
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;			
	}
	
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;			
	}
	
	public static int avg(int[] arr) {
		int average = 0;
		for (int i = 0; i < arr.length;i++) {
			average = (average + arr[i]);
		}
		return average/arr.length;			
	}

}
