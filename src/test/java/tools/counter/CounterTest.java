package tools.counter;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    private static final String WORD1 = "Time";
    private Counter counter = new Counter();

    @Test
    public void shouldBeAbleToAddWord() {
        counter.addWord(WORD1);

        assertThat(counter.checkIfWordExists(WORD1)).isTrue();
    }
}
