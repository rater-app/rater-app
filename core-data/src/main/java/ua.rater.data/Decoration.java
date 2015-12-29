package ua.rater.data;

import ua.rater.api.data.IDecoration;
import ua.rater.api.data.IOption;

import java.util.List;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Decoration implements IDecoration {
    private String name;
    private String description;
    private List<IOption> options;
    private String submitButton;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<IOption> getOptions() {
        return options;
    }

    @Override
    public void setOptions(List<IOption> options) {
        this.options = options;
    }

    @Override
    public String getSubmitButton() {
        return submitButton;
    }

    @Override
    public void setSubmitButton(String submitButton) {
        this.submitButton = submitButton;
    }
}
