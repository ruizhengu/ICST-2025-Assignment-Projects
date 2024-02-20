package uk.ac.sheffield.com1003.cafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestPrintPendingOrdersAfterServing {

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
    public void printPendingOrdersAfterServing() throws Exception {
        // Handout is unspecific obout what to print if there are no pending orders,
        // so anything could be found here, but check that
        Cafe cafe = new Cafe("Central Perk", 2, 2);
        cafe.addRecipe(createEspressoRecipe());
        cafe.placeOrder("Espresso", "Mari-Cruz", 5);
        cafe.placeOrder("Espresso", "Jose", 3);
        cafe.serveOrder();
        cafe.printPendingOrders();
//        ArrayList<String> lines = getOutLines();
//        assertEquals(2, lines.size());
//        assertEquals("Pending Orders:", lines.get(0));
//        assertEquals("Order: Espresso; For: Jose; Paid: 3.0", lines.get(1));
    }




}
