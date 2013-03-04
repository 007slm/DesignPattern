package Flyweight;

import java.util.HashMap;

public class CoffeeFactory {

	private static CoffeeFactory coffeeFactory = new CoffeeFactory();
	private HashMap<String, Coffee> flyweightMap = new HashMap<String, Coffee>();

	public static CoffeeFactory getInstance(){
		return coffeeFactory;
	}
	
	public Coffee orderCoffee(String coffeeName) {
		if (flyweightMap.containsKey(coffeeName)) {
			return flyweightMap.get(coffeeName);
		} else {
			Coffee coffee = new Coffee(coffeeName);
			flyweightMap.put(coffeeName, coffee);
			return coffee;
		}
	}

	public int objectNumber() {
		return flyweightMap.size();
	}
}
