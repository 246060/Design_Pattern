package business_delegate.case2.LookUpService;

import business_delegate.case2.BusinessService.NetflixService;
import business_delegate.case2.BusinessService.VideoStreamingService;
import business_delegate.case2.BusinessService.YouTubeService;

import java.util.Locale;

public class BusinessLookup {

	private NetflixService netflixService;
	private YouTubeService youTubeService;

	public VideoStreamingService getBusinessService(String movie) {
		if (movie.toLowerCase(Locale.ROOT).contains("die hard")) {
			return netflixService;
		} else {
			return youTubeService;
		}
	}

	public void setNetflixService(NetflixService netflixService) {
		this.netflixService = netflixService;
	}

	public void setYouTubeService(YouTubeService youTubeService) {
		this.youTubeService = youTubeService;
	}
}
