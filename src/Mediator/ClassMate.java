package Mediator;

public class ClassMate extends Person {

	public ClassMate(ChatMediator mediator, String name) {
		super(mediator, name);
	}

	@Override
	public void receiveNotify(String message) {
		System.out.println(name + " : Got it");
	}

	@Override
	public void receiveMessage(String who, String message) {
		System.out.println(name + " to " + who + " : Got it");
	}

}
