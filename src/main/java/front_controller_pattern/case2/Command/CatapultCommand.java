package front_controller_pattern.case2.Command;

import front_controller_pattern.case2.View.CatapultView;


public class CatapultCommand implements Command {

  @Override
  public void process() {
    new CatapultView().display();
  }
}
