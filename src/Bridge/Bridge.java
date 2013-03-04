package Bridge;

public class Bridge {

	/*
	 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
	 */
	public static void main(String[] args) {
		Man man = new Man("Ted");
		Woman woman = new Woman("Shary");

		Jacket jacket = new Jacket();
		Trouser trouser = new Trouser();

		man.clothing = jacket;
		woman.clothing = trouser;
		
		man.dress();
		woman.dress();
	}
}
