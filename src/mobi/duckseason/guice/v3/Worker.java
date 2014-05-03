package mobi.duckseason.guice.v3;

public class Worker {
	public void buildHouse(){
		//...
		Door door = new DoorFactory().get();
		addDoor(door);
		//...
	}

	private void addDoor(Door door) {
		System.out.println("Adding door to the house");
	}
	
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.buildHouse();
	}

}
