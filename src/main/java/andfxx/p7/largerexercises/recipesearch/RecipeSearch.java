package andfxx.p7.largerexercises.recipesearch;

import java.util.ArrayList;
import java.util.List;

public class RecipeSearch {
    private final List<Recipe> recipes;

    public RecipeSearch(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void displayRecipes(List<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.name() + ", cooking time: " + recipe.cookingTime());
        }
    }

    public List<Recipe> getRecipesByName(String name) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.name().toLowerCase().contains(name.toLowerCase())) {
                filteredRecipes.add(recipe);
            }
        }

        return filteredRecipes;
    }

    public List<Recipe> getRecipesWithCookingTimeLessThanOrEqualTo(int cookingTime) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.cookingTime() <= cookingTime) {
                filteredRecipes.add(recipe);
            }
        }

        return filteredRecipes;
    }

    public List<Recipe> getRecipesByIngredient(String ingredient) {
        List<Recipe> filteredRecipes = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.ingredients().contains(ingredient)) {
                filteredRecipes.add(recipe);
            }
        }

        return filteredRecipes;
    }
}
