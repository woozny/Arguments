package tools.ping;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PingTest {

    private static final String[] ONE_ARGUMENT = {"PING"};
    private static final String[] TWO_ARGUMENTS = {"PING", "dummy_arg"};
    private static final String LITERAL_NULL_STRING = "null";

    private Ping ping = new Ping();

    @Test
    public void shouldReturnSecondArgument() {
        assertThat(ping.parseAndReturnArgument(TWO_ARGUMENTS)).isEqualTo(TWO_ARGUMENTS[1]);
    }

    @Test
    public void shouldReturnNullIfOnlyOneArgumentProvided() {
        assertThat(ping.parseAndReturnArgument(ONE_ARGUMENT)).isEqualTo(LITERAL_NULL_STRING);
    }

}