package uk.ac.sheffield.com1003.cafe.ingredients;

import static org.junit.Assert.*;
import org.junit.Test;

public class Milk_LLMTest {

//    @Test(expected = NullPointerException.class)
//    public void testEqualsWithNullObject() {
//        Milk milk = new Milk(100, Milk.Type.WHOLE);
//        milk.equals(null);
//    }

    @Test
    public void testEqualsWithSameObject() {
        Milk milk1 = new Milk(100, Milk.Type.WHOLE);
        Milk milk2 = milk1;

        assertTrue(milk1.equals(milk2));
    }

//    @Test
//    public void testEqualsWithDifferentClass() {
//        Milk milk = new Milk(100, Milk.Type.WHOLE);
//        Milk milk1 = new Milk();
//
//        assertFalse(milk.equals(milk1));
//    }

    @Test
    public void testEqualsWithSameParameters() {
        Milk milk1 = new Milk(100, Milk.Type.WHOLE);
        Milk milk2 = new Milk(100, Milk.Type.WHOLE);

        assertTrue(milk1.equals(milk2));
    }

    @Test
    public void testEqualsWithDifferentAmounts() {
        Milk milk1 = new Milk(100, Milk.Type.WHOLE);
        Milk milk2 = new Milk(200, Milk.Type.WHOLE);

        assertFalse(milk1.equals(milk2));
    }

    @Test
    public void testEqualsWithDifferentTypes() {
        Milk milk1 = new Milk(100, Milk.Type.WHOLE);
        Milk milk2 = new Milk(100, Milk.Type.SEMI);

        assertFalse(milk1.equals(milk2));
    }
}