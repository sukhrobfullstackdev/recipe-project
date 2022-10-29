package uz.sudev.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sudev.recipeproject.domain.entities.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
