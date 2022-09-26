package front_controller_pattern.case2.Command;

import front_controller_pattern.case2.View.ErrorView;


public class UnknownCommand implements Command {

  @Override
  public void process() {
    new ErrorView().display();
  }
}
