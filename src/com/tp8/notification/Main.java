package com.tp8.notification;
public class Main {

    public static void main(String[] args) {

        System.out.println("TESTS NOTIFICATIONS");

        NotificationSender emailSender =
                new EmailNotificationSender();

        NotificationService emailService =
                new NotificationService(emailSender);

        emailService.sendWelcomeMessage("user@example.com");

        System.out.println();

        NotificationSender smsSender =
                new SmsNotificationSender();

        NotificationService smsService =
                new NotificationService(smsSender);

        smsService.sendWelcomeMessage("+33612345678");
    }
}
