package com.flores.development.shaded.logic.v1;

import static java.util.Optional.of;

import java.util.Optional;

import com.flores.development.shaded.logic.LogicComponent;

/**
 * Demostrate the use of the models submodule th
 * @author Jason
 */
public class SomeLogic extends LogicComponent {

	@Override
	public Optional<String> getVersion() {
		return of("v1");
	}
}
