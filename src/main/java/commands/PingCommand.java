package commands;

import tools.ping.Ping;

public class PingCommand implements Command {

    private Ping ping;

    public PingCommand(Ping ping) {
        this.ping = ping;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println(ping.parseAndReturnArgument(arguments));
    }
}
