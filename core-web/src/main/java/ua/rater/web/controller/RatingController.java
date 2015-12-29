package ua.rater.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ua.rater.web.controller.model.Response;

/**
 * Created by Maksym on 12/19/2015.
 */
@RestController
public class RatingController extends BasicController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Response hello() {
        return createSuccessResponse("hello");
    }
}
