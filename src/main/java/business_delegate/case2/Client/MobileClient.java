package business_delegate.case2.Client;

import business_delegate.case2.BusinessDelegate.BusinessDelegate;

// MobileClient 는 BusinessDelegate 를 사용하여 비즈니스 계층을 호출합니다.
public class MobileClient {

	private final BusinessDelegate businessDelegate;

	public MobileClient(BusinessDelegate businessDelegate) {
		this.businessDelegate = businessDelegate;
	}

	public void playbackMovie(String movie) {
		businessDelegate.playbackMovie(movie);
	}
}
