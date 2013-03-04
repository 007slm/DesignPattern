package Builder;

public abstract class AbstractBuilder {

	protected Animal animal;

	public AbstractBuilder() {
		animal = new Animal();
	}

	public abstract void buildName();

	public abstract void buildLeg();

	public abstract Animal getAnimal();
}
