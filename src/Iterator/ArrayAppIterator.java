package Iterator;

public class ArrayAppIterator implements AppIterator {

	private String[] apps;
	private int index = -1;

	public ArrayAppIterator(String[] apps) {
		this.apps = apps;
		if (apps != null && apps.length > 0)
			index = 0;
	}

	@Override
	public boolean hasNext() {
		return index != -1 && index != apps.length;
	}

	@Override
	public Object next() {
		String next = apps[index];
		index++;
		return next;
	}

}
