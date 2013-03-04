package Strategy;

public class DuckA extends Duck {
	public DuckA() {
		System.out.println("This is DuckA");
		quackBehavior = new QuackBehaviorA();
	}
}
