package launcher;

import invoker.Invoker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LauncherTest {

    private static final String TIME_COMMAND = "TIME";
    private static final String PING_COMMAND = "PING";
    private static final String COUNT_COMMAND = "COUNT";
    private static final String[] TIME_ARGS = {"TIME"};
    private static final String[] PING_ARGS = {"PING", "dummy"};
    private static final String[] COUNT_ARGS = {"COUNT"};

    @Mock private Invoker invoker;
    @InjectMocks private Launcher launcher;

    @Test
    public void shouldInvokeTimeCommand() {
        launcher.run(TIME_ARGS);

        verify(invoker).invokeCommand(TIME_COMMAND, TIME_ARGS);
    }

    @Test
    public void shouldInvokePingCommand() {
        launcher.run(PING_ARGS);

        verify(invoker).invokeCommand(PING_COMMAND, PING_ARGS);
    }

    @Test
    public void shouldInvokeCountCommand() {
        launcher.run(COUNT_ARGS);

        verify(invoker).invokeCommand(COUNT_COMMAND, COUNT_ARGS);
    }



}