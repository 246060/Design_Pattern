package data_locality.game.component;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class RenderComponent implements Component {

  @Override
  public void update() {
    // do nothing
  }

  @Override
  public void render() {
    log.info("Render Component");
  }
}
