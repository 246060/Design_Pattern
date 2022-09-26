package data_locality.game.component.manager;

import java.util.stream.IntStream;

import data_locality.game.component.Component;
import data_locality.game.component.RenderComponent;
import lombok.extern.slf4j.Slf4j;

/**
 * Render component manager for Game.
 */
@Slf4j
public class RenderComponentManager {

  private static final int MAX_ENTITIES = 10000;

  private final int numEntities;

  private final Component[] renderComponents = new RenderComponent[MAX_ENTITIES];

  public RenderComponentManager(int numEntities) {
    this.numEntities = numEntities;
  }

  /**
   * Start render component.
   */
  public void start() {
    log.info("Start Render Game Component ");
    IntStream.range(0, numEntities).forEach(i -> renderComponents[i] = new RenderComponent());
  }


  /**
   * render component.
   */
  public void render() {
    log.info("Update Render Game Component ");
    // Process Render.
    IntStream.range(0, numEntities)
        .filter(i -> renderComponents.length > i && renderComponents[i] != null)
        .forEach(i -> renderComponents[i].render());
  }
}
