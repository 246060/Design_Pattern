package data_locality.game.component.manager;

import data_locality.game.component.AiComponent;
import data_locality.game.component.Component;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
public class AiComponentManager {

	private static final int MAX_ENTITIES = 10000;
	private final int numEntities;
	private final Component[] aiComponents = new AiComponent[MAX_ENTITIES];

	public AiComponentManager(int numEntities) {
		this.numEntities = numEntities;
	}

	public void start() {
		log.info("Start AI Game Component");
		IntStream.range(0, numEntities).forEach(i -> aiComponents[i] = new AiComponent());
	}

	public void update() {
		log.info("Update AI Game Component");
		IntStream.range(0, numEntities)
						.filter(i -> aiComponents.length > i && aiComponents[i] != null)
						.forEach(i -> aiComponents[i].update());
	}
}
