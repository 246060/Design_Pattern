package singleton.case2;

import java.io.*;

public class SingletonSerializedTest {

    /*
    * 직렬화 된 싱글톤 클래스의 문제점은
    *
    * 역 직렬화 할 때마다 클래스의 새 인스턴스를 생성한다는 것입니다.
    * 간단한 프로그램으로 봅시다.
    * */
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        SerializedSingleton instanceOne = SerializedSingleton.getInstance();

        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

        // instanceOne hashCode=664223387
        // instanceTwo hashCode=2084435065

        // 따라서 싱글톤 패턴을 파괴하고
        // 이 시나리오를 극복하기 위해 readResolve() 메서드의 구현을 제공하는데 필요한 모든 작업을 수행합니다.

        // result after readResolve method add to SerializedSingleton
        // instanceOne hashCode=664223387
        // instanceTwo hashCode=664223387
    }
}
