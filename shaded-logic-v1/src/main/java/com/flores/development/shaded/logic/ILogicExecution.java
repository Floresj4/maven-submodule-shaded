package com.flores.development.shaded.logic;

import com.flores.development.shaded.models.SomeObject;

/**
 * Default interface for versioned logic implementations
 * to be bound to.
 * @author Jason
 */
public interface ILogicExecution {
	
	/**
	 * Execute some business logic
	 * @param something to execute on
	 */
	public String execute(SomeObject something);
}
