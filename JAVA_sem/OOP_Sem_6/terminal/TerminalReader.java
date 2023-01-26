package terminal;

import terminal.executabel.executabel.CommandExcutabel;
import terminal.executabel.executabel.CommandResult;
import terminal.executabel.factory.CommandExecutabelFactory;
import terminal.parser.CommandParser;
import terminal.view.ResultView;

import java.util.Scanner;

public class TerminalReader {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutabelFactory commandExecutableFactory;
    private final ResultView resultView;

    //private CommandExecutableFactoryImpl commandExecutableFactoryImpl = new CommandExecutableFactoryImpl();


    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutabelFactory commandExecutableFactory,ResultView resultView) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory,resultView);
        }
        return terminalReader;
    }



    public TerminalReader(CommandParser commandParser, CommandExecutabelFactory commandExecutableFactory, ResultView resultView) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
        this.resultView = resultView;
    }

    public void readCommands() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String read = in.nextLine();
            Command command = commandParser.parseCommand(read);
            CommandExcutabel commandExcutabel = commandExecutableFactory.create(command);
            CommandResult result = commandExcutabel.execute();
            resultView.processCommandResult(result);

            //String[] readParsInput = commandParser.parseCommand(read);

            //CommandExcutabel commandExcutabel = commandExecutableFactoryImpl.create(readParsInput);

            //commandExcutabel.execute();


        }
    }


}
