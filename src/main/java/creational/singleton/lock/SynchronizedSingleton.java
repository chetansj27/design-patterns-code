package creational.singleton.lock;
/*
   Pros:
        Work fines for multithreaded env
   Cons:
         It causes slow performance as multiple threads can’t access it simultaneously
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton singletonObj;

    private SynchronizedSingleton() {

    }

    public synchronized static SynchronizedSingleton getInstance() {
        if (singletonObj == null) {
            singletonObj = new SynchronizedSingleton();
        }
        return singletonObj;
    }
}
