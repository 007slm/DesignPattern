package Singleton;

public class Singleton {

	/*
	 * 双重加锁机制
	 */
	public static void main(String[] args) {
		System.out.println("Request manager");
		Manager.getIntance();
		System.out.println("Request manager");
		Manager.getIntance();
	}
}
