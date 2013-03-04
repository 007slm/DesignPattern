package Visitor;

public class SubjectVisitor implements SubjectVistorInterface {

	@Override
	public void visitSubjectOne(SubjectOne one) {
		System.out.println("This is one");
	}

	@Override
	public void visitSubjectTwo(SubjectTwo two) {
		System.out.println("This is two");
	}

}
