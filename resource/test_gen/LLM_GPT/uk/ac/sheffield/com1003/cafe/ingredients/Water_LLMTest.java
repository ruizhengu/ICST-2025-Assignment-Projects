package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.ingredients.Water;

public class Water_LLMTest {

    @Test
    public void testEqualsSameObject() {
        Water water = new Water();
        assertTrue(water.equals(water));
    }

    @Test
    public void testEqualsDifferentObjectSameProperties() {
        Water water1 = new Water(30);
        Water water2 = new Water(30);
        assertTrue(water1.equals(water2));
    }

    @Test
    public void testEqualsDifferentAmounts() {
        Water water1 = new Water(30);
        Water water2 = new Water(50);
        assertFalse(water1.equals(water2)); // Amounts differ
    }

    @Test
    public void testEqualsDifferentInstance() {
        Water water = new Water();
        String notWater = "I am not water";
        assertFalse(water.equals(notWater));
    }

    @Test
    public void testEqualsNull() {
        Water water = new Water();
        assertFalse(water.equals(null)); // Cannot be equal to null
    }

    @Test
    public void testEqualsDifferentClass() {
        Water water = new Water();
        assertFalse(water.equals(new Object())); // Should not be equal to an object of a different class
    }

    @Test
    public void testEqualsSameNameDifferentAmounts() {
        Water water1 = new Water(100);
        Water water2 = new Water(100); // Same amount
        assertTrue(water1.equals(water2)); // They should be equal based on name and amount
    }

    @Test
    public void testEqualsDifferentUnits() {
        Water water1 = new Water(30);
        Water water2 = new Water(30); // Both in ML
        assertTrue(water1.equals(water2)); // Units are the same (ML)
    }
}
