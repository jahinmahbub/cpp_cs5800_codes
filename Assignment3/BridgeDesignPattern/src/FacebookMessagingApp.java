public class FacebookMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        System.out.print("Sending message via Facebook Messenger: ");
        messageType.sendMessage();
    }
}