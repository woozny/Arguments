package commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.Time.Time;
import tools.counter.Counter;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TimeCommandTest {

    private static final String[] ARGUMENT = {"TIME"};

    @Mock private Time time;
    @Mock private Counter counter;

    @Test
    public void shouldExecuteMethodReturningCurrentTime() {
        Command timeCommand = new TimeCommand(time, counter);

        timeCommand.execute(ARGUMENT);

        verify(time).getCurrentTime();
    }

    @Test
    public void shouldCountCommandWhileExecutingTimeMethods() {
        Command timeCommand = new TimeCommand(time, counter);

        timeCommand.execute(ARGUMENT);

        verify(counter).addWord(ARGUMENT[0]);
    }
}