package Adapter;

public class Adapter {
	/*
	 * 加以适配器 避免对原有代码的改动
	 */
	public static void main(String[] args) {
		Cat cat = new Cat() {
			@Override
			public void mew() {
				System.out.println("Mew mew ~");
			}
		};
		Duck duck = new Duck() {
			@Override
			public void quack() {
				System.out.println("Quack quack ~");
			}
		};

		System.out.println("猫模仿鸭子叫");
		new VoiceAdapter(cat).quack();
		System.out.println("鸭子模仿猫叫");
		new VoiceAdapter(duck).mew();

	}
}
