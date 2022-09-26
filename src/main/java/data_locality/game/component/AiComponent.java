
package data_locality.game.component;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of AI component for Game.
 */
@Slf4j
public class AiComponent implements Component {

  /**
   * Update ai component.
   */
  @Override
  public void update() {
    log.info("update AI component");
  }

  @Override
  public void render() {
    // Do Nothing.
  }
}
