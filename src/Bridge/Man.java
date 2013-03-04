package Bridge;

public class Man extends Person {

	public Man(String name) {
		super(name);
	}

	@Override
	public void dress() {
		clothing.wear(this);
	}

}
