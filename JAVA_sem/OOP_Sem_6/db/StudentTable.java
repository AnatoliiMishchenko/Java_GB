package db;
/**
 * - Создать класс StudentTable
 * - Реализовать метод удаления по имени boolean removeByName (String name), который бы удалял студента из таблицы по имени
 * - Создать в классе StudentRepository зависимость класса StudentTable
 * - Вызывать метод removeByName из одноименного метода класса
 *
 *
 */

import data.Student;

import java.util.Iterator;

public class StudentTable extends Table<Student> {

    public boolean deleteByFio(String fio) {
        Iterator<Student> iterator = elements.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getFio().equals(fio)) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public boolean deleteByFio(int age, int groupNumber) {
        Iterator<Student> iterator = elements.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getYearOfBirth() == age &&
                   student.getGroupNumber() == groupNumber) {
                iterator.remove();
                return true;
            }
        }

        return false;
    }
}
