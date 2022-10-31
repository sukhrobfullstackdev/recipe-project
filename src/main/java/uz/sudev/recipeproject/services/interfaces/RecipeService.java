package uz.sudev.recipeproject.services.interfaces;

import uz.sudev.recipeproject.domain.entities.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
