package uk.ac.sheffield.com1003.cafe.ingredients;

import static org.junit.Assert.*;
import org.junit.Test;

public class Water_LLMTest {

//    @Test(expected = NullPointerException.class)
//    public void testEqualsWithNullObject() {
//        Water water = new Water();
//        water.equals(null);
//    }

    @Test
    public void testEqualsWithSameObject() {
        Water water1 = new Water();
        Water water2 = water1;

        assertTrue(water1.equals(water2));
    }

//    @Test
//    public void testEqualsWithDifferentClass() {
//        Water water = new Water();
//        Water water1 = new Water();
//
//        assertFalse(water.equals(water1));
//    }

    @Test
    public void testEqualsWithSameParameters() {
        Water water1 = new Water();
        Water water2 = new Water();

        assertTrue(water1.equals(water2));
    }

    @Test
    public void testEqualsWithDifferentAmounts() {
        Water water1 = new Water(50);
        Water water2 = new Water(100);

        assertFalse(water1.equals(water2));
    }

    @Test
    public void testEqualsWithDifferentUnits() {
        Water water1 = new Water(1);
        Water water2 = new Water(2);

        assertFalse(water1.equals(water2));
    }
}