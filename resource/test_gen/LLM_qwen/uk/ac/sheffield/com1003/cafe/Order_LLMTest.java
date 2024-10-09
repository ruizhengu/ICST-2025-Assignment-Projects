package uk.ac.sheffield.com1003.cafe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.sheffield.com1003.cafe.Cafe;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;
import uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException;
import uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class Order_LLMTest {

    private Cafe cafe;
    private Recipe recipe1;
    private Recipe recipe2;
    private Order order1;
    private Order order2;

    @BeforeEach
    public void setUp() {
        cafe = new Cafe();
        recipe1 = new Recipe("Pizza", 5.99);
        recipe2 = new Recipe("Burger", 4.75);

        cafe.addRecipe(recipe1);
        cafe.addRecipe(recipe2);

        order1 = new Order(recipe1, "Alice", 6.00);
        order2 = new Order(recipe2, "Bob", 4.50);
    }

//    @Test
//    public void testPlaceOrder() throws RecipeNotFoundException,
//            CafeOutOfCapacityException {
//        assertTrue(cafe.placeOrder("Pizza", "Charlie", 6.00));
//        assertTrue(cafe.placeOrder("Burger", "Dave", 4.75));
//
//        assertFalse(cafe.placeOrder("Salad", "Eve", 3.99)); // Recipe not found
//    }

//    @Test
//    public void testServeOrder() {
//        try {
//            cafe.placeOrder("Pizza", "Charlie", 6.00);
//            Order servedOrder = cafe.serveOrder();
//            assertNotNull(servedOrder);
//            assertEquals(recipe1, servedOrder.getRecipe());
//            assertFalse(servedOrder.isServed());
//
//            servedOrder.serve(); // Mark the order as served
//            assertTrue(servedOrder.isServed());
//
//            Order nextOrder = cafe.serveOrder();
//            assertNull(nextOrder); // No more orders to serve
//        } catch (Exception e) {
//            fail("Failed to serve orders: " + e.getMessage());
//        }
//    }

//    @Test
//    public void testRemoveRecipe() throws RecipeNotFoundException {
////        assertTrue(cafe.removeRecipe("Pizza"));
//        Recipe[] menu = cafe.getMenu();
//        assertEquals(1, menu.length);
//        assertEquals(recipe2, menu[0]);
//
//        try {
//            cafe.removeRecipe("Pizza"); // Should throw exception as recipe is already removed
//            fail("Expected RecipeNotFoundException");
//        } catch (RecipeNotFoundException e) {
//            // Expected
//        }
//    }

    @Test
    public void testPrintMenu() {
        cafe.printMenu(); // Output will vary based on system properties and implementation details
    }

    @Test
    public void testGetMenu() {
        Recipe[] menu = cafe.getMenu();
        assertEquals(2, menu.length);
        assertEquals(recipe1, menu[0]);
        assertEquals(recipe2, menu[1]);
    }
}