package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RedditData {
    @JsonProperty("children")
    private List<RedditPost> posts;

    public List<RedditPost> getPosts() {
        return posts;
    }
}
