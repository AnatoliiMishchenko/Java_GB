package sem_2.repository;

import sem_2.data.Teacher;

public class TeacheRepository implements UserRepository<Teacher , Integer> {
    @Override
    public Teacher save(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByFio(String fio) {
        return null;
    }
}
