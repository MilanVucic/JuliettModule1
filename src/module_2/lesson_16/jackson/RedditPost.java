package module_2.lesson_16.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RedditPost {
    @JsonProperty("data")
    private RedditPostData postData;

    public RedditPostData getPostData() {
        return postData;
    }
}
