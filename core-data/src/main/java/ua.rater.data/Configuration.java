package ua.rater.data;


/**
 * Created by Anastasia on 27.12.2015.
 */
public class Configuration {
    private SurveyStyle surveyStyle;
    private OptionStyle optionStyle;
    private ResultStyle resultStyle;

    public Configuration(SurveyStyle surveyStyle, OptionStyle optionStyle, ResultStyle resultStyle) {
        this.surveyStyle = surveyStyle;
        this.optionStyle = optionStyle;
        this.resultStyle = resultStyle;
    }

    public Configuration() {
    }

    public SurveyStyle getSurveyStyle() {
        return surveyStyle;
    }

    public void setSurveyStyle(SurveyStyle surveyStyle) {
        this.surveyStyle = surveyStyle;
    }

    public OptionStyle getOptionStyle() {
        return optionStyle;
    }

    public void setOptionStyle(OptionStyle optionStyle) {
        this.optionStyle = optionStyle;
    }

    public ResultStyle getResultStyle() {
        return resultStyle;
    }

    public void setResultStyle(ResultStyle resultStyle) {
        this.resultStyle = resultStyle;
    }
}
