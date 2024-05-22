package creational.singleton.eager;
/*
   Pros:
        Easy to implement
   Cons:
        May lead to resource wastage. Because instance of class is created always, whether it is required or not.
 */
public class EagerSingleton {
    private static final EagerSingleton singletonObj = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return singletonObj;
    }
}
