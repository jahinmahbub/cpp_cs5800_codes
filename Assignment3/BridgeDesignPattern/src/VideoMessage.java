public class VideoMessage implements MessageType {
    @Override
    public void sendMessage() {
        System.out.println("Video sent");
    }
}