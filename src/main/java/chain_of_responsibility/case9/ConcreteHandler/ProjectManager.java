package chain_of_responsibility.case9.ConcreteHandler;

import chain_of_responsibility.case9.Handler.ChainElement;

public class ProjectManager extends ChainElement {

	public ProjectManager (int level){
		this.level = level;
	}

	protected void sendEmail(String message){
		System.out.println("\nAn email was send to the PROJECT MANAGER. The message was:");
		System.out.println(message);

	}
}
