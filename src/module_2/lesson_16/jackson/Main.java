package module_2.lesson_16.jackson;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new JsonMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        URL url = null;
        try {
            url = new URL("https://www.reddit.com/.json");
            RedditResponse response = objectMapper.readValue(url, RedditResponse.class);
            for (RedditPost post: response.getData().getPosts()) {
                System.out.println("_____________________");
                System.out.println("Subreddit:" + post.getPostData().getSubreddit());
                System.out.println("Title:" + post.getPostData().getTitle());
                System.out.println("_____________________");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
