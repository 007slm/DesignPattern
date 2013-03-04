package Facade;

public class Control {
	private Light light;
	private Tv tv;
	private Dvd dvd;

	public Control() {
		light = new Light();
		tv = new Tv();
		dvd = new Dvd();
	}

	public void walkin() {
		light.on();
		tv.on();
		dvd.on();
	}
	
	public void walkout() {
		light.off();
		tv.off();
		dvd.off();
	}
}
