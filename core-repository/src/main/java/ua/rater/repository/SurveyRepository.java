package ua.rater.repository;

import org.springframework.stereotype.Repository;
import ua.rater.data.Survey;

import java.util.List;

/**
 * Created by Maksym on 1/6/2016.
 */
@Repository
public class SurveyRepository extends AbstractRepository<Survey> {
    @Override
    public Class<Survey> getEntityClass() {
        return Survey.class;
    }

    public List<? extends Survey> findList(String id) {
        return null;
    }
}



