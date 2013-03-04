package Command;

public class Control {
	private AbstractCommand command;

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}

	public void setCommand(AbstractCommand... commands) {
		for (AbstractCommand command : commands) {
			setCommand(command);
			pressButton();
		}
	}

	public void pressButton() {
		command.execute();
	}
}
