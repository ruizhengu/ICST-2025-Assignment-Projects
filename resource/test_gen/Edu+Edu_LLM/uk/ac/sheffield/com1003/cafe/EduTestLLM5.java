package uk.ac.sheffield.com1003.cafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Syrup;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EduTestLLM5 {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    protected Recipe createEspressoRecipe() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Coffee());
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    protected Recipe createEspressoRecipeAlt() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            espresso.addIngredient(new Coffee());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    protected Recipe createEspressoRecipeIncomplete() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

//    @Test
//    public void testRecipeMultipleIngredientsDifferentOrder() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        Recipe latte2 = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        assertNotEquals(latte, latte2); // order matters
//    }

    @Test
    public void testRecipeMultipleIngredientsMissing() throws Exception {

        Recipe latte = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());

        Recipe latte2 = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
        latte2.addIngredient(new Coffee());
        latte2.addIngredient(new Water());

        assertNotEquals(latte, latte2); // missing ingredient
    }

//    @Test
//    public void testRecipeMultipleIngredientsExtra() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        Recipe latte2 = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
//        latte2.addIngredient(new Milk(50, Milk.Type.SEMI));
//
//        assertNotEquals(latte, latte2); // extra ingredient
//    }

    @Test
    public void testRecipeMultipleIngredientsDifferentSoyType() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.SEMI));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertNotEquals(latte, latte2); // different soy type
    }

//    @Test
//    public void testRecipeMultipleIngredientsDifferentCreamType() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte with Cream", 3.0, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        Recipe latte2 = new Recipe("Large Latte with Cream", 3.0, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        assertNotEquals(latte, latte2); // different cream type
//    }

//    @Test
//    public void testRecipeMultipleIngredientsDifferentCreamAmount() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte with Cream", 3.0, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        Recipe latte2 = new Recipe("Large Latte with Cream", 3.0, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
//
//        assertNotEquals(latte, latte2); // different cream amount
//    }
//
//    @Test
//    public void testRecipeMultipleIngredientsDifferentSyrupType() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte with Syrup", 3.5, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
////        latte.addIngredient(new Syrup(Syrup.Type.HONEY));
//
//        Recipe latte2 = new Recipe("Large Latte with Syrup", 3.5, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
////        latte2.addIngredient(new Syrup(Syrup.Type.VANILLA));
//
//        assertNotEquals(latte, latte2); // different syrup type
//    }

//    @Test
//    public void testRecipeMultipleIngredientsDifferentSyrupAmount() throws Exception {
//
//        Recipe latte = new Recipe("Large Latte with Syrup", 3.5, Recipe.Size.LARGE, 3);
//        latte.addIngredient(new Coffee());
//        latte.addIngredient(new Water());
//        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));
////        latte.addIngredient(new Syrup(Syrup.Type.HONEY));
//
//        Recipe latte2 = new Recipe("Large Latte with Syrup", 3.5, Recipe.Size.LARGE, 3);
//        latte2.addIngredient(new Coffee());
//        latte2.addIngredient(new Water());
//        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
////        latte2.addIngredient(new Syrup(Syrup.Type.HONEY, 50));
//
//        assertNotEquals(latte, latte2); // different syrup amount
//    }
}
