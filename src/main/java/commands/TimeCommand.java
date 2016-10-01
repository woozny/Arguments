package commands;

import tools.Time.Time;

public class TimeCommand implements Command {

    private final Time time;

    public TimeCommand(Time time) {
        this.time = time;
    }

    @Override
    public void execute() {
        System.out.println(time.getCurrentTime());
    }
}
