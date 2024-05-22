package creational.factory;
//concrete prodcut
public class EmailNotification implements NotificationInterface {
    @Override
    public void sendNotification() {
        System.out.println("email notification sent");
    }
}
