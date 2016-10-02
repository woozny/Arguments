package commands;

import tools.counter.Counter;

public class CounterCommandNoPrinting implements Command {


    private Counter counter;

    public CounterCommandNoPrinting(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute(String[] arguments) {
        counter.addWord(arguments[0]);
    }
}
