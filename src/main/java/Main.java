import mail.EmailSender;
import mail.Property;

/**
 * Created by Николай on 14.07.2016.
 */
public class Main {

    public static void main(String[] args) {

        String username = "";
        String password = "";
        EmailSender emailSender = new EmailSender(new Property(username, password).getSession());
        emailSender.send(username, username);

    }
}
