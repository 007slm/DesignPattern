package Memento;

public class Originator {
	private String sign;

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSign() {
		return sign;
	}

	public interface MementoIF {

	}

	public MementoIF save() {
		return new Memento();
	}

	public void load(MementoIF load) {
		sign = ((Memento) load).getSaveSign();
	}

	private class Memento implements MementoIF {

		private String saveSign;

		public Memento() {
			saveSign = sign;
		}

		public String getSaveSign() {
			return saveSign;
		}
	}
}
