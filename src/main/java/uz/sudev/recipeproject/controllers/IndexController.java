package uz.sudev.recipeproject.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sudev.recipeproject.domain.entities.Category;
import uz.sudev.recipeproject.domain.entities.UnitOfMeasure;
import uz.sudev.recipeproject.repositories.CategoryRepository;
import uz.sudev.recipeproject.repositories.RecipeRepository;
import uz.sudev.recipeproject.repositories.UnitOfMeasureRepository;
import uz.sudev.recipeproject.services.interfaces.RecipeService;

import java.util.Optional;

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
