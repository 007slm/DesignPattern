package TemplateMethod;

/*
 * 规定子类对象行为，将具体实现在子类中进行
 */
public class TemplateMethod {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		Tea tea = new Tea();

		coffee.boilWater();
		coffee.brew();
		coffee.addCondiments();

		tea.boilWater();
		tea.brew();
		tea.addCondiments();
	}
}
