package singleton.case1;

public class ThreadSafeSingletonWithLazyLoging {

    // The field must be declared volatile so that DCL(double check lock) would work correctly.
    private static volatile ThreadSafeSingletonWithLazyLoging instance;

    private String value;

    private ThreadSafeSingletonWithLazyLoging(String value) {
        try {
            // The following code emulates slow initialization.
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static ThreadSafeSingletonWithLazyLoging getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL). It
        // exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating separate
        // instances as a result.
        //
        // It may seem that having the `result` variable here is completely
        // pointless. There is, however, a very important caveat when
        // implementing double-checked locking in Java, which is solved by
        // introducing this local variable.
        //
        // You can read more info DCL issues in Java here:
        // https://refactoring.guru/java-dcl-issue

        ThreadSafeSingletonWithLazyLoging result = instance;
        if (result != null) {
            return result;
        }

        synchronized (ThreadSafeSingletonWithLazyLoging.class) {
            if (instance == null) {
                instance = new ThreadSafeSingletonWithLazyLoging(value);
            }
            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
