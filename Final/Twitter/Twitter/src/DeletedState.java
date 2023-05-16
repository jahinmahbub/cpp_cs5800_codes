public class DeletedState implements TweetState {
    
    @Override
    public void publish(Tweet tweet) {
        System.out.println("Cannot publish a deleted tweet");
    }

    @Override
    public void delete(Tweet tweet) {
        System.out.println("Tweet is already deleted");
    }
}