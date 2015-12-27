package ua.rater.data;

import ua.rater.api.data.IConfiguration;
import ua.rater.api.data.IDecoration;
import ua.rater.api.data.ISurvey;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Survey implements ISurvey{
    private String id;
    private IDecoration decoration;
    private IConfiguration configuration;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public IDecoration getDecoration() {
        return decoration;
    }

    public void setDecoration(IDecoration decoration) {
        this.decoration = decoration;
    }

    public IConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(IConfiguration configuration) {
        this.configuration = configuration;
    }
}
