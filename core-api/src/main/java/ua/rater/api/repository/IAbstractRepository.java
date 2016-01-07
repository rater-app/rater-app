package ua.rater.api.repository;

import java.util.List;

/**
 * Created by Maksym on 12/27/2015.
 */
public interface IAbstractRepository<T> {

    void insert(T entity);

    void update(T entity);

    void delete(String id);

    T loadById(String id);

    List<? extends T> findList(String id);
}
