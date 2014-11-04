package org.emspase.engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VicissitudesState extends State {
	protected Graph graph;
	protected ArrayList< ResourceTracker > resources;
	protected int playerCnt = 1;
	public VicissitudesState() {
		this.graph = new Graph();
		GraphNode node1 = new GraphNode(1,Color.BLUE,new Prize(1,PrizeType.BLUE));
		GraphNode node2 = new GraphNode(2,Color.GREEN,new Prize(1,PrizeType.GREEN));
		GraphNode node3 = new GraphNode(3,Color.RED,new Prize(1,PrizeType.RED));
		GraphNode node4 = new GraphNode(4,Color.YELLOW,new Prize(1,PrizeType.YELLOW));
		node1.addNeighbor(node2);
		node2.addNeighbor(node3);
		node3.addNeighbor(node4);
		node4.addNeighbor(node1);
		this.graph.addNode(node1);
		this.graph.addNode(node2);
		this.graph.addNode(node3);
		this.graph.addNode(node4);
		
		resources = new ArrayList< ResourceTracker >();
		for (int i = 0; i < playerCnt; playerCnt++) {
		   resources.add( new ResourceTracker() );
		}
	}
	public int size() {
		// TODO Auto-generated method stub
		return graph.nodes.size();
	}
}
