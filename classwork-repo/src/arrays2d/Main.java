package arrays2d;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Array2DSampler test = new Array2DSampler();
	}

	private static void changeNeighbors(int[] arr, int i) {
		arr[i]++;
		if(i - 1 >= 0) {
			arr[i - 1]--;
		}
		if(i + 1 < arr.length) {
			arr[i + 1]--;
		}
	}

}
