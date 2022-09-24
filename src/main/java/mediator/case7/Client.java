package mediator.case7;

import mediator.case7.Component.ChatUser;
import mediator.case7.Component.User;
import mediator.case7.Mediador.ChatRoom;
import mediator.case7.Mediador.IChatRoom;

public class Client {

	public static void main(String[] args) {
		System.out.println();
		IChatRoom chatroom = new ChatRoom();

		User user1 = new ChatUser(chatroom, "1", "Alex");
		User user2 = new ChatUser(chatroom, "2", "Brian");
		User user3 = new ChatUser(chatroom, "3", "Charles");
		User user4 = new ChatUser(chatroom, "4", "David");

		chatroom.addUser(user1);
		chatroom.addUser(user2);
		chatroom.addUser(user3);
		chatroom.addUser(user4);

		user1.send("Hello brian", "2");

		System.out.println();

		user2.send("Hey buddy", "1");
	}
}
