package org.emspase.engine.test;

import static org.junit.Assert.*;

import org.emspase.engine.VicissitudesState;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class VicissitudesStateTest {
	VicissitudesState vs;
	@Before
	public void setUp() throws Exception {
		vs = new VicissitudesState();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(vs.size(),4);
	}

}
