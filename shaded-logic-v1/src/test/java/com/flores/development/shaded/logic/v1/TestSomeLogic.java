package com.flores.development.shaded.logic.v1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.UUID;


import org.junit.BeforeClass;
import org.junit.Test;

import com.flores.development.shaded.models.SomeObject;

/**
 * @author Jason
 */
public class TestSomeLogic {

	private static SomeObject something;
	private static SomeLogic logic;

	@BeforeClass
	public static void initialize() {
		logic = new SomeLogic();
	}
	
	@Test
	public void testGetVersion() {
		assertTrue(logic.getVersion().isPresent());
		assertEquals("v1", logic.getVersion().get());
	}
	
	@Test
	public void testExecute() {
		String initProperty = UUID.randomUUID().toString();
		something = new SomeObject(initProperty);
		something.setPropertyA("-abc");

		assertEquals(initProperty + "v1-abc", logic.execute(something));		
	}
}
