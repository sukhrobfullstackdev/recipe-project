package uz.sudev.recipeproject.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sudev.recipeproject.services.interfaces.RecipeService;

@RestController
public class IndexController {
    private final RecipeService recipeService;
    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }
    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }

}
