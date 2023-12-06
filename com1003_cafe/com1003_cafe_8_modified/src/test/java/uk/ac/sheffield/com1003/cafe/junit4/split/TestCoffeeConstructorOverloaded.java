package uk.ac.sheffield.com1003.cafe.junit4.split;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.Cafe;
import uk.ac.sheffield.com1003.cafe.Recipe;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCoffeeConstructorOverloaded  {

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

    protected Recipe createEspressoRecipeAlt() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            espresso.addIngredient(new Coffee());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

    protected Recipe createEspressoRecipeIncomplete() {
        try {
            Recipe espresso = new Recipe("Espresso", 1.5, Recipe.Size.SMALL, 2);
            espresso.addIngredient(new Water());
            return espresso;
        } catch (TooManyIngredientsException exc) {
            System.err.println(exc.getMessage());
            return null;
        }
    }

//    protected ArrayList<String> getOutLines() {
//        Stream<String> lines = outContent.toString().lines();
//        ArrayList<String> arrayList = new ArrayList<>();
//        lines.forEach(arrayList::add);
//        return arrayList;
//    }

    protected void resetOutLines() {
        outContent.reset();
    }

//    protected ArrayList<String> getErrLines() {
//        Stream<String> lines = errContent.toString().lines();
//        ArrayList<String> arrayList = new ArrayList<>();
//        lines.forEach(arrayList::add);
//        return arrayList;
//    }

    @Test(timeout = 5000)
    public void testCoffeeConstructorOverloaded() throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        // if Coffee(int amount) has not been implemented, this will throw NoSuchMethodException
        Coffee c = new Coffee(30);

        assertEquals("Coffee", c.getName());
        assertEquals(30, c.getAmount());
        assertEquals(Unit.GR, c.getUnit());
        boolean isDecaf = c.getDecaf();
        assertFalse(isDecaf);
    }










}
