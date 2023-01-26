package terminal.view;

import terminal.executabel.executabel.CommandResult;

public class ResultViewImpl implements ResultView {

    @Override
    public void processCommandResult(CommandResult commandResult) {
        System.out.println(commandResult);
    }
}