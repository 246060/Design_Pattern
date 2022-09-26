package business_delegate.case2;

import business_delegate.case2.BusinessDelegate.BusinessDelegate;
import business_delegate.case2.BusinessService.NetflixService;
import business_delegate.case2.BusinessService.YouTubeService;
import business_delegate.case2.Client.MobileClient;
import business_delegate.case2.LookUpService.BusinessLookup;

public class Main {

	public static void main(String[] args) {

		var businessLookup = new BusinessLookup();
		businessLookup.setNetflixService(new NetflixService());
		businessLookup.setYouTubeService(new YouTubeService());

		var businessDelegate = new BusinessDelegate();
		businessDelegate.setLookupService(businessLookup);

		var client = new MobileClient(businessDelegate);
		client.playbackMovie("Die Hard 2");
		client.playbackMovie("Maradona: The Greatest Ever");
	}
}
