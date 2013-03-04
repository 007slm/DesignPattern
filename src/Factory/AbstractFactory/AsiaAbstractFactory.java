package Factory.AbstractFactory;

import Factory.Apple;
import Factory.Fruit;
import Factory.Strawberry;

public class AsiaAbstractFactory extends Factory {

	@Override
	public Fruit getApple() {
		Apple apple = new Apple();
		apple.name = "Asia " + apple.name;
		return apple;
	}

	@Override
	public Fruit getStrawberry() {
		Strawberry strawberry = new Strawberry();
		strawberry.name = "Asia " + strawberry.name;
		return strawberry;
	}

}
