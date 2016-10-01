package tools.ping;

public class NullPing implements PingLogic {

    private String argument;

    NullPing() {}

    @Override
    public String getArgument() {
        return "null";
    }
}
