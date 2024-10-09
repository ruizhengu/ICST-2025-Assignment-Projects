package uk.ac.sheffield.com1003.cafe.ingredients;

import static org.junit.Assert.*;
import org.junit.Test;

public class Syrup_LLMTest {

//    @Test(expected = NullPointerException.class)
//    public void testEqualsWithNullObject() {
//        Syrup syrup = new Syrup("Vanilla");
//        syrup.equals(null);
//    }

    @Test
    public void testEqualsWithSameObject() {
        Syrup syrup1 = new Syrup("Vanilla");
        Syrup syrup2 = syrup1;

        assertTrue(syrup1.equals(syrup2));
    }

//    @Test
//    public void testEqualsWithDifferentClass() {
//        Syrup syrup = new Syrup("Vanilla");
//        Syrup syrup1 = new Syrup();
//
//        assertFalse(syrup.equals(syrup1));
//    }

    @Test
    public void testEqualsWithSameParameters() {
        Syrup syrup1 = new Syrup("Vanilla");
        Syrup syrup2 = new Syrup("Vanilla");

        assertTrue(syrup1.equals(syrup2));
    }

//    @Test
//    public void testEqualsWithDifferentFlavours() {
//        Syrup syrup1 = new Syrup("Vanilla");
//        Syrup syrup2 = new Syrup("Chocolate");
//
//        assertFalse(syrup1.equals(syrup2));
//    }
}