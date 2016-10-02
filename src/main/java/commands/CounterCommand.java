package commands;

import helper.MapPrinter;
import tools.counter.Counter;

import java.util.Map;

public class CounterCommand implements Command {

    private Counter counter;

    public CounterCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute(String[] arguments) {
        counter.addWord(arguments[0]);
        Map wordMap = counter.getMapWithWords();
        MapPrinter.pintMap(wordMap);
    }
}
