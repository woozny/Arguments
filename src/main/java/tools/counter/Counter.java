package tools.counter;

import java.util.HashMap;
import java.util.Map;

public class Counter {

    private Map<String, Integer> words;

    public Counter() {
        words = new HashMap<>();
    }

    public void addWord(String word) {
        words.put(word, 1);
    }

    public boolean checkIfWordExists(String word) {
        if (words.containsKey(word)) {
            return true;
        }
        return false;
    }
}
