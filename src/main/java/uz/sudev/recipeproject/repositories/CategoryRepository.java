package uz.sudev.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sudev.recipeproject.domain.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
