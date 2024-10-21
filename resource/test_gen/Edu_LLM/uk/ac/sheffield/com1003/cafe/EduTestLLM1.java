package uk.ac.sheffield.com1003.cafe;

import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EduTestLLM1 {
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

    protected Recipe createEspressoRecipe() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Coffee());
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    @Test
    public void testAppClassExists() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("uk.ac.sheffield.com1003.cafe.App");
        assertNotNull(clazz);
    }

    @Test
    public void testAddRecipeAndMenuSize() throws Exception {
        Cafe cafe = new Cafe("Central Perk");
        Recipe espresso = createEspressoRecipe();
        assertTrue(cafe.addRecipe(espresso));
        Recipe americano = new Recipe("Americano", 2, Recipe.Size.REGULAR, 2);
        americano.addIngredient(new Coffee());
        americano.addIngredient(new Water());
        assertTrue(cafe.addRecipe(americano));
        assertEquals(2, cafe.getMenu().length);
    }

    @Test
    public void testAddRecipeMenuSizeZero() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 0, 10); // only one recipe can be allowed
        Recipe espresso = createEspressoRecipe();
        assertFalse(cafe.addRecipe(espresso));
        assertEquals(0, cafe.getMenu().length);
    }

    @Test
    public void testAddRecipeExceedingMenuSize() throws Exception {
        Cafe cafe = new Cafe("Central Perk", 1, 10); // only one recipe can be allowed
        Recipe espresso = createEspressoRecipe();
        assertTrue(cafe.addRecipe(espresso));
        Recipe americano = new Recipe("Americano", 2, Recipe.Size.REGULAR, 2);
        americano.addIngredient(new Coffee());
        americano.addIngredient(new Water());
        assertFalse(cafe.addRecipe(americano)); // should not be added
        assertEquals(1, cafe.getMenu().length);
    }

    @Test
    public void testCoffeeConstructor() throws IllegalAccessException {
        Coffee c = new Coffee();
        assertEquals("Coffee", c.getName());
        assertEquals(8, c.getAmount());
        assertEquals(Unit.GR, c.getUnit());

        // Having to use reflection because we didn't provide
        // a getter for Coffee.decaf or ask for one to be implemented
        Boolean isDecaf = (Boolean) FieldUtils.readField(c, "decaf", true);
        assertFalse(isDecaf);
    }

    @Test
    public void testCoffeeConstructorOverloaded() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        // if Coffee(int amount) has not been implemented, this will throw NoSuchMethodException
        Coffee c = ConstructorUtils.invokeConstructor(Coffee.class, 30);

        assertEquals("Coffee", c.getName());
        assertEquals(30, c.getAmount());
        assertEquals(Unit.GR, c.getUnit());
        Boolean isDecaf = (Boolean) FieldUtils.readField(c, "decaf", true);
        assertFalse(isDecaf);
    }

    @Test
    public void testWaterConstructorOverloaded() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Water w = ConstructorUtils.invokeConstructor(Water.class, 120);
        assertNotNull(w);
        assertEquals("Water", w.getName());
        assertEquals(120, w.getAmount());
        assertEquals(Unit.ML, w.getUnit());
    }

    @Test
    public void testWaterConstructor() {
        Water w = new Water();
        assertEquals("Water", w.getName());
        assertEquals(Unit.ML, w.getUnit());
    }

//    @Test(expected = TooManyIngredientsException.class)
//    public void testTooManyIngredients() throws TooManyIngredientsException {
//        Recipe espresso = createEspressoRecipe();
//        EspressoMachine machine = new EspressoMachine();
//        machine.makeDrink(espresso);
//    }

    @Test
    public void testMakeDrinkWithSufficientIngredients() throws Exception {
        Coffee coffee = new Coffee();
        Water water = new Water();
        Milk milk = new Milk();

        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 3);
        espresso.addIngredient(coffee);
        espresso.addIngredient(water);
        espresso.addIngredient(milk);

//        EspressoMachine machine = new EspressoMachine();
//        CoffeeDrink drink = machine.makeDrink(espresso);
//        assertEquals("Espresso", drink.getName());
//        assertEquals(1.5, drink.getPrice(), 0.01);
//        assertEquals(Recipe.Size.SMALL, drink.getSize());
//        assertTrue(drink.getIngredients().contains(coffee));
//        assertTrue(drink.getIngredients().contains(water));
//        assertTrue(drink.getIngredients().contains(milk));
    }

    @Test
    public void testMakeDrinkWithInsufficientIngredients() throws Exception {
        Coffee coffee = new Coffee();
        Water water = new Water();

        Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 3);
        espresso.addIngredient(coffee);
        espresso.addIngredient(water);
        espresso.addIngredient(new Milk());

//        EspressoMachine machine = new EspressoMachine();
//        try {
//            CoffeeDrink drink = machine.makeDrink(espresso);
//            fail("Expected an InsufficientIngredientsException");
//        } catch (InsufficientIngredientsException e) {
//            assertEquals("Not enough coffee available", e.getMessage());
//        }
    }

//    @Test
//    public void testRefillIngredient() throws Exception {
//        EspressoMachine machine = new EspressoMachine();
//        MachineStatus status = machine.getMachineStatus();
//        assertEquals(100, status.getCoffeeAmount(), 0.01);
//        assertEquals(200, status.getWaterAmount(), 0.01);
//
//        machine.refillIngredient("coffee", 50);
//        machine.refillIngredient("water", 100);
//
//        status = machine.getMachineStatus();
//        assertEquals(150, status.getCoffeeAmount(), 0.01);
//        assertEquals(300, status.getWaterAmount(), 0.01);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testRefillIngredientWithInvalidType() throws Exception {
//        EspressoMachine machine = new EspressoMachine();
//        machine.refillIngredient("sugar", 50);
//    }
}
