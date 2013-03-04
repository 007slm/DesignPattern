package ChainofResponsibility;

public abstract class Processer {
	protected Processer nextProcesser;

	public Processer(Processer nextProcesser) {
		this.nextProcesser = nextProcesser;
	}

	public abstract void handleRequest(int money);

}
