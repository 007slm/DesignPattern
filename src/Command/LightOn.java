package Command;

public class LightOn extends AbstractCommand{
	
	private Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
