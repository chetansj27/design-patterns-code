package creational.singleton.lazy;
/*
   Pros:
        Object is created only if it is needed. It may overcome wastage of resource and  CPU time.
   Cons:
        If multiple threads are inside the if condition at the same time.
        It will destroy the singleton pattern and both threads will get different instances of the singleton class.
 */
public class LazySingleton {
    private static LazySingleton singletonObj;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (singletonObj == null) {
            singletonObj = new LazySingleton();
        }
        return singletonObj;
    }
}
