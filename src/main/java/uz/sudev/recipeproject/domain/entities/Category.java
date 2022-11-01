package uz.sudev.recipeproject.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {
    private String categoryName;
    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }
}
