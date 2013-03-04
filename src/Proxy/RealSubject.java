package Proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("Process request");
	}

}
