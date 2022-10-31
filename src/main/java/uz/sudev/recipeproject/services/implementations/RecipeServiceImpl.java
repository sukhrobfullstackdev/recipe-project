package uz.sudev.recipeproject.services.implementations;

import org.springframework.stereotype.Service;
import uz.sudev.recipeproject.domain.entities.Recipe;
import uz.sudev.recipeproject.repositories.RecipeRepository;
import uz.sudev.recipeproject.services.interfaces.RecipeService;

import java.util.HashSet;
import java.util.Set;
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
        return recipes;
    }
}
