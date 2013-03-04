package State;

public class Store {

	private ShopState openingState;
	private ShopState soldoutState;
	private ShopState closeState;

	private ShopState currentState;
	private int leftItem;

	public Store() {
		leftItem = 5;
		openingState = new OpeningState();
		soldoutState = new SoldoutState();
		closeState = new CloseState();
		currentState = openingState;
	}

	public boolean sold() {
		if (leftItem > 0)
			leftItem--;
		else if (leftItem == 0) {
			currentState = soldoutState;
			leftItem--;
		} else
			currentState = closeState;

		currentState.buy();
		return currentState != closeState;
	}

	private class OpeningState extends ShopState {

		@Override
		public boolean buy() {
			System.out.println("Sold one");
			return true;
		}

	}

	private class SoldoutState extends ShopState {

		@Override
		public boolean buy() {
			System.out.println("Soldout!");
			return false;
		}

	}

	private class CloseState extends ShopState {

		@Override
		public boolean buy() {
			System.out.println("We has closed!");
			return false;
		}

	}
}
