package mobi.duckseason.guice.v3;

public class DoorFactory {
	public Door get() {
		Wood wood = new WoodFactory().get(); 
		Door door = new Door(wood);
		return door;
	}
}
