package arrays;

public class Borough {
	private String name;
	
	public static final Borough[] NY_BOROUGHS = {new Borough("Brooklyn"), new Borough("Queens"), new Borough("The Bronx"), new Borough("Manhattan"), new Borough("Staten Island")};
	
	public Borough(String n) {
		this.name = n;
	}
	
	public String toString() {
		return this.name;
	}
}
