package tools.counter;

import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    private static final String WORD1 = "Time";
    private static final String WORD2 = "Ping";

    private Counter counter;

    @Before
    public void init() {
        counter = new Counter();
    }

    @Test
    public void shouldBeAbleToAddWord() {
        counter.addWord(WORD1);

        assertThat(counter.checkIfWordExists(WORD1)).isTrue();
    }

    @Test
    public void shouldBeAbleToGetMapWithAddedWords() {
        counter.addWord(WORD1);
        counter.addWord(WORD2);

        Map mapWithWords = counter.getMapWithWords();

        assertThat(mapWithWords.containsKey(WORD1)).isTrue();
        assertThat(mapWithWords.containsKey(WORD2)).isTrue();
    }

    @Test
    public void shouldBeAbleToVerifyHowManyTimesWordHasBeenAdded() {
        counter.addWord(WORD1);
        counter.addWord(WORD1);
        counter.addWord(WORD2);
        counter.addWord(WORD2);
        counter.addWord(WORD2);

        Map mapWithWords = counter.getMapWithWords();

        assertThat(mapWithWords.get(WORD1)).isEqualTo(2);
        assertThat(mapWithWords.get(WORD2)).isEqualTo(3);
    }
}
