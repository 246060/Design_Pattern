package bridge.case2;

public interface BaseRepository {
    void save(BaseEntity entity);
    StorageRepository getStorageRepository();
}
