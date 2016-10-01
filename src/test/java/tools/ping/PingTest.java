package tools.ping;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static tools.ping.PingFactory.createPing;

public class PingTest {

    private static final String ARGUMENT1 = "Arg";
    private static final String NULL_ARGUMENT = null;
    private static final String LITERAL_NULL_STRING = "null";

    @Test
    public void shouldReturnProvidedString() {
        PingLogic ping = createPing(ARGUMENT1);
        assertThat(ping.getArgument()).isEqualTo(ARGUMENT1);
    }

    @Test
    public void shouldReturnNullForMissingArgument() {
        PingLogic ping = createPing(NULL_ARGUMENT);
        assertThat(ping.getArgument()).isEqualTo(LITERAL_NULL_STRING);
    }

}