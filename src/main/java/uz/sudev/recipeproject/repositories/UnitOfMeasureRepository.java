package uz.sudev.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import uz.sudev.recipeproject.domain.entities.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
