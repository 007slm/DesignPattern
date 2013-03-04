package Prototype;

public class Subject implements Cloneable {

	public int sign;
	public Subject child;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("clone");
		return super.clone();
	}
}
