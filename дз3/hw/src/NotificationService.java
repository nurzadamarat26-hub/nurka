import java.util.List;

public class NotificationService {

    private List<MessageSender> senders;

    public NotificationService(List<MessageSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (MessageSender sender : senders) {
            sender.send(message);
        }
    }
}