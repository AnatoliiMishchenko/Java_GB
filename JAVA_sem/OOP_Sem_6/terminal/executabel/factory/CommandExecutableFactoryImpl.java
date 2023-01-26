package terminal.executabel.factory;

import data.Student;
import service.DataService;
import service.StudentService;
import terminal.Command;
import terminal.executabel.executabel.*;

/**
 * Создать класc CommandExecutableFactoryImpl
 * - Реализовать в нём метод CommandExecutable create (String[] input), где в зависимости от переданных параметров создается тот или иной класс
 * - Использовать этот класс и метод в классе TerminalReader
 */

public class CommandExecutableFactoryImpl implements CommandExecutabelFactory {

    private final StudentService studentService;


    public CommandExecutableFactoryImpl(DataService<Student> studentService) {
        this.studentService = (StudentService) studentService;
    }


    @Override
    public CommandExcutabel create(Command command) {

        if (command.isCreatCommand()) {
            return new CreateStudentExecutable(studentService, command);
        }
        if (command.isDeleteCommand()) {
            return new DeleteStudentExecutable(studentService, command);
        }
        if (command.isDeleteNumberGroupCommand()) {
            return new DeleteStudentByAgeAndGroupNumberExecutable(studentService, command);
        } else return new NoneCommandExecutable();


    }

}
