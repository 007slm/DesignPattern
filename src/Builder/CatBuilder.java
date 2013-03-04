package Builder;

public class CatBuilder extends AbstractBuilder {

	@Override
	public void buildName() {
		animal.name = "cat";
	}

	@Override
	public void buildLeg() {
		animal.leg = 4;
	}

	@Override
	public Animal getAnimal() {
		return animal;
	}

}
