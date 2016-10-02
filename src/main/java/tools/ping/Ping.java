package tools.ping;

public class Ping {

    private String argument;

    public String parseAndReturnArgument(String[] arg) {
        if (hasMoreThanTwoArguments(arg)) {
            argument = arg[1];
        } else {
            argument = "null";
        }
        return argument;
    }

    private boolean hasMoreThanTwoArguments(String[] arg) {
        return arg.length >= 2;
    }
}
