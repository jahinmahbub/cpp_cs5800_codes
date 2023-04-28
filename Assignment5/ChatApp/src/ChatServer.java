import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatServer {
    private Map<User, ChatHistory> chatHistories;
    private Map<User, List<User>> blockedUsers;

    public ChatServer() {
        chatHistories = new HashMap<>();
        blockedUsers = new HashMap<>();
    }

    public void registerUser(User user) {
        chatHistories.put(user, new ChatHistory());
        blockedUsers.put(user, new ArrayList<>());
    }

    public void unregisterUser(User user) {
        chatHistories.remove(user);
        blockedUsers.remove(user);
    }

    public void sendMessage(String sender, List<User> recipients, String messageContent) {
        Message message = new Message(sender, recipients, messageContent);
        for (User recipient : recipients) {
            if (!isBlocked(sender, recipient)) {
                ChatHistory chatHistory = chatHistories.get(recipient);
                chatHistory.addMessage(message);
            }
        }
    }

    public void undoLastMessage(User user) {
        ChatHistory chatHistory = chatHistories.get(user);
        Message lastMessage = chatHistory.getLastMessage();
        MessageMemento memento = new MessageMemento(lastMessage.getContent(),LocalDateTime.now());
        if (lastMessage != null && !isBlocked(lastMessage.getSender(), user)) {
            lastMessage.saveToMemento(memento);
            chatHistory.removeLastMessage();
            System.out.println("User " + user.getName() + " has undone their last message.");
        } else {
            System.out.println("User " + user.getName() + " cannot undo their last message.");
        }
    }

    public void blockUser(User user, User userToBlock) {
        List<User> blockedList = blockedUsers.get(user);
        if (!blockedList.contains(userToBlock)) {
            blockedList.add(userToBlock);
            System.out.println("User " + user.getName() + " has blocked messages from user " + userToBlock.getName() + ".");
        } else {
            System.out.println("User " + user.getName() + " has already blocked messages from user " + userToBlock.getName() + ".");
        }
    }

    public void unblockUser(User user, User userToUnblock) {
        List<User> blockedList = blockedUsers.get(user);
        if (blockedList.remove(userToUnblock)) {
            System.out.println("User " + user.getName() + " has unblocked messages from user " + userToUnblock.getName() + ".");
        } else {
            System.out.println("User " + user.getName() + " was not blocking messages from user " + userToUnblock.getName() + ".");
        }
    }

    private boolean isBlocked(String sender, User recipient) {
        List<User> blockedList = blockedUsers.get(recipient);
        return blockedList.contains(sender);
    }
}
