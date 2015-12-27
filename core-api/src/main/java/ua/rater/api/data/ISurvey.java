package ua.rater.api.data;

/**
 * Created by Anastasia on 27.12.2015.
 */
public interface ISurvey {

    public String getId();

    public void setId(String id);

    public IDecoration getDecoration();

    public void setDecoration(IDecoration decoration);

    public IConfiguration getConfiguration();

    public void setConfiguration(IConfiguration configuration);
}
