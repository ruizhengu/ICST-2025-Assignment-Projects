package uk.ac.sheffield.com1003.cafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class EduTestLLM2 {
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

    protected Recipe createEspressoRecipe() throws TooManyIngredientsException {
        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
        espresso.addIngredient(new Coffee());
        espresso.addIngredient(new Water());
        return espresso;
    }

    protected ArrayList<String> getOutLines() {
        String[] lines = outContent.toString().split("\\r?\\n");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(lines));
        return arrayList;
    }

    @Test
    public void testGreeting() {
        Cafe cafe = new Cafe("Central Perk");
        assertEquals(cafe.greeting(), "Welcome to Central Perk");
    }

    @Test
    public void testGreetingPartial() {
        Cafe cafe = new Cafe("Central Perk");
        assertTrue(cafe.greeting().contains("Welcome") || cafe.greeting().contains("Central Perk"));
    }

    @Test
    public void testPrintMenuExactFormat() throws Exception {
        Cafe cafe = new Cafe("Central Perk");

        Recipe espresso = createEspressoRecipe();
        cafe.addRecipe(espresso);

        Recipe americano = new Recipe("Americano", 2, Recipe.Size.REGULAR, 2);
        americano.addIngredient(new Coffee());
        americano.addIngredient(new Water());
        cafe.addRecipe(americano);

        cafe.printMenu();
        ArrayList<String> lines = getOutLines();
        assertEquals(8, lines.size());
        assertEquals("==========", lines.get(0));
        assertEquals("Welcome to Central Perk", lines.get(1));
        assertEquals("Menu", lines.get(2));
        assertEquals("==========", lines.get(3));
        assertEquals("Espresso - 1.5", lines.get(4));
        assertEquals("Americano - 2.0", lines.get(5));
        assertEquals("==========", lines.get(6));
        assertEquals("Enjoy!", lines.get(7));
    }

    @Test
    public void testPrintMenuIncorrectFormat() throws Exception {
        Cafe cafe = new Cafe("Central Perk");

        Recipe espresso = createEspressoRecipe();
        cafe.addRecipe(espresso);

        Recipe americano = new Recipe("Americano", 2, Recipe.Size.REGULAR, 2);
        americano.addIngredient(new Coffee());
        americano.addIngredient(new Water());
        cafe.addRecipe(americano);

        cafe.printMenu();
        ArrayList<String> lines = getOutLines();
        assertTrue(lines.stream().anyMatch(item -> item.contains("Central Perk")));
        assertTrue(lines.stream().anyMatch(item -> item.contains("Menu")));
        assertTrue(lines.stream().anyMatch(item -> item.matches("Espresso.*1\\.5")));
        assertTrue(lines.stream().anyMatch(item -> item.matches("Americano.*2\\.0")));
        assertTrue(lines.stream().anyMatch(item -> item.contains("Enjoy!")));
    }

//    @Test
//    public void testAddingIngredientsExceedingMaximumCapacity() {
//        Recipe recipe = new Recipe("Coffee", 1.5, Recipe.Size.SMALL, 1);
//        assertThrows(TooManyIngredientsException.class, () -> recipe.addIngredient(new Coffee()));
//    }

    @Test
    public void testRemovingIngredients() throws TooManyIngredientsException {
        Recipe recipe = new Recipe("Coffee", 1.5, Recipe.Size.SMALL, 2);
        recipe.addIngredient(new Coffee());
        recipe.addIngredient(new Water());
//        recipe.removeIngredient(0);
//        assertEquals(1, recipe.getIngredients().size());
//        assertTrue(recipe.getIngredients().get(0) instanceof Water);
    }

//    @Test
//    public void testChangingRecipePriceAndSize() throws TooManyIngredientsException {
//        Recipe recipe = new Recipe("Coffee", 1.5, Recipe.Size.SMALL, 2);
//        recipe.setPrice(2.0);
//        recipe.setSize(Recipe.Size.MEDIUM);
//        assertEquals(2.0, recipe.getPrice(), 0.001);
//        assertEquals(Recipe.Size.MEDIUM, recipe.getSize());
//    }

//    @Test
//    public void testInvalidRecipeCreation() {
//        assertThrows(IllegalArgumentException.class, () -> new Recipe("Coffee", -1.5, Recipe.Size.SMALL, 2));
//    }

//    @Test
//    public void testAddingDuplicateIngredients() throws TooManyIngredientsException {
//        Recipe recipe = new Recipe("Coffee", 1.5, Recipe.Size.SMALL, 2);
//        recipe.addIngredient(new Coffee());
//        recipe.addIngredient(new Water());
//        recipe.addIngredient(new Coffee()); // Duplicate ingredient
//        assertEquals(3, recipe.getIngredients().size());
//        assertTrue(recipe.getIngredients().get(0) instanceof Coffee);
//        assertTrue(recipe.getIngredients().get(1) instanceof Water);
//        assertTrue(recipe.getIngredients().get(2) instanceof Coffee);
//    }
//
//    @Test
//    public void testChangingIngredientOrderInRecipe() throws TooManyIngredientsException {
//        Recipe recipe = new Recipe("Coffee", 1.5, Recipe.Size.SMALL, 2);
//        recipe.addIngredient(new Coffee());
//        recipe.addIngredient(new Water());
//        recipe.swapIngredients(0, 1);
//        assertEquals(2, recipe.getIngredients().size());
//        assertTrue(recipe.getIngredients().get(0) instanceof Water);
//        assertTrue(recipe.getIngredients().get(1) instanceof Coffee);
//    }
}
