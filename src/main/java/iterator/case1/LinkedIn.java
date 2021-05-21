package iterator.case1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinkedIn implements SocialNetwork {

    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        this.contacts = Objects.isNull(cache) ? new ArrayList<>() : cache;
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        simulateNetworkLatency();
        System.out.printf("LinkedIn: Loading profile '%s' over the network...\n", profileEmail);
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        simulateNetworkLatency();
        System.out.printf("LinkedIn: Loading '%s' list of '%s' over the network...\n", contactType, profileEmail);
        Profile profile = findContact(profileEmail);
        return Objects.isNull(profile) ? null : profile.getContacts(contactType);
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts)
            if (profile.getEmail().equals(profileEmail))
                return profile;
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "coworkers", profileEmail);
    }
}
