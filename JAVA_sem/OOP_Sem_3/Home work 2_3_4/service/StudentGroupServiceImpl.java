package sem_2.service;

import sem_2.data.*;
import sem_2.repository.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.awt.SystemColor.text;


public class StudentGroupServiceImpl extends StudentGroupService {
    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroup(int numberGroup) {
        return studentGroupIntegerRepository.findById(numberGroup);
    }


    public StudentGroup create(int groupNumber) {

        DataService studentService = new StudentServiceImpl();
        DataService teacherService = new TeacherServiceImpl(text);


        List<User> students = ((StudentServiceImpl) studentService).read1(String.valueOf(text));
        List<User> teachers = ((TeacherServiceImpl) teacherService).read1(String.valueOf(text));

        List<Student> studentsOfGroup = new ArrayList<>();
        Teacher teacherOfGroup = null;

        for (User student : students) {

            if (groupNumber == Integer.parseInt(((Student) (student)).getNaumberGroup())) {
                studentsOfGroup.add((Student) student);
            }
        }

        for (User teacher : teachers) {
            if (((Teacher) (teacher)).getGroup().contains(groupNumber)) {
                teacherOfGroup = (Teacher) (teacher);
                break;

            }
        }
        return new StudentGroup(teacherOfGroup, studentsOfGroup, groupNumber);
    }


    @Override
    public List<User> read(User user) {
        return null;
    }

    @Override
    public void create(User user) {

    }


    @Override
    public List<User> read1(String text) {
        return null;
    }

    public StudentGroup getGroup() {
        return null;
    }

    public void remove(String fio) {
        Iterator<Student> studentGroup = getGroup().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }

    }

    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());

    }


    public void sort(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList(), new UserComparator());
    }
}


