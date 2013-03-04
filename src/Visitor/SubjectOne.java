package Visitor;

public class SubjectOne extends Subject {

	@Override
	public void accept(SubjectVistorInterface visitor) {
		visitor.visitSubjectOne(this);
	}

}
