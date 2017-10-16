package arrays;

public class ArraysMain {

	public ArraysMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * returns the result after rolling n number of dice
	 * @param n
	 * @return
	 */
	
	public int diceRoll(int n) {
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int randNum = (int)(Math.random()*6) + 1;
			result += randNum;
		}
		
		return result;
	}

}
