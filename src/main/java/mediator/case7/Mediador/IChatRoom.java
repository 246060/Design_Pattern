package mediator.case7.Mediador;


import mediator.case7.Component.User;

public interface IChatRoom {
	void sendMessage(String msg, String userId);
	void addUser(User user);
}
