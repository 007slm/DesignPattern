package Facade;

public class Dvd {
	public void on() {
		System.out.println(this.getClass().getSimpleName() + " is on");
	}

	public void off() {
		System.out.println(this.getClass().getSimpleName() + " is off");
	}
}
