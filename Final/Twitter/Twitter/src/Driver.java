import java.util.*;

public class Driver {
    public static void main(String[] args) {
        List<TwitterUser> userBase = new ArrayList<>(); 
        TwitterUser Sharon = new TwitterUser("Ingeborg");

        // Create 3 different users
        TwitterUser Elon = new TwitterUser("Elon");
        TwitterUser Bill = new TwitterUser("Bill");
        TwitterUser Zuck = new TwitterUser("Zuck");

        userBase.add(Elon);
        userBase.add(Bill);
        userBase.add(Zuck);
        userBase.add(Sharon);        
        // Have each user post some tweets
        Tweet Elon1 = new Tweet("SpaceX is a Scam","SpaceX");
        Elon.postTweet(Elon1);
        Tweet Elon2 = new Tweet("I made Twitter way better","Twitter");
        Elon.postTweet(Elon2);
        Tweet Bill1 = new Tweet("LinkedIn is a Scam","LinkedIn");
        Bill.postTweet(Bill1);
        Tweet Bill2 = new Tweet("Xbox is a Scam","Xbox");
        Bill.postTweet(Bill2);
        Tweet Bill3 = new Tweet("Sony is better","Sony");
        Bill.postTweet(Bill3);
        Tweet Zuck1 = new Tweet("Instagram is a cesspool","Instagram");
        Zuck.postTweet(Zuck1);
        Tweet Zuck2 = new Tweet("WhatsApp is Garbage", "Whatsapp");
        Zuck.postTweet(Zuck2);

        Zuck.follow(Sharon);
        Bill.follow(Zuck);
        Elon.follow(Bill);
        Zuck.follow(Elon);

        // Print out the timeline for each user
        System.out.println(Elon);
        
        System.out.println(Bill);
        
        System.out.println(Zuck);

    }
}
