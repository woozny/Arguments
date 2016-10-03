package commands;

import tools.counter.Counter;
import tools.ping.Ping;

public class PingCommand implements Command {

    private final Ping ping;
    private final Counter counter;

    public PingCommand(Ping ping, Counter counter) {
        this.ping = ping;
        this.counter = counter;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println(ping.parseAndReturnArgument(arguments));
        counter.addWord(arguments[0]);
    }
}
