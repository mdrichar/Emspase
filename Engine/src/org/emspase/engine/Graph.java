package org.emspase.engine;

import java.util.ArrayList;

public class Graph {
	ArrayList<GraphNode> nodes;
	public Graph() {
		nodes = new ArrayList<GraphNode>();
	}
	void addNode(GraphNode node) {
		nodes.add(node);
	}
	

}
