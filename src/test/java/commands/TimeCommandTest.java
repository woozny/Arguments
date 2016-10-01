package commands;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.Time.Time;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TimeCommandTest {

    @Mock private Time time;

    @Test
    public void shouldExecuteMethodReturningCurrentTime() {
        Command timeCommand = new TimeCommand(time);

        timeCommand.execute();

        verify(time).getCurrentTime();



    }
}