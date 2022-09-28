package data_locality.game;

import data_locality.game.component.manager.AiComponentManager;
import data_locality.game.component.manager.PhysicsComponentManager;
import data_locality.game.component.manager.RenderComponentManager;
import lombok.extern.slf4j.Slf4j;

/**
 * The game Entity maintains a big array of pointers .
 *
 * Each spin of the game loop, we need to run the following:
 * <p>Update the AI components.
 * <p>Update the physics components for them.
 * <p>Render them using their render components.
 */
@Slf4j
public class GameEntity {

  private final AiComponentManager aiComponentManager;
  private final PhysicsComponentManager physicsComponentManager;
  private final RenderComponentManager renderComponentManager;

  public GameEntity(int numEntities) {
    log.info("Init Game with #Entity : {}", numEntities);
    aiComponentManager = new AiComponentManager(numEntities);
    physicsComponentManager = new PhysicsComponentManager(numEntities);
    renderComponentManager = new RenderComponentManager(numEntities);
  }

  public void start() {
    log.info("Start Game");
    aiComponentManager.start();
    physicsComponentManager.start();
    renderComponentManager.start();
  }

  public void update() {
    log.info("Update Game Component");
    aiComponentManager.update();
    physicsComponentManager.update();
    renderComponentManager.render();
  }

}
