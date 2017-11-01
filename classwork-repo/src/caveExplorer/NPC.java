package caveExplorer;

public class NPC {
	
	private CaveRoom[][] floor;
	private int currentRow;
	private int currentCol;
	private NPCRoom currentRoom;
	
	private boolean active;
	private String activeDescription;
	private String inactiveDescription;
	
	public NPC() {
		this.floor = CaveExplorer.caves;
		this.activeDescription = "There is a person standing in the room, waiting to talk to you. Press 'e' to talk.";
		this.inactiveDescription = "The person you spoke to earlier is standing here";
		this.currentCol = -1;
		this.currentRow = -1;
		currentRoom = null;
		active = true;
	}

	public boolean isActive() {
		return active;
	}

	public void interact() {
		CaveExplorer.print("Let's interact! Type 'bye' to stop.");
		String s = CaveExplorer.in.nextLine();
		while(!s.equalsIgnoreCase("bye")) {
			CaveExplorer.print("Yeah...I don't do a whole lot.");
			s = CaveExplorer.in.nextLine();
		}
		CaveExplorer.print("Later, friend!");
		active = false;
	}

	public String getSymbol() {
		return "P";
	}

	public String getDescription() {
		return activeDescription;
	}

	public String getInactiveDescription() {
		return inactiveDescription;
	}
}
