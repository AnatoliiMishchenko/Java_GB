package sem_2.repository;

import sem_2.data.StudentGroup;

public abstract class GroupRepository implements Repository<StudentGroup, Integer> {
    @Override
    public StudentGroup save(StudentGroup entity) {
        return null;
    }

    @Override
    public StudentGroup findById(Integer id) {
        return null;
    }
}
