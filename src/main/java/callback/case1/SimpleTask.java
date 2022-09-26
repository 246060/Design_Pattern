package callback.case1;


public final class SimpleTask extends Task {

  @Override
  public void execute() {
    System.out.println("Perform some important activity and after call the callback method.");
  }
}
