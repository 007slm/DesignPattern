package Factory;

import Factory.AbstractFactory.AmericanAbstractFactory;
import Factory.AbstractFactory.AsiaAbstractFactory;
import Factory.FactoryMethod.FirstFactory;
import Factory.FactoryMethod.SecondFactory;
import Factory.SimpleFactory.SimpleFactory;

/*
 * 简单工厂方法不能应对于功能需求的扩展，违背开放封闭原则
 * 工厂方法是在由抽象工厂的子类去进行抽象产品子类的提供，实现在抽象工厂子类中
 * 抽象工厂是一个产品族的组合，而工厂方法则只能提供同一产品等级的产品
 */
public class Factory {

	public static void main(String[] args) {
		// 简单工厂
		System.out.println("简单工厂生产的：" + SimpleFactory.getFruit("Apple").name);
		System.out.println("简单工厂生产的："
				+ SimpleFactory.getFruit("Strawberry").name);

		// 工厂方法
		FirstFactory firstFactory = new FirstFactory();
		SecondFactory secondFactory = new SecondFactory();
		System.out.println("工厂方法生产的：" + firstFactory.getFruit("Apple").name);
		System.out.println("工厂方法生产的："
				+ firstFactory.getFruit("Strawberry").name);
		System.out.println("工厂方法生产的：" + secondFactory.getFruit("Apple").name);
		System.out.println("工厂方法生产的："
				+ secondFactory.getFruit("Strawberry").name);

		// 抽象工厂
		AsiaAbstractFactory asiaAbstractFactory = new AsiaAbstractFactory();
		AmericanAbstractFactory americanAbstractFactory = new AmericanAbstractFactory();
		System.out.println("抽象工厂生产的：" + asiaAbstractFactory.getApple().name);
		System.out
				.println("抽象工厂生产的：" + americanAbstractFactory.getApple().name);
		System.out.println("抽象工厂生产的："
				+ asiaAbstractFactory.getStrawberry().name);
		System.out.println("抽象工厂生产的："
				+ americanAbstractFactory.getStrawberry().name);
	}

}
