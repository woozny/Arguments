package commands;

import tools.Time.Time;
import tools.counter.Counter;

public class TimeCommand implements Command {

    private final Time time;
    private final Counter counter;

    public TimeCommand(Time time, Counter counter) {
        this.time = time;
        this.counter = counter;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println(time.getCurrentTime());
        counter.addWord(arguments[0]);
    }
}
