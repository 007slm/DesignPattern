package Strategy;

public abstract class Duck {

	protected QuackBehavior quackBehavior;

	public void performQuack() {
		quackBehavior.quack();
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
