package uz.sudev.recipeproject.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.sudev.recipeproject.domain.entities.Recipe;
import uz.sudev.recipeproject.services.interfaces.RecipeService;

import java.util.Set;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");
        Set<Recipe> recipes = recipeService.getRecipes();
        model.addAttribute("recipes", recipes);
        return "index";
    }
}