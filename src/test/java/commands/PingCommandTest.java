package commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.ping.Ping;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PingCommandTest {

    private static final String[] ARGUMENT = {"PING"};

    @Mock
    Ping ping;

    @Test
    public void shouldExecuteMethodToGetArgument() {
        Command pingCommand = new PingCommand(ping);

        pingCommand.execute(ARGUMENT);

        verify(ping).parseAndReturnArgument(ARGUMENT);
    }
}