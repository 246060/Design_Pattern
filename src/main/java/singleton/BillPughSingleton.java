package singleton;

/*
 * Java5 이전 버전에서는 Java 메모리 모델에 많은 문제가 발생했으며,
 * 너무 많은 스레드가 Singleton 클래스의 인스턴스를 동시에 가져오려고 하는 특정 시나리오에서 위의 접근 방식이 실패하는데 사용되었습니다.
 *
 * 그래서 빌 퍼그(Bill Pugh)는 내부 정적 도우미 클래스를 사용하여 싱글턴 클래스를 만드는 다른 방법을 생각해냈습니다.
 * Bill Pugh Singleton 구현은 다음과 같습니다.
 * */
public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }


    /*
     * 싱글톤 클래스의 인스턴스를 포함하는 비공개 내부 정적 클래스를 확인합니다.
     * 싱글톤 클래스가 로드되면 SingletonHelper 클래스는 메모리에 로드되지 않고
     * 누군가 getInstance 메서드를 호출 할 때만
     * 이 클래스가 로드되고 Singleton 클래스 인스턴스를 만듭니다.
     *
     * 이것은 synchronization가 필요하지 않으므로 Singleton 클래스에 가장 널리 사용되는 접근 방식입니다.
     * 많은 프로젝트에서 이 접근 방식을 사용하고 있으며 이해하고 구현하기도 쉽습니다.
     * */
}
