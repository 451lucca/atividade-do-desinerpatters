public class Main {
    public static void main(String[] args) {
        String message = "Bem-vindo ao sistema!";

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        NotificationService pushService = new NotificationService(new PushNotificationFactory());

        emailService.send(message);
        smsService.send(message);
        pushService.send(message);
    }
}
