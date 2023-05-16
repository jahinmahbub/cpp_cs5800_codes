import java.util.*;

public class Tweet {
    private String content;
    private List<String> hashtags;
    private List<String> mentions;
    private TweetState state;
    private int likes; 
    private int retweets; 
    private String author;

    public Tweet(String content, String hashtag) {
        this.content = content;
        this.hashtags = new ArrayList<>();
        this.mentions = new ArrayList<>();
        this.state = new DraftState();
        this.likes = 0;
        this.retweets = 0;
        this.author = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addHashtag(String hashtag) {
        hashtags.add(hashtag);
    }

    public void removeHashtag(String hashtag) {
        hashtags.remove(hashtag);
    }

    public void addMention(String mention) {
        mentions.add(mention);
    }

    public void removeMention(String mention) {
        mentions.remove(mention);
    }

    public void setState(TweetState state) {
        this.state = state;
    }

    public void publish(Tweet tweet) {
        state.publish(tweet);
    }

    public void delete(Tweet tweet) {
        state.delete(tweet);
    }

    public void like() {
        likes++;
    }
    
    public void retweet() {
        retweets++;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public List<String> getMentions() {
        return mentions;
    }

    public int getLikes() {
        return likes;
    }
    
    public int getRetweets() {
        return retweets;
    }
}
