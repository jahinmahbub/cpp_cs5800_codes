public class WhatsAppMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        System.out.print("Sending message via WhatsApp: ");
        messageType.sendMessage();
    }
}