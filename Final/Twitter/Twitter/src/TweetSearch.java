import java.util.*;

public class TweetSearch {
    private List<Tweet> tweets;

    public TweetSearch(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<Tweet> searchByHashtag(String hashtag) {
        List<Tweet> result = new ArrayList<>();
        for (Tweet tweet : tweets) {
            if (tweet.getHashtags().contains(hashtag)) {
                result.add(tweet);
            }
        }
        return result;
    }

    public List<Tweet> searchByMention(String mention) {
        List<Tweet> result = new ArrayList<>();
        for (Tweet tweet : tweets) {
            if (tweet.getMentions().contains(mention)) {
                result.add(tweet);
            }
        }
        return result;
    }
}