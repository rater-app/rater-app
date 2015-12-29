package ua.rater.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.rater.api.data.ISurvey;
import ua.rater.web.controller.model.Response;

/**
 * Created by Anastasia on 28.12.2015.
 */
@Controller
public class SurveyController extends BasicController {
    @Autowired
    IService service;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public Response view(@RequestParam("id") String id) {
        if (!StringUtils.isEmpty(id)) {
            ISurvey survey = service.find(id);
            return createSuccessResponse(survey);
        } else {
            return createFailResponse();
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestParam("survey") ISurvey survey) {
        service.update(survey);
        return createSuccessResponse();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response add(@RequestParam("survey") ISurvey survey) {
        service.add(survey);
        return createSuccessResponse();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Response view(@RequestParam("id") String id) {
        if (!StringUtils.isEmpty(id)) {
            service.delete(id);
            return createSuccessResponse();
        } else {
            return createFailResponse();
        }
    }
}
