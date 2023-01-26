package terminal.executabel.executabel;

import service.StudentService;
import terminal.Command;

public class DeleteStudentExecutable extends AbstractCommandExecutable {
    private static final String DESCRIPTION = "Команда для удаления студента по его фио ";
    private final StudentService studentService;
    private final String fio;

    public DeleteStudentExecutable(StudentService studentService, Command command) {
        this.studentService = studentService;
        this.fio = command.getArgument().get(1);
    }

    @Override
    public CommandResult execute() {
        boolean isSuccess = studentService.deleteByLastName(fio);
        return createResult(isSuccess);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION +
                "'fio'=" + fio + " ";
    }
}
