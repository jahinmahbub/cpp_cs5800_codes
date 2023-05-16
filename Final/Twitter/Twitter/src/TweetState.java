public interface TweetState {
    void publish(Tweet tweet);
    void delete(Tweet tweet);
}
