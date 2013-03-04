package Facade;

/*
 * 简化对外暴露的接口，并且解除对子类对象的依赖
 */
public class Facade {
	public static void main(String[] args) {
		Control control = new Control();
		
		System.out.println("进入房间");
		control.walkin();
		System.out.println("离开房间");
		control.walkout();
	}
}
