package com.flores.development.shaded.logic;

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
	public String execute(ISomeObject something);
}
