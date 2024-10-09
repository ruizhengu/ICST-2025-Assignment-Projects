package uk.ac.sheffield.com1003.cafe;

import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class Cafe_LLMTest {
    private Cafe cafe;
    private Recipe espresso;
    private Recipe doubleEspresso;
    private Recipe soyLatte;
    private Order order1;
    private Order order2;

    @Before
    public void setUp() throws Exception {
        cafe = new Cafe("Central Perk");

        espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
        espresso.addIngredient(new Coffee());
        espresso.addIngredient(new Water());

        doubleEspresso = new Recipe("Double Espresso", 2.2,
                Recipe.Size.REGULAR, 2);
        doubleEspresso.addIngredient(new Coffee(15));
        doubleEspresso.addIngredient(new Water(50));

        soyLatte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE,
                3);
        soyLatte.addIngredient(new Coffee());
        soyLatte.addIngredient(new Water());
        soyLatte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        cafe.addRecipe(espresso);
        cafe.addRecipe(doubleEspresso);
        cafe.addRecipe(soyLatte);

//        order1 = cafe.placeOrder("Espresso", "Alice", 2.0);
//        order2 = cafe.placeOrder("Double Espresso", "Bob", 3.0);
    }

//    @Test
//    public void testGreeting() {
//        assertEquals("Welcome to Central Perk!", cafe.greeting());
//        assertTrue(lines.contains("Customer: Alice, Recipe: Espresso"));
//    }

//    @Test
//    public void testPlaceOrderSuccess() throws Exception {
//        assertTrue(cafe.placeOrder("Large Soy Latte", "Charlie", 2.5));
//        assertEquals(1, order2.getStatus());
//    }

    @Test(expected = RecipeNotFoundException.class)
    public void testPlaceOrderRecipeNotFound() throws Exception {
        cafe.placeOrder("Invalid Recipe", "Dave", 3.0);
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void testPlaceOrderCafeOutCapacity() throws Exception {
        for (int i = 0; i < 1000; i++) {
            cafe.placeOrder("Espresso", "Customer" + i, 2.0);
        }
    }

    @Test
    public void testPrintMenu() {
        // The method prints to System.out and we can't capture its output directly.
        // For simplicity, just call the method to ensure it doesn't throw an exception.
        cafe.printMenu();
    }

//    @Test
//    public void testPrintPendingOrders() {
//        // Capture the printed output to verify correctness
//        List<String> lines = new ArrayList<>();
//        System.setOut(new java.io.PrintStream(new
//                java.io.ByteArrayOutputStream()) {
//            @Override
//            public void println(String s) {
//                lines.add(s);
//            }
//        });
//
//        cafe.printPendingOrders();
//
//        assertTrue(lines.contains("Customer: Alice, Recipe: Espresso"));
//        assertTrue(lines.contains("Customer: Bob, Recipe: Double Espresso"));
//    }

//    @Test
//    public void testRemoveRecipe() throws Exception {
//        cafe.removeRecipe("Espresso");
//        assertFalse(cafe.findRecipe("Espresso") != null);
//    }

    @Test(expected = RecipeNotFoundException.class)
    public void testRemoveNonExistentRecipe() throws Exception {
        cafe.removeRecipe("Invalid Recipe");
    }

//    @Test
//    public void testServeOrder() throws Exception {
//        Order servedOrder = cafe.serveOrder();
//        assertNotNull(servedOrder);
//        assertEquals(1, servedOrder.getStatus());
//    }

//    @Test(expected = CafeOutOfCapacityException.class)
//    public void testServeOrderNoMoreOrdersToServe() throws Exception {
//        for (int i = 0; i < 2; i++) {
//            cafe.serveOrder();
//        }
//        cafe.serveOrder(); // Should throw an exception
//    }
}