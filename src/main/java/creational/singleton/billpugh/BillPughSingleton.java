package creational.singleton.billpugh;

public class BillPughSingleton {
    private BillPughSingleton() {

    }

    public static BillPughSingleton getInstance() {
        return InnerClass.singletonObj;
    }

    private static class InnerClass {
        private static final BillPughSingleton singletonObj = new BillPughSingleton();
    }

}
