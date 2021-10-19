package singleton;


/*
 * 스레드 안전 싱글톤 클래스를 만드는 더 쉬운 방법은
 * 글로벌 액세스 방법을 동기화하여 한 번에 하나의 스레드만 이 메서드를 실행할 수 있도록 하는 것입니다.
 * 이 접근법의 일반적인 구현은 아래 클래스와 같습니다.
 * */
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
     * 위의 구현은 잘 작동하며 스레드 안전성을 제공하지만,
     * 동기화된 메서드와 관련된 비용 때문에 성능이 저하됩니다(읽기: Java Synchronization).
     *
     * 매번 오버헤드가 증가하지 않도록 이중 점검 잠금 원칙을 사용합니다.
     * 이 접근 방식에서는 동기화된 블록이 if 조건 내에서 추가 확인과 함께 사용되어 싱글톤 클래스의 인스턴스 하나만 생성되도록 합니다.
     * */


    // 다음 코드 조각은 이중 체크된 잠금 구현을 제공합니다.
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }


}
