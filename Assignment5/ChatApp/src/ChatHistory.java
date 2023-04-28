/*
ChatHistory: A class that stores the chat history for a user. It should have methods to add a new message to the history and get the last message sent.
*/

import java.util.ArrayList;
import java.util.List;

public class ChatHistory {

    private List<Message> messages;

    public ChatHistory() {
        this.messages = new ArrayList<>();
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public Message getLastMessage() {
        if (messages.isEmpty()) {
            return null;
        }
        return messages.get(messages.size() - 1);
    }

    public void removeLastMessage() {
        messages.remove(messages.size() - 1);
        if (messages.isEmpty()) {
            messages = null;
        }
        else {
            messages.get(messages.size() - 1);
        }
        
    }
    
    public List<Message> getMessages() {
        return messages;
    }
    
    public void getChatHistory() {
        System.out.println("Chat History:");
        for (Message message : messages) {
            System.out.println("From: " + message.getSender() + ", To: " + message.getRecipients() + ", Timestamp: " + message.getTimestamp() + ", Message: " + message.getContent());
        }
    }
}