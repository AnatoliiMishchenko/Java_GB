package terminal.executabel.executabel;

import service.StudentService;
import terminal.Command;

public class DeleteStudentByAgeAndGroupNumberExecutable extends AbstractCommandExecutable{
    private static final String DESCRIPTION = "Команда для удаления студента по возрасту и номеру группы ";

    private final StudentService studentService;
    private final int studentAge;
    private final int groupNumber;

    public DeleteStudentByAgeAndGroupNumberExecutable(StudentService studentService, Command command) {
        this.studentService = studentService;
        this.studentAge = Integer.parseInt(command.getArgument().get(1));
        this.groupNumber = Integer.parseInt(command.getArgument().get(2));
    }

    @Override
    public CommandResult execute() {
        boolean isSuccess = studentService.deleteByAgeAndGroupNumber(studentAge, groupNumber);
        return createResult(isSuccess);
    }

    @Override
    protected String getDescription() {
        return DESCRIPTION +
                "'studentAge'=" + studentAge + " " +
                "'groupNumber'=" + groupNumber + " ";
    }
}
