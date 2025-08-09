/*
* BubbleSort Java implementation for learning purpose. 
*/
public class BubbleSort {
	
	public static void main(String[]args) {
		
	int [] arr = {5,2,10,7,4,3};
	
	for (int i=0; i <arr.length -1; i++){
		for(int j=0; j <arr.length -1 -i; j++) {
			
			if(arr[j] > arr[j+1]) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
	for (int n: arr) {
		System.out.println(n + "");
	}
	
	}
}
	
	

