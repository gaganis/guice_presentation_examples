package mobi.duckseason.guice.v6;

import javax.inject.Inject;

public class MetallicDoor extends Door {

	@Inject
	public MetallicDoor(Metal metal) {
		System.out.println("creating metalic door with " + metal);
	}

}
