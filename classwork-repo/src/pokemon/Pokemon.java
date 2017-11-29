package pokemon;

public class Pokemon {
	
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public static void main(String[] args) {
		 Pokemon squirtle = new Pokemon("Squirtle", 26);
		 Pokemon bulbasaur = new Pokemon("Bulbasaur", 26);
		 squirtle.iChooseYou();
		 bulbasaur.iChooseYou();
		 System.out.println("Squirtle used Surf!");
		 squirtle.attack(bulbasaur, new Attack() {
			 
			 public void attack(Pokemon target) {
				 int hp = target.getHP();
				 target.setHP(hp - 100);
			 }
		 
		 });
		 System.out.println("Bulbasaur used Toxic!");
		 bulbasaur.attack(squirtle, new Attack() {

			public void attack(Pokemon target) {
				target.setPoisoned(true);
				System.out.println("Squirtle was badly poisoned!");
			}
			 
		 });
		 squirtle.levelUp(new Effect() {

			public void happen() {
				squirtle.setHP(100);
			}
			 
		 });
	}

	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}
	
	public void levelUp(Effect e) {
		level++;
		e.happen();
	}

	public void iChooseYou() {
		System.out.println(this.name + ", " + this.name + "!");
	}
	
	public int getHP() {
		return this.hp;
	}
	
	public void setHP(int newHP) {
		this.hp = newHP;
	}
	
	public void setPoisoned(boolean b) {
		this.poisoned = b;
	}
	
	public void lapse() {
		if(this.poisoned) {
			setHP(this.hp - 15);
		}
	}
	
	public void attack(Pokemon target, Attack attack){
		 if(Math.random() < .9){
			 attack.attack(target);
			 System.out.println("The attack hit");
		 }else{
			 System.out.println("The attack missed");
		 }
	}

}
