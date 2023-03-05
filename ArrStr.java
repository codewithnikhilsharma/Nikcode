package Array;

public class ArrStr {

	public static void main(String[] args) {
		
		String[] str = {"ab","cd","ef","gh","ij","kl","mn","op"};
		for(int i = 0; i<str.length; i++) {
			if(i %  2 != 0) {
				System.out.println(str[i]);
			}
		}
	}
}
