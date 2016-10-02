package invoker;

import commands.Command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private Map<String, Command> commands;

    public Invoker() {
        commands = new HashMap<>();
    }

    public void setCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public void invokeCommand(String commandName, String[] arguments) {
        commands.get(commandName).execute(arguments);
    }
}
