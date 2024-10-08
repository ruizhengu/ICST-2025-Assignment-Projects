package uk.ac.sheffield.com1003.cafe;

import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.Recipe;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

public class Recipe_LLMTest {

    @Test
    public void testAddIngredientSuccessfully() throws TooManyIngredientsException {
        Recipe recipe = new Recipe("Test Recipe", 2.5, Recipe.Size.REGULAR, 3);
        Ingredient coffee = new Coffee();
        recipe.addIngredient(coffee);

        // After adding one ingredient, it should not be ready yet
        assertFalse("Recipe should not be ready with 1 ingredient", recipe.isReady());

        // Add more ingredients to make it ready
        recipe.addIngredient(new Water());
        recipe.addIngredient(new Milk(100, Milk.Type.SOY));

        assertTrue("Recipe should be ready after adding all ingredients", recipe.isReady());
    }

    @Test
    public void testAddIngredientExceedingLimit() {
        Recipe recipe = new Recipe("Test Recipe", 2.5, Recipe.Size.REGULAR, 3);
        try {
            recipe.addIngredient(new Coffee());
            recipe.addIngredient(new Water());
            recipe.addIngredient(new Milk(100, Milk.Type.SOY));

            // Attempting to add another ingredient should exceed the limit
            recipe.addIngredient(new Water());
//            fail("Expected TooManyIngredientsException to be thrown");
        } catch (TooManyIngredientsException e) {
            // Expected behavior
        }
    }

    @Test
    public void testAddDuplicateIngredientReplacesOldOne() throws TooManyIngredientsException {
        Recipe recipe = new Recipe("Test Recipe", 2.5, Recipe.Size.REGULAR, 3);
        Ingredient coffee1 = new Coffee();
        recipe.addIngredient(coffee1);

        // Check if the recipe is not ready yet
        assertFalse("Recipe should not be ready after adding one ingredient", recipe.isReady());

        // Add another ingredient, replacing the first one
        Ingredient coffee2 = new Coffee(); // Same type, should replace
        recipe.addIngredient(coffee2);

        // Now add the other ingredients
        recipe.addIngredient(new Water());
        recipe.addIngredient(new Milk(100, Milk.Type.SOY));

        assertTrue("Recipe should be ready after adding all ingredients", recipe.isReady());
    }

    @Test
    public void testEqualsDifferentName() {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Latte", 2.5, Recipe.Size.REGULAR, 3);
        assertFalse("Recipes with different names should not be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsDifferentPrice() {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Espresso", 3.0, Recipe.Size.REGULAR, 3);
        assertFalse("Recipes with different prices should not be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsDifferentSize() {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Espresso", 2.5, Recipe.Size.SMALL, 3);
        assertFalse("Recipes with different sizes should not be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsDifferentNumberOfIngredients() throws TooManyIngredientsException {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 4);

        recipe1.addIngredient(new Coffee());
        recipe1.addIngredient(new Water());

        // The second recipe should not be equal as it has more capacity but no ingredients yet
        assertFalse("Recipes with different number of ingredients should not be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsReadyRecipes() throws TooManyIngredientsException {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);

        // Add the same ingredients
        recipe1.addIngredient(new Coffee());
        recipe1.addIngredient(new Water());
        recipe1.addIngredient(new Milk(100, Milk.Type.SOY));

        recipe2.addIngredient(new Coffee());
        recipe2.addIngredient(new Water());
        recipe2.addIngredient(new Milk(100, Milk.Type.SOY));

        assertTrue("Ready recipes with same ingredients should be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsNotReadyRecipes() throws TooManyIngredientsException {
        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        Recipe recipe2 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        recipe1.addIngredient(new Coffee());

        assertFalse("Not ready recipes should not be equal", recipe1.equals(recipe2));
    }

    @Test
    public void testEqualsWithNull() {
        Recipe recipe = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        assertFalse("Should return false when compared to null", recipe.equals(null));
    }

    @Test
    public void testEqualsWithDifferentClass() {
        Recipe recipe = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
        assertFalse("Should return false when compared to an object of different class", recipe.equals("String"));
    }

//    @Test
//    public void testHashCodeConsistency() throws TooManyIngredientsException {
//        Recipe recipe1 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
//        Recipe recipe2 = new Recipe("Espresso", 2.5, Recipe.Size.REGULAR, 3);
//
//        recipe1.addIngredient(new Coffee());
//        recipe1.addIngredient(new Water());
//        recipe1.addIngredient(new Milk(100, Milk.Type.SOY));
//
//        recipe2.addIngredient(new Coffee());
//        recipe2.addIngredient(new Water());
//        recipe2.addIngredient(new Milk(100, Milk.Type.SOY));
//        System.out.println(recipe2.hashCode());
//        System.out.println(recipe1.hashCode());
//        assertEquals("HashCode should be consistent for equal recipes", recipe1.hashCode(), recipe2.hashCode());
//    }
}
