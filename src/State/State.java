package State;

public class State {
	/*
	 * 允许一个对象在其内部状态改变时改变它的行为
	 */
	public static void main(String[] args) {
		Store store = new Store();

		while (store.sold()) {
		}
	}
}
