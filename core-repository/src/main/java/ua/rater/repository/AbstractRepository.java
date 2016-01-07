package ua.rater.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import ua.rater.api.repository.IAbstractRepository;
import ua.rater.data.Identifier;

/**
 * Created by Maksym on 12/27/2015.
 */
public abstract class AbstractRepository<T extends Identifier> implements IAbstractRepository<T> {

    @Autowired
    protected MongoTemplate template;

    @Override
    public void insert(T entity) {
        template.insert(entity);
    }

    @Override
    public void delete(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        template.remove(query, getEntityClass());
    }

    @Override
    public T loadById(String id) {
        Query query = Query.query(Criteria.where("id").is(id));
        return template.findOne(query, getEntityClass());
    }

    @Override
    public void update(T entity) {
        Query query = Query.query(Criteria.where("id").is(entity.getId()));
        Update update = new Update();
        template.updateFirst(query, update, getEntityClass());
    }

    public abstract Class<? extends T> getEntityClass();

}
