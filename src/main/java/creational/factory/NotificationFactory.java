package creational.factory;

//creator
public abstract class NotificationFactory {
    public abstract NotificationInterface createNotification(String type);
}
