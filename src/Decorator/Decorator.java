package Decorator;

/*
 * 不依赖于特定对象编程，举例：Java中的I/O类，如InputStream的子类FileInputStream等
 */
public class Decorator {
	public static void main(String[] args) {
		Beverage coffee = new Coffee();
		System.out.println(coffee.getDescription() + " cost: "
				+ coffee.getCost());
		coffee = new Sugar(coffee);
		System.out.println(coffee.getDescription() + " cost: "
				+ coffee.getCost());
	}
}
