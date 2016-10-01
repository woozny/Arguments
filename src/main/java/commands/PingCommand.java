package commands;

import tools.ping.PingLogic;

public class PingCommand implements Command {

    PingLogic ping;

    public PingCommand(PingLogic pingLogic) {
        this.ping = pingLogic;
    }

    @Override
    public void execute() {
        System.out.println(ping.getArgument());
    }
}
