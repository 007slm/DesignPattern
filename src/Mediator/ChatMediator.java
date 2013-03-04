package Mediator;

import java.util.HashMap;
import java.util.Iterator;

public class ChatMediator {

	private HashMap<String, Person> roomHashMap = new HashMap<String, Person>();

	public void join(Person person) {
		roomHashMap.put(person.name, person);
		say(person, "Hi everybody!");
	}

	public void leave(Person person) {
		roomHashMap.remove(person.name);
		say(person, "Bye everybody!");
	}

	public void say(Person person, String message) {
		System.out.println(person.name + " : " + message);
		for (Iterator<String> iterator = roomHashMap.keySet().iterator(); iterator
				.hasNext();) {
			String name = (String) iterator.next();
			if (!name.equals(person.name)) {
				roomHashMap.get(name).receiveNotify(message);
			}
		}
	}

	public void whisper(Person from, String to, String message) {
		System.out.println(from.name + " to " + to + " : " + message);
		for (Iterator<String> iterator = roomHashMap.keySet().iterator(); iterator
				.hasNext();) {
			String name = (String) iterator.next();
			if (name.equals(to)) {
				roomHashMap.get(name).receiveMessage(from.name, message);
			}
		}
	}
}
