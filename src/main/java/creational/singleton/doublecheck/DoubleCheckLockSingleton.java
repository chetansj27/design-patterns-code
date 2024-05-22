package creational.singleton.doublecheck;
/*
   Pros:
        Work fines for multithreaded env and performance overhead gets reduced
   Cons:
         First time, it can affect performance
 */
public class DoubleCheckLockSingleton {
    private static DoubleCheckLockSingleton singletonObj;

    private DoubleCheckLockSingleton() {

    }

    public static DoubleCheckLockSingleton getInstance() {
        if (singletonObj == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                singletonObj = new DoubleCheckLockSingleton();
            }
        }
        return singletonObj;
    }
}
