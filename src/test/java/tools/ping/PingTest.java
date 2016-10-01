package tools.ping;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class PingTest {

    private static final String ARGUMENT1 = "Arg";
    private static final String NULL_ARGUMENT = null;
    private Ping ping = new Ping();

    @Test
    public void shouldReturnProvidedString() {
        assertThat(ping.ping(ARGUMENT1)).isEqualTo(ARGUMENT1);
    }

    @Test
    public void shouldReturnNullForMissingArgument() {
        assertThat(ping.ping(NULL_ARGUMENT)).isEqualTo(NULL_ARGUMENT);
    }

}