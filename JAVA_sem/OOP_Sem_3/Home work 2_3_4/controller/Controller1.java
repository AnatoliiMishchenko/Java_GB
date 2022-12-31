package sem_2.controller;

public interface Controller1 <E,I>{
    E save (E entity);
    E findById(int id);
}
