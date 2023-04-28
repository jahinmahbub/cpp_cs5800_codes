import java.time.LocalDateTime;
import java.util.List;

public class Message {
    private String sender;
    private List<User> recipients;
    private LocalDateTime timestamp;
    private String content;

    public Message(String name, List<User> recipients, String content) {
        this.sender = name;
        this.recipients = recipients;
        this.timestamp = LocalDateTime.now();
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getContent() {
        return content;
    }

    public MessageMemento createMemento() {
        return new MessageMemento(content, timestamp);
    }

    public void restoreFromMemento(MessageMemento memento) {
        this.content = memento.getMessageContent();
        this.timestamp = memento.getTimestamp();
    }

    public String getId() {
        return String.format("%s-%s", sender, timestamp);
    }

    public MessageMemento saveToMemento(MessageMemento memento) {
        return new MessageMemento(memento.getMessageContent(), memento.getTimestamp());
    }

    
}
