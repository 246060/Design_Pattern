package bridge.case2.abstraction;

import bridge.case2.BaseEntity;
import bridge.case2.implementor.StorageRepository;

public interface BaseRepository {
	void save(BaseEntity entity);
	StorageRepository getStorageRepository();
}
