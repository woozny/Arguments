package tools.ping;

public class PingFactory {

    private PingFactory() {}

    public static PingLogic createPing(String argument) {
        if (argument != null) {
            return new Ping(argument);
        }
        return new NullPing();
    }
}
