package org.emspase.engine;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Rules {
	State initialState();
	List<Action> getLegalMoves(State s);
	int whoseTurn(State s);
	boolean isTerminal(State s);
	Map<Player,Float> payoffs(State s);
	ObsListStatePair execute(State s, Action a);
	boolean isLegal(Action a, State s);
	List<Action> getLegalActions(State s);
	Set<List<Action>> informationSet(List<Observation> o);

}
