package creational.singleton;

import creational.singleton.billpugh.BillPughSingleton;
import creational.singleton.doublecheck.DoubleCheckLockSingleton;
import creational.singleton.eager.EagerSingleton;
import creational.singleton.lazy.LazySingleton;
import creational.singleton.lock.SynchronizedSingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        DoubleCheckLockSingleton doubleCheckLockSingleton = DoubleCheckLockSingleton.getInstance();
        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
    }
}
