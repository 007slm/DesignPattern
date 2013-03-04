package Observer;

/*
 * 解除不同对象之间的耦合关系，使观察者依赖于主题，产生一对多的关系
 */

public class Observer {
	public static void main(String[] args) {
		ChatRoom chatRoom = new ChatRoom();

		Person a = new Person("Ted");
		Person b = new Person("John");
		Person c = new Person("Mary");

		chatRoom.join(a);
		chatRoom.join(b);
		chatRoom.join(c);

		chatRoom.leave(a);
		chatRoom.leave(b);
		chatRoom.leave(c);
	}
}
