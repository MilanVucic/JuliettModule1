package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class RedditPostData {
    private String title;
    private String subreddit;

    public String getTitle() {
        return title;
    }

    public String getSubreddit() {
        return subreddit;
    }
}
