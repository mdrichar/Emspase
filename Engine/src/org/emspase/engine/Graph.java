package org.emspase.engine;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Graph {
	ArrayList<GraphNode> nodes;
	ArrayList<Set<Integer>> neighbors;
	public Graph() {
		nodes = new ArrayList<GraphNode>();
		neighbors = new ArrayList<Set<Integer>>();
	}
	public Graph(Graph graph) {
		// TODO Auto-generated constructor stub
		this.nodes = new ArrayList<GraphNode>();
		for (GraphNode n : graph.nodes) {
			this.nodes.add(new GraphNode(n));
		}
		this.neighbors = (ArrayList<Set<Integer>>) graph.neighbors.clone();
	}
	void addNode(GraphNode node) {
		nodes.add(node);
		neighbors.add(new TreeSet<Integer>());
	}
	
	void addNeighbor(int src, int dest) {
		assert(src < nodes.size());
		assert(dest < nodes.size());
		neighbors.get(src).add(new Integer(dest));
	}
	

}
