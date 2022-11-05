package uz.sudev.recipeproject.services.implementations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import uz.sudev.recipeproject.domain.entities.Recipe;
import uz.sudev.recipeproject.repositories.RecipeRepository;
import uz.sudev.recipeproject.services.interfaces.ImageService;

import java.io.IOException;
import java.util.Optional;

@Service
@Slf4j
public class ImageServiceImpl implements ImageService {
    private final RecipeRepository recipeRepository;

    public ImageServiceImpl( RecipeRepository recipeService) {
        this.recipeRepository = recipeService;
    }
    @Override
    @Transactional
    public void saveImageFile(Long recipeId, MultipartFile file) {
        try {
            Optional<Recipe> optionalRecipe = recipeRepository.findById(recipeId);
            Recipe recipe = null;
            if (optionalRecipe.isPresent()) {
                recipe = optionalRecipe.get();
            }
            Byte[] byteObjects = new Byte[file.getBytes().length];
            int i = 0;
            for (byte b : file.getBytes()){
                byteObjects[i++] = b;
            }
            if (recipe != null) {
                recipe.setImage(byteObjects);
                recipeRepository.save(recipe);
            } else {
                log.error("Recipe is not found!");
            }
        } catch (IOException e) {
            //todo handle better
            log.error("Error occurred", e);
            e.printStackTrace();
        }
    }
}
