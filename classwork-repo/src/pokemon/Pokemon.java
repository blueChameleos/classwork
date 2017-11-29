package pokemon;

public class Pokemon {
	
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void iChooseYou() {
		System.out.println(this.name + " " + this.name);
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public void setHP(int newHP) {
		this.hp = newHP;
	}

}
