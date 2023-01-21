package terminal.excutabel;

import data.Student;
import service.StudentService;

public class DeleteStudentExecutable implements CommandExcutabel{
    private StudentService studentService;
    private Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteStudent(student);

    }
    @Override
    public void executeName() {
        studentService.deleteStudent(student.getFirstName());

    }

    @Override
    public void executeNumberGroup() {
        studentService.deleteStudent(student);

    }

    @Override
    public void executerAge() {
        studentService.deleteGAge(student);

    }
}
