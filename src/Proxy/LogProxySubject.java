package Proxy;

public class LogProxySubject implements Subject {

	private Subject subject;

	public LogProxySubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		System.out.println("Log: Start request");
		subject.request();
		System.out.println("Log: End request");
	}

}
