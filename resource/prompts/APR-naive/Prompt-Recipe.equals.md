You are an automatic program repair tool. Your task is to fix a buggy method with in its class. 

The following class is where the buggy method within:

```
package uk.ac.sheffield.com1003.cafe;

import java.util.Arrays;

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

    public boolean equals(Recipe recipe) {
        int counter = 0;

        /**compares size of current object with objects in 'Recipe' */
        if (!this.size.equals(recipe.size)) {
            return false;
        }

        /**iterates through 'ingredients' of both recipes, increments counter by 1 if ingredients are not equal*/
        for (Ingredient ingredient : this.ingredients) {
            for (Ingredient otherRecipe: recipe.ingredients) {
                if (!otherRecipe.equals(ingredient)) {
                    counter++;
                }

                /**If the counter exceeds the maximum possible number of different ingredient combinations, the method returns false*/
                if (counter > recipe.ingredients.length * this.ingredients.length - this.ingredients.length) {
                    return false;
                }
            }
        }

        return this.getPrice() == recipe.getPrice();
    }

}

```

The buggy method is `public boolean equals(Recipe recipe)`.

The method fails the following tests:

```
    @Test
    public void testRecipeEqualsNoIngredients() {
        Recipe nothing = new Recipe("Nothing", 1, Recipe.Size.LARGE, 0);
        Recipe dummy = new Recipe("Dummy", 1, Recipe.Size.LARGE, 0);
        assertEquals(nothing, dummy);
    }
```

The failing test case's error message:

```
java.lang.AssertionError: expected:<uk.ac.sheffield.com1003.cafe.Recipe@1040be71> but was:<uk.ac.sheffield.com1003.cafe.Recipe@548a24a>
	at org.junit.Assert.fail(Assert.java:89)
```



Please provide a fixed version of the buggy method, make the minimal edits to the original buggy method. Return only the fixed buggy method, within a code block.