package mobi.duckseason.guice.v1;

public class Worker {
	public void buildHouse(){
		//...
		Wood wood = new Wood();
		Door door = new Door(wood);
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
