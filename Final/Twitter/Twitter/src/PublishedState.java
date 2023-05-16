public class PublishedState implements TweetState {
    
    @Override
    public void publish(Tweet tweet) {
        System.out.println("Tweet is already published");
    }

    @Override
    public void delete(Tweet tweet) {
        tweet.setState(new DeletedState());
    }
}