package practice;


interface Hello{
	// this tracking comment
	public String hey();
}

public class LogicalPros {

	public static void main(String[] args) {

		int arr[] = { 10, 0, 20, 0, 30, 0 };
		int[] arr2 = new int[arr.length - 1];

		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 0) {
				arr2[i] = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = arr2[i];
			}	
		}
	     
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == 0) {
				arr2[i] = arr[i];
				arr[i] = arr[i + 1];
				arr[i+1] = arr2[i];
			}	
		}
	     
		for (int j : arr) {
			System.out.println("value of array sorted " + j);
		}
		
		for (int l : arr2) {
			System.out.println("value of array2 sorted " + l);
		}
		
	Hello h =  ()->{
		return "hello";
	};
	
	h.hey();
	}
	
}
