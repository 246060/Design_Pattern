package front_controller_pattern.case2.View;


public class ErrorView implements View {

  @Override
  public void display() {
    System.out.println("Error 500");
  }
}
