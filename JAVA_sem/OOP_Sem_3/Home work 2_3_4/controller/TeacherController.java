package sem_2.controller;

import sem_2.data.Teacher;
import sem_2.repository.Repository;
import sem_2.repository.TeacheRepository;
import sem_2.service.TaecherService;

public class TeacherController implements UserController<Teacher , Integer>
{
    private final TeacheRepository teacheRepository;

    public TeacherController(TeacheRepository teacheRepository) {
        this.teacheRepository = teacheRepository;
    }



    @Override
    public Teacher save(Teacher entity) {
        return  teacheRepository.save(entity);}

    @Override
    public Teacher findById(int id) {
        return teacheRepository.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacheRepository.findByFio(fio);
    }
}
