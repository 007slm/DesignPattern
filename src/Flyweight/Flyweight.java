package Flyweight;

/*
 * 运用共享技术有效地支持大量细粒度的对象。通过与其他类似对象共享数据来减小内存占用。
 */
public class Flyweight {
	public static void main(String[] args) {
		CoffeeFactory.getInstance().orderCoffee("摩卡");
		CoffeeFactory.getInstance().orderCoffee("拿铁");
		CoffeeFactory.getInstance().orderCoffee("拿铁");
		CoffeeFactory.getInstance().orderCoffee("摩卡");

		System.out.println("生成了" + CoffeeFactory.getInstance().objectNumber()
				+ "个对象");
	}
}
