package creational.factory;

public class ClientDemo {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new ConcreteNotificationFactory();
        NotificationInterface emailNotification = notificationFactory.createNotification("Email");
        emailNotification.sendNotification();
        NotificationInterface pushNotification = notificationFactory.createNotification("Push");
        pushNotification.sendNotification();
    }
}
