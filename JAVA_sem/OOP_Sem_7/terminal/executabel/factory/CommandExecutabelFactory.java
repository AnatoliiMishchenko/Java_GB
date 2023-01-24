package terminal.executabel.factory;

import terminal.Command;
import terminal.executabel.executabel.CommandExcutabel;

/**
 * - Переименовать класс CommandExecutableFactory в CommandExecutableFactoryImpl
 * - Создать интерфейс CommandExecutableFactory и имплементировать от него класс CommandExecutableFactoryImpl.
 * - В классе TerminalReader реализовать DIP, то есть возможность менять реализации CommandExecutableFactory
 *
 */

public interface CommandExecutabelFactory {

    CommandExcutabel create(Command command);
}
