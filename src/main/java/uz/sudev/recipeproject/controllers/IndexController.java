package uz.sudev.recipeproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        System.out.println("Some message to say....!");
        return "index";
    }

}
