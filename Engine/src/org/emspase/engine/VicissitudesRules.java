package org.emspase.engine;

import java.util.ArrayList;
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
	public int whoseTurn(State s) {
		// TODO Auto-generated method stub
		return ((VicissitudesState)s).whoseTurn;
	}

	@Override
	public boolean isTerminal(State s) {
		// TODO Auto-generated method stub
		((VicissitudesState)s).isTerminal();
		return false;
	}

	@Override
	public Map<Player, Float> payoffs(State s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObsListStatePair execute(State s, Action a) {
		// TODO Make observations real
		List<Observation> bogusObservations = new ArrayList<Observation>();
		VicissitudesState next = new VicissitudesState((VicissitudesState)s);
		next.apply((VicissitudesAction)a);
		return new ObsListStatePair(bogusObservations,next);
	}

	@Override
	public boolean isLegal(Action a, State s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Action> getLegalActions(State s) {
		// TODO Auto-generated method stub
		return ((VicissitudesState)s).getLegalActions();
	}

	@Override
	public Set<List<Action>> informationSet(List<Observation> o) {
		// TODO Auto-generated method stub
		return null;
	}

}
