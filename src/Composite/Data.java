package Composite;

public abstract class Data {

	private String name;

	public Data(String name) {
		this.name = name;
	}

	public void visit() {
		System.out.println("visit " + name);
	}
}
