package singleton;


/*
 * Singleton 패턴을 구현하는 게으른 초기화 방법은 글로벌 액세스 방법으로 인스턴스를 만듭니다.
 * 다음은 이 접근법으로 Singleton 클래스를 만들기 위한 샘플 코드입니다.
 * */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    /*
     * 위의 구현은 단일 스레드 환경의 경우 잘 작동하지만
     * 다중 스레드 시스템의 경우 여러 스레드가 동시에 if 조건 내부에 있는 경우 문제가 발생할 수 있습니다.
     * 그러면 싱글톤 패턴이 파괴되고 두 스레드 모두 싱글톤 클래스의 다른 인스턴스를 가져옵니다.
     * 다음 섹션에서는 스레드 안전 싱글톤 클래스를 만드는 다양한 방법을 살펴보겠습니다.
     * */
}
