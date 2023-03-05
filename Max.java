package Array;

public class Max {

	public static void main(String[] args) {
		
		int ans = 0;
		int[] jo = { 4 , 6, 7, 9, 10 };
		
		for(int i = 0; i<jo.length; i++) {
			
			if(jo[i] > ans) {
				ans = jo[i];
			}
			
		}
		System.out.println(ans);
	}
}
