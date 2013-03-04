package Bridge;

public abstract class Person {

	public String name;
	public Clothing clothing;

	public Person(String name) {
		this.name = name;
	}

	public abstract void dress();

}
