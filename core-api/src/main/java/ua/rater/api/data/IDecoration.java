package ua.rater.api.data;

import java.util.List;

/**
 * Created by Anastasia on 27.12.2015.
 */
public interface IDecoration {
    public String getName();

    public void setName(String name);

    public String getDescription();

    public void setDescription(String description);

    public List<IOption> getOptions();

    public void setOptions(List<IOption> options);

    public String getSubmitButton();

    public void setSubmitButton(String submitButton);
}
