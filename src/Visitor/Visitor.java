package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
	/*
	 * 访问者模式适用于数据结构相对未定的系统，它把数据结构和作用于结构上的操作之间的耦合解脱开，使得操作集合可以相对自由地演化。
	 */
	public static void main(String[] args) {
		SubjectVisitor visitor = new SubjectVisitor();

		SubjectOne one = new SubjectOne();
		SubjectTwo two = new SubjectTwo();

		List<Subject> subjects = new ArrayList<Subject>();
		subjects.add(one);
		subjects.add(two);

		for (Subject subject : subjects) {
			subject.accept(visitor);
		}

	}

}
