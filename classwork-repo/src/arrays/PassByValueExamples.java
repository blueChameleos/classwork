package arrays;

import java.util.Arrays;

public class PassByValueExamples {

	public static void main(String[] args) {
		String s = "Hello";
		Person p  = new Person("Random","Dude",Borough.NY_BOROUGHS[0]);
		int x = 5;
		int[] array = {1,2,3};
		changeEverything(s,x,array);
		test2(p);
		test3(array);
		System.out.println("p is now " + p + ", array is now " + Arrays.toString(array));
	}
	
	private static void test1(Person p, int x, int[] arr) {
		String name = p.getFirstName();
		name = "Original";
	}
	
	private static void test2(Person p) {
		p.setFirstName("Original");
	}
	
	private static void test3(int[] array) {
		array[0] = 999;
		array[1] = 666;
	}

	private static void changeEverything(String s, int x, int[] array) {
		s = "Goodbye";
		x = - 5;
		array = new int[2];
		array[1] = 1;
		array[0] = 0;
	}

}
