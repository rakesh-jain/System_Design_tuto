package creationpattern.factorymethod.notification_example;

public class SmsNotification implements Notification {
    @Override
    public void notifyuser() {
        System.out.println("SMS notified");
    }
}
