import java.util.*;

public class TwitterUser {
    private String username;
    private List<Tweet> tweets;
    private List<TwitterUser> followers;
    
    public TwitterUser(String username) {
        this.username = username;
        this.tweets = new ArrayList<>();
        this.followers = new ArrayList<>();
    }
    
    public void postTweet(Tweet tweet) {
        TweetValidator validator = new TweetValidator();
        if (validator.validate(tweet)) {
            this.tweets.add(tweet);
            tweet.setAuthor(username);
            tweet.publish(tweet);
        } else {
            System.out.println("Invalid tweet. Please check the tweet content, length, and hashtags/mentions.");
        }
    }
    
    public void likeTweet(Tweet tweet) {
        tweet.like();
    }
    
    public void retweet(Tweet tweet) {
        tweet.retweet();
    }
    
    public void follow(TwitterUser user) {
        if (!this.followers.contains(user)) {
            this.followers.add(user);
            user.notifyFollowers(this.username + " started following " + user.getUsername());
        }
    }
    
    public void unfollow(TwitterUser user) {
        if (this.followers.contains(user)) {
            this.followers.remove(user);
            user.notifyFollowers(this.username + " stopped following " + user.getUsername());
        }
    }
    
    public void notifyFollowers(String message) {
        for (TwitterUser follower : this.followers) {
            System.out.println("Notification for " + follower.getUsername() + ": " + message);
        }
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public List<Tweet> getTweets() {
        return this.tweets;
    }
    
    public List<TwitterUser> getFollowers() {
        return this.followers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tweets by " + this.username + ":\n");
        for (Tweet tweet : this.tweets) {
            sb.append(tweet.getContent() + "\n");
        }
        return sb.toString();
    }
}
