package uz.sudev.recipeproject.services.interfaces;

import uz.sudev.recipeproject.payload.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
