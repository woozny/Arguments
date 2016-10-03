package commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.counter.Counter;
import tools.ping.Ping;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PingCountMacroCommandTest {

    private static final String[] ARGUMENT = {"PING"};

    @Mock private Ping ping;
    @Mock private Counter counter;

    @Test
    public void shouldExecuteMethodToGetArgument() {
        Command pingCommand = new PingCountMacroCommand(ping, counter);

        pingCommand.execute(ARGUMENT);

        verify(ping).parseAndReturnArgument(ARGUMENT);
    }

    @Test
    public void shouldCountCommandWhileInvokingPingMethods() {
        Command pingCommand = new PingCountMacroCommand(ping, counter);

        pingCommand.execute(ARGUMENT);

        verify(counter).addWord(ARGUMENT[0]);
    }
}