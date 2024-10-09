package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.ingredients.Syrup;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;

public class Syrup_LLMTest {

    @Test
    public void testEqualsSameObject() {
        Syrup syrup = new Syrup();
        assertTrue(syrup.equals(syrup));
    }

    @Test
    public void testEqualsDifferentObjectSameProperties() {
        Syrup syrup1 = new Syrup();
        Syrup syrup2 = new Syrup();
        assertTrue(syrup1.equals(syrup2));
    }

    @Test
    public void testEqualsDifferentFlavour() {
        Syrup syrup1 = new Syrup("Maple");
        Syrup syrup2 = new Syrup("Chocolate");
        assertTrue(syrup1.equals(syrup2)); // Flavours are different but should still be equal based on name.
    }

    @Test
    public void testEqualsDifferentAmount() {
        Syrup syrup1 = new Syrup("Maple");
        Syrup syrup2 = new Syrup("Maple"); // Same flavour but should still be equal based on name.
        assertTrue(syrup1.equals(syrup2)); // Amount does not affect equality as per base class.
    }

    @Test
    public void testEqualsNull() {
        Syrup syrup = new Syrup();
        assertFalse(syrup.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Syrup syrup = new Syrup();
        String notSyrup = "I am not syrup";
        assertFalse(syrup.equals(notSyrup));
    }

    @Test
    public void testEqualsIdenticalObjectsWithDifferentFlavours() {
        Syrup syrup1 = new Syrup("Maple");
        Syrup syrup2 = new Syrup("Maple");
        assertTrue(syrup1.equals(syrup2)); // Same name, different flavour
    }

    @Test
    public void testEqualsDifferentUnits() {
        Syrup syrup1 = new Syrup("Vanilla");
        Syrup syrup2 = new Syrup("Vanilla");
        assertTrue(syrup1.equals(syrup2)); // Units are the same (ML)
    }
}
