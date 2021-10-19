package singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    /*
     * 리플렉션은 위의 모든 싱글 톤 구현 접근법을 파괴하는 데 사용할 수 있습니다.
     * 예제 클래스로 이것을 보겠습니다.
     * */
    public static void main(String[] args) {

        practice_1.singleton.EagerInitializedSingleton instanceOne = practice_1.singleton.EagerInitializedSingleton.getInstance();
        practice_1.singleton.EagerInitializedSingleton instanceTwo = null;

        try {
            Constructor[] constructors = practice_1.singleton.EagerInitializedSingleton.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (practice_1.singleton.EagerInitializedSingleton) constructor.newInstance();
                break;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }

    /*
     * 위의 테스트 클래스를 실행하면
     * 두 인스턴스의 hashCode가 싱글톤 패턴을 파괴하는 것과 동일하지 않음을 알 수 있습니다.
     *
     * Reflection은 매우 강력하며 Spring 및 Hibernate와 같은 많은 프레임 워크에서 사용됩니다.
     * Java Reflection Tutorial을 확인하십시오.
     * */
}
