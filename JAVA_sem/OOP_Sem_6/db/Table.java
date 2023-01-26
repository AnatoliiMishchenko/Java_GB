package db;
/**
 * - Создать пекедж db
 * - Реализовать в нем абстрактный обобщенный класс Table, содержащий в себе переменную List<E> elements.
 * - Реализовать в классе метод добавления элемента E save(E entity), который внутри себя добавляет entity в переменную elements
 */


import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {

    protected List<E> elements;

    protected Table() {
        this.elements = new ArrayList<>();
    }

    public E save(E entity) {
        elements.add(entity);
        return entity;
    }

    public List<E> getElements() {
        return elements;
    }
}