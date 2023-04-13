public class Driver {
    public static void main(String[] args) {
        MessagingApp whatsapp = new WhatsAppMessagingApp();
        MessagingApp telegram = new TelegramMessagingApp();
        MessagingApp facebook = new FacebookMessagingApp();

        MessageType text = new TextMessage();
        MessageType image = new ImageMessage();
        MessageType video = new VideoMessage();

        whatsapp.sendMessage(text);
        whatsapp.sendMessage(image);
        telegram.sendMessage(text);
        telegram.sendMessage(video);
        facebook.sendMessage(image);
        facebook.sendMessage(video);    }
}
