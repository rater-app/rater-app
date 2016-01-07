package ua.rater.api.service;

import ua.rater.data.Identifier;
import ua.rater.data.Survey;

/**
 * Created by Anastasia on 29.12.2015.
 */
public interface IService<T extends Identifier> {

    public T find(String id);

    public void update(T survey);

    public void add(T survey);

    public void delete(String id);

}
