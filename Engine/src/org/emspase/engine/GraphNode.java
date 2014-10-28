package org.emspase.engine;

import java.util.HashSet;
import java.util.Set;

public class GraphNode {
	protected int id;
	protected Color color;
	protected Set<GraphNode> neighbors;
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
		this.neighbors = new HashSet<GraphNode>();
	}
	
	public boolean addNeighbor(GraphNode node) {
		if (node != null) {
			return neighbors.add(node);
		} else return false;
	}
	
}
