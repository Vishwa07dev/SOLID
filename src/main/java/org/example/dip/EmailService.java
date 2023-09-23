package org.example.dip;

/**
 * High level modules should not depend on the low level modules. Both should depend on the interface.
 *
 * Also the details should depend on abstraction
 */
public class EmailService {
    void sendEmail(String message){
        System.out.println("Email sent "+ message);
    }
}

class SMSService {
    void sendMessage(String message){
        System.out.println("Message sent " + message);
    }
}

class NotificationService {
    private SMSService smsService;
    private EmailService emailService;

    public  NotificationService(){
        smsService = new SMSService();
        emailService = new EmailService();
    }

    void sendNotification(String message){
        emailService.sendEmail(message);
        smsService.sendMessage(message);
    }
}
