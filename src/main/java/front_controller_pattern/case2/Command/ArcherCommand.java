package front_controller_pattern.case2.Command;

import front_controller_pattern.case2.View.ArcherView;


public class ArcherCommand implements Command {

  @Override
  public void process() {
    new ArcherView().display();
  }
}
