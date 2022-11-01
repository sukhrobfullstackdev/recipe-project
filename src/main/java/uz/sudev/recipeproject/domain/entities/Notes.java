package uz.sudev.recipeproject.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notes extends BaseEntity{
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNotes;
}
