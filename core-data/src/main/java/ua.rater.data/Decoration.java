package ua.rater.data;

import ua.rater.api.data.IDecoration;
import ua.rater.api.data.IOption;

import java.util.List;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Decoration implements IDecoration{
    private String name;
    private String description;
    private List<IOption> options;
    private String submitButton;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<IOption> getOptions() {
        return options;
    }

    public void setOptions(List<IOption> options) {
        this.options = options;
    }

    public String getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(String submitButton) {
        this.submitButton = submitButton;
    }
}
