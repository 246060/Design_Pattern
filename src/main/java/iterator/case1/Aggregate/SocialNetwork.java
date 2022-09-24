package iterator.case1.Aggregate;

import iterator.case1.Iterator.ProfileIterator;

public interface SocialNetwork {
	ProfileIterator createFriendsIterator(String profileEmail);
	ProfileIterator createCoworkersIterator(String profileEmail);
}
