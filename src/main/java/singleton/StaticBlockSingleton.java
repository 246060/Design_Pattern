package singleton;


/*
 * 정적 블록 초기화 구현은
 * 예외 처리 옵션을 제공하는 정적블록에 클래스의 인스턴스가 생성된다는 점을 제외하면
 * 즉시 초기화와 유사합니다.
 * */
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {}

    //static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    /*
     * Both eager initialization and static block initialization
     * creates the instance even before it’s being used
     * and that is not the best practice to use.
     * So in further sections, we will learn how to create a Singleton class that supports lazy initialization.
     * */
}












