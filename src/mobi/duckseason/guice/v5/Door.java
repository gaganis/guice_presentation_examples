package mobi.duckseason.guice.v5;

import javax.inject.Inject;

public class Door {

	@Inject
	public Door(Wood cutWood) {
		System.out.println("Constructing door");
	}
}
