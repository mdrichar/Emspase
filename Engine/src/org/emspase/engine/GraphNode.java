package org.emspase.engine;

import java.util.HashSet;
import java.util.Set;

public class GraphNode {
	protected int id;
	protected Color color;
	protected Prize prize;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Prize getPrize() {
		return prize;
	}
	public void setPrize(Prize prize) {
		this.prize = prize;
	}
	public GraphNode(int id, Color color, Prize prize) {
		super();
		this.id = id;
		this.color = color;
		this.prize = prize;
	}
	
	public GraphNode(GraphNode n) {
		// TODO Auto-generated constructor stub
		this.id = n.id;
		this.color = n.color;
		this.prize = n.prize;
	}
	
}
