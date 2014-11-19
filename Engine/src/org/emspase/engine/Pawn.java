package org.emspase.engine;

public class Pawn {
	protected int player;
	protected int location;

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public Pawn(int player, int location) {
		this.player = player;
		this.location = location;		
	}

	public Pawn(Pawn p) {
		this.player = p.player;
		this.location = p.location;
	}

}
