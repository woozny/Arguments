package commands;

import helper.MapPrinter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tools.counter.Counter;
import tools.ping.PingLogic;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CounterCommandTest {

    @Mock
    Counter counter;

    @Mock
    MapPrinter mapPrinter;

    @Test
    public void shouldExecuteMethodToGetArgument() {
        Command counterCommand = new CounterCommand(counter);

        counterCommand.execute();

        verify(counter).getMapWithWords();
    }

}