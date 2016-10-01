package tools.counter;

import java.util.HashMap;
import java.util.Map;

public class Counter {

    private static final int WORD_ADDED_FIRS_TIME = 1;
    private Map<String, Integer> words;

    public Counter() {
        words = new HashMap<>();
    }

    public boolean checkIfWordExists(String word) {
        return isWordAlreadyAdded(word);
    }

    public void addWord(String word) {
        if (isWordAlreadyAdded(word)) {
            incrementNumberOfWordOccurrences(word);
        } else {
            addWordForFirsTime(word);
        }
    }

    private boolean isWordAlreadyAdded(String word) {
        return words.containsKey(word);
    }

    private void incrementNumberOfWordOccurrences(String word) {
        int numberOfOccurrences = words.get(word);
        words.put(word, ++numberOfOccurrences);
    }

    private Integer addWordForFirsTime(String word) {
        return words.put(word, WORD_ADDED_FIRS_TIME);
    }

    public Map getMapWithWords() {
        return new HashMap<>(words);
    }
}
