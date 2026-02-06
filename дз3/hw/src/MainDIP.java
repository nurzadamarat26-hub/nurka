
import java.util.List;

public class MainDIP {
    public static void main(String[] args) {

        MessageSender email = new EmailSender();
        MessageSender sms = new SmsSender();

        NotificationService service =
                new NotificationService(List.of(email, sms));

        service.sendNotification("Hello user!");
    }
}