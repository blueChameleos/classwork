package arrays2d;

public class Array2DSampler {

	private String[][] picture;
	
	public Array2DSampler() {
		String[][] picture = new String[10][20];
		printPicture(picture);
	}

	private void printPicture(String[][] pictures) {
		for(int row = 0; row < pictures.length; row++) {
			for(int col = 0; col < pictures[row].length; col++) {
				System.out.print(pictures[row][col]);
			}
			System.out.println("");
		}
		
		for(String[] row: picture) {
			for(String col: row) {
				System.out.print(col);
			}
			System.out.println("");
		}
	}

}
