package singleton.case2;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /*
     * 위의 구현은 잘 작동하고 스레드 안전성을 제공하지만
     * 별도의 인스턴스를 생성 할 수 있는 처음 몇 개의 스레드에 대해서만 필요하지만
     * 동기화된 메서드와 관련된 비용으로 인해 성능이 저하됩니다 (읽기 : Java 동기화).
     *
     * 매번 이러한 추가 오버 헤드를 방지하기 위해 이중 확인 잠금 원칙이 사용됩니다.
     * 이 접근 방식에서 동기화된 블록은 단일 클래스의 인스턴스가 하나만 생성되었는지
     * 확인하는 추가 검사와 함께 if 조건 내에서 사용됩니다.
     * */

    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


    /*
     * Java 5 이전에는 Java 메모리 모델에 많은 문제가 있었고
     * 위의 접근 방식은 너무 많은 스레드가 Singleton 클래스의 인스턴스를
     * 동시에 가져 오려고하는 특정 시나리오에서 실패하는데 사용되었습니다.
     *
     * 그래서 Bill Pugh는 내부 정적 도우미 클래스를 사용하여
     * Singleton 클래스를 만드는 다른 접근 방식을 고안했습니다.
     *
     * Bill Pugh Singleton 구현은 다음과 같습니다.
     * */

    private static class SingletonHelper {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstanceByBillPughSingleton() {
        return SingletonHelper.INSTANCE;
    }

    /*
     * 싱글톤 클래스의 인스턴스를 포함하는 비공개 내부 정적 클래스를 확인합니다.
     * 싱글톤 클래스가 로드되면 SingletonHelper 클래스는 메모리에 로드되지 않고
     * 누군가 getInstance 메서드를 호출 할 때만이 클래스가 로드되고 Singleton 클래스 인스턴스를 만듭니다.
     *
     * 이것은 동기화가 필요하지 않으므로 Singleton 클래스에 가장 널리 사용되는 접근 방식입니다.
     * 많은 프로젝트에서 이 접근 방식을 사용하고 있으며 이해하고 구현하기도 쉽습니다.
     * */
}










