package TemplateMethod;

public class Coffee extends Beverage {

	@Override
	public void boilWater() {
		System.out.println("boil 150ml water");
	}

	@Override
	public void brew() {
		System.out.println("brew the coffee");
	}

	@Override
	public void addCondiments() {
		System.out.println("add some sugar");
	}

}
