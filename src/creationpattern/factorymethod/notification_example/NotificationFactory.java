package creationpattern.factorymethod.notification_example;

public class NotificationFactory {
    public Notification notification(String str){
        if(str==null || str.isEmpty()){
            return null;
        }
        switch (str){
            case "SMS": return new SmsNotification();
            case "PUSH":return new PushNotification();
            case "EMAIL" : return new EmailNotification();
            default:throw new RuntimeException("Unknown Exception "+str);
        }
    }
}
