package singleton.case2;

public class StaticBlockSingleton {

    /*
     * 정적 블록 초기화 구현은 예외 처리 옵션을 제공하는
     * 정적 블록에서 클래스의 인스턴스가 생성된다는 점을 제외하면 즉시 초기화와 유사합니다.
     *
     * 예외 처리는 제공하나 지연 초기화는 없음.
     * */

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
}
