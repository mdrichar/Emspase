package org.emspase.engine.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.emspase.engine.Prize;
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
		assertEquals(true,true);
	}
	
	@Test
	public void testDefaultconstructor() {
		Prize prize = new Prize();
		assertEquals(prize.getQuantity(),1);
	}

}
