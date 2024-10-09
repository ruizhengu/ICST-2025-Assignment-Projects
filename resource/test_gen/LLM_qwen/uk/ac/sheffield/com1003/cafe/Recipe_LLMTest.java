package uk.ac.sheffield.com1003.cafe;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

public class Recipe_LLMTest {

    private Ingredient coffee;
    private Ingredient water;
    private Ingredient milk;
    private Recipe recipe;

    @Before
    public void setUp() {
        coffee = new Coffee();
        water = new Water();
        milk = new Milk(50, Milk.Type.SOY);
        recipe = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
    }

//    @Test
//    public void testAddIngredient_NewIngredient() throws TooManyIngredientsException {
//        recipe.addIngredient(coffee);
//        assertTrue(recipe.isReady());
//    }

    @Test
    public void testAddIngredient_ReplaceExistingIngredient() throws
            TooManyIngredientsException {
        recipe.addIngredient(water);
        recipe.addIngredient(milk);

        recipe.addIngredient(water); // Replace water with itself
        assertTrue(recipe.isReady());
    }

//    @Test(expected = TooManyIngredientsException.class)
//    public void testAddIngredient_TooManyIngredients() throws
//            TooManyIngredientsException {
//        for (int i = 0; i < 2; i++) { // Add 3 ingredients to a recipe that can hold only 2
//            recipe.addIngredient(coffee);
//        }
//    }
//
//    @Test
//    public void testEquals_SameRecipe() throws TooManyIngredientsException {
//        Recipe sameRecipe = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
//        sameRecipe.addIngredient(coffee);
//        sameRecipe.addIngredient(water);
//
//        assertTrue(recipe.equals(sameRecipe));
//    }

    @Test
    public void testEquals_DifferentRecipe() throws TooManyIngredientsException {
        Recipe differentRecipe = new Recipe("Americano", 1.75, Recipe.Size.REGULAR, 2);
        differentRecipe.addIngredient(coffee);
        differentRecipe.addIngredient(water);

        assertFalse(recipe.equals(differentRecipe));
    }

    @Test
    public void testEquals_DifferentPrice() throws TooManyIngredientsException {
        Recipe differentPriceRecipe = new Recipe("Espresso", 1.75, Recipe.Size.SMALL,
                2);
        differentPriceRecipe.addIngredient(coffee);
        differentPriceRecipe.addIngredient(water);

        assertFalse(recipe.equals(differentPriceRecipe));
    }

    @Test
    public void testEquals_DifferentSize() throws TooManyIngredientsException {
        Recipe differentSizeRecipe = new Recipe("Espresso", 1.5, Recipe.Size.LARGE, 2);
        differentSizeRecipe.addIngredient(coffee);
        differentSizeRecipe.addIngredient(water);

        assertFalse(recipe.equals(differentSizeRecipe));
    }

    @Test
    public void testEquals_DifferentNumberOfIngredients() throws TooManyIngredientsException {
        Recipe differentNumberOfIngredientsRecipe = new Recipe("Espresso", 1.5,
                Recipe.Size.SMALL, 3);
        differentNumberOfIngredientsRecipe.addIngredient(coffee);
        differentNumberOfIngredientsRecipe.addIngredient(water);

        assertFalse(recipe.equals(differentNumberOfIngredientsRecipe));
    }

    @Test
    public void testEquals_MissingIngredients() throws TooManyIngredientsException {
        Recipe missingIngredientsRecipe = new Recipe("Espresso", 1.5,
                Recipe.Size.SMALL, 2);
        missingIngredientsRecipe.addIngredient(coffee);

        assertFalse(recipe.equals(missingIngredientsRecipe));
    }
}