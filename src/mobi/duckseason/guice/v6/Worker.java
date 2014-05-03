package mobi.duckseason.guice.v6;

import javax.inject.Inject;

import com.google.inject.Guice;
import com.google.inject.Injector;


public class Worker {
	private Door door;
	@Inject
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
		Injector injector = Guice.createInjector(new ConfigModule());
		Worker worker = injector.getInstance(Worker.class);
		worker.buildHouse();
		
		
	}

	private void addDoor(Door door) {
		System.out.println("Adding door to the house");
	}
}
