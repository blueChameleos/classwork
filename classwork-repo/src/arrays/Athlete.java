package arrays;

public class Athlete extends Person{

	private int money;
	
	public Athlete(String first, String last, Borough home, int money) {
		// TODO Auto-generated constructor stub
		super(first, last, home);
		this.money = money;
	}
	
	public String toString() {
		// to call superclass methods, use super.
		return super.toString() + ". I make $" + money + "!";
	}
}
