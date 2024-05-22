package creational.factory;

public class ConcreteNotificationFactory extends NotificationFactory {
    @Override
    public NotificationInterface createNotification(String type) {
        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
