package Adapter;

public class VoiceAdapter implements Cat, Duck {

	private Cat cat;
	private Duck duck;

	public VoiceAdapter(Cat cat) {
		this.cat = cat;
	}

	public VoiceAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		if (cat != null) {
			cat.mew();
		} else if (duck != null) {
			duck.quack();
		}
	}

	@Override
	public void mew() {
		if (cat != null) {
			cat.mew();
		} else if (duck != null) {
			duck.quack();
		}
	}

}
