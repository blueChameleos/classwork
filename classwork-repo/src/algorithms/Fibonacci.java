package algorithms;

public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.print(fibonacci(10));
	}

	public static int fibonacci(int n) {
		if(n <= 2) {
			return 1;
		}
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
}
