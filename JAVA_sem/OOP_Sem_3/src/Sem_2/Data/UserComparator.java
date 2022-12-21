package Sem_2.Data;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {
        return  (student1.getSurname().compareTo(student2.getSurname()));

    }
}
