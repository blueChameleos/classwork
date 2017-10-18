package arrays;

public class ObjectMain {

	public ObjectMain() {
		Object[] people = new Object[12];
		populate(people);
		people[0] = new Thing("your mom");
		for(Object p : people) {
			System.out.println(p.toString());
		}
	}

	private void populate(Object[] people) {
		// TODO Auto-generated method stub
		for(int i = 0; i < people.length; i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END);
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END);
			Borough home = randomBorough();
			/*
			BIG IDEA:
			In an object array, you can have multiple data types!
			This is unique from the primitive array!
			*/
			if(Math.random() < .6) {
				int money = (int)((Math.random() * 20)+1)*10000;
				people[i] = new Athlete(firstName, lastName, home, money);
			}
			else {
				people[i] = new Person(firstName, lastName, home);
			}
		}
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		// TODO Auto-generated method stub
		return get(a) + get(b) + get(c);
	}

	private String get(String[] array) {
		return array[(int)(Math.random()*array.length)];
	}
	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	public static void main(String[] args) {
		ObjectMain obj = new ObjectMain();
	}
}
