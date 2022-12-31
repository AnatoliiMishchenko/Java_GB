package sem_2.controller;

import sem_2.data.StudentGroup;
import sem_2.data.User;

public interface UserController<E extends User, I > extends Controller1<E,I> {
    E findByFio(String fio);
}
