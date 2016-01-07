package ua.rater.data;


/**
 * Created by Anastasia on 27.12.2015.
 */
public class Survey extends Identifier {
    private Decoration decoration;
    private Configuration configuration;

    public Decoration getDecoration() {
        return decoration;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }
}
