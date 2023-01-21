package terminal.excutabel;

import data.Student;
import service.StudentService;

public class CreateStudentExecutable implements CommandExcutabel {
    private StudentService studentService;

    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    public CreateStudentExecutable(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.createUser(student);

    }

    @Override
    public void executeName() {

    }

    @Override
    public void executeNumberGroup() {

    }

    @Override
    public void executerAge() {

    }

}
