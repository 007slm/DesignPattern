package Mediator;

public abstract class Person {

	public ChatMediator mediator;
	public String name;

	public Person(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public abstract void receiveNotify(String message);

	public abstract void receiveMessage(String who, String message);
}
