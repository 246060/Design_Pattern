package mediator.case3.Component;

import mediator.case3.Mediador.ChatMediator;

public class ChatUser {

	private ChatMediator mediator;
	private String name;

	public ChatUser(ChatMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}

	public void send(String msg) {
		System.out.println(name + " Sending Message = " + msg);
		mediator.sendMessage(msg, this);
	}

	public void receive(String msg) {
		System.out.println(name + " Message received : " + msg);
	}
}
