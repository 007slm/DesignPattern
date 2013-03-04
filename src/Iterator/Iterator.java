package Iterator;

public class Iterator {

	/*
	 * 适配于多种数据结构的对象，对其进行聚合，提供统一的访问方式
	 */
	public static void main(String[] args) {
		String[] apps = {"1","2","3"};
		ArrayAppIterator appIterator = new ArrayAppIterator(apps);
		while (appIterator.hasNext()) {
			System.out.println(appIterator.next());
		}
	}
}
