package Builder;

public class Builder {
	/*
	 * 建造者模式可以将一个产品的内部表象与产品的生成过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。
	 */

	public static void main(String[] args) {
		CatBuilder catBuilder = new CatBuilder();
		catBuilder.buildName();
		catBuilder.buildLeg();
		System.out.println(catBuilder.getAnimal().name + " "
				+ catBuilder.getAnimal().leg);
	}
}
