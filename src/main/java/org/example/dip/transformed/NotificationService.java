package org.example.dip.transformed;

public class NotificationService {

    private MessageService messageService ;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    void sendNotification(String message){
        this.messageService.sendMessage(message);
    }
}

interface MessageService {

    void sendMessage(String message);
}


class SMSService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent : "+ message);
    }
}

class EmailService implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent : "+ message);
    }
}
