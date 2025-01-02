package creationpattern.factorymethod.notification_example;

public class NotificationApplication {
    public static void main(String[] args) {
        NotificationFactory notificationFactory=new NotificationFactory();
        Notification notification=notificationFactory.notification("EMAIL");
        notification.notifyuser();
    }
}
