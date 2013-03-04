package Factory.FactoryMethod;

import Factory.Apple;
import Factory.Fruit;
import Factory.Strawberry;

public class SecondFactory extends Factory {

	@Override
	public Fruit getFruit(String type) {
		if (type.equals("Apple")) {
			Apple apple = new Apple();
			apple.name = "Second's " + apple.name;
			return apple;
		} else if (type.equals("Strawberry")) {
			Strawberry strawberry = new Strawberry();
			strawberry.name = "Second's " + strawberry.name;
			return strawberry;
		}
		return null;
	}

}
