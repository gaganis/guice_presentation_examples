package mobi.duckseason.guice.v4;


public class Worker {
	private Door door;
	public Worker(Door door) {
		this.door = door;
	}
	public void buildHouse(){
		//...
		addDoor(door);
		//...
	}
	//..

	public static void main(String[] args) {
		Wood wood = new Wood();
		Door door = new Door(wood);
		Worker worker = new Worker(door);
		worker.buildHouse();
	}

	private void addDoor(Door door) {
		System.out.println("Adding door to the house");
	}
}
