package Decorator;

public abstract class Condiment extends Beverage {

	protected Beverage beverage;

	public Condiment(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return cost + beverage.getCost();
	}

	public String getDescription() {
		return description + " " + beverage.getDescription();
	};
}
