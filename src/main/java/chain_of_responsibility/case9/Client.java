package chain_of_responsibility.case9;

import chain_of_responsibility.case9.ConcreteHandler.Analyst;
import chain_of_responsibility.case9.ConcreteHandler.Director;
import chain_of_responsibility.case9.ConcreteHandler.ProjectManager;
import chain_of_responsibility.case9.Handler.ChainElement;

public class Client {

	public static void main(String[] args) {

		ChainElement firstChainElement = new Analyst(2);
		ChainElement secondChainElement = new ProjectManager(1);
		ChainElement thirdChainElement = new Director(0);


		firstChainElement.setNextChainElement(secondChainElement);
		secondChainElement.setNextChainElement(thirdChainElement);


		firstChainElement.tryToSendEmail(0, "This is a HIGH priority message. START from 1st Chain element");
		System.out.println("----------------------------------------------------------------");

		firstChainElement.tryToSendEmail(1, "This is a MEDIUM priority message. START from 1st Chain element");
		System.out.println("----------------------------------------------------------------");

		thirdChainElement.tryToSendEmail(0, "This is a HIGH priority message. START from 3rd Chain element");
		System.out.println("----------------------------------------------------------------");
	}
}
