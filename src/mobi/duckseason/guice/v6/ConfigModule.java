package mobi.duckseason.guice.v6;


public class ConfigModule extends  com.google.inject.AbstractModule {

	@Override
	protected void configure() {
		bind(Door.class).to(MetallicDoor.class);
	}
}
