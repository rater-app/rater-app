package ua.rater.data;

import ua.rater.api.data.IConfiguration;
import ua.rater.api.data.OptionStyle;
import ua.rater.api.data.ResultStyle;
import ua.rater.api.data.SurveyStyle;

/**
 * Created by Anastasia on 27.12.2015.
 */
public class Configuration implements IConfiguration {
    private SurveyStyle surveyStyle;
    private OptionStyle optionStyle;
    private ResultStyle resultStyle;

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
