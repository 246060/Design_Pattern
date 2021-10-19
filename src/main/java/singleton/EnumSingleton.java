package singleton;


/*
 * Reflection을 사용하여 이러한 상황을 극복하기 위해
 * Joshua Bloch는 Java 프로그램에서 모든 enum 값이 한 번만 인스턴스화 되도록 하기 때문에
 * Java가 Singleton 디자인 패턴을 구현하는데 Enum을 사용하도록 제안합니다.
 *
 * Java Enum 값은 전역적으로 액세스 할 수 있으므로 싱글톤도 마찬가지입니다.
 *
 * 단점은 enum 유형이 다소 융통성이 없다는 것입니다.
 *
 * 예를 들어 지연 초기화를 허용하지 않습니다.
 * */
public enum EnumSingleton {

    INSTANCE;

    public static void doSomething() {
        //do something
    }
}
