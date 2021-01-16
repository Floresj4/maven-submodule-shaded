package com.flores.development.shaded.logic.v2;

import java.util.UUID;

import com.flores.development.shaded.logic.ILogicExecution;
import com.flores.development.shaded.models.SomeObject;

import lombok.extern.slf4j.Slf4j;

/**
 * Another version specific implementation of the logic
 * interface.
 * @author Jason
 */
@Slf4j
public class SomeLogic implements ILogicExecution {

	public String execute(SomeObject something) {
		log.debug("Ignoring passed object entirely.");
		return UUID.randomUUID().toString();
	}
}
