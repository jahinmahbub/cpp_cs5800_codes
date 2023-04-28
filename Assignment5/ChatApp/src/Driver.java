public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServer();

        // Register users
        User alice = new User("Alice", chatServer);
        User bob = new User("Bob", chatServer);
        User charlie = new User("Charlie", chatServer);

        alice.registerUser(alice);
        bob.registerUser(bob);
        charlie.registerUser(charlie);

        // Send messages
        alice.send(bob, "Hello Bob!");
        bob.send(alice, "Hi Alice, how are you?");
        charlie.send(alice, "Hey Alice, want to grab lunch?");
        alice.send(charlie, "Sure Charlie, where do you want to go?");

        // Undo last message
        alice.undo(alice);

        // Block messages from specific user
        bob.block(alice);

        // Send messages again
        alice.send(bob, "Please can you unblock me, Bob?");
        bob.send(alice, "No, sorry Alice.");

        // Print chat history
        System.out.println("Chat history for Alice:");
        alice.getChatHistory();

        System.out.println("Chat history for Bob:");
        bob.getChatHistory();

        System.out.println("Chat history for Charlie:");
        charlie.getChatHistory();
    }
}