package ua.rater.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import ua.rater.api.service.IService;
import ua.rater.api.service.ISurveyService;
import ua.rater.data.*;
import ua.rater.web.controller.model.Response;

/**
 * Created by Anastasia on 28.12.2015.
 */
@RestController
public class SurveyController extends BasicController {

    @Autowired
    ISurveyService service;

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public Response view(@RequestParam(value = "id", required = false) String id) {
        if (StringUtils.isEmpty(id)) {
            return createFailResponse("id", "ID is required");
        }
        Survey survey = service.find(id);
        return createSuccessResponse(survey);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public Response update(@RequestBody(required = false)Survey survey ) {
        if (StringUtils.isEmpty(survey)) {
            return createFailResponse("survey", "Survey is required");
        }
        service.update(survey);
        return createSuccessResponse();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Response add(@RequestBody(required = false) Survey survey) {
        if (StringUtils.isEmpty(survey)) {
            return createFailResponse("survey", "Survey is required");
        }
        service.add(survey);
        return createSuccessResponse();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Response delete(@RequestParam("id") String id) {
        if (StringUtils.isEmpty(id)) {
            return createFailResponse("id", "ID is required");
        }
        service.delete(id);
        return createSuccessResponse();
    }
}
