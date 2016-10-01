package tools.ping;

public class Ping implements PingLogic {

    private String argument;

    Ping(String argument) {
        this.argument = argument;
    }

    @Override
    public String getArgument() {
        return argument;
    }
}
