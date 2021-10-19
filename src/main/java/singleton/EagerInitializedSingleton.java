package singleton;

/*
 * eager 초기화에서는 클래스 로딩시 Singleton Class의 인스턴스가 생성되는데,
 * 이는 singleton 클래스를 생성하는 가장 쉬운 방법이지만
 * 클라이언트 응용 프로그램이 사용하지 않는 경우에도 인스턴스가 생성된다는 단점이 있습니다.
 * */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    /*
     * 싱글톤 클래스가 많은 리소스를 사용하지 않는 경우 사용하는 방법입니다.
     * 그러나 대부분의 시나리오에서 Singleton 클래스는 파일 시스템, 데이터베이스 연결 등과 같은 리소스에 대해 생성됩니다.
     * 클라이언트가 getInstance 메서드를 호출하지 않는한 인스턴스화를 피해야 합니다.
     * 또한 이 메서드는 예외처리를 위한 옵션을 제공하지 않습니다.
     * */
}
