package uz.sudev.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sudev.recipeproject.domain.entities.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByCategoryName(String categoryName);
}
