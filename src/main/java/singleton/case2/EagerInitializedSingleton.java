package singleton.case2;

public class EagerInitializedSingleton {

    /*
        싱글톤 클래스가 많은 리소스를 사용하지 않는 경우 사용하는 방법입니다.
        그러나 대부분의 시나리오에서 Singleton 클래스는 파일 시스템, 데이터베이스 연결 등과 같은 리소스에 대해 생성됩니다.

        클라이언트가 getInstance 메서드를 호출하지 않는 한 인스턴스화를 피해야합니다.
        또한 이 메서드는 예외 처리를 위한 옵션을 제공하지 않습니다.
    */

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
