package Factory.FactoryMethod;

import Factory.Apple;
import Factory.Fruit;
import Factory.Strawberry;

public class FirstFactory extends Factory {

	@Override
	public Fruit getFruit(String type) {
		if (type.equals("Apple")) {
			Apple apple = new Apple();
			apple.name = "First's " + apple.name;
			return apple;
		} else if (type.equals("Strawberry")) {
			Strawberry strawberry = new Strawberry();
			strawberry.name = "First's " + strawberry.name;
			return strawberry;
		}
		return null;
	}

}
