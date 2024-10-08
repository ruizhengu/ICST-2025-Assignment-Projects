package uk.ac.sheffield.com1003.cafe;

import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.Order;
import uk.ac.sheffield.com1003.cafe.Recipe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class Order_LLMTest {

    private Recipe recipe;
    private Order order;

    @Before
    public void setUp() {
        recipe = new Recipe("Latte", 2.5);
        order = new Order(recipe, "John Doe", 3.0);
    }

    @Test
    public void testConstructorWithDefaultSpecialRequest() {
        Order defaultOrder = new Order(recipe, "Jane Doe", 3.0);
        assertEquals("Order: Latte; For: Jane Doe; Paid: 3.0", defaultOrder.toString());
    }

    @Test
    public void testConstructorWithSpecialRequest() {
        Order specialOrder = new Order(recipe, "Alice", 4.0, "Extra hot");
        assertEquals("Order: Latte; For: Alice; Paid: 4.0", specialOrder.toString());
    }

    @Test
    public void testServeUpdatesOrderServed() {
        order.serve();
        // Check if orderServed is not null by comparing output of printReceipt
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String expectedOrderServed = "Served: " + now.format(formatter);
        String actualOutput = getReceiptOutput(order);
        assertTrue("Receipt should indicate the order has been served", actualOutput.contains(expectedOrderServed));
    }

    @Test
    public void testToStringMethod() {
        assertEquals("Order: Latte; For: John Doe; Paid: 3.0", order.toString());
    }

    private String getReceiptOutput(Order order) {
        // Captures the printed output by redirecting System.out
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        order.printReceipt();
        System.setOut(System.out);
        return outContent.toString();
    }
}
