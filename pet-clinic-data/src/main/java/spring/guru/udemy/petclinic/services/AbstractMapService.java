package spring.guru.udemy.petclinic.services;

import spring.guru.udemy.petclinic.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T extends BaseEntity, I> implements CrudService<T, I> {

    protected Map<I, T> map = new HashMap<>();

    @Override
    public T save(T object) {
        map.put((I) object.getId(), object);
        return object;
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T findById(I id) {
        return map.get(id);
    }

    @Override
    public void deleteById(I id) {
        map.remove(id);
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(itEntry -> itEntry.getValue().equals(object));
    }


}
