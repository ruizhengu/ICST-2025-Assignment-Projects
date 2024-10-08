package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;

public class Milk_LLMTest {

    @Test
    public void testEqualsSameObject() {
        Milk milk = new Milk(100, Type.WHOLE);
        assertTrue(milk.equals(milk));
    }

    @Test
    public void testEqualsDifferentObjectSameProperties() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(100, Type.WHOLE);
        assertTrue(milk1.equals(milk2));
    }

    @Test
    public void testEqualsDifferentAmount() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(200, Type.WHOLE);
        assertFalse(milk1.equals(milk2));
    }

    @Test
    public void testEqualsDifferentType() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(100, Type.SEMI);
        assertFalse(milk1.equals(milk2));
    }

    @Test
    public void testEqualsNull() {
        Milk milk = new Milk(100, Type.WHOLE);
        assertFalse(milk.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() {
        Milk milk = new Milk(100, Type.WHOLE);
        String notMilk = "I am not milk";
        assertFalse(milk.equals(notMilk));
    }

    @Test
    public void testEqualsIdenticalObjectsWithDifferentAmounts() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(100, Type.WHOLE);
        assertTrue(milk1.equals(milk2));
    }

    @Test
    public void testEqualsSameTypeDifferentUnit() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(100, Type.WHOLE);
        assertTrue(milk1.equals(milk2)); // Units are the same (ML)
    }

    @Test
    public void testEqualsDifferentUnits() {
        Milk milk1 = new Milk(100, Type.WHOLE);
        Milk milk2 = new Milk(100, Type.WHOLE);
        assertTrue(milk1.equals(milk2));
    }
}
