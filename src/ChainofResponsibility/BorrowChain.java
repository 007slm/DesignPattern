package ChainofResponsibility;


public class BorrowChain {
	public void borrow(int money) {
		Ke ke = new Ke(null);
		Cal cal = new Cal(ke);
		Ted ted = new Ted(cal);
		
		ted.handleRequest(money);
	}

	private class Ted extends Processer {

		public Ted(Processer nextProcesser) {
			super(nextProcesser);
		}

		@Override
		public void handleRequest(int money) {
			if (money > 20) {
				System.out
						.println("Ted : Sorry I don't have much money , you can ask "
								+ nextProcesser.getClass().getSimpleName());
				nextProcesser.handleRequest(money);
			} else
				System.out.println("Ted : I can borrow you");
		}

	}

	private class Cal extends Processer {

		public Cal(Processer nextProcesser) {
			super(nextProcesser);
		}

		@Override
		public void handleRequest(int money) {
			if (money > 100) {
				System.out
						.println("Cal : Sorry I don't have much money , you can ask "
								+ nextProcesser.getClass().getSimpleName());
				nextProcesser.handleRequest(money);
			} else
				System.out.println("Cal : I can borrow you");
		}

	}

	private class Ke extends Processer {

		public Ke(Processer nextProcesser) {
			super(nextProcesser);
		}

		@Override
		public void handleRequest(int money) {
			if (money > 500) {
				System.out.println("Ke : Sorry I don't have much money");
			} else
				System.out.println("Ke : I can borrow you");
		}

	}
}
