package business_delegate.case2.BusinessService;


public class YouTubeService implements VideoStreamingService {

  @Override
  public void doProcessing() {
    System.out.println("YouTubeService is now processing");
  }
}
