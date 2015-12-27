package ua.rater.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import ua.rater.web.controller.model.Response;

import java.util.Map;

/**
 * Created by Maksym on 12/19/2015.
 */
public class BasicController {

    @Autowired
    protected ObjectMapper mapper;

    protected JsonNode createSuccessResponse() {
        return createSuccessResponse(null);
    }

    protected JsonNode createSuccessResponse(Object body) {
        Response response = new Response();
        response.setStatusCode("OK");
        response.setData(body);
        return mapper.valueToTree(response);
    }

    protected JsonNode createFailResponse() {
        return createFailResponse(null);
    }

    protected JsonNode createFailResponse(Map<String, String> errors) {
        return createFailResponse(errors, HttpStatus.BAD_REQUEST);
    }

    protected JsonNode createFailResponse(Map<String, String> errors, HttpStatus statusCode) {
        Response response = new Response();
        response.setStatusCode("FAIL");
        response.setData(errors);
        response.setHttpStatus(statusCode.toString());
        return mapper.valueToTree(response);
    }
}
