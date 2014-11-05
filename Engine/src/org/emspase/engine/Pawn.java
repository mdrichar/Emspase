package org.emspase.engine;

public class Pawn {
	protected int player;
	protected GraphNode location;

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	public GraphNode getLocation() {
		return location;
	}

	public void setLocation(GraphNode location) {
		this.location = location;
	}

	public Pawn(int player, GraphNode location) {
		// TODO Auto-generated constructor stub
	}

}
