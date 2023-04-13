public class TelegramMessagingApp implements MessagingApp {
    @Override
    public void sendMessage(MessageType messageType) {
        System.out.print("Sending message via Telegram: ");
        messageType.sendMessage();
    }
}