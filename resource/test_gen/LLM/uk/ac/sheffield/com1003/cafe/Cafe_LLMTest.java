import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.Cafe;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;
import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;

import static org.junit.Assert.*;

public class Cafe_LLMTest {

    private Cafe cafe;
    private Recipe espresso;
    private Recipe latte;

    @Before
    public void setUp() throws Exception {
        cafe = new Cafe("Central Perk");
        espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 1);
        latte = new Recipe("Latte", 2.5, Recipe.Size.LARGE, 2);

        cafe.addRecipe(espresso);
        cafe.addRecipe(latte);
    }

    @Test
    public void testGreeting() {
        String greeting = cafe.greeting();
        assertEquals("Welcome to Central Perk", greeting);
    }

    @Test
    public void testPlaceOrderSuccess() throws CafeOutOfCapacityException, RecipeNotFoundException {
        boolean orderPlaced = cafe.placeOrder("Espresso", "Alice", 1.5);
        assertTrue(orderPlaced);
    }

    @Test
    public void testPlaceOrderInsufficientFunds() throws CafeOutOfCapacityException, RecipeNotFoundException {
        boolean orderPlaced = cafe.placeOrder("Espresso", "Alice", 1.0);
        assertFalse(orderPlaced);
    }

    @Test(expected = RecipeNotFoundException.class)
    public void testPlaceOrderRecipeNotFound() throws CafeOutOfCapacityException, RecipeNotFoundException {
        cafe.placeOrder("Cappuccino", "Bob", 2.0);
    }

    @Test(expected = CafeOutOfCapacityException.class)
    public void testPlaceOrderOutOfCapacity() throws CafeOutOfCapacityException, RecipeNotFoundException {
        for (int i = 0; i < 100; i++) {
            cafe.placeOrder("Latte", "Customer" + i, 2.5);
        }
        cafe.placeOrder("Espresso", "Customer101", 1.5); // Should trigger exception
    }

    @Test
    public void testPrintMenu() {
        // Simulate printing menu
        cafe.printMenu();
        // No assertions here since it's a print method; manual verification may be required.
    }

    @Test
    public void testPrintPendingOrders() throws CafeOutOfCapacityException, RecipeNotFoundException {
        cafe.placeOrder("Espresso", "Alice", 1.5);
        cafe.placeOrder("Latte", "Bob", 2.5);

        cafe.printPendingOrders();
        // Manual verification needed as this method prints directly to the console.
    }

    @Test
    public void testRemoveRecipeSuccess() throws RecipeNotFoundException {
        cafe.removeRecipe("Espresso");
        Recipe[] menu = cafe.getMenu();
        boolean espressoFound = false;
        for (Recipe r : menu) {
            if (r.getName().equals("Espresso")) {
                espressoFound = true;
                break;
            }
        }
        assertFalse(espressoFound);
    }

    @Test(expected = RecipeNotFoundException.class)
    public void testRemoveRecipeNotFound() throws RecipeNotFoundException {
        cafe.removeRecipe("Cappuccino");
    }

//    @Test
//    public void testServeOrderSuccess() throws CafeOutOfCapacityException, RecipeNotFoundException {
//        cafe.placeOrder("Espresso", "Alice", 1.5);
//        Order servedOrder = cafe.serveOrder();
//        assertNotNull(servedOrder);
//        assertTrue(servedOrder.);
//    }

    @Test
    public void testServeOrderNoOrders() {
        Order servedOrder = cafe.serveOrder();
        assertNull(servedOrder);
    }
}
