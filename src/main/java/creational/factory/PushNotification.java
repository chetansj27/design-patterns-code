package creational.factory;
//Concrete Product
public class PushNotification implements NotificationInterface {
    @Override
    public void sendNotification() {
        System.out.println("push notification sent");
    }
}
