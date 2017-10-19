package arrays;

public class ObjectMain {

	public ObjectMain() {
		Person[] people = new Person[120];
		populate(people);
		//people[0] = new Thing("your mom");
		Person[] group = selectGroup(people, 120);
		for(Person p : group) {
			p.mingle(people);
			System.out.println(p);
			p.stateYourFriends();
		}
		analyzeCommonalities(people, group);
	}
	
	//returns the number of items that are the same in both arrays
	//and in the same location
	//assume that array1 and array2 
	private int countCommonalities(Object[] array1, Object[] array2) {
		int count = 0;
		for(int i = 0; i < array1.length; i++) {
			if(array1[i] == array2[i]){
				count++;
			}
		}
		return count;
	}

	private void analyzeCommonalities(Person[] people, Person[] group) {
		double averageCommonality = 0;
		double trials = 500;
		for(int i = 0; i < trials; i++) {
			group = selectGroup(people, people.length);
			averageCommonality += countCommonalities(people, group);
		}
		averageCommonality = averageCommonality/trials;
		System.out.println("After " + (int)(trials) + " trials, shuffling " + people.length + " people, on average, " + averageCommonality + " people end up in the same position where they started.");
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
	
	public Person[] selectGroup(Person[] population, int length) {
		Person[] group = new Person[length];
		for(int i = 0; i < length; i++) {
			Person p = randomPerson(population);
			while(alreadyContains(group, p)) {
				p = randomPerson(population);
			}
			group[i] = p;
		}
		return group;
	}
	
	public boolean alreadyContains(Person[] population, Person p) {
		for(int i = 0; i < population.length; i++) {
			if(population[i] == p) {
				return true;
			}
		}
		return false;
	}
	
	private Person randomPerson(Person[] population) {
		int index = (int)(Math.random()*population.length);
		return population[index];
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
