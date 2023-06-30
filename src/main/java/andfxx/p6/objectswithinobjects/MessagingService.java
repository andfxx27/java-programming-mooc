package andfxx.p6.objectswithinobjects;

import java.util.ArrayList;
import java.util.List;

public class MessagingService {
    private final List<Message> messages;

    public MessagingService() {
        messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return (ArrayList<Message>) messages;
    }
}
