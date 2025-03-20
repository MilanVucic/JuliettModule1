package module_1.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WordSuggester {
    private int suggestionCount;
    private Map<String, Map<String, Integer>> nextWordFrequencies;

    public void addText(String text) {
        // ....
    }

    public List<String> getSuggestionsFor(String word) {
        return getSuggestionsFor(word, suggestionCount);
    }

    public List<String> getSuggestionsFor(String word, int count) {
        return new ArrayList<>();
    }

    public void setSuggestionCount(int suggestionCount) {
        this.suggestionCount = suggestionCount;
    }
}
