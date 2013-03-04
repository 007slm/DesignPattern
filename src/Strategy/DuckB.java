package Strategy;

public class DuckB extends Duck {
	public DuckB() {
		System.out.println("This is DuckB");
		quackBehavior = new QuackBehaviorB();
	}
}
