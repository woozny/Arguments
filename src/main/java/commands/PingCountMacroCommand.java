package commands;

import tools.counter.Counter;
import tools.ping.Ping;

public class PingCountMacroCommand implements Command {

    private final Ping ping;
    private final Counter counter;

    public PingCountMacroCommand(Ping ping, Counter counter) {
        this.ping = ping;
        this.counter = counter;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println(ping.parseAndReturnArgument(arguments));
        counter.addWord(arguments[0]);
    }
}
