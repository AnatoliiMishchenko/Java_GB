package terminal.executabel.executabel;

public abstract class AbstractCommandExecutable implements CommandExcutabel{

    protected abstract String getDescription();

    protected CommandResult createResult(boolean isSuccess) {
        return new CommandResult(isSuccess, getDescription());
    }
}
