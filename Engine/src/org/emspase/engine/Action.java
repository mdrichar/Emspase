package org.emspase.engine;

public class Action {
	public int getActionCode() {
		return actionCode;
	}

	public void setActionCode(int actionCode) {
		this.actionCode = actionCode;
	}

	protected int actionCode;

	public Action(int actionCode) {
		super();
		this.actionCode = actionCode;
	}
	

}
