package bridge.case2.implementor;

import bridge.case2.BaseEntity;

public interface StorageRepository {
	void store(BaseEntity entity);
}
