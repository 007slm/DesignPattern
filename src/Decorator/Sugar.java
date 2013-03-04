package Decorator;

public class Sugar extends Condiment {

	public Sugar(Beverage beverage) {
		super(beverage);

		description = "Sugar";
		cost = 2;
	}

}
