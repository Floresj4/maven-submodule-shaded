package com.flores.development.shaded.logic.v2;

import static org.junit.Assert.assertNotEquals;

import java.util.UUID;

import org.junit.Test;

import com.flores.development.shaded.models.SomeObject;

/**
 * Another version specific implementation of the logic
 * interface.
 * @author Jason
 */
public class TestSomeLogic {

	@Test
	public void TestExecute() {
		String initProperty = UUID.randomUUID().toString();
		SomeObject something = new SomeObject(initProperty);
		
		SomeLogic logic = new SomeLogic();
		String returnProperty = logic.execute(something);
		assertNotEquals(initProperty, returnProperty);
	}
}
