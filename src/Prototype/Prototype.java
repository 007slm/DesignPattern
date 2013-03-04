package Prototype;

public class Prototype {
	/*
	 * 原型模式，原型的生成要较实例化一个新的对象更加快速，它是直接在内存中进行操作的
	 */
	public static void main(String[] args) {
		Subject subject = new Subject();
		subject.sign = 10;

		try {
			Subject copy = (Subject) subject.clone();
			System.out.println(copy.sign);
			subject.child = copy;
			
			copy = (Subject) subject.clone(); 
			System.out.println(copy.child.sign);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
