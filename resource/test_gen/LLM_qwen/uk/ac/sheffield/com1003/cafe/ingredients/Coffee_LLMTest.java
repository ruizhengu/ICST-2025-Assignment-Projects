package uk.ac.sheffield.com1003.cafe.ingredients;

import static org.junit.Assert.*;
import org.junit.Test;

public class Coffee_LLMTest {

//    @Test(expected = NullPointerException.class)
//    public void testEqualsWithNullObject() {
//        Coffee coffee = new Coffee(8);
//        coffee.equals(null);
//    }

    @Test
    public void testEqualsWithSameObject() {
        Coffee coffee1 = new Coffee(8);
        Coffee coffee2 = coffee1;

        assertTrue(coffee1.equals(coffee2));
    }

//    @Test
//    public void testEqualsWithDifferentClass() {
//        Coffee coffee = new Coffee(8);
//        Coffee coffee1 = new Coffee();
//
//        assertFalse(coffee.equals(coffee1));
//    }

    @Test
    public void testEqualsWithSameParameters() {
        Coffee coffee1 = new Coffee(8, true);
        Coffee coffee2 = new Coffee(8, true);

        assertTrue(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsWithDifferentAmounts() {
        Coffee coffee1 = new Coffee(8, true);
        Coffee coffee2 = new Coffee(16, true);

        assertFalse(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsWithDifferentUnits() {
        Coffee coffee1 = new Coffee(8, true);
        Coffee coffee2 = new Coffee(8, false);

        assertFalse(coffee1.equals(coffee2));
    }
}