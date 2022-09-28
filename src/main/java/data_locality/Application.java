package data_locality;

import data_locality.game.GameEntity;
import lombok.extern.slf4j.Slf4j;

/**
 * Use the Data Locality pattern is when you have a performance problem.
 * Take advantage of that to improve performance by increasing data locality — keeping data in contiguous memory in the order that you process it.
 *
 * Example:  Game loop that processes a bunch of game entities.
 * Those entities are decomposed into different domains  — AI, physics, and rendering — using the Component pattern.
 */
@Slf4j
public class Application {

  private static final int NUM_ENTITIES = 5;

  /**
   * Start game loop with each component have NUM_ENTITIES instance.
   */
  public static void main(String[] args) {

    log.info("Start Game Application using Data-Locality pattern");

    var gameEntity = new GameEntity(NUM_ENTITIES);
    gameEntity.start();
    gameEntity.update();
  }
}
