package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;
import static org.junit.Assert.*;

import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;

public class Coffee_LLMTest {

    @Test
    public void testEqualsSameObject() {
        Coffee coffee = new Coffee();
        assertTrue(coffee.equals(coffee));
    }

    @Test
    public void testEqualsDifferentObjectSameValues() {
        Coffee coffee1 = new Coffee(10, false);
        Coffee coffee2 = new Coffee(10, false);
        assertTrue(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsDifferentAmount() {
        Coffee coffee1 = new Coffee(10, false);
        Coffee coffee2 = new Coffee(5, false);
        assertFalse(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsDifferentDecaf() {
        Coffee coffee1 = new Coffee(10, true);
        Coffee coffee2 = new Coffee(10, false);
        assertFalse(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsDifferentName() {
        Coffee coffee1 = new Coffee(10, false);
        Coffee coffee2 = new Coffee(10, false) {
            @Override
            public String getName() {
                return "Espresso"; // Override to change name
            }
        };
        assertFalse(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsNull() {
        Coffee coffee = new Coffee();
        assertFalse(coffee.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        Coffee coffee = new Coffee();
        String notACoffee = "Not a Coffee Object";
        assertFalse(coffee.equals(notACoffee));
    }

//    @Test
//    public void testEqualsWithDifferentUnit() {
//        Coffee coffee1 = new Coffee(10, false);
//        Coffee coffee2 = new Coffee(10, false) {
//            @Override
//            public Unit getUnit() {
//                return Unit.ML; // Override to change unit
//            }
//        };
//        assertFalse(coffee1.equals(coffee2));
//    }

    @Test
    public void testEqualsIdenticalObject() {
        Coffee coffee1 = new Coffee(10, true);
        Coffee coffee2 = new Coffee(10, true);
        assertTrue(coffee1.equals(coffee2));
    }

    @Test
    public void testEqualsDifferentIngredients() {
        Coffee coffee1 = new Coffee(10, false);
        Coffee coffee2 = new Coffee(10, true);
        assertFalse(coffee1.equals(coffee2));
    }
}
