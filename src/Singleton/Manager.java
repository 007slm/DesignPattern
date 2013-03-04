package Singleton;

public class Manager {

	private static Manager manager;

	public static Manager getIntance() {
		if (manager == null) {
			synchronized (Manager.class) {
				manager = new Manager();
				System.out.println("Manager is alloc");
			}
		} else
			System.out.println("Manager is exist");
		return manager;
	}
}
