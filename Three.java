package Oops;

public class Three {

	    public static void main(String[] args) {
	        int n = 10, t1 = 0, t2 = 1;
	        System.out.print("Fibonacci series up to " + n + ": ");
	        while (t1 <= n) {
	            System.out.print(t1 + " + ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	    }
	}


