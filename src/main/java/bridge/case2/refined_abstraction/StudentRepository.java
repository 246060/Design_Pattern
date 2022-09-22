package bridge.case2.refined_abstraction;

import bridge.case2.BaseEntity;
import bridge.case2.abstraction.BaseRepository;
import bridge.case2.implementor.StorageRepository;

public class StudentRepository implements BaseRepository {

	StorageRepository storageRepository;

	public StudentRepository(StorageRepository storageRepository) {
		this.storageRepository = storageRepository;
	}

	@Override
	public void save(BaseEntity entity) {
		storageRepository.store(entity);
	}

	@Override
	public StorageRepository getStorageRepository() {
		return storageRepository;
	}
}
