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
	private Hobby hobby;
	private Person[] friends;
	
	public Person(String f, String l, Borough h) {
		this.firstName = f;
		this.lastName = l;
		this.home = h;
		this.friends = new Person[3];
		hobby = hobby.randomHobby();
	}
	
	public void setInFirstPlace(Person f) {
		for(int i = friends.length - 1; i > 0; i--) {
			friends[i] = friends[i-1];
		}
		friends[0] = f;
	}
	
	public void stateYourFriends() {
		String friendsList = "My friends include ";
		for(int i = 0; i < this.friends.length - 1; i++) {
			friendsList += this.friends[i].firstName + ", ";
		}
		friendsList += "and " + this.friends[this.friends.length - 1].firstName;
		System.out.println(friendsList);
	}
	
	public void mingle(Person[] peers) {
		for(Person p: peers) {
			if(p != this) {
				setInFirstPlace(p);
			}
		}
	}
	
	public String toString() {
		return this.firstName + " " + this.lastName + " lives in " + this.home;
	}
}
