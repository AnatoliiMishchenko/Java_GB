package sem_2.repository;

import sem_2.data.User;

public interface UserRepository<E extends User, I> extends Repository<E,I>{
    abstract E findByFio( String fio);




}
