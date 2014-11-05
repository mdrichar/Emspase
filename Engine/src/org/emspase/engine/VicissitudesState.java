package org.emspase.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class VicissitudesState extends State {
	public static final int POINTS_NEEDED_TO_WIN = 10;
	public Graph graph;
	public ArrayList< ResourceTracker > resources;
	protected int playerCnt = 1;
	public int whoseTurn = 0;
	public ArrayList<Pawn> pawns;
	public int[] scores;
	public ArrayList<Integer> victoryPoints;
	
	public VicissitudesState() {
		scores = new int[this.playerCnt];
		for (int i = 0; i < playerCnt; playerCnt++) {
			scores[i] = 0;
		}
		victoryPoints = new ArrayList<Integer>(this.playerCnt);
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
		
		pawns = new ArrayList<Pawn>();
		pawns.add(new Pawn(0,node1));
	}
	public int getPlayerCnt() {
		return playerCnt;
	}
	public int size() {
		// TODO Auto-generated method stub
		return graph.nodes.size();
	}
	
	public int maxScore() {
		return Collections.max(victoryPoints).intValue();
	}
	public boolean isTerminal() {
		// TODO Auto-generated method stub
		return maxScore() >= POINTS_NEEDED_TO_WIN;
	}
}
