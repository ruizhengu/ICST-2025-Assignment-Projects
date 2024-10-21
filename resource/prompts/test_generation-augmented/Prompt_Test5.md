The task is to augment an existing test suite to make it cover as many cases as possible.

There are the classes that the test suite interact with:

```
package uk.ac.sheffield.com1003.cafe;

import java.util.*;

import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;

public class Recipe {
    public enum Size {SMALL, REGULAR, LARGE}

    ;
    private String name;
    private double price;
    private Size size;
    private Ingredient[] ingredients;

    public Recipe(String name, double price) {
        this(name, price, Size.REGULAR, 3);

    }

    public Recipe(String name, double price, Size size, int numberOfIngredients) {
        this.name = name;
        this.price = price;
        this.size = size;
        ingredients = new Ingredient[numberOfIngredients];
    }

    /**
     * Add ingredient to recipe if it does not already exist.
     * If ingredient with the same name already exists, replace it with the new one.
     *
     * @param ingredient Ingredient to be added to recipe.
     * @throws TooManyIngredientsException if the number of ingredients in the recipe would be exceeded
     */
    public void addIngredient(Ingredient ingredient) throws TooManyIngredientsException {
        int i = 0;
        while (i < ingredients.length) {
            if (ingredients[i] == null || ingredients[i].equals(ingredient)) {
                ingredients[i] = ingredient;
                return;
            } else
                i++;
        }
        if (i < ingredients.length)
            ingredients[i] = ingredient;
        else
            throw new TooManyIngredientsException();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Checks whether recipe is ready to be used.
     *
     * @return True if all ingredients of the recipe have been added and false otherwise
     */
    public boolean isReady() {
        for (Ingredient ingredient : ingredients) {
            if (ingredient == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Recipe))
            return false;
        Recipe recipe = (Recipe) o;
        if ((recipe.price != price) || (size != recipe.size))
            return false;

        if (!isReady() || !recipe.isReady())
            return false;

        if (ingredients.length != recipe.ingredients.length)
            return false;

        for (int i = 0; i < ingredients.length; i++) {
            boolean found = false;
            for (int j = 0; j < ingredients.length; j++) {
                if (ingredients[i].equals(recipe.ingredients[j])) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, price, size);
        result = 31 * result + Arrays.hashCode(ingredients);
        return result;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Milk extends Ingredient {
    public enum Type {WHOLE, SEMI, SKIMMED, SOY, ALMOND}

    ;
    private Type type = Type.WHOLE;

    public Milk() {
        this(100, Type.WHOLE);
    }

    public Milk(int amount) {
        this(amount, Type.WHOLE);
    }

    public Milk(int amount, Type type) {
        this.name = "Milk";
        this.unit = Unit.ML;
        this.amount = amount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Milk [unit=" + unit + ", amount=" + amount + ", type=" + type + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || !(another instanceof Milk))
            return false;
        Milk m = (Milk) another;
        return name.equals(m.name) && amount == m.amount && unit == m.unit && type == m.type;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Water extends Ingredient {

    public Water() {
        this(30);
    }

    public Water(int amount) {
        this.name = "Water";
        this.amount = amount;
        this.unit = Unit.ML;
    }

    @Override
    public String toString() {
        return "Water [unit=" + unit + ", amount=" + amount + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || !(another instanceof Water))
            return false;
        Water w = (Water) another;
        return name.equals(w.name) && amount == w.amount && unit == w.unit;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Coffee extends Ingredient {
    private boolean decaf;

    public Coffee() {
        this(8);
    }

    public Coffee(int amount) {
        this(amount, false);
    }

    public Coffee(int amount, boolean decaf) {
        this.name = "Coffee";
        this.amount = amount;
        this.unit = Unit.GR;
        this.decaf = decaf;
    }

    @Override
    public String toString() {
        return "Coffee [unit=" + unit + ", amount=" + amount + ", decaf=" + decaf + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || !(another instanceof Coffee))
            return false;
        Coffee coffee = (Coffee) another;
        return name.equals(coffee.getName()) && amount == coffee.amount && unit == coffee.unit && decaf == coffee.decaf;
    }
}
```

Here is the existing test suite.

```
package uk.ac.sheffield.com1003.cafe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestCafeTask5 {

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

    @Test
    public void testRecipeEqualsItself() {
        Recipe espresso = createEspressoRecipe();
        assertEquals(espresso, espresso);
    }

    @Test
    public void testRecipeEqualsNull() {
        Recipe espresso = createEspressoRecipe();
        assertNotEquals(null, espresso);
    }

    @Test
    public void testRecipeEqualsDifferentOrderOfSameIngredients() {
        Recipe espresso = createEspressoRecipe();
        Recipe espresso2 = createEspressoRecipeAlt();
        assertEquals(espresso, espresso2);
    }

    @Test
    public void testRecipeEqualsIncompleteRecipe() {
        Recipe espresso = createEspressoRecipe();
        Recipe espressoIncomplete = createEspressoRecipeIncomplete();
        assertNotEquals(espresso, espressoIncomplete);
    }

    @Test
    public void testRecipeEqualsNoIngredients() {
        Recipe nothing = new Recipe("Nothing", 1, Recipe.Size.LARGE, 0);
        Recipe dummy = new Recipe("Dummy", 1, Recipe.Size.LARGE, 0);
        assertEquals(nothing, dummy);
    }

    @Test
    public void testRecipeNotEqualsPrice() {
        Recipe nothing = new Recipe("Nothing", 1, Recipe.Size.LARGE, 0);
        Recipe dummy = new Recipe("Nothing", 1.5, Recipe.Size.LARGE, 0);
        assertNotEquals(nothing, dummy);
    }

    @Test
    public void testRecipeNotEqualsSize() {
        Recipe nothing = new Recipe("Nothing", 1, Recipe.Size.SMALL, 0);
        Recipe dummy = new Recipe("Nothing", 1, Recipe.Size.LARGE, 0);
        assertNotEquals(nothing, dummy);
    }

    @Test
    public void testRecipeNotEqualsNotReady() {
        Recipe nothing = new Recipe("Nothing", 1, Recipe.Size.LARGE, 3);
        Recipe dummy = new Recipe("Dummy", 1, Recipe.Size.LARGE, 0);
        assertNotEquals(nothing, dummy);
    }

    @Test
    public void testRecipeMultipleIngredients() throws Exception {

        Recipe latte = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentName() throws Exception {

        Recipe latte = new Recipe("Large Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Latte Grande", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentCoffeeAmount() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee(40, false));

        assertNotEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentMilkAmount() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(101, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertNotEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentMilkType() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.SEMI));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertNotEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentCoffeeType() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(100, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee(8, true)); // 8 is default amount; default decaf=false

        assertNotEquals(latte, latte2);
    }

    @Test
    public void testRecipeMultipleIngredientsDifferentAmmounts() throws Exception {

        Recipe latte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte.addIngredient(new Coffee());
        latte.addIngredient(new Water());
        latte.addIngredient(new Milk(100, Milk.Type.WHOLE));

        Recipe latte2 = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        latte2.addIngredient(new Milk(101, Milk.Type.WHOLE));
        latte2.addIngredient(new Water());
        latte2.addIngredient(new Coffee());

        assertNotEquals(latte, latte2);
    }
}
```

Please keep the orginal test suite, and augment it by creating more tests into it.

Please do not create objects that are not included in the clasess.

Please do not add tests targeting the constructors of the classes.