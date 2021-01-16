package com.flores.development.shaded.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor
@RequiredArgsConstructor
public class SomeObject {
	
	@Setter
	private String propertyA;

	@Setter
	private int properyB;
	
	@NonNull @Getter
	private String initProperty;
}
