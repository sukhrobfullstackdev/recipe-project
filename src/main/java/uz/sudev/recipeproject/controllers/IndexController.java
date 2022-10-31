package uz.sudev.recipeproject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sudev.recipeproject.domain.entities.Category;
import uz.sudev.recipeproject.domain.entities.UnitOfMeasure;
import uz.sudev.recipeproject.repositories.CategoryRepository;
import uz.sudev.recipeproject.repositories.RecipeRepository;
import uz.sudev.recipeproject.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@RestController
public class IndexController {
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> optionalCategory = categoryRepository.findByCategoryName("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Teaspoon");
        optionalCategory.ifPresent(category -> System.out.println("Category's id is " + category.getId()));
        optionalUnitOfMeasure.ifPresent(unitOfMeasure -> System.out.println("Unit of measure's id is " + unitOfMeasure.getId()));
        System.out.println("Some message to say....!");
        return "index";
    }

}
