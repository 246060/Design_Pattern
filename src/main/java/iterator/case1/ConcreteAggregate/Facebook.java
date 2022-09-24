package iterator.case1.ConcreteAggregate;

import iterator.case1.Aggregate.SocialNetwork;
import iterator.case1.ConcreteIterator.FacebookIterator;
import iterator.case1.Iterator.ProfileIterator;
import iterator.case1.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Facebook implements SocialNetwork {

	private List<Profile> profiles;

	public Facebook(List<Profile> cache) {
		this.profiles = Objects.isNull(cache) ? new ArrayList<>() : cache;
	}

	public Profile requestProfileFromFacebook(String profileEmail) {
		simulateNetworkLatency();
		System.out.printf("Facebook: Loading profile '%s' over the network...\n", profileEmail);
		return findProfile(profileEmail);
	}

	public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
		simulateNetworkLatency();
		System.out.printf("Facebook: Loading '%s' list of '%s' over the network...\n", contactType, profileEmail);
		Profile profile = findProfile(profileEmail);
		return Objects.isNull(profile) ? null : profile.getContacts(contactType);
	}

	private Profile findProfile(String profileEmail) {
		for (Profile profile : profiles)
			if (profile.getEmail().equals(profileEmail))
				return profile;
		return null;
	}

	private void simulateNetworkLatency() {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ProfileIterator createFriendsIterator(String profileEmail) {
		return new FacebookIterator(this, "friends", profileEmail);
	}

	@Override
	public ProfileIterator createCoworkersIterator(String profileEmail) {
		return new FacebookIterator(this, "coworkers", profileEmail);
	}
}
