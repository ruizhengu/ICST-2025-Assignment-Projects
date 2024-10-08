The task is to generate a JUnit4 test suite for the given class.

```\
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Syrup extends Ingredient {
    private String flavour;

    public Syrup() {
        this.name = "Syrup";
        this.amount = 10;
        this.unit = Unit.ML;
        this.flavour = "Plain";
    }

    public Syrup(String flavour) {
        this();
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Syrup [unit=" + unit + ", amount=" + amount + ", flavour=" + flavour + "]";
    }
}
```

Here is an example of how the methods of the class are called.

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public abstract class Ingredient {
    protected String name = "";
    protected Unit unit = Unit.UNDEFINED;
    protected int amount;

    public String getName() {
        return this.name;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Ingredient [name=" + name + ", unit=" + unit + ", amount=" + amount + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || ! (another instanceof Ingredient))
            return false;
        return name.equals(((Ingredient)another).getName());
    }
}
```

```
package uk.ac.sheffield.com1003.cafe;

import java.util.*;

import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Ingredient;

public class Recipe {
    public enum Size { SMALL, REGULAR, LARGE };
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

        if (! isReady() || !recipe.isReady())
            return false;

        if (ingredients.length != recipe.ingredients.length)
            return false;

        for (int i=0; i<ingredients.length; i++) {
            boolean found = false;
            for (int j=0; j<ingredients.length; j++) {
                if (ingredients[i].equals(recipe.ingredients[j])) {
                    found = true;
                    break;
                }
            }
            if (! found)
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

Please emphasize on the following methods (try to cover as many cases as possible for these methods)

*  Milk.equals
