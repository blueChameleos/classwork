package caveExplorer;

public class Fountain extends NPCRoom{

	public Fountain(String description) {
		super(description);
	}
	
	public void enter() {
		CaveExplorer.inventory.setHP(100);
		System.out.println("Your HP has been fully restored!");
		super.enter();
	}
}
