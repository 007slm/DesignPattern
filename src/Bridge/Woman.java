package Bridge;

public class Woman extends Person {

	public Woman(String name) {
		super(name);
	}

	@Override
	public void dress() {
		clothing.wear(this);
	}

}
