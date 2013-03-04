package Mediator;

public class Mediator {

	/*
	 * 定义一个中介对象来封装系列对象之间的交互。中介者使各个对象不需要显示地相互引用，从而使其耦合性松散，而且可以独立地改变他们之间的交互。
	 */
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediator();
		ClassMate teacher = new ClassMate(mediator, "teacher");
		ClassMate lilei = new ClassMate(mediator, "lilei");
		ClassMate hanmeimei = new ClassMate(mediator, "hanmeimei");

		mediator.join(teacher);
		mediator.join(lilei);
		mediator.join(hanmeimei);

		mediator.say(teacher, "今天5点放学");
		mediator.whisper(teacher, lilei.name, "放学留下来!");
	}

}
