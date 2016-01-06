package ua.rater.data;


import java.util.List;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Decoration {
    private String name;
    private String description;
    private List<Option> options;
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

    public List<Option> getOptions() {
        return options;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public String getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(String submitButton) {
        this.submitButton = submitButton;
    }
}
