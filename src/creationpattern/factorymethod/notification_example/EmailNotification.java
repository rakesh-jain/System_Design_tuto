package creationpattern.factorymethod.notification_example;

public class EmailNotification implements Notification{
    @Override
    public void notifyuser() {
        System.out.println("Email Notified ");
    }
}
