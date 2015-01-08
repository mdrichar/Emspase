package org.emspase.engine.test;

import static org.junit.Assert.*;

import java.util.List;

import org.emspase.engine.Action;
import org.emspase.engine.ObsListStatePair;
import org.emspase.engine.VicissitudesAction;
import org.emspase.engine.VicissitudesRules;
import org.emspase.engine.VicissitudesState;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VicissitudesRulesTest {

	protected VicissitudesRules rules;
	@Before
	public void setUp() throws Exception {
		rules = new VicissitudesRules();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInit() {
		VicissitudesState vs = (VicissitudesState) rules.initialState();
		assertEquals(vs.maxScore(),0);
	}
	
	@Test
	public void testGetLegals() {
		VicissitudesState vs = (VicissitudesState) rules.initialState();
		List<Action> va = vs.getLegalActions();
		assertEquals(va.size(),1);
		
	}
	
	@Test
	public void testExecute() {
		VicissitudesState vs = (VicissitudesState) rules.initialState();
		List<Action> va = vs.getLegalActions();
		VicissitudesAction va1 = (VicissitudesAction) va.get(0);
		ObsListStatePair olsp = rules.execute(vs, va1);
		vs = (VicissitudesState)olsp.getState();
		va = vs.getLegalActions();
		va1 = (VicissitudesAction) va.get(0);
		olsp = rules.execute(vs, va1);
		vs = (VicissitudesState)olsp.getState();
		assertTrue(vs.isTerminal());
		
	}

}
