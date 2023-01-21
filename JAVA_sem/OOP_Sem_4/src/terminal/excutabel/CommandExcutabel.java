package terminal.excutabel;
/**Создать интерфейс CommandExecutable c абстрактным методом execute()
 - Реализовать 2 класса, имплементировав созданный интерфейс, CreateStudentExecutable и DeleteStudentExecutable.
 В унаследованных методах они должны обращаться к методом класса StudentService.
 - Подумать какие переменные могли бы содержать созданные классы
 */

public interface CommandExcutabel {
    void execute();

    void executeName();

    void  executeNumberGroup();

    void executerAge();
}
