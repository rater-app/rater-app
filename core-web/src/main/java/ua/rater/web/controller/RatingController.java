package ua.rater.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Maksym on 12/19/2015.
 */
@Controller
public class RatingController extends BasicController {

    public RatingController() {
        System.out.println("yeap");
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public JsonNode hello() {
        return createSuccessResponse(1);
    }

}
