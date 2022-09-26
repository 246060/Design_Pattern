package business_delegate.case2.BusinessDelegate;


import business_delegate.case2.BusinessService.VideoStreamingService;
import business_delegate.case2.LookUpService.BusinessLookup;

// BusinessDelegate 는 프레젠테이션 계층과 비즈니스 계층을 분리합니다.
public class BusinessDelegate {

	private BusinessLookup lookupService;

	public void playbackMovie(String movie) {
		VideoStreamingService videoStreamingService = lookupService.getBusinessService(movie);
		videoStreamingService.doProcessing();
	}

	public void setLookupService(BusinessLookup lookupService) {
		this.lookupService = lookupService;
	}
}
