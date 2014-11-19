package org.emspase.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VicissitudesState extends State {
	public static final int POINTS_NEEDED_TO_WIN = 10;
	public Graph graph;
	public ArrayList<ResourceTracker> resources;
	protected int playerCnt;
	public int whoseTurn = 0;
	public ArrayList<Pawn> pawns;
	public int[] scores;
	public ArrayList<Integer> victoryPoints;

	public VicissitudesState(VicissitudesState other) {
		this.graph = new Graph(other.graph);
		this.resources = new ArrayList<ResourceTracker>();
		for (ResourceTracker rt : other.resources){
			this.resources.add(new ResourceTracker(rt));
		}
		this.playerCnt = other.playerCnt;
		this.whoseTurn = other.whoseTurn;
		this.scores = other.scores.clone();
		this.pawns = new ArrayList<Pawn>();
		for (Pawn p : other.pawns){
			this.pawns.add(new Pawn(p));
		}
		this.victoryPoints = new ArrayList<Integer>();
		for (Integer i : other.victoryPoints) {
			this.victoryPoints.add(new Integer(i));
		}
	}

	public VicissitudesState() {
		this.playerCnt = 1;
		scores = new int[this.playerCnt];
		for (int i = 0; i < playerCnt; i++) {
			scores[i] = 0;
		}
		victoryPoints = new ArrayList<Integer>(this.playerCnt);
		this.graph = new Graph();
		GraphNode node0 = new GraphNode(0, Color.BLUE, new Prize(1,
				PrizeType.BLUE));
		GraphNode node1 = new GraphNode(1, Color.GREEN, new Prize(1,
				PrizeType.GREEN));
		GraphNode node2 = new GraphNode(2, Color.RED, new Prize(1,
				PrizeType.RED));
		GraphNode node3 = new GraphNode(3, Color.YELLOW, new Prize(1,
				PrizeType.YELLOW));
		this.graph.addNode(node0);
		this.graph.addNode(node1);
		this.graph.addNode(node2);
		this.graph.addNode(node3);
		this.graph.addNeighbor(0, 1);
		this.graph.addNeighbor(1, 2);
		this.graph.addNeighbor(2, 3);
		this.graph.addNeighbor(3, 0);

		resources = new ArrayList<ResourceTracker>();
		for (int i = 0; i < playerCnt; i++) {
			resources.add(new ResourceTracker());
		}

		pawns = new ArrayList<Pawn>();
		pawns.add(new Pawn(0, 0));

		this.victoryPoints = new ArrayList<Integer>();
		for (int i = 0; i < playerCnt; i++) {
			this.victoryPoints.add(new Integer(0));
		}

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

	public List<Action> getLegalActions() {
		List<Action> result = new ArrayList<Action>();
		VicissitudesAction va = new VicissitudesAction(1);
		result.add(va);
		return result;
	}

	public void apply(VicissitudesAction va) {
		if (va.type == ActionType.BUY_CHIT) {
			scores[whoseTurn]++;
		}
	}

	// Actions: move pawn src dest payments...
	// Actions: spawn pawn dest
	// Actions: buy vpchit
	// Actions: earn

}
