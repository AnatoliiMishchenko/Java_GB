package terminal.executabel.executabel;

import data.Student;
import service.StudentService;
import terminal.Command;

public class CreateStudentExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для создания студента ";
    private StudentService studentService;

    private Student student;

    public CreateStudentExecutable(StudentService studentService, Command command) {
        this.studentService = studentService;
        this.student = new Student(command.getArgument().get(0));
    }



    @Override
    public CommandResult execute() {
        studentService.createUser(student);
        return createResult(true);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION + student.toString() + " ";
    }


}
