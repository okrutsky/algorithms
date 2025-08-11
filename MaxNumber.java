package Algorithms;

public class MaxNumber {
		
	public static void Main(String[] args) {
		
		int []arr = {1,2,3,4,5};
		int max = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max number is: " + max);
	}
}
