package ua.rater.service;

import org.springframework.util.StringUtils;
import ua.rater.api.service.IService;
import ua.rater.data.Identifier;
import ua.rater.data.Survey;
import ua.rater.repository.AbstractRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Maksym on 1/6/2016.
 */
public abstract class BasicService<T extends Identifier, R extends AbstractRepository<T>>
        implements IService<T> {
    protected abstract R getRepository();

    @Override
    public void add(T entity) {
        if (StringUtils.hasLength(entity.getId())) {
            entity.setId(UUID.randomUUID().toString());
        }
        getRepository().insert(entity);
    }

    @Override
    public void delete(String id) {
        getRepository().delete(id);
    }

    @Override
    public void update(T entity) {
        getRepository().update(entity);
    }

    @Override
    public T find(String id) {
        return getRepository().loadById(id);

    }

    public List<? extends T> findList(String id) {
        return getRepository().findList(id);
    }
}




