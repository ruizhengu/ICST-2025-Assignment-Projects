package uk.ac.sheffield.com1003.cafe.module;

import uk.ac.sheffield.com1003.cafe.Recipe.Size;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;

public class App {
    public static void main(String[] args) throws Exception {
        Cafe cafe = new Cafe("Central Perk");
        String name = "Espresso";
        double price = 1.5;
        Recipe.Size size = Recipe.Size.SMALL;
        int n = 2;
        Recipe espresso = new Recipe(name, price, size, n);
        espresso.addIngredient(new Coffee());
        espresso.addIngredient(new Water());
        cafe.addRecipe(espresso);

        Recipe doubleEspresso = new Recipe("Double Espresso", 2.2, Recipe.Size.REGULAR, 2);
        doubleEspresso.addIngredient(new Coffee(15));
        doubleEspresso.addIngredient(new Water(50));
        cafe.addRecipe(doubleEspresso);

        Recipe soyLatte = new Recipe("Large Soy Latte", 2.5, Recipe.Size.LARGE, 3);
        soyLatte.addIngredient(new Coffee());
        soyLatte.addIngredient(new Water());
        soyLatte.addIngredient(new Milk(100, Type.SOY));
        cafe.addRecipe(soyLatte);

        cafe.printMenu();
    }
}
