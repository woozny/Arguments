package tools.counter;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CounterTest {

    private Counter counter = new Counter();

    @Test
    public void shouldBeAbleToAddWord() {
        counter.addWord("Time");
        assertThat(counter.checkIfWordExists("Time")).isTrue();
    }

}