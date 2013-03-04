package TemplateMethod;


public class Tea extends Beverage {

	@Override
	public void boilWater() {
		System.out.println("boil 350ml water");
	}

	@Override
	public void brew() {
		System.out.println("brew the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("add nothing");
	}


}
