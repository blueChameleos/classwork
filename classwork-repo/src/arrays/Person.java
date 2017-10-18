package arrays;

public class Person {
	public static final String[] FIRST_START = {"Chr", "Am", "L", "D", "Th", "Br", "B"};
	public static final String[] FIRST_MIDDLE = {"ala", "ima", "e", "o", "anna", "ola", "a"};
	public static final String[] FIRST_END = {"na", "ck", "n", "tt", "anna", "ola", "a"};

	public static final String[] LAST_START = {"Bl", "Am", "L", "D", "Th", "Br", "B"};
	public static final String[] LAST_MIDDLE = {"an", "in", "ast", "own", "il"};
	public static final String[] LAST_END = {"strom", "son", "rack", "les", "vin", "ston", "a"};
	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String f, String l, Borough h) {
		this.firstName = f;
		this.lastName = l;
		this.home = h;
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName + " lives in " + this.home;
	}
}
