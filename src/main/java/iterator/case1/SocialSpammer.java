package iterator.case1;

import iterator.case1.Aggregate.SocialNetwork;
import iterator.case1.Iterator.ProfileIterator;

public class SocialSpammer {

	public SocialNetwork network;
	public ProfileIterator iterator;

	public SocialSpammer(SocialNetwork network) {
		this.network = network;
	}

	public void sendSpamToFriends(String profileEmail, String message) {
		System.out.println("\nIterating over friends...\n");

		iterator = network.createFriendsIterator(profileEmail);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendSpamToCoworkers(String profileEmail, String message) {
		System.out.println("\nIterating over coworkers...\n");

		iterator = network.createCoworkersIterator(profileEmail);
		while (iterator.hasNext()) {
			Profile profile = iterator.getNext();
			sendMessage(profile.getEmail(), message);
		}
	}

	public void sendMessage(String email, String message) {
		System.out.printf("Sent message to: '%s'. Message body: '%s'\n", email, message);
	}
}
