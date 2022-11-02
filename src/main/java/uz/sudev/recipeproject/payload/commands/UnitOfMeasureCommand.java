package uz.sudev.recipeproject.payload.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnitOfMeasureCommand {
    private Long id;
    private String description;
}
