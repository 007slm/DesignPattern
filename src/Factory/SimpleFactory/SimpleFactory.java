package Factory.SimpleFactory;

import Factory.Apple;
import Factory.Fruit;
import Factory.Strawberry;

public class SimpleFactory {
	public static Fruit getFruit(String name) {
		if (name.equals("Apple")) {
			return new Apple();
		} else if (name.equals("Strawberry")) {
			return new Strawberry();
		}
		return null;
	}
}
