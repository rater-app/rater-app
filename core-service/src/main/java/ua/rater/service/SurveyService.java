package ua.rater.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.rater.api.service.ISurveyService;
import ua.rater.data.Survey;
import ua.rater.repository.SurveyRepository;

/**
 * Created by Maksym on 1/6/2016.
 */
@Service
public class SurveyService extends BasicService<Survey, SurveyRepository> implements ISurveyService {
    @Autowired
    private SurveyRepository repository;

    @Override
    protected SurveyRepository getRepository() {
        return repository;
    }
}
