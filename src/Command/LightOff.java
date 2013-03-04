package Command;

public class LightOff extends AbstractCommand {
	
	private Light light;

	public LightOff(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}
