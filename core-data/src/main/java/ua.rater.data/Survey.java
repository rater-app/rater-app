package ua.rater.data;

import ua.rater.api.data.IConfiguration;
import ua.rater.api.data.IDecoration;
import ua.rater.api.data.ISurvey;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Survey implements ISurvey {
    private String id;
    private IDecoration decoration;
    private IConfiguration configuration;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public IDecoration getDecoration() {
        return decoration;
    }

    @Override
    public void setDecoration(IDecoration decoration) {
        this.decoration = decoration;
    }

    @Override
    public IConfiguration getConfiguration() {
        return configuration;
    }

    @Override
    public void setConfiguration(IConfiguration configuration) {
        this.configuration = configuration;
    }
}
