package terminal;

import terminal.excutabel.CommandExcutabel;
import terminal.excutabel.CommandExecutableFactory;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private CommandParser commandParser;


    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }

    public void getIn() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String read = in.nextLine();

            String[] readParsInput = commandParser.parseCommand(read);

            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();

            CommandExcutabel commandExcutabel = commandExecutableFactory.create(readParsInput);

            commandExcutabel.execute();
        }
    }

}
