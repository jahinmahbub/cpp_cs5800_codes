public class DraftState implements TweetState {

    @Override
    public void publish(Tweet tweet) {
        tweet.setState(new PublishedState());
    }

    @Override
    public void delete(Tweet tweet) {
        tweet.setState(new DeletedState());
    }
}