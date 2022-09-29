package double_dispatch.case1;

import double_dispatch.case1.constants.AppConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * Space station Mir game object.
 */
@Slf4j
public class SpaceStationMir extends GameObject {

	public SpaceStationMir(int left, int top, int right, int bottom) {
		super(left, top, right, bottom);
	}

	@Override
	public void collision(GameObject gameObject) {
		gameObject.collisionResolve(this);
	}

	@Override
	public void collisionResolve(FlamingAsteroid asteroid) {
		log.info(AppConstants.HITS + " {} is damaged! {} is set on fire!", asteroid.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
		setOnFire(true);
	}

	@Override
	public void collisionResolve(Meteoroid meteoroid) {
		log.info(AppConstants.HITS + " {} is damaged!", meteoroid.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}

	@Override
	public void collisionResolve(SpaceStationMir mir) {
		log.info(AppConstants.HITS + " {} is damaged!", mir.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}

	@Override
	public void collisionResolve(SpaceStationIss iss) {
		log.info(AppConstants.HITS, " {} is damaged!", iss.getClass().getSimpleName(), this.getClass().getSimpleName(), this.getClass().getSimpleName());
		setDamaged(true);
	}
}
