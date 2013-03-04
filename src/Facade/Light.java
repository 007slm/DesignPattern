package Facade;

public class Light {
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " is on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " is off");
	}
}
