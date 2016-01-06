package ua.rater.web.controller;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ua.rater.data.Survey;
import ua.rater.web.controller.model.Response;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by Anastasia on 06.01.2016.
 */
public class SurveyControllerTest {
    private SurveyController surveyController;

    @Before
    public void setup(){
        surveyController = new SurveyController();
    }

    @Test
    public void testView() {
        Response response = surveyController.view("a");
        assertNotNull(response);
        assertEquals("OK", response.getStatusCode());
    }

    @Test
    public void testViewWithoutID() {
        Response response = surveyController.view(null);
        assertNotNull(response);
        assertEquals("FAIL", response.getStatusCode());
        assertNotNull(response.getData());
        HashMap<String, String> errors = (HashMap<String, String>) response.getData();
        assertEquals(1, errors.size());
        assertEquals("ID is required", errors.get("id"));
    }

    @Test
    public void testUpdate() {
        Response response = surveyController.update(new Survey());
        assertNotNull(response);
        assertEquals("OK", response.getStatusCode());
    }

    @Test
    public void testUpdateWithoutBody() {
        Response response = surveyController.update(null);
        checkBadResponse(response);
    }

    private void checkBadResponse(Response response) {
        assertNotNull(response);
        assertEquals("FAIL", response.getStatusCode());
        assertNotNull(response.getData());
        HashMap<String, String> errors = (HashMap<String, String>) response.getData();
        assertEquals(1, errors.size());
        assertEquals("Survey is required", errors.get("survey"));
    }

    @Test
    public void testAdd() throws Exception {
        Response response = surveyController.add(new Survey());
        assertNotNull(response);
        assertEquals("OK", response.getStatusCode());
    }

    @Test
    public void testAddWithoutBody() {
        Response response = surveyController.add(null);
        checkBadResponse(response);
    }

    @Test
    public void testDelete() throws Exception {
        Response response = surveyController.delete("a");
        assertNotNull(response);
        assertEquals("OK", response.getStatusCode());
    }

    @Test
    public void testDeleteWithoutID() {
        Response response = surveyController.delete(null);
        assertNotNull(response);
        assertEquals("FAIL", response.getStatusCode());
        assertNotNull(response.getData());
        HashMap<String, String> errors = (HashMap<String, String>) response.getData();
        assertEquals(1, errors.size());
        assertEquals("ID is required", errors.get("id"));
    }

}