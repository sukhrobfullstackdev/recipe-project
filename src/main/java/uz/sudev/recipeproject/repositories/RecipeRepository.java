package uz.sudev.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sudev.recipeproject.domain.entities.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
