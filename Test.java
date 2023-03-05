package Array;

public class Test {

	public static void main(String[] args) {
		
	 int [] arr = {1, 2, 3, 4,5 ,0 ,-1,-55,-7};
	 
	 for(int i = 1; i<arr.length-1; i++) {
		 
		 if(arr[i-1] < arr[i] && arr[i] > arr[i+1] ) {
			 System.out.println(arr[i]);
			 break;
		 }
	 }
		
	}
}
