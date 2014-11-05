package org.emspase.engine;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class VicissitudesRules implements Rules {

	@Override
	public State initialState() {
		return new VicissitudesState();
	}

	@Override
	public List<Action> getLegalMoves(State s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Player whoseTurn(State s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTerminal() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<Player, Float> payoffs(State s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObsListStatePair execute(State s, Action a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLegal(Action a, State s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Action> getLegalActions(State s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<List<Action>> informationSet(List<Observation> o) {
		// TODO Auto-generated method stub
		return null;
	}

}
