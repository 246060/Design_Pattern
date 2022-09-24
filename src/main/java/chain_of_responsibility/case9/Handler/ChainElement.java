package chain_of_responsibility.case9.Handler;

public abstract class ChainElement {

	// the level of importance 0=MAXIMUM, 1=MEDIUM, 2=LOW
	protected int level;

	//next element in the Chain of Responsibility
	protected ChainElement nextChainElement;

	public void setNextChainElement(ChainElement nextChainElement) {
		this.nextChainElement = nextChainElement;
	}

	public void tryToSendEmail(int level, String message) {

		if (this.level >= level) {
			sendEmail(message);
		}

		if (nextChainElement != null) {
			nextChainElement.tryToSendEmail(level, message);
		}
	}

	abstract protected void sendEmail(String message);
}
