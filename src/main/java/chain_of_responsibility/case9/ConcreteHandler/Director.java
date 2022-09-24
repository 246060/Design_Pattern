package chain_of_responsibility.case9.ConcreteHandler;

import chain_of_responsibility.case9.Handler.ChainElement;

public class Director extends ChainElement {

	public Director (int level){
		this.level = level;
	}

	protected void sendEmail(String message){
		System.out.println("\nAn email was send to the DIRECTOR. The message was:");
		System.out.println(message);

	}

}
