package CodeAcademy;

import java.util.Arrays;

public class MainNews {
    public static void main(String[] args) {
        Newsfeed sampleFeed = new Newsfeed();
        System.out.println(Arrays.toString(sampleFeed.getTopics()));

        System.out.println("The top topic is " + sampleFeed.getFirstTopic());

        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(1);
        sampleFeed.viewTopic(3);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(2);
        sampleFeed.viewTopic(1);

        System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!");

        sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
        sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
        sampleFeed.setFavoriteArticle(0, "Oil News");

        System.out.println(Arrays.toString(sampleFeed.favoriteArticles));

        System.out.println(sampleFeed.getNumTopics());
    }
}