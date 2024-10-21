package uk.ac.sheffield.com1003.cafe;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class EduTestLLM3 {
    // Helper method to create a sample Espresso recipe
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

    @Test
    public void placeOrderWithValidRecipeAndCapacity() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
        assertEquals(1, indexPlace);
        assertEquals(0, indexServe);
    }

    @Test
    public void serveOrderAfterPlacing() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        Order o = cafe.serveOrder();
        assertNotNull(o);
//        assertEquals("Espresso", o.getRecipeName());
//        assertEquals(3, o.getCopies());
//        assertEquals("Jose", o.getName());
        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
        assertEquals(1, indexPlace);
        assertEquals(1, indexServe);
    }

    @Test
    public void serveMultipleOrdersInSequence() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 3, 2);
        cafe.addRecipe(createEspressoRecipe());
        cafe.addRecipe(new Recipe("Flat white", 2.0));

        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        assertTrue(cafe.placeOrder("Flat white", "Maria", 2));

        Order first = cafe.serveOrder();
        assertNotNull(first);
//        assertEquals("Espresso", first.getRecipeName());
//        assertEquals(3, first.getCopies());

        Order second = cafe.serveOrder();
        assertNotNull(second);
//        assertEquals("Flat white", second.getRecipeName());
//        assertEquals(2, second.getCopies());

        assertNull(cafe.serveOrder()); // No more orders to serve
    }

    @Test(expected = RecipeNotFoundException.class)
    public void placeOrderForNonexistentRecipeThrowsException() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Flat white", "Jose", 10);
    }

//    @Test(expected = RecipeNotFoundException.class)
//    public void serveNonexistentOrderThrowsException1() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        Order o = cafe.serveOrder();
//        assertNull(o);
//        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
//        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
//        assertEquals(0, indexPlace);
//        assertEquals(0, indexServe);
//    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderWhenFullThrowsException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        assertTrue(cafe.placeOrder("Espresso", "Maria", 5)); // This should fail
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderWhenFullThrowsCorrectException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        assertTrue(cafe.placeOrder("Espresso", "Maria", 5)); // This should fail
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderWhenHalfFullThrowsException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        assertTrue(cafe.placeOrder("Espresso", "Maria", 2)); // This should fail
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void placeOrderWhenHalfFullThrowsCorrectException() throws RecipeNotFoundException, CafeOutOfCapacityException {
        Cafe cafe = new Cafe("Central Perk", 2, 1);
        cafe.addRecipe(createEspressoRecipe());
        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
        assertTrue(cafe.placeOrder("Espresso", "Maria", 2)); // This should fail
    }

//    @Test(expected = RecipeNotFoundException.class)
//    public void serveNonexistentOrderThrowsException() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        Order o = cafe.serveOrder();
//        assertNull(o);
//        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
//        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
//        assertEquals(0, indexPlace);
//        assertEquals(0, indexServe);
//    }

//    @Test(expected = RecipeNotFoundException.class)
//    public void serveNonexistentOrderThrowsCorrectException1() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        Order o = cafe.serveOrder();
//        assertNull(o);
//        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
//        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
//        assertEquals(0, indexPlace);
//        assertEquals(0, indexServe);
//    }

//    @Test
//    public void placeMultipleOrdersForSameRecipe() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 5, 3);
//        cafe.addRecipe(createEspressoRecipe());
//
//        assertTrue(cafe.placeOrder("Espresso", "Jose", 3));
//        assertTrue(cafe.placeOrder("Espresso", "Maria", 2));
//        assertTrue(cafe.placeOrder("Espresso", "Pedro", 4));
//
//        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
//        assertEquals(5, indexPlace);
//
//        Order first = cafe.serveOrder();
//        assertNotNull(first);
////        assertEquals("Espresso", first.getRecipeName());
////        assertEquals(3, first.getCopies());
//
//        Order second = cafe.serveOrder();
//        assertNotNull(second);
////        assertEquals("Espresso", second.getRecipeName());
////        assertEquals(2, second.getCopies());
//
//        Order third = cafe.serveOrder();
//        assertNotNull(third);
////        assertEquals("Espresso", third.getRecipeName());
////        assertEquals(4, third.getCopies());
//
//        assertNull(cafe.serveOrder()); // No more orders to serve
//    }

    @Test(expected = RecipeNotFoundException.class)
    public void placeOrderForNonexistentRecipeThrowsCorrectException() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 1);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Flat white", "Jose", 10); // This should fail
    }

//    @Test(expected = RecipeNotFoundException.class)
//    public void serveNonexistentOrderThrowsCorrectException() throws Exception {
//        Cafe cafe = new Cafe("Central Perk", 2, 1);
//        Order o = cafe.serveOrder();
//        assertNull(o);
//        int indexPlace = (int) FieldUtils.readField(cafe, "indexNextOrderToPlace", true);
//        int indexServe = (int) FieldUtils.readField(cafe, "indexNextOrderToServe", true);
//        assertEquals(0, indexPlace);
//        assertEquals(0, indexServe);
//    }
}
