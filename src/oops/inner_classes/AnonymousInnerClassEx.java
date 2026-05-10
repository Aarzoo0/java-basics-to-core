package oops.inner_classes;

public class AnonymousInnerClassEx {

    public static void main(String[] args) {

        NotificationService email=new NotificationService() {
            @Override
            public void sendNotification(String customerName) {
                System.out.println("Sending email to "+ customerName);
            }
        };

        System.out.println();

        NotificationService sms=new NotificationService() {
            @Override
            public void sendNotification(String customerName) {
                System.out.println("Sending sms to "+customerName);
            }
        };

        email.sendNotification("Tarak");
        sms.sendNotification("Daya");

    }
}
