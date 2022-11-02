package uz.sudev.recipeproject.payload.converters;



import lombok.Synchronized;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import uz.sudev.recipeproject.domain.entities.Category;
import uz.sudev.recipeproject.payload.commands.CategoryCommand;

import org.springframework.core.convert.converter.Converter;

/**
 * Created by jt on 6/21/17.
 */
@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {

    @Synchronized
    @Nullable
    @Override
    public Category convert(CategoryCommand source) {
        if (source == null) {
            return null;
        }

        final Category category = new Category();
        category.setId(source.getId());
        category.setCategoryName(source.getDescription());
        return category;
    }
}
