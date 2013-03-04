package Memento;

import Memento.Originator.MementoIF;

public class Memento {

	/*
	 * 备忘录对象是一个用来存储另外一个对象内部状态的快照的对象。备忘录模式的用意是在不破坏封装的条件下，将一个对象的状态捕捉(Capture)住，并外部化
	 * ，存储起来，从而可以在将来合适的时候把这个对象还原到存储起来的状态。备忘录模式常常与命令模式和迭代子模式一同使用。
	 */
	public static void main(String[] args) {
		new Caretaker();
	}

	private static class Caretaker {
		public Caretaker() {
			Originator originator = new Originator();
			originator.setSign("test1");
			MementoIF save = originator.save();
			originator.setSign("test2");
			System.out.println(originator.getSign());
			originator.load(save);
			System.out.println(originator.getSign());
		}
	}
}
