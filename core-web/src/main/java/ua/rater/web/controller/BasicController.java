package ua.rater.web.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import ua.rater.web.controller.model.Response;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Maksym on 12/19/2015.
 */
public class BasicController {

    protected Response createSuccessResponse() {
        return createSuccessResponse(null);
    }

    protected Response createSuccessResponse(Object body) {
        Response response = new Response();
        response.setStatusCode("OK");
        response.setData(body);
        return response;
    }

    protected Response createFailResponse() {
        return createFailResponse(null);
    }

    protected Response createFailResponse(String fieldName, String error) {
        Map<String, String> errors = new HashMap<String, String>();
        errors.put(fieldName, error);
        return createFailResponse(errors);
    }

    protected Response createFailResponse(Map<String, String> errors) {
        return createFailResponse(errors, HttpStatus.BAD_REQUEST);
    }

    protected Response createFailResponse(Map<String, String> errors, HttpStatus statusCode) {
        Response response = new Response();
        response.setStatusCode("FAIL");
        response.setData(errors);
        response.setHttpStatus(statusCode.toString());
        return response;
    }
}
