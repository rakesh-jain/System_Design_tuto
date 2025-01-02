package creationpattern.factorymethod.notification_example;

public class PushNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Push notified");
    }
}
