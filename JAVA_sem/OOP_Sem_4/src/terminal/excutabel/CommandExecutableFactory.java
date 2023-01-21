package terminal.excutabel;

import data.Student;
import service.StudentService;

/**
 * Создать класc CommandExecutableFactory
 * - Реализовать в нём метод CommandExecutable create (String[] input), где в зависимости от переданных параметров создается тот или иной класс
 * - Использовать этот класс и метод в классе TerminalReader
 *
 */

public class CommandExecutableFactory {

    StudentService studentService;

    public  CommandExcutabel create (String [] input){
        if(input[0].equals("add")) {
            return new CreateStudentExecutable(studentService, new Student(input[1]));
        }
        else {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }

    }

}
