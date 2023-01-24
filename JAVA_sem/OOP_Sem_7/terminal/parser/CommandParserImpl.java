package terminal.parser;

import terminal.Command;

import java.util.List;

import static java.util.Arrays.asList;

public class CommandParserImpl implements CommandParser {
    @Override
    public Command parseCommand(String inputCommand) {
        List<String> list = asList(inputCommand.split(" "));
        return new Command(list);
    }

   
}
