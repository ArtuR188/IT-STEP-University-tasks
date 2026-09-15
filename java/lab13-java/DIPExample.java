interface MessageSender {
    void send(String msg);
}

class EmailSender implements MessageSender {
    public void send(String msg) {
        System.out.println("Email: " + msg);
    }
}

class Notification {
    private final MessageSender sender;
    Notification(MessageSender sender) {
        this.sender = sender;
    }
    void notifyUser(String msg) {
        sender.send(msg);
    }
}

public class DIPExample {
    public static void main(String[] args) {
        MessageSender sender = new EmailSender();
        Notification n = new Notification(sender);
        n.notifyUser("Hello!");
    }
}
