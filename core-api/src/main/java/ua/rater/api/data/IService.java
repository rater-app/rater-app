package ua.rater.api.data;

import ua.rater.data.Survey;

/**
 * Created by Anastasia on 29.12.2015.
 */
public interface IService {

    public Survey find(String id);

    public void update(Survey survey);

    public void add(Survey survey);

    public void delete(String id);

}
