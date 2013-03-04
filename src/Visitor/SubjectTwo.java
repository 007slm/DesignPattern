package Visitor;

public class SubjectTwo extends Subject {

	@Override
	public void accept(SubjectVistorInterface visitor) {
		visitor.visitSubjectTwo(this);
	}

}
