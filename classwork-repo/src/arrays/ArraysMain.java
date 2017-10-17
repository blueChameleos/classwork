package arrays;

import java.util.*;

public class ArraysMain {
	
	private String[] suits;
	private String[] values;
	private String[] deck;
	private int[] testArray;
	
	public ArraysMain() {
		suits  = new String[4];
		
		suits[0] = "CLUBS";
		suits[1] = "HEARTS";
		suits[2] = "DIAMONDS";
		suits[3] = "SPADES";
		
		values = new String[13];
		
		for(int i = 0; i < values.length; i++) {
			values[i] = "" + (i+1);
		}
		
		values[0] = "ACE";
		values[12] = "KING";
		values[11] = "QUEEN";
		values[10] = "JACK";
		
		//deck = buildDeck();
		
		testArray = new int[10];
		populate1ToN(testArray);
		cycleThrough(testArray, 5);
		
		int[] test = {1,2,3,4,5,6,7};
		System.out.println(test);
		
		//frontToBack(testArray);
		
		
		//System.out.println(Arrays.toString(deck));
		//reverseArray(testArray);
		//subArray(testArray, 2 , 2);
	}
	
	private void cycleThrough(int[] array, int n) {
		for(int i = 0; i < n; i++) {
			frontToBack(array);
		}
	}
	
	private void frontToBack(int[] array) {
		int x  = array[0];
		
		for(int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		
		array[array.length - 1] = x;
	}
	
	private String[] buildDeck() {
		String[] deck = new String[52]; 
		
		System.out.println(deck);
		
		return deck;
	}
	
	public void reverseArray(int[] array) {
		int[] result = new int[array.length];
		
		for(int i = 0 - 1; i < array.length; i++) {
			result[array.length - (i+1)] = array[i];
		}
		
		array = result;
	}
	
	public void subArray(int[] array, int startIdx, int distance) {
		int[] subarray = new int[distance];
		
		for(int i = 0; i < distance; i++) {
			subarray[i] = array[startIdx + i];
			System.out.println(subarray[i]);
		}
	}
	
	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private void populate1ToN(int[] array) {
		for(int i  = 0; i < array.length; i++) {
			array[i] = (i + 1);
		}
	}
	
	public void shuffle(int[] array) {
		for(int i = 0; i < array.length; i++) {
			swap(array,i,(int)(Math.random()*array.length));
		}
	}

	private void countOccurences(int[] array, int lower, int upper) {
		int[] counter = new int[upper-lower+1];
		for(int value: array) {
			counter[value - lower]++;
		}
		for(int i = 0; i < counter.length; i++) {
			System.out.println("The value " + (i+lower)+ " was rolled " + counter[i] + " times.");
		}
	}

	private void populate(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = diceRoll(2);
		}	
	}
	
	private int longestConsecutiveSequence(int[] array) {
		int record = 1;
		
		for(int i = 0;  i < array.length - 1; i++) {
			int count = 0;
			int start = i;
			int end = i + 1;
			
			while(isConsecutive(array,start,end) && end < array.length) {
				count++;
				end++;
			}
			
			if(count > record) {
				record = count;
			}
		}
		
		return record;
	}
	
	private boolean isConsecutive(int[] array, int start, int end) {
		for(int i = start; i < end; i++) {
			if(array[i + 1] != array[i] + 1) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		ArraysMain sample = new ArraysMain();
		
		//1. Arrays are collections of primitives and Objects
		//SPECIAL NOTE: This is the ONLY collection of primitives
		
		//2. Size cannot be changed
		
		//3. Elements of the array are REFERENCES to objects. In
		//other words, changing an element of an array changes
		//the reference, NOT the object
		
	}
	
	/**
	 * returns the result after rolling n number of dice
	 * @param n
	 * @return
	 */
	
	public int diceRoll(int n) {
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int dieRoll = (int)(Math.random()*6) + 1;
			result += dieRoll;
		}
		
		return result;
	}
}
