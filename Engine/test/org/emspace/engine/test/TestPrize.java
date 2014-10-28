package org.emspace.engine.test;

import static org.junit.Assert.*;

import org.emspace.engine.Prize;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPrize {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testDefaultconstructor() {
		Prize prize = new Prize();
		assertEquals(prize.getQuantity(),1);
	}

}
