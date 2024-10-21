package uk.ac.sheffield.com1003.cafe;

import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;
public class EduTestLLM6 {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

//    @Test
//    public void testIngredientDefaultConstructorSetsName() throws Exception {
//        Ingredient ingredient = new Ingredient();
//        String name = FieldUtils.readField(ingredient, "name", true);
//        assertEquals("", name);
//    }
//
//    @Test
//    public void testIngredientDefaultConstructorSetsAmount() throws Exception {
//        Ingredient ingredient = new Ingredient();
//        int amount = (int) FieldUtils.readField(ingredient, "amount", true);
//        assertEquals(0, amount);
//    }
//
//    @Test
//    public void testIngredientDefaultConstructorSetsUnit() throws Exception {
//        Ingredient ingredient = new Ingredient();
//        Unit unit = (Unit) FieldUtils.readField(ingredient, "unit", true);
//        assertEquals(Unit.GRAMS, unit);
//    }
//
//    @Test
//    public void testIngredientSetters() throws Exception {
//        Ingredient ingredient = new Ingredient();
//        ingredient.setName("Coffee");
//        ingredient.setAmount(100);
//        ingredient.setUnit(Unit.CUPS);
//
//        String name = FieldUtils.readField(ingredient, "name", true);
//        int amount = (int) FieldUtils.readField(ingredient, "amount", true);
//        Unit unit = (Unit) FieldUtils.readField(ingredient, "unit", true);
//
//        assertEquals("Coffee", name);
//        assertEquals(100, amount);
//        assertEquals(Unit.CUPS, unit);
//    }
//
//    @Test
//    public void testIngredientToString() throws Exception {
//        Ingredient ingredient = new Ingredient();
//        ingredient.setName("Water");
//        ingredient.setAmount(500);
//        ingredient.setUnit(Unit.MILLILITERS);
//
//        String s = (String) MethodUtils.invokeMethod(ingredient, "toString");
//        assertEquals("Ingredient [name=Water, amount=500, unit=MILLILITERS]", s);
//    }
//
//    @Test
//    public void testIngredientEquals() throws Exception {
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setName("Coffee");
//        ingredient1.setAmount(100);
//        ingredient1.setUnit(Unit.CUPS);
//
//        Ingredient ingredient2 = new Ingredient();
//        ingredient2.setName("Coffee");
//        ingredient2.setAmount(100);
//        ingredient2.setUnit(Unit.CUPS);
//
//        assertTrue(ingredient1.equals(ingredient2));
//    }
//
//    @Test
//    public void testIngredientEqualsDifferentName() throws Exception {
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setName("Coffee");
//        ingredient1.setAmount(100);
//        ingredient1.setUnit(Unit.CUPS);
//
//        Ingredient ingredient2 = new Ingredient();
//        ingredient2.setName("Tea");
//        ingredient2.setAmount(100);
//        ingredient2.setUnit(Unit.CUPS);
//
//        assertFalse(ingredient1.equals(ingredient2));
//    }
//
//    @Test
//    public void testIngredientEqualsDifferentAmount() throws Exception {
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setName("Coffee");
//        ingredient1.setAmount(100);
//        ingredient1.setUnit(Unit.CUPS);
//
//        Ingredient ingredient2 = new Ingredient();
//        ingredient2.setName("Coffee");
//        ingredient2.setAmount(50);
//        ingredient2.setUnit(Unit.CUPS);
//
//        assertFalse(ingredient1.equals(ingredient2));
//    }
//
//    @Test
//    public void testIngredientEqualsDifferentUnit() throws Exception {
//        Ingredient ingredient1 = new Ingredient();
//        ingredient1.setName("Coffee");
//        ingredient1.setAmount(100);
//        ingredient1.setUnit(Unit.CUPS);
//
//        Ingredient ingredient2 = new Ingredient();
//        ingredient2.setName("Coffee");
//        ingredient2.setAmount(100);
//        ingredient2.setUnit(Unit.GALLONS);
//
//        assertFalse(ingredient1.equals(ingredient2));
//    }

//    @Test
//    public void testWaterDefaultConstructorSetsName() throws Exception {
//        Water water = new Water();
//        String name = FieldUtils.readField(water, "name", true);
//        assertEquals("", name);
//    }

//    @Test
//    public void testWaterDefaultConstructorSetsAmount() throws Exception {
//        Water water = new Water();
//        int amount = (int) FieldUtils.readField(water, "amount", true);
//        assertEquals(0, amount);
//    }

//    @Test
//    public void testWaterDefaultConstructorSetsUnit() throws Exception {
//        Water water = new Water();
//        Unit unit = (Unit) FieldUtils.readField(water, "unit", true);
//        assertEquals(Unit.MILLILITERS, unit);
//    }
//
//    @Test
//    public void testWaterSetters() throws Exception {
//        Water water = new Water();
//        water.setName("Filtered Water");
//        water.setAmount(250);
//        water.setUnit(Unit.LITERS);
//
//        String name = FieldUtils.readField(water, "name", true);
//        int amount = (int) FieldUtils.readField(water, "amount", true);
//        Unit unit = (Unit) FieldUtils.readField(water, "unit", true);
//
//        assertEquals("Filtered Water", name);
//        assertEquals(250, amount);
//        assertEquals(Unit.LITERS, unit);
//    }
//
//    @Test
//    public void testWaterToString() throws Exception {
//        Water water = new Water();
//        water.setName("Spring Water");
//        water.setAmount(1500);
//        water.setUnit(Unit.MILLILITERS);
//
//        String s = (String) MethodUtils.invokeMethod(water, "toString");
//        assertEquals("Water [name=Spring Water, amount=1500, unit=MILLILITERS]", s);
//    }
//
//    @Test
//    public void testWaterEquals() throws Exception {
//        Water water1 = new Water();
//        water1.setName("Spring Water");
//        water1.setAmount(1500);
//        water1.setUnit(Unit.MILLILITERS);
//
//        Water water2 = new Water();
//        water2.setName("Spring Water");
//        water2.setAmount(1500);
//        water2.setUnit(Unit.MILLILITERS);
//
//        assertTrue(water1.equals(water2));
//    }
//
//    @Test
//    public void testWaterEqualsDifferentName() throws Exception {
//        Water water1 = new Water();
//        water1.setName("Spring Water");
//        water1.setAmount(1500);
//        water1.setUnit(Unit.MILLILITERS);
//
//        Water water2 = new Water();
//        water2.setName("Mineral Water");
//        water2.setAmount(1500);
//        water2.setUnit(Unit.MILLILITERS);
//
//        assertFalse(water1.equals(water2));
//    }
//
//    @Test
//    public void testWaterEqualsDifferentAmount() throws Exception {
//        Water water1 = new Water();
//        water1.setName("Spring Water");
//        water1.setAmount(1500);
//        water1.setUnit(Unit.MILLILITERS);
//
//        Water water2 = new Water();
//        water2.setName("Spring Water");
//        water2.setAmount(750);
//        water2.setUnit(Unit.MILLILITERS);
//
//        assertFalse(water1.equals(water2));
//    }
//
//    @Test
//    public void testWaterEqualsDifferentUnit() throws Exception {
//        Water water1 = new Water();
//        water1.setName("Spring Water");
//        water1.setAmount(1500);
//        water1.setUnit(Unit.MILLILITERS);
//
//        Water water2 = new Water();
//        water2.setName("Spring Water");
//        water2.setAmount(1500);
//        water2.setUnit(Unit.LITERS);
//
//        assertFalse(water1.equals(water2));
//    }

    @Test
    public void testWaterEqualsNull() throws Exception {
        Water water = new Water();

        assertFalse(water.equals(null));
    }

    @Test
    public void testWaterEqualsDifferentClass() throws Exception {
        Water water = new Water();
        String str = "Hello";

        assertFalse(water.equals(str));
    }
}
