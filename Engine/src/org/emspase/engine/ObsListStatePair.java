package org.emspase.engine;

import java.util.List;

public class ObsListStatePair {
	List<Observation> observations;
	public ObsListStatePair(List<Observation> observations, State state) {
		super();
		this.observations = observations;
		this.state = state;
	}
	public List<Observation> getObservations() {
		return observations;
	}
	public State getState() {
		return state;
	}
	State state;
	

}
