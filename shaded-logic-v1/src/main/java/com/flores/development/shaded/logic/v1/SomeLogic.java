package com.flores.development.shaded.logic.v1;

import com.flores.development.shaded.logic.ILogicExecution;
import com.flores.development.shaded.models.SomeObject;

/**
 * Demostrate the use of the models submodule th
 * @author Jason
 */
public class SomeLogic implements ILogicExecution {

	@Override
	public String execute(SomeObject something) {
		return something.getInitProperty()
				+ "v1"
				+ something.getPropertyA();
	}
}
