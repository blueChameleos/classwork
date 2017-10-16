package arrays;

import java.util.*;

public class ArraysMain {
	
	private String[] suits;
	private String[] values;
	private String[] deck;
	
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
		
		deck = new String[52];
		buildDeck();
		
		System.out.println(Arrays.toString(deck));
	}
	
	private void buildDeck() {
		
	}
	
	private void swap(int[] array, int i, int j) {
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
