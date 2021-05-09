package singleton.case1;

public class BasicSingleton {

    private static BasicSingleton instance;
    private String value;

    public BasicSingleton(String value) {

        try {
            // The following code emulates slow initialization.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.value = value;
    }

    public static BasicSingleton getInstance(String value) {
        if (instance == null) {
            instance = new BasicSingleton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }
}
