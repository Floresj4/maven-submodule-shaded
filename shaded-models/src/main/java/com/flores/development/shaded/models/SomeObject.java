package com.flores.development.shaded.models;

import com.flores.development.shaded.logic.ISomeObject;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * A model object to be shared across modules
 * and other external projects that may need
 * them.
 * @author Jason
 */
@Getter
@RequiredArgsConstructor
public class SomeObject implements ISomeObject {
	
	@Setter
	private String propertyA;

	@Setter
	private int propertyB;
	
	@NonNull @Getter
	private String initProperty;
}
