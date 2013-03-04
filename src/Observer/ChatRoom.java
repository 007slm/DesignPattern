package Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

	private List<Person> people;

	public ChatRoom() {
		people = new ArrayList<Person>();
	}

	public void join(Person person) {
		System.out.println("Hi everybody " + person.getName() + " is coming ~");
		for (Person p : people)
			p.onNewOneComing(person);
		people.add(person);
	}

	public void leave(Person person) {
		System.out.println( person.getName() + ": bye ~");
		people.remove(person);
		for (Person p : people)
			p.onSomeoneLeaving(person);
	}

	public interface PersonListener {

		public void onNewOneComing(Person person);

		public void onSomeoneLeaving(Person person);
	}
}
