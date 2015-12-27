package ua.rater.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Maksym on 12/27/2015.
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String loadStartPage() {
        return "index";
    }
}
