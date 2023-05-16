public class TweetValidator {
    public boolean validate(Tweet tweet) {
        String content = tweet.getContent();

        // Check that the tweet is not empty
        if (content.trim().isEmpty()) {
            return false;
        }

        // Check that the tweet is not too long
        if (content.length() > 280) {
            return false;
        }
        
        // All checks passed, tweet is valid
        return true;
    }
}
