package business_delegate.case2.BusinessService;


public class NetflixService implements VideoStreamingService {

  @Override
  public void doProcessing() {
    System.out.println("NetflixService is now processing");
  }
}
