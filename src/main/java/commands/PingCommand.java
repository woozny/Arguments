package commands;

import tools.ping.PingLogic;

public class PingCommand implements Command {

    PingLogic ping;

    public PingCommand(PingLogic pingLogic) {
        this.ping = pingLogic;
    }

    @Override
    public void execute(String[] arguments) {
        System.out.println(ping.getArgument());
    }
}
