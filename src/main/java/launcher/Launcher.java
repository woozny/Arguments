package launcher;

import commands.*;
import invoker.Invoker;
import tools.Time.Time;
import tools.counter.Counter;
import tools.ping.Ping;

public class Launcher {

    private static final String COUNT_ARG = "COUNT";
    private static final String COUNT_NOT_PRINT_ARG = "COUNT_NOT_PRINT";
    private static final String TIME_ARG = "TIME";
    private static final String PING_ARG = "PING";

    private Invoker invoker;
    private Counter counter;
    private Time time;
    private Ping ping;

    public Launcher() {
        invoker = new Invoker();
        counter = new Counter();
        time = new Time();
        ping = new Ping();
    }

    public void run(String[] args) {


        Command counterCommand = new CounterCommand(counter);
        Command counterCommandNoPrinting = new CounterCommandNoPrinting(counter);
        Command timeCommand = new TimeCommand(time);
        Command pingCommand = new PingCommand(ping);

        invoker.setCommand(COUNT_ARG, counterCommand);
        invoker.setCommand(COUNT_NOT_PRINT_ARG, counterCommandNoPrinting);
        invoker.setCommand(TIME_ARG, timeCommand);
        invoker.setCommand(PING_ARG, pingCommand);

        parseArgumentsAndInvokeCommands(args, invoker);
    }

    private void parseArgumentsAndInvokeCommands(String[] args, Invoker invoker) {
        if (args.length > 0) {
            switch (args[0].toUpperCase()) {
                case TIME_ARG:
                    invoker.invokeCommand(TIME_ARG, args);
                    invoker.invokeCommand(COUNT_NOT_PRINT_ARG, args);
                    break;
                case PING_ARG:
                    invoker.invokeCommand(PING_ARG, args);
                    invoker.invokeCommand(COUNT_NOT_PRINT_ARG, args);
                    break;
                case COUNT_ARG:
                    invoker.invokeCommand(COUNT_ARG, args);
                    break;
                default:
                    throw new IllegalArgumentException("Not supported argument: " + args[0]);
            }
        }
    }
}