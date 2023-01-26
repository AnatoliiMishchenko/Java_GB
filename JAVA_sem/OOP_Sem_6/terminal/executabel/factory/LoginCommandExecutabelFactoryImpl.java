package terminal.executabel.factory;

import service.StudentService;
import terminal.Command;
import terminal.executabel.executabel.CommandExcutabel;

/**
 * - Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactoryImpl
 * - Переопределить единственный метод так, чтобы он вызывал внутри себя метод предка,
 *   но в начале и конце распечатывал информацию о входных и выходных параметрах
  */

public class LoginCommandExecutabelFactoryImpl extends CommandExecutableFactoryImpl {

    public LoginCommandExecutabelFactoryImpl(StudentService studentService) {
        super(studentService);
    }

    @Override
    public CommandExcutabel create(Command command) {
        System.out.println("Входные параметры" + command);
        CommandExcutabel result = super.create(command);
        System.out.println("Выходные параметры" + result);
        return result;
    }
}
