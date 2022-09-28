
package data_locality.game.component;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AiComponent implements Component {

  @Override
  public void update() {
    log.info("update AI component");
  }

  @Override
  public void render() {
    // Do Nothing.
  }
}
