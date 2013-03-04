package Strategy;

/*
 * 策略模式：将可能会变化的功能部分取出加以封装
 */
public class Strategy {
	public static void main(String[] args) {

		DuckA duckA = new DuckA();
		DuckB duckB = new DuckB();
		
		System.out.println("DuckA叫");
		duckA.performQuack();
		System.out.println("DuckB叫");
		duckB.performQuack();

		System.out.println("对DuckA加以改变之后");
		duckA.setQuackBehavior(duckB.getQuackBehavior());
		System.out.println("DuckA叫");
		duckA.performQuack();
	}
}
