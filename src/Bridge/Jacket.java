package Bridge;

public class Jacket implements Clothing {

	@Override
	public void wear(Person somebody) {
		System.out.println(somebody.getClass().getSimpleName() + " wear "
				+ getClass().getSimpleName());
	}

}
