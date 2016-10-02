package invoker;

import commands.CounterCommand;
import commands.TimeCommand;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.Time.Time;
import tools.counter.Counter;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class InvokerTest {

    private static final String TIME_COMMAND_NAME = "TIME";
    private static final String COUNT_COMMAND_NAME = "COUNT";
    private static final String PING_COMMAND_NAME = "PING";
    private static final String[] TIME_ARGUMENT = {TIME_COMMAND_NAME};
    private static final String[] COUNT_ARGUMENT = {COUNT_COMMAND_NAME};
    private static final String[] PING_ARGUMENT = {PING_COMMAND_NAME, "dummy_arg"};


    @Mock private Time time;
    @Mock private Counter counter;

    private TimeCommand timeCommand;
    private CounterCommand counterCommand;

    private Invoker invoker;

    @Before
    public void init() {
        invoker = new Invoker();

        timeCommand = new TimeCommand(time);
        counterCommand = new CounterCommand(counter);

        invoker.setCommand(TIME_COMMAND_NAME, timeCommand);
        invoker.setCommand(COUNT_COMMAND_NAME, counterCommand);
    }

    @Test
    public void shouldExecuteTimeMethodWithTimeArguments() {
        invoker.invokeCommand(TIME_COMMAND_NAME, TIME_ARGUMENT);

        verify(time).getCurrentTime();
    }

    @Test
    public void shouldExecuteCounterMethodWithCounterArguments() {
        invoker.invokeCommand(COUNT_COMMAND_NAME, COUNT_ARGUMENT);

        verify(counter).addWord(COUNT_ARGUMENT[0]);
    }
}