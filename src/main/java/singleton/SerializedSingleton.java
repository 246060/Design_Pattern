package singleton;

/*
 * 때로는 분산 시스템에서 파일 시스템에 상태를 저장하고 나중에 검색 할 수 있도록
 * Singleton 클래스에 Serializable 인터페이스를 구현해야합니다.
 *
 * Serializable 인터페이스를 구현하는 작은 싱글톤 클래스도 있습니다.
 * */
public class SerializedSingleton {

    private static final long serialVersionUID = -7604766932017737115L;
    private SerializedSingleton() {}

    private static class SingletonHelper {
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }

    /*
     * 직렬화된 싱글톤 클래스의 문제점은
     * 역직렬화 할 때마다 클래스의 새 인스턴스를 생성한다는 것입니다.
     *
     * 간단한 프로그램으로 봅시다.
     * */
    protected Object readResolve() {
        return getInstance();
    }


}
