package bridge.case2;

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
