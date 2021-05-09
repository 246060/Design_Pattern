package singleton.case2;

public class LazyInitializedSingleton {

    /*
     * 단일 스레드 환경의 경우 잘 작동하지만 다중 스레드 시스템의 경우
     * 여러 스레드가 동시에 if 조건 내에 있으면 문제가 발생할 수 있습니다.
     *
     * 싱글톤 패턴을 파괴하고 두 스레드 모두 싱글톤 클래스의 다른 인스턴스를 얻습니다.
     * */
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
