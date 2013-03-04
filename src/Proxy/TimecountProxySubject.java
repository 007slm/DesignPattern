package Proxy;

public class TimecountProxySubject implements Subject {

	private Subject subject;

	public TimecountProxySubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		System.out.println("starttime:" + System.currentTimeMillis());
		subject.request();
		System.out.println("endtime:" + System.currentTimeMillis());
	}

}
