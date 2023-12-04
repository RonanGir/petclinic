package spring.guru.udemy.petclinic.services;

import java.util.Set;

public interface CrudService<T, I> {

    T findById(I id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(I id);
}
