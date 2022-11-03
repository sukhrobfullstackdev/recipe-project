package uz.sudev.recipeproject.services.interfaces;

import uz.sudev.recipeproject.domain.entities.Recipe;
import uz.sudev.recipeproject.payload.commands.RecipeCommand;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}
