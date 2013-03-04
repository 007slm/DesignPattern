package Factory.AbstractFactory;

import Factory.Apple;
import Factory.Fruit;
import Factory.Strawberry;

public class AmericanAbstractFactory extends Factory {

	@Override
	public Fruit getApple() {
		Apple apple = new Apple();
		apple.name = "American " + apple.name;
		return apple;
	}

	@Override
	public Fruit getStrawberry() {
		Strawberry strawberry = new Strawberry();
		strawberry.name = "American " + strawberry.name;
		return strawberry;
	}

}
