package com.flores.development.shaded.logic;

import java.util.Optional;

/**
 * Abstract class that logic versions should be base on.
 * @author Jason
 */
public abstract class LogicComponent implements ILogicExecution {
	
	/**
	 * @return the version number associated with an
	 * implementation of this class
	 */
	public abstract Optional<String> getVersion();
	
	public String execute(ISomeObject something) {
		return something.getInitProperty()
				+ getVersion().orElse("unknown")
				+ something.getPropertyA();
	}
}
