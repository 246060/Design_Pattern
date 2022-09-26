package data_locality.game.component;

import lombok.extern.slf4j.Slf4j;

/**
 * Implementation of Physics Component of Game.
 */
@Slf4j
public class PhysicsComponent implements Component {

  /**
   * update physics component of game.
   */
  @Override
  public void update() {
    log.info("Update physics component of game");
  }

  @Override
  public void render() {
    // do nothing
  }
}
