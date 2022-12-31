package sem_2.controller;

import sem_2.data.StudentGroup;
import sem_2.repository.GroupRepository;
import sem_2.service.StudentGroupServiceImpl;

public class GroupController implements Controller1<StudentGroup, Integer> {
    private final GroupRepository groupRepository;

    public GroupController(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public StudentGroup save(StudentGroup entity) {
        return groupRepository.save(entity);
    }

    @Override
    public StudentGroup findById(int id) {
        return groupRepository.findById(id);
    }
}
