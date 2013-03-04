package Observer;

import Observer.ChatRoom.PersonListener;

public class Person implements PersonListener {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void onNewOneComing(Person person) {
		System.out.println(name + ": Welcome " + person.getName());
	}

	@Override
	public void onSomeoneLeaving(Person person) {
		System.out.println(name + ": Bye " + person.getName());
	}

	public String getName() {
		return name;
	}
}
