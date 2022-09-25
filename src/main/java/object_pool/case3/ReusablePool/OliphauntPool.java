package object_pool.case3.ReusablePool;

import object_pool.case3.Reusable.Oliphaunt;

public class OliphauntPool extends ObjectPool<Oliphaunt> {

	@Override
	protected Oliphaunt create() {
		return new Oliphaunt();
	}
}