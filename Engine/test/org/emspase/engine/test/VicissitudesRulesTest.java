package org.emspase.engine.test;

import static org.junit.Assert.*;

import java.util.List;

import org.emspase.engine.Action;
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

}
