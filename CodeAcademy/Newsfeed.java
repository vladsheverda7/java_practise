package CodeAcademy;

public class Newsfeed {
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    public int[] views = {0, 0, 0, 0};
    String[] favoriteArticles;

    public Newsfeed(){
        favoriteArticles = new String[10];
    }

    public String[] getTopics(){
        return topics;
    }

    public String getFirstTopic() {
        return topics[0];
    }

    public void viewTopic(int topicIndex){
        views[topicIndex] = views[topicIndex] + 1;
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle){
        // Add newArticle to favoriteArticles:
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public int getNumTopics(){
        return topics.length;
    }
}

