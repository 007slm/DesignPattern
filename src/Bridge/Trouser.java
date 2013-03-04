package Bridge;

public class Trouser implements Clothing {

	@Override
	public void wear(Person somebody) {
		System.out.println(somebody.getClass().getSimpleName() + " wear "
				+ getClass().getSimpleName());
	}

}
