package uk.ac.sheffield.com1003.cafe.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 100);
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water10);
        java.lang.String str12 = water10.getName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray15);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Coffee [unit=GR, amount=8, decaf=false]", "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water14 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str15 = water14.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean18 = water14.equals((java.lang.Object) 30);
        java.lang.String str19 = water14.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException27 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray28 = cafeOutOfCapacityException27.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        boolean boolean34 = water14.equals((java.lang.Object) recipeNotFoundException30);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException30.getSuppressed();
        java.lang.Class<?> wildcardClass37 = recipeNotFoundException30.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water" + "'", str15, "Water");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        java.lang.String str26 = recipeNotFoundException21.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str26, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.String str14 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "hi!", (double) (byte) -1, "");
        order4.serve();
        order4.serve();
        order4.serve();
        // The following exception was thrown during execution in test generation
        try {
            order4.printReceipt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        double double11 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean16 = cafe3.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        recipe19.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee26);
        boolean boolean28 = recipe8.equals((java.lang.Object) coffee26);
        double double29 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, true);
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str35 = cafe34.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size38 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size38, (int) (short) 10);
        boolean boolean42 = recipe40.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "hi!", (double) 0L);
        boolean boolean46 = cafe34.addRecipe(recipe40);
        java.lang.String str47 = cafe34.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray48 = cafe34.getMenu();
        boolean boolean49 = coffee32.equals((java.lang.Object) recipeArray48);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee32);
        double double51 = recipe8.getPrice();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + size38 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size38.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Welcome to hi!" + "'", str47, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=10, decaf=false]", (int) (byte) 1, 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str2 = water1.toString();
        java.lang.String str3 = water1.toString();
        int int4 = water1.getAmount();
        int int5 = water1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=100]" + "'", str2, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=100]" + "'", str3, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        order13.printReceipt();
        order13.printReceipt();
        java.lang.String str16 = order13.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0" + "'", str16, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Order: Water; For: Water; Paid: 1.0", "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.greeting();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(32, true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=0, decaf=false]");
        cafe1.printMenu();
        java.lang.Class<?> wildcardClass3 = cafe1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "hi!", (double) (byte) -1, "");
        order4.serve();
        order4.serve();
        order4.serve();
        order4.serve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = order4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0]", 0, 1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str14 = water13.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe16.printPendingOrders();
        java.lang.String str18 = cafe16.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe16.getMenu();
        cafe16.printMenu();
        boolean boolean21 = water13.equals((java.lang.Object) cafe16);
        java.lang.String str22 = water13.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean26 = water13.equals((java.lang.Object) 1.0f);
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray29 = cafe28.getMenu();
        boolean boolean30 = water13.equals((java.lang.Object) recipeArray29);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size33 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size33, (int) (short) 10);
        double double36 = recipe35.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Water", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (byte) 10, "Milk [unit=ML, amount=32, type=WHOLE]");
        boolean boolean44 = water13.equals((java.lang.Object) order43);
        order43.printReceipt();
        java.lang.String str46 = order43.toString();
        order43.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water" + "'", str22, "Water");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(recipeArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + size33 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size33.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Order: ; For: Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0; Paid: 10.0" + "'", str46, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0; Paid: 10.0");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.greeting();
        java.lang.String str7 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe0.placeOrder("Milk [unit=ML, amount=10, type=SEMI]", "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (short) 0, (int) '#');
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException26 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray27 = cafeOutOfCapacityException26.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException26);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.String str31 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        order8.serve();
        java.lang.String str10 = order8.toString();
        order8.printReceipt();
        order8.serve();
        order8.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str10, "Order: ; For: Welcome to Cafe; Paid: 10.0");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(35, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        int int6 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", 10, (int) (short) 100);
        boolean boolean11 = milk1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException22 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray23 = cafeOutOfCapacityException22.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException22);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException40 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray41 = cafeOutOfCapacityException40.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException40);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException43.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException48 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException48.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException50.getSuppressed();
        recipeNotFoundException48.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException56 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        recipeNotFoundException56.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException56);
        recipeNotFoundException48.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        boolean boolean64 = milk1.equals((java.lang.Object) recipeNotFoundException12);
        java.lang.String str65 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str65, "Milk [unit=ML, amount=10, type=WHOLE]");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk4);
        java.lang.String str6 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean10 = recipe9.isReady();
        java.lang.String str11 = recipe9.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        java.lang.String str15 = coffee12.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) (short) 100, (int) '4');
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=100, type=null]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str5 = milk4.toString();
        boolean boolean6 = milk1.equals((java.lang.Object) str5);
        java.lang.Object obj7 = null;
        boolean boolean8 = milk1.equals(obj7);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) 100, size10, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=35, type=WHOLE]", (double) 1.0f, size10, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) (short) 1, size10, (int) ' ');
        java.lang.Class<?> wildcardClass21 = size10.getClass();
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printMenu();
        java.lang.String str12 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0", "Water [unit=ML, amount=30]", (double) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean18 = recipe7.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str20 = coffee19.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type21 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean22 = coffee19.equals((java.lang.Object) type21);
        java.lang.String str23 = coffee19.toString();
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size27 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size27, (int) (short) 10);
        boolean boolean30 = coffee19.equals((java.lang.Object) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size33 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size33, 0);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Milk [unit=ML, amount=100, type=WHOLE]", (double) 'a', "Order: ; For: ; Paid: 10.0");
        boolean boolean40 = coffee19.equals((java.lang.Object) recipe35);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        java.lang.String str42 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size27 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size27.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + size33 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size33.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0" + "'", str42, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj6 = null;
        boolean boolean7 = milk5.equals(obj6);
        java.lang.String str8 = milk5.toString();
        java.lang.String str9 = milk5.getName();
        java.lang.String str10 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe14.printPendingOrders();
        cafe14.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order17 = cafe14.serveOrder();
        boolean boolean18 = milk5.equals((java.lang.Object) order17);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size21, (int) (short) 10);
        double double24 = recipe23.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Welcome to Cafe", (double) 10);
        boolean boolean28 = milk5.equals((java.lang.Object) recipe23);
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe29.printPendingOrders();
        java.lang.String str31 = cafe29.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size34 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size34, (int) (short) 10);
        java.lang.String str37 = recipe36.getName();
        boolean boolean38 = cafe29.addRecipe(recipe36);
        cafe29.printMenu();
        cafe29.printPendingOrders();
        boolean boolean41 = milk5.equals((java.lang.Object) cafe29);
        boolean boolean42 = coffee0.equals((java.lang.Object) cafe29);
        uk.ac.sheffield.com1003.cafe.Order order43 = cafe29.serveOrder();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk" + "'", str9, "Milk");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertNull(order17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size34 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size34.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(order43);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        boolean boolean10 = cafe1.addRecipe(recipe5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cafe1.placeOrder("Water [unit=ML, amount=10]", "", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", (double) 100L, size4, 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: ; Paid: 10.0");
        int int11 = syrup10.getAmount();
        java.lang.String str12 = syrup10.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup10);
        java.lang.String str14 = syrup10.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup" + "'", str14, "Syrup");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        boolean boolean15 = milk1.equals((java.lang.Object) order14);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size22 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size22, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=0, decaf=false]", (double) (short) 10, size22, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=SKIMMED]", (double) (byte) 10, size22, (int) (short) 100);
        boolean boolean29 = milk1.equals((java.lang.Object) "Milk [unit=ML, amount=10, type=SKIMMED]");
        java.lang.String str30 = milk1.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + size22 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size22.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk" + "'", str30, "Milk");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str17 = recipe8.getName();
        java.lang.String str18 = recipe8.getName();
        boolean boolean19 = cafe3.addRecipe(recipe8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", "Water [unit=ML, amount=0]", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        java.lang.String str2 = water0.toString();
        boolean boolean4 = water0.equals((java.lang.Object) 10);
        java.lang.String str5 = water0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        java.lang.String str11 = water0.toString();
        java.lang.String str12 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        java.lang.String str7 = cafe0.greeting();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(32);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type1);
        int int3 = milk2.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj6 = null;
        boolean boolean7 = milk5.equals(obj6);
        java.lang.String str8 = milk5.toString();
        java.lang.String str9 = milk5.getName();
        java.lang.String str10 = milk5.toString();
        java.lang.String str11 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit12 = milk5.getUnit();
        boolean boolean13 = milk2.equals((java.lang.Object) milk5);
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe14.printPendingOrders();
        java.lang.String str16 = cafe14.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        java.lang.String str22 = recipe21.getName();
        boolean boolean23 = cafe14.addRecipe(recipe21);
        cafe14.printMenu();
        cafe14.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe14.getMenu();
        java.lang.String str27 = cafe14.getName();
        boolean boolean28 = milk2.equals((java.lang.Object) cafe14);
        // The following exception was thrown during execution in test generation
        try {
            cafe14.removeRecipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk" + "'", str9, "Milk");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size4, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size4, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException25 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray26 = cafeOutOfCapacityException25.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        boolean boolean29 = milk10.equals((java.lang.Object) recipeNotFoundException11);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str31 = milk10.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk" + "'", str31, "Milk");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        java.lang.String str3 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str3, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=0]", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=30, decaf=false]", 8, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        java.lang.Class<?> wildcardClass5 = cafe3.getClass();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        java.lang.String str6 = milk1.toString();
        java.lang.String str7 = milk1.toString();
        java.lang.String str8 = milk1.getName();
        int int9 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        int int11 = water0.getAmount();
        java.lang.String str12 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        double double18 = recipe17.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Welcome to Cafe", (double) 10);
        order21.serve();
        java.lang.String str23 = order21.toString();
        order21.printReceipt();
        order21.serve();
        boolean boolean26 = water0.equals((java.lang.Object) order21);
        order21.printReceipt();
        java.lang.String str28 = order21.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str23, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str28, "Order: ; For: Welcome to Cafe; Paid: 10.0");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException26 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray27 = cafeOutOfCapacityException26.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException26);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException19.getSuppressed();
        java.lang.String str32 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str32, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        java.lang.String str6 = milk1.toString();
        boolean boolean8 = milk1.equals((java.lang.Object) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean11 = milk1.equals((java.lang.Object) milk10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=false]", (double) '#');
        boolean boolean15 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Water; Paid: 1.0", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        java.lang.String str7 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        java.lang.String str9 = milk8.toString();
        java.lang.String str10 = milk8.toString();
        boolean boolean11 = milk5.equals((java.lang.Object) str10);
        java.lang.String str12 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        boolean boolean21 = milk5.equals((java.lang.Object) order20);
        java.lang.String str22 = order20.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str12, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0" + "'", str22, "Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        java.lang.String str2 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe3.printPendingOrders();
        java.lang.String str5 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        java.lang.String str7 = cafe3.greeting();
        cafe3.printMenu();
        boolean boolean9 = water0.equals((java.lang.Object) cafe3);
        java.lang.String str10 = cafe3.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cafe" + "'", str10, "Cafe");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", "Order: Water; For: Water; Paid: 1.0", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=8, decaf=false]", 1, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        order8.serve();
        java.lang.String str10 = order8.toString();
        java.lang.String str11 = order8.toString();
        order8.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str10, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str11, "Order: ; For: Welcome to Cafe; Paid: 10.0");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) -1, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        order7.serve();
        order7.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str14 = water13.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe16.printPendingOrders();
        java.lang.String str18 = cafe16.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe16.getMenu();
        cafe16.printMenu();
        boolean boolean21 = water13.equals((java.lang.Object) cafe16);
        java.lang.String str22 = water13.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean26 = water13.equals((java.lang.Object) 1.0f);
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray29 = cafe28.getMenu();
        boolean boolean30 = water13.equals((java.lang.Object) recipeArray29);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size33 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size33, (int) (short) 10);
        double double36 = recipe35.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Water", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (byte) 10, "Milk [unit=ML, amount=32, type=WHOLE]");
        boolean boolean44 = water13.equals((java.lang.Object) order43);
        order43.serve();
        order43.serve();
        order43.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water" + "'", str22, "Water");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(recipeArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + size33 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size33.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        java.lang.String str7 = recipe2.getName();
        double double8 = recipe2.getPrice();
        boolean boolean9 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SKIMMED]", (double) (short) 1, "Welcome to Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.Class<?> wildcardClass25 = order24.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        java.lang.String str11 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cafe" + "'", str11, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray12);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size12, (int) '4');
        boolean boolean15 = cafe0.addRecipe(recipe14);
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cafe0.placeOrder("Coffee [unit=GR, amount=-1, decaf=false]", "Milk [unit=ML, amount=-1, type=WHOLE]", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 100, 8);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        boolean boolean12 = recipe10.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean21 = recipe10.equals((java.lang.Object) 10);
        double double22 = recipe10.getPrice();
        boolean boolean23 = recipe10.isReady();
        boolean boolean24 = recipe10.isReady();
        boolean boolean25 = cafe1.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order26 = cafe1.serveOrder();
        java.lang.String str27 = cafe1.getName();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(order26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str14 = water13.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe16.printPendingOrders();
        java.lang.String str18 = cafe16.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe16.getMenu();
        cafe16.printMenu();
        boolean boolean21 = water13.equals((java.lang.Object) cafe16);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee22 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str23 = coffee22.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type24 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean25 = coffee22.equals((java.lang.Object) type24);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup27 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str28 = syrup27.toString();
        boolean boolean29 = coffee22.equals((java.lang.Object) syrup27);
        boolean boolean30 = water13.equals((java.lang.Object) syrup27);
        java.lang.String str31 = water13.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException42 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray43 = cafeOutOfCapacityException42.getSuppressed();
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException42);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException45.getSuppressed();
        boolean boolean51 = water13.equals((java.lang.Object) throwableArray50);
        java.lang.String str52 = water13.toString();
        java.lang.String str53 = water13.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str28, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=30]" + "'", str31, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Water [unit=ML, amount=30]" + "'", str52, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Water" + "'", str53, "Water");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException7 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray8 = cafeOutOfCapacityException7.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException10.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException10.getSuppressed();
        java.lang.String str16 = recipeNotFoundException10.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str16, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee2.getUnit();
        java.lang.String str4 = coffee2.getName();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 30, (int) '4');
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", "Syrup [unit=ML, amount=10, flavour=Welcome to ]", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str4, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str16 = water15.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water15);
        boolean boolean18 = coffee1.equals((java.lang.Object) recipe6);
        double double19 = recipe6.getPrice();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=30]" + "'", str16, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size6, 30);
        java.lang.Class<?> wildcardClass13 = size6.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee2.getUnit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException29 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray30 = tooManyIngredientsException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water31 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int32 = water31.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException34.getSuppressed();
        boolean boolean38 = water31.equals((java.lang.Object) recipeNotFoundException34);
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException48 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray49 = cafeOutOfCapacityException48.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException48);
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException54.getSuppressed();
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        recipeNotFoundException59.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException68 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray69 = recipeNotFoundException68.getSuppressed();
        java.lang.Throwable[] throwableArray70 = recipeNotFoundException68.getSuppressed();
        recipeNotFoundException66.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException73 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException73.getSuppressed();
        recipeNotFoundException72.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        recipeNotFoundException68.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException68.getSuppressed();
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) tooManyIngredientsException29);
        java.lang.String str81 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 30 + "'", int32 == 30);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str81, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        cafe1.printPendingOrders();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str4, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int2 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean15 = water3.equals((java.lang.Object) "Welcome to Cafe");
        boolean boolean16 = milk1.equals((java.lang.Object) boolean15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException19.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException51 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray52 = cafeOutOfCapacityException51.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException51);
        java.lang.Throwable[] throwableArray54 = cafeOutOfCapacityException51.getSuppressed();
        java.lang.Throwable[] throwableArray55 = cafeOutOfCapacityException51.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException51);
        java.lang.Throwable[] throwableArray57 = cafeOutOfCapacityException51.getSuppressed();
        boolean boolean58 = milk1.equals((java.lang.Object) cafeOutOfCapacityException51);
        java.lang.String str59 = cafeOutOfCapacityException51.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str59, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        java.lang.String str7 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe9.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe9.getMenu();
        java.lang.String str12 = cafe9.getName();
        java.lang.String str13 = cafe9.getName();
        boolean boolean14 = milk5.equals((java.lang.Object) cafe9);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size17, (int) '4');
        boolean boolean21 = recipe19.equals((java.lang.Object) 10.0d);
        java.lang.String str22 = recipe19.getName();
        boolean boolean24 = recipe19.equals((java.lang.Object) "Coffee");
        boolean boolean25 = milk5.equals((java.lang.Object) recipe19);
        int int26 = milk5.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit27 = milk5.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water [unit=ML, amount=30]" + "'", str22, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        java.lang.String str5 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", 1.0d);
        java.lang.String str9 = order8.toString();
        order8.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 1.0" + "'", str9, "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 1.0");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        order9.serve();
        order9.serve();
        order9.serve();
        java.lang.String str13 = order9.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str13, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", (double) 100L, size4, 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: ; Paid: 10.0");
        int int11 = syrup10.getAmount();
        java.lang.String str12 = syrup10.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup10);
        java.lang.String str14 = syrup10.toString();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str14, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 0, true);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.getName();
        java.lang.String str3 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Water [unit=ML, amount=100]", "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to ", (double) 30);
        order18.serve();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size8, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=10, decaf=true]", (double) (byte) 100, size8, 8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=0, decaf=false]", (double) 0L, size8, 10);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk", (double) 1L, size8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        java.lang.String str2 = milk1.toString();
        boolean boolean4 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=10, decaf=true]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) 'a');
        boolean boolean11 = milk1.equals((java.lang.Object) order10);
        java.lang.Class<?> wildcardClass12 = milk1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water14 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str15 = water14.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean18 = water14.equals((java.lang.Object) 30);
        java.lang.String str19 = water14.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException27 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray28 = cafeOutOfCapacityException27.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        boolean boolean34 = water14.equals((java.lang.Object) recipeNotFoundException30);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.String str36 = recipeNotFoundException30.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water" + "'", str15, "Water");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str36, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Water", (double) 100.0f, "Milk");
        double double21 = recipe9.getPrice();
        boolean boolean22 = cafe1.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=0, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(recipeArray23);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=100]", (int) (byte) 0, (int) (short) 100);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type5);
        int int10 = milk9.getAmount();
        java.lang.Class<?> wildcardClass11 = milk9.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size4, (int) '4');
        boolean boolean8 = recipe6.equals((java.lang.Object) 10.0d);
        boolean boolean9 = milk1.equals((java.lang.Object) recipe6);
        java.lang.String str10 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Plain]", (-1.0d), "Coffee [unit=GR, amount=1, decaf=false]");
        order14.serve();
        java.lang.String str16 = order14.toString();
        order14.printReceipt();
        order14.serve();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0" + "'", str16, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size11, 0);
        boolean boolean14 = recipe4.equals((java.lang.Object) size11);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=0, type=SKIMMED]", (double) 100, "Milk [unit=ML, amount=35, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0", (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: ; For: ; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", (int) '#', (int) (byte) 1);
        cafe3.printMenu();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe9.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe9.serveOrder();
        java.lang.String str12 = cafe9.getName();
        java.lang.String str13 = cafe9.greeting();
        boolean boolean14 = recipe4.equals((java.lang.Object) str13);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException15 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException16 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray17 = cafeOutOfCapacityException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        cafeOutOfCapacityException16.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        cafeOutOfCapacityException15.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException16);
        boolean boolean31 = recipe4.equals((java.lang.Object) cafeOutOfCapacityException16);
        java.lang.Class<?> wildcardClass32 = recipe4.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Welcome to Cafe" + "'", str13, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
        int int2 = syrup1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        java.lang.String str7 = cafe3.getName();
        java.lang.String str8 = cafe3.greeting();
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.getName();
        java.lang.String str4 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk" + "'", str4, "Milk");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException36 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray37 = cafeOutOfCapacityException36.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water43 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str44 = water43.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk46 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean47 = water43.equals((java.lang.Object) 30);
        java.lang.String str48 = water43.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException56 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray57 = cafeOutOfCapacityException56.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException56);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        boolean boolean63 = water43.equals((java.lang.Object) recipeNotFoundException59);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException68 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException69 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray70 = recipeNotFoundException69.getSuppressed();
        recipeNotFoundException68.addSuppressed((java.lang.Throwable) recipeNotFoundException69);
        recipeNotFoundException66.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException73 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray74 = cafeOutOfCapacityException73.getSuppressed();
        recipeNotFoundException66.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException73);
        java.lang.Throwable[] throwableArray76 = cafeOutOfCapacityException73.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException77 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray78 = recipeNotFoundException77.getSuppressed();
        java.lang.Throwable[] throwableArray79 = recipeNotFoundException77.getSuppressed();
        cafeOutOfCapacityException73.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        recipeNotFoundException59.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        java.lang.Class<?> wildcardClass82 = recipeNotFoundException77.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Water" + "'", str44, "Water");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Water [unit=ML, amount=30]" + "'", str48, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str14 = water13.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe16.printPendingOrders();
        java.lang.String str18 = cafe16.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe16.getMenu();
        cafe16.printMenu();
        boolean boolean21 = water13.equals((java.lang.Object) cafe16);
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe16.serveOrder();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(order22);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (byte) 100, size2, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        java.lang.String str7 = recipe2.getName();
        java.lang.Class<?> wildcardClass8 = recipe2.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        java.lang.String str3 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str3, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        java.lang.String str15 = recipe11.getName();
        boolean boolean16 = cafe1.addRecipe(recipe11);
        java.lang.Object obj17 = null;
        boolean boolean18 = recipe11.equals(obj17);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size21, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk28);
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0", (double) (-1), "Milk [unit=ML, amount=-1, type=WHOLE]");
        boolean boolean34 = recipe11.equals((java.lang.Object) (-1));
        boolean boolean35 = recipe11.isReady();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cafe" + "'", str15, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        java.lang.String str5 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        java.lang.String str10 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean15 = recipe4.isReady();
        java.lang.String str16 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Order: ; For: hi!; Paid: 0.0", 0.0d);
        order19.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=30]" + "'", str16, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee0.getUnit();
        java.lang.String str3 = coffee0.toString();
        java.lang.Class<?> wildcardClass4 = coffee0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", (double) 1L);
        boolean boolean10 = recipe4.equals((java.lang.Object) "Milk");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size13, (int) (short) 10);
        double double16 = recipe15.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water24 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str25 = water24.toString();
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water24);
        uk.ac.sheffield.com1003.cafe.Cafe cafe27 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe27.printPendingOrders();
        java.lang.String str29 = cafe27.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe27.getMenu();
        cafe27.printMenu();
        boolean boolean32 = water24.equals((java.lang.Object) cafe27);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee33 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str34 = coffee33.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type35 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean36 = coffee33.equals((java.lang.Object) type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup38 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str39 = syrup38.toString();
        boolean boolean40 = coffee33.equals((java.lang.Object) syrup38);
        boolean boolean41 = water24.equals((java.lang.Object) syrup38);
        java.lang.String str42 = syrup38.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup38);
        java.lang.String str44 = syrup38.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=30]" + "'", str25, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Welcome to Cafe" + "'", str29, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str39, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str42, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str44, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = milk3.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        java.lang.String str8 = milk7.getName();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0", 0, (int) (short) 100);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=Welcome to ]", "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", 8.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 30, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        boolean boolean12 = recipe10.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean21 = recipe10.equals((java.lang.Object) 10);
        double double22 = recipe10.getPrice();
        boolean boolean23 = recipe10.isReady();
        boolean boolean24 = recipe10.isReady();
        boolean boolean25 = cafe1.addRecipe(recipe10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = cafe1.placeOrder("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 0.0", "Milk [unit=ML, amount=1, type=WHOLE]", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=35, type=WHOLE]", (double) (byte) 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0" + "'", str12, "Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe1.getMenu();
        java.lang.Class<?> wildcardClass8 = cafe1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        boolean boolean4 = coffee2.equals((java.lang.Object) type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean12 = recipe4.isReady();
        java.lang.String str13 = recipe4.getName();
        boolean boolean14 = coffee1.equals((java.lang.Object) recipe4);
        java.lang.Object obj15 = null;
        boolean boolean16 = coffee1.equals(obj15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        int int4 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean8 = cafe4.addRecipe(recipe7);
        boolean boolean9 = syrup1.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        boolean boolean14 = recipe7.equals((java.lang.Object) cafe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe13.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe13.removeRecipe("Order: ; For: Water; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(recipeArray15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=35, type=WHOLE]", 10, 100);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean7 = recipe6.isReady();
        java.lang.String str8 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        java.lang.String str11 = recipe6.getName();
        double double12 = recipe6.getPrice();
        boolean boolean13 = recipe6.isReady();
        java.lang.String str14 = recipe6.getName();
        boolean boolean15 = cafe0.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str18 = milk17.toString();
        int int19 = milk17.getAmount();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str18, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printPendingOrders();
        java.lang.Class<?> wildcardClass6 = cafe0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: ; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str13 = order12.toString();
        java.lang.String str14 = order12.toString();
        java.lang.Class<?> wildcardClass15 = order12.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str13, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str14, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Milk [unit=ML, amount=1, type=WHOLE]", (double) (byte) -1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit11 = water0.getUnit();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray1 = cafeOutOfCapacityException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        java.lang.Throwable[] throwableArray14 = cafeOutOfCapacityException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException15 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException15.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int18 = water17.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException20.getSuppressed();
        boolean boolean24 = water17.equals((java.lang.Object) recipeNotFoundException20);
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException20.getSuppressed();
        tooManyIngredientsException15.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException34 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray35 = cafeOutOfCapacityException34.getSuppressed();
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException34);
        tooManyIngredientsException15.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException49);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException54.getSuppressed();
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        java.lang.Throwable[] throwableArray63 = recipeNotFoundException54.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        tooManyIngredientsException15.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException15);
        java.lang.String str67 = tooManyIngredientsException15.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str67, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        boolean boolean12 = recipe4.isReady();
        java.lang.String str13 = recipe4.getName();
        java.lang.Class<?> wildcardClass14 = recipe4.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", "Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int10 = water9.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException12.getSuppressed();
        boolean boolean16 = water9.equals((java.lang.Object) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException12.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.String str20 = recipeNotFoundException12.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str20, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            order3.printReceipt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=WHOLE]", 100.0d);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee", (double) 1L, size4, 1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException11.getSuppressed();
        boolean boolean21 = recipe8.equals((java.lang.Object) recipeNotFoundException11);
        java.lang.String str22 = recipe8.getName();
        java.lang.String str23 = recipe8.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee" + "'", str22, "Coffee");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee" + "'", str23, "Coffee");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type5);
        int int10 = milk9.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str12 = cafe11.getName();
        cafe11.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe11.getMenu();
        boolean boolean15 = milk9.equals((java.lang.Object) cafe11);
        // The following exception was thrown during execution in test generation
        try {
            cafe11.removeRecipe("hi!");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cafe" + "'", str12, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str17 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean19 = coffee16.equals((java.lang.Object) type18);
        java.lang.String str20 = coffee16.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee16);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size24, (int) (short) 10);
        boolean boolean27 = coffee16.equals((java.lang.Object) (short) 10);
        java.lang.String str28 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe30 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str31 = cafe30.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size34 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size34, (int) (short) 10);
        boolean boolean38 = recipe36.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "hi!", (double) 0L);
        boolean boolean42 = cafe30.addRecipe(recipe36);
        java.lang.String str43 = cafe30.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray44 = cafe30.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order45 = cafe30.serveOrder();
        boolean boolean46 = coffee16.equals((java.lang.Object) order45);
        java.lang.String str47 = coffee16.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + size34 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size34.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to hi!" + "'", str43, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray44);
        org.junit.Assert.assertNull(order45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str47, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        java.lang.String str15 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size10, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        double double19 = recipe12.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        boolean boolean23 = cafe3.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Coffee [unit=GR, amount=10, decaf=false]", (double) 35, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        java.lang.String str28 = order27.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0" + "'", str28, "Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        java.lang.String str6 = cafe3.getName();
        java.lang.String str7 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Water", (double) 100.0f, "Milk");
        double double23 = recipe11.getPrice();
        boolean boolean24 = cafe3.addRecipe(recipe11);
        boolean boolean25 = cafe0.addRecipe(recipe11);
        java.lang.String str26 = recipe11.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean11 = coffee8.equals((java.lang.Object) type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type10);
        boolean boolean15 = water4.equals((java.lang.Object) type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        cafe1.printMenu();
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        java.lang.String str14 = recipe4.getName();
        java.lang.String str15 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((-1));
        java.lang.Class<?> wildcardClass2 = water1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        java.lang.String str2 = milk1.toString();
        int int3 = milk1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=0, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        java.lang.String str12 = cafe0.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cafe" + "'", str12, "Cafe");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        java.lang.String str7 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        java.lang.String str9 = milk8.toString();
        java.lang.String str10 = milk8.toString();
        boolean boolean11 = milk5.equals((java.lang.Object) str10);
        java.lang.String str12 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        boolean boolean21 = milk5.equals((java.lang.Object) order20);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = milk5.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str12, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        int int11 = water0.getAmount();
        java.lang.String str12 = water0.toString();
        boolean boolean14 = water0.equals((java.lang.Object) "Water");
        java.lang.Class<?> wildcardClass15 = water0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(32);
        int int2 = water1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        boolean boolean4 = water0.equals((java.lang.Object) "Milk");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1);
        boolean boolean8 = water0.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.Class<?> wildcardClass9 = water0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        int int2 = coffee0.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException13 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray14 = cafeOutOfCapacityException13.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException56 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        recipeNotFoundException56.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException47.getSuppressed();
        boolean boolean65 = coffee0.equals((java.lang.Object) recipeNotFoundException47);
        java.lang.String str66 = recipeNotFoundException47.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str66, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Water]; Paid: 0.0", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("hi!");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=hi!]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=hi!]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=hi!]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=hi!]");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=8]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=null]", (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        cafe0.printMenu();
        cafe0.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0", (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
        java.lang.String str2 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str2, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        cafe1.printMenu();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup0 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup();
        java.lang.String str1 = syrup0.toString();
        java.lang.String str2 = syrup0.toString();
        java.lang.String str3 = syrup0.toString();
        java.lang.String str4 = syrup0.toString();
        java.lang.String str5 = syrup0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str1, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Welcome to Order: ; For: Water; Paid: 1.0", "Order: ; For: ; Paid: 10.0", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        cafe1.printMenu();
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe5.printPendingOrders();
        boolean boolean7 = water1.equals((java.lang.Object) cafe5);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        boolean boolean10 = water1.equals((java.lang.Object) cafe9);
        int int11 = water1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException7 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray8 = cafeOutOfCapacityException7.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException7);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int11 = water10.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException13.getSuppressed();
        boolean boolean17 = water10.equals((java.lang.Object) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.String str34 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = cafe0.addRecipe(recipe10);
        double double18 = recipe10.getPrice();
        double double19 = recipe10.getPrice();
        boolean boolean20 = recipe10.isReady();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water0.getUnit();
        java.lang.String str3 = water0.toString();
        java.lang.String str4 = water0.toString();
        java.lang.String str5 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException26 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray27 = cafeOutOfCapacityException26.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException26);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException33 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray34 = cafeOutOfCapacityException33.getSuppressed();
        boolean boolean35 = coffee32.equals((java.lang.Object) cafeOutOfCapacityException33);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException33);
        java.lang.String str37 = cafeOutOfCapacityException33.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str37, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) (-1));
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0", 1.0d);
        double double6 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        java.lang.String str8 = cafe3.greeting();
        java.lang.String str9 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe3.placeOrder("Welcome to Welcome to hi!", "Order: ; For: Water; Paid: 1.0", 10.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str9, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (-1.0f));
        java.lang.String str6 = order5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0" + "'", str6, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        java.lang.String str7 = coffee5.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException10.getSuppressed();
        boolean boolean20 = coffee5.equals((java.lang.Object) throwableArray19);
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe22.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray24 = cafe22.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean32 = cafe28.addRecipe(recipe31);
        boolean boolean33 = cafe26.addRecipe(recipe31);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        boolean boolean38 = cafe22.addRecipe(recipe31);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size41 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size41, (int) (short) 10);
        boolean boolean45 = recipe43.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean53 = recipe31.equals((java.lang.Object) order52);
        boolean boolean54 = coffee5.equals((java.lang.Object) recipe31);
        java.lang.String str55 = coffee5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee" + "'", str7, "Coffee");
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(recipeArray24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + size41 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size41.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str55, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Welcome to hi!" + "'", str3, "Welcome to Welcome to hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to hi!" + "'", str4, "Welcome to hi!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to hi!", (double) ' ');
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        java.lang.String str2 = water1.toString();
        java.lang.String str3 = water1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = milk6.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type7);
        java.lang.String str10 = milk9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str13 = coffee12.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type14 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean15 = coffee12.equals((java.lang.Object) type14);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type14);
        java.lang.String str17 = milk16.getName();
        java.lang.String str18 = milk16.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe20.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray22 = cafe20.getMenu();
        java.lang.String str23 = cafe20.getName();
        java.lang.String str24 = cafe20.getName();
        boolean boolean25 = milk16.equals((java.lang.Object) cafe20);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size28 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size28, (int) '4');
        boolean boolean32 = recipe30.equals((java.lang.Object) 10.0d);
        java.lang.String str33 = recipe30.getName();
        boolean boolean35 = recipe30.equals((java.lang.Object) "Coffee");
        boolean boolean36 = milk16.equals((java.lang.Object) recipe30);
        boolean boolean37 = milk9.equals((java.lang.Object) milk16);
        java.lang.String str38 = milk16.toString();
        boolean boolean39 = water1.equals((java.lang.Object) str38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=0]" + "'", str2, "Water [unit=ML, amount=0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str10, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk" + "'", str17, "Milk");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str18, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + size28 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size28.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Water [unit=ML, amount=30]" + "'", str33, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str38, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", "Coffee [unit=GR, amount=35, decaf=false]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Welcome to hi!" + "'", str3, "Welcome to Welcome to hi!");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=SKIMMED]", (double) (byte) 1, "Order: ; For: ; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=100, decaf=false]", (double) 0);
        double double15 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = cafe0.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order18 = cafe0.serveOrder();
        java.lang.String str19 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order20 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=100, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertNull(order20);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Cafe", (double) 100, size4, 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Water [unit=ML, amount=10]", (double) 1L);
        java.lang.String str12 = order11.toString();
        order11.serve();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Welcome to Welcome to Cafe; For: Water [unit=ML, amount=10]; Paid: 1.0" + "'", str12, "Order: Welcome to Welcome to Cafe; For: Water [unit=ML, amount=10]; Paid: 1.0");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=false]", (double) 'a');
        boolean boolean4 = recipe2.equals((java.lang.Object) "Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printMenu();
        java.lang.String str12 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Coffee [unit=GR, amount=32, decaf=false]", "Syrup [unit=ML, amount=10, flavour=]", 35.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=true]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size4, 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str10 = water9.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean13 = water9.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = water9.getUnit();
        int int15 = water9.getAmount();
        boolean boolean16 = recipe8.equals((java.lang.Object) water9);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Coffee [unit=GR, amount=1, decaf=false]", (double) 100.0f);
        boolean boolean20 = recipe8.isReady();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Welcome to Cafe; Paid: 10.0", (double) 0.0f, "Welcome to Order: ; For: hi!; Paid: 0.0");
        java.lang.String str25 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type29 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean30 = milk28.equals((java.lang.Object) type29);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk31 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type29);
        java.lang.String str32 = milk31.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee34 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str35 = coffee34.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type36 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean37 = coffee34.equals((java.lang.Object) type36);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type36);
        java.lang.String str39 = milk38.getName();
        java.lang.String str40 = milk38.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe42 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe42.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray44 = cafe42.getMenu();
        java.lang.String str45 = cafe42.getName();
        java.lang.String str46 = cafe42.getName();
        boolean boolean47 = milk38.equals((java.lang.Object) cafe42);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size50 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size50, (int) '4');
        boolean boolean54 = recipe52.equals((java.lang.Object) 10.0d);
        java.lang.String str55 = recipe52.getName();
        boolean boolean57 = recipe52.equals((java.lang.Object) "Coffee");
        boolean boolean58 = milk38.equals((java.lang.Object) recipe52);
        boolean boolean59 = milk31.equals((java.lang.Object) milk38);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup61 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str62 = syrup61.toString();
        java.lang.Class<?> wildcardClass63 = syrup61.getClass();
        boolean boolean64 = milk38.equals((java.lang.Object) syrup61);
        boolean boolean65 = recipe8.equals((java.lang.Object) syrup61);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str32, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type36.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk" + "'", str39, "Milk");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str40, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + size50 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size50.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Water [unit=ML, amount=30]" + "'", str55, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str62, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) (byte) 10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str5 = coffee4.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean8 = coffee4.equals((java.lang.Object) cafe7);
        boolean boolean9 = water1.equals((java.lang.Object) boolean8);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = water1.getUnit();
        java.lang.String str11 = water1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=35]" + "'", str11, "Water [unit=ML, amount=35]");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str17 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean19 = coffee16.equals((java.lang.Object) type18);
        java.lang.String str20 = coffee16.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee16);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = coffee16.getUnit();
        java.lang.String str23 = coffee16.toString();
        java.lang.String str24 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit25 = coffee16.getUnit();
        java.lang.Class<?> wildcardClass26 = unit25.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", (double) 100L);
        double double3 = recipe2.getPrice();
        java.lang.String str4 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.Object obj3 = null;
        boolean boolean4 = coffee2.equals(obj3);
        java.lang.Class<?> wildcardClass5 = coffee2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Welcome to Cafe" + "'", str2, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size2, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str7 = cafe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe6.serveOrder();
        java.lang.String str9 = cafe6.getName();
        cafe6.printPendingOrders();
        boolean boolean11 = recipe4.equals((java.lang.Object) cafe6);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str7, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str9, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=WHOLE]");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Milk [unit=ML, amount=100, type=WHOLE]" + "'", str3, "Welcome to Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, false);
        boolean boolean4 = coffee2.equals((java.lang.Object) "Coffee [unit=GR, amount=-1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water [unit=ML, amount=0]", (double) 10.0f);
        order14.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException21 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray22 = cafeOutOfCapacityException21.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException21);
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        boolean boolean33 = water1.equals((java.lang.Object) recipeNotFoundException25);
        java.lang.String str34 = recipeNotFoundException25.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        boolean boolean7 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 0.0f, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]");
        order11.serve();
        order11.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException26 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray27 = cafeOutOfCapacityException26.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException26);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.String str31 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk4);
        java.lang.String str6 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean10 = recipe9.isReady();
        java.lang.String str11 = recipe9.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException15 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException16 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray17 = cafeOutOfCapacityException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        cafeOutOfCapacityException16.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        cafeOutOfCapacityException15.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException16);
        boolean boolean31 = recipe2.equals((java.lang.Object) cafeOutOfCapacityException16);
        java.lang.Throwable[] throwableArray32 = cafeOutOfCapacityException16.getSuppressed();
        java.lang.String str33 = cafeOutOfCapacityException16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str33, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str4, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to hi!" + "'", str2, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water [unit=ML, amount=0]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=32, type=ALMOND]", (double) 1L, "Welcome to Order: ; For: Water; Paid: 1.0");
        java.lang.String str19 = order18.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 1.0" + "'", str19, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 1.0");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) 'a', 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean7 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) -1, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        boolean boolean12 = cafe3.addRecipe(recipe6);
        java.lang.Class<?> wildcardClass13 = cafe3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=-1]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=WHOLE]", (int) (short) 10, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean8 = cafe4.addRecipe(recipe7);
        boolean boolean9 = syrup1.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        boolean boolean14 = recipe7.equals((java.lang.Object) cafe13);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) 10L, size17, (int) (byte) 100);
        boolean boolean20 = cafe13.addRecipe(recipe19);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray21 = cafe13.getMenu();
        java.lang.String str22 = cafe13.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(recipeArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str22, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = cafe0.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order18 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        java.lang.String str22 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cafe" + "'", str22, "Cafe");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean25 = cafe1.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe28.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe28.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean38 = cafe34.addRecipe(recipe37);
        boolean boolean39 = cafe32.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        boolean boolean44 = cafe28.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size47 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size47, (int) (short) 10);
        boolean boolean51 = recipe49.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean59 = recipe37.equals((java.lang.Object) order58);
        uk.ac.sheffield.com1003.cafe.Order order62 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0", (double) 30);
        boolean boolean63 = cafe1.addRecipe(recipe37);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=32, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertNotNull(recipeArray30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + size47 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size47.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (double) (byte) 1);
        order5.serve();
        order5.serve();
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean11 = coffee8.equals((java.lang.Object) type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type10);
        boolean boolean15 = water4.equals((java.lang.Object) type10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size20, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size20, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray27 = cafe26.getMenu();
        boolean boolean28 = recipe24.equals((java.lang.Object) cafe26);
        boolean boolean29 = water4.equals((java.lang.Object) cafe26);
        boolean boolean30 = coffee2.equals((java.lang.Object) water4);
        java.lang.String str31 = water4.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(recipeArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=0]" + "'", str31, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size4, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (-1.0f), "Welcome to ");
        boolean boolean11 = coffee1.equals((java.lang.Object) recipe6);
        java.lang.String str12 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        double double18 = recipe17.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe17.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk27);
        boolean boolean29 = coffee1.equals((java.lang.Object) milk27);
        int int30 = milk27.getAmount();
        java.lang.String str31 = milk27.toString();
        java.lang.Class<?> wildcardClass32 = milk27.getClass();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=30, decaf=false]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str31, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", "Coffee [unit=GR, amount=30, decaf=false]", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str4, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.Class<?> wildcardClass14 = recipe7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (-1.0f), "Welcome to ");
        java.lang.String str9 = order8.toString();
        order8.printReceipt();
        order8.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0" + "'", str9, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        java.lang.String str6 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe10.printPendingOrders();
        cafe10.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order13 = cafe10.serveOrder();
        boolean boolean14 = milk1.equals((java.lang.Object) order13);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = milk1.getUnit();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertNull(order13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        java.lang.String str7 = recipe2.getName();
        double double8 = recipe2.getPrice();
        boolean boolean9 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 0);
        double double21 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        boolean boolean8 = water0.equals((java.lang.Object) (byte) -1);
        boolean boolean10 = water0.equals((java.lang.Object) 30);
        int int11 = water0.getAmount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=32, type=SKIMMED]");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str17 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean19 = coffee16.equals((java.lang.Object) type18);
        java.lang.String str20 = coffee16.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee16);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = coffee16.getUnit();
        java.lang.String str23 = coffee16.toString();
        int int24 = coffee16.getAmount();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order9 = cafe1.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee2.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str5 = coffee4.toString();
        java.lang.String str6 = coffee4.toString();
        java.lang.String str7 = coffee4.toString();
        boolean boolean8 = coffee2.equals((java.lang.Object) str7);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe2 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe2.printPendingOrders();
        java.lang.String str4 = cafe2.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size7, (int) (short) 10);
        java.lang.String str10 = recipe9.getName();
        boolean boolean11 = cafe2.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size14, (int) '4');
        boolean boolean17 = cafe2.addRecipe(recipe16);
        cafe2.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size21, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str28 = coffee27.toString();
        boolean boolean29 = recipe23.equals((java.lang.Object) str28);
        java.lang.String str30 = recipe23.getName();
        boolean boolean31 = cafe2.addRecipe(recipe23);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) '#', "Milk [unit=ML, amount=1, type=WHOLE]");
        boolean boolean36 = cafe0.addRecipe(recipe23);
        java.lang.String str37 = recipe23.getName();
        double double38 = recipe23.getPrice();
        java.lang.String str39 = recipe23.getName();
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", (double) 8, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Welcome to Cafe; Paid: 10.0; Paid: 1.0");
        double double44 = recipe23.getPrice();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        int int4 = coffee3.getAmount();
        java.lang.String str5 = coffee3.toString();
        boolean boolean6 = coffee0.equals((java.lang.Object) coffee3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        java.lang.String str8 = cafe3.greeting();
        java.lang.String str9 = cafe3.greeting();
        java.lang.String str10 = cafe3.greeting();
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str9, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str10, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.Class<?> wildcardClass2 = cafe0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            recipeNotFoundException3.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size12, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size12, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) 100, size12, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=35, type=WHOLE]", (double) 1.0f, size12, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) (short) 1, size12, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 100L, size12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException36 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray37 = cafeOutOfCapacityException36.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water43 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str44 = water43.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk46 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean47 = water43.equals((java.lang.Object) 30);
        java.lang.String str48 = water43.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException56 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray57 = cafeOutOfCapacityException56.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException56);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        boolean boolean63 = water43.equals((java.lang.Object) recipeNotFoundException59);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException66 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray67 = cafeOutOfCapacityException66.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException68 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray69 = recipeNotFoundException68.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException70 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = recipeNotFoundException70.getSuppressed();
        recipeNotFoundException68.addSuppressed((java.lang.Throwable) recipeNotFoundException70);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException74 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException75 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray76 = recipeNotFoundException75.getSuppressed();
        recipeNotFoundException74.addSuppressed((java.lang.Throwable) recipeNotFoundException75);
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) recipeNotFoundException75);
        cafeOutOfCapacityException66.addSuppressed((java.lang.Throwable) recipeNotFoundException70);
        java.lang.Throwable[] throwableArray80 = cafeOutOfCapacityException66.getSuppressed();
        recipeNotFoundException59.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException66);
        java.lang.String str82 = recipeNotFoundException59.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Water" + "'", str44, "Water");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Water [unit=ML, amount=30]" + "'", str48, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str82, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str11 = coffee10.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size14, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee20 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str21 = coffee20.toString();
        boolean boolean22 = recipe16.equals((java.lang.Object) str21);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        double double27 = recipe16.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        boolean boolean32 = coffee10.equals((java.lang.Object) "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
        int int33 = coffee10.getAmount();
        java.lang.String str34 = coffee10.toString();
        java.lang.String str35 = coffee10.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee10);
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=0, type=SKIMMED]", (double) (short) 100, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        java.lang.String str11 = recipe4.getName();
        java.lang.String str12 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        java.lang.String str15 = order14.toString();
        boolean boolean16 = coffee1.equals((java.lang.Object) order14);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: ; Paid: 10.0" + "'", str15, "Order: ; For: ; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=WHOLE]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Milk [unit=ML, amount=100, type=WHOLE]", "Coffee [unit=GR, amount=35, decaf=false]", 1.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        java.lang.String str5 = recipe4.getName();
        double double6 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=ALMOND]", (double) (-1), size8, 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) (byte) 1, size8, 35);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: hi!; Paid: 0.0", (double) 1L, size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=35, type=WHOLE]", (double) (byte) 1, size8, 0);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        order9.serve();
        order9.serve();
        order9.serve();
        order9.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size12, (int) '4');
        boolean boolean15 = cafe0.addRecipe(recipe14);
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str26 = coffee25.toString();
        boolean boolean27 = recipe21.equals((java.lang.Object) str26);
        java.lang.String str28 = recipe21.getName();
        boolean boolean29 = cafe0.addRecipe(recipe21);
        uk.ac.sheffield.com1003.cafe.Order order30 = cafe0.serveOrder();
        cafe0.printMenu();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray33 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order35 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = cafe0.placeOrder("Welcome to Coffee [unit=GR, amount=30, decaf=false]", "Coffee [unit=GR, amount=-1, decaf=true]", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(order30);
        org.junit.Assert.assertNotNull(recipeArray33);
        org.junit.Assert.assertNull(order35);
        org.junit.Assert.assertNotNull(recipeArray36);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        java.lang.String str7 = recipe2.getName();
        double double8 = recipe2.getPrice();
        java.lang.String str9 = recipe2.getName();
        java.lang.String str10 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type5);
        int int10 = milk9.getAmount();
        java.lang.String str11 = milk9.toString();
        java.lang.String str12 = milk9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=-1, type=SKIMMED]" + "'", str11, "Milk [unit=ML, amount=-1, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=-1, type=SKIMMED]" + "'", str12, "Milk [unit=ML, amount=-1, type=SKIMMED]");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10.0f, size2, 8);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        boolean boolean4 = recipe2.isReady();
        java.lang.String str5 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        boolean boolean8 = recipe2.equals((java.lang.Object) cafe7);
        cafe7.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe7.placeOrder("Order: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; For: ; Paid: 10.0", "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Milk [unit=ML, amount=0, type=WHOLE]", "Order: ; For: Water; Paid: 1.0", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water12 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str13 = water12.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean16 = water12.equals((java.lang.Object) 30);
        java.lang.String str17 = water12.toString();
        java.lang.String str18 = water12.getName();
        java.lang.String str19 = water12.toString();
        java.lang.String str20 = water12.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water12);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee31 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        recipe24.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee31);
        boolean boolean33 = recipe4.equals((java.lang.Object) recipe24);
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 10.0f);
        order36.serve();
        order36.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=30]" + "'", str17, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water" + "'", str18, "Water");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj9 = null;
        boolean boolean10 = milk8.equals(obj9);
        java.lang.String str11 = milk8.toString();
        java.lang.String str12 = milk8.getName();
        java.lang.String str13 = milk8.toString();
        boolean boolean14 = recipe2.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk" + "'", str12, "Milk");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        java.lang.String str9 = order8.toString();
        java.lang.String str10 = order8.toString();
        java.lang.String str11 = order8.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str9, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str10, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str11, "Order: ; For: Welcome to Cafe; Paid: 10.0");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size12, (int) '4');
        boolean boolean15 = cafe0.addRecipe(recipe14);
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str26 = coffee25.toString();
        boolean boolean27 = recipe21.equals((java.lang.Object) str26);
        java.lang.String str28 = recipe21.getName();
        boolean boolean29 = cafe0.addRecipe(recipe21);
        uk.ac.sheffield.com1003.cafe.Order order30 = cafe0.serveOrder();
        cafe0.printMenu();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray33 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Water]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(order30);
        org.junit.Assert.assertNotNull(recipeArray33);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        java.lang.String str11 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double18 = recipe14.getPrice();
        java.lang.String str19 = recipe14.getName();
        double double20 = recipe14.getPrice();
        double double21 = recipe14.getPrice();
        boolean boolean22 = cafe0.addRecipe(recipe14);
        double double23 = recipe14.getPrice();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str19, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Syrup]");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to ", (double) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type20 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type20);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        boolean boolean23 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str26 = coffee25.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type27 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean28 = coffee25.equals((java.lang.Object) type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type27);
        java.lang.String str30 = milk29.getName();
        java.lang.String str31 = milk29.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk29);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk" + "'", str30, "Milk");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str31, "Milk [unit=ML, amount=10, type=SKIMMED]");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException2 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray3 = cafeOutOfCapacityException2.getSuppressed();
        boolean boolean4 = coffee1.equals((java.lang.Object) cafeOutOfCapacityException2);
        java.lang.String str5 = cafeOutOfCapacityException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str5, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1));
        boolean boolean4 = water0.equals((java.lang.Object) (-1));
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.toString();
        java.lang.String str7 = water0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size12, (int) '4');
        boolean boolean15 = cafe0.addRecipe(recipe14);
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order17 = cafe0.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(order17);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) (byte) 10, "Coffee [unit=GR, amount=0, decaf=false]");
        order19.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water; Paid: 1.0", (double) (-1));
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", 1.0d, "Coffee");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str9 = water8.toString();
        java.lang.String str10 = water8.toString();
        boolean boolean11 = recipe2.equals((java.lang.Object) str10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=100]" + "'", str9, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=100]" + "'", str10, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Water; Paid: 1.0", (-1.0d));
        double double13 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, false);
        int int3 = coffee2.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str6 = water5.toString();
        java.lang.String str7 = water5.toString();
        int int8 = water5.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int11 = milk10.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water12 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str13 = water12.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean24 = water12.equals((java.lang.Object) "Welcome to Cafe");
        boolean boolean25 = milk10.equals((java.lang.Object) boolean24);
        boolean boolean26 = water5.equals((java.lang.Object) milk10);
        boolean boolean27 = coffee2.equals((java.lang.Object) boolean26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=100]" + "'", str6, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=100]" + "'", str7, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException4.getSuppressed();
        boolean boolean9 = milk1.equals((java.lang.Object) throwableArray8);
        java.lang.String str10 = milk1.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Syrup]");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Order: Water; For: Water; Paid: 1.0", "Milk [unit=ML, amount=1, type=WHOLE]", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        double double10 = recipe2.getPrice();
        double double11 = recipe2.getPrice();
        boolean boolean12 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe10.getMenu();
        boolean boolean12 = recipe8.equals((java.lang.Object) cafe10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (byte) 100);
        order15.serve();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=10]", (double) (byte) 10);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str6 = water5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean9 = water5.equals((java.lang.Object) 30);
        java.lang.String str10 = water5.toString();
        java.lang.String str11 = water5.getName();
        boolean boolean13 = water5.equals((java.lang.Object) (byte) -1);
        java.lang.String str14 = water5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = water5.getUnit();
        boolean boolean16 = milk4.equals((java.lang.Object) water5);
        java.lang.Object obj17 = null;
        boolean boolean18 = water5.equals(obj17);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size23 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size23, (int) '4');
        boolean boolean27 = recipe25.equals((java.lang.Object) 10.0d);
        boolean boolean28 = milk20.equals((java.lang.Object) recipe25);
        boolean boolean29 = water5.equals((java.lang.Object) recipe25);
        boolean boolean30 = coffee2.equals((java.lang.Object) recipe25);
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100L, "Milk [unit=ML, amount=100, type=null]");
        java.lang.String str35 = recipe25.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water" + "'", str14, "Water");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + size23 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size23.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Water [unit=ML, amount=30]" + "'", str35, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=0]", (double) (byte) 100, "Coffee [unit=GR, amount=0, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj22 = null;
        boolean boolean23 = milk21.equals(obj22);
        java.lang.String str24 = milk21.toString();
        java.lang.String str25 = milk21.getName();
        java.lang.String str26 = milk21.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        java.lang.String str28 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str24, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk" + "'", str25, "Milk");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str28, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str7 = coffee6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean9 = coffee6.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type8);
        boolean boolean13 = water2.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe18 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean22 = cafe18.addRecipe(recipe21);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup27 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=30, type=WHOLE]");
        recipe21.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup27);
        boolean boolean29 = milk14.equals((java.lang.Object) syrup27);
        java.lang.String str30 = syrup27.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Syrup" + "'", str30, "Syrup");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Milk [unit=ML, amount=0, type=SKIMMED]", "Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException19 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray20 = cafeOutOfCapacityException19.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        java.lang.Throwable[] throwableArray51 = tooManyIngredientsException0.getSuppressed();
        java.lang.String str52 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str52, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: 10.0", 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException18.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException18.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        boolean boolean29 = milk1.equals((java.lang.Object) recipeNotFoundException18);
        java.lang.String str30 = recipeNotFoundException18.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str30, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        java.lang.String str2 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=0, type=WHOLE]");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=35]", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        boolean boolean11 = recipe4.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=0, decaf=false]]", (double) 30);
        order14.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe12 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe12.printPendingOrders();
        cafe12.printPendingOrders();
        cafe12.printPendingOrders();
        java.lang.String str16 = cafe12.greeting();
        java.lang.String str17 = cafe12.getName();
        boolean boolean18 = water0.equals((java.lang.Object) cafe12);
        java.lang.String str19 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str16, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str17, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        java.lang.String str4 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, false);
        boolean boolean8 = coffee0.equals((java.lang.Object) false);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("hi!");
        boolean boolean11 = coffee0.equals((java.lang.Object) syrup10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) (byte) 100, 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) (byte) 1, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk0 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException1 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException1.getSuppressed();
        boolean boolean3 = milk0.equals((java.lang.Object) throwableArray2);
        java.lang.String str4 = milk0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe10.printPendingOrders();
        boolean boolean12 = water6.equals((java.lang.Object) cafe10);
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        boolean boolean15 = water6.equals((java.lang.Object) cafe14);
        boolean boolean16 = milk0.equals((java.lang.Object) water6);
        java.lang.Object obj17 = null;
        boolean boolean18 = water6.equals(obj17);
        java.lang.String str19 = water6.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=100]" + "'", str19, "Water [unit=ML, amount=100]");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean8 = cafe4.addRecipe(recipe7);
        boolean boolean9 = syrup1.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        boolean boolean14 = recipe7.equals((java.lang.Object) cafe13);
        double double15 = recipe7.getPrice();
        java.lang.String str16 = recipe7.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str16, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        boolean boolean5 = milk2.equals((java.lang.Object) 30);
        java.lang.String str6 = milk2.toString();
        int int7 = milk2.getAmount();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=100, type=null]" + "'", str6, "Milk [unit=ML, amount=100, type=null]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (-1.0f));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water7 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str8 = water7.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water7);
        double double10 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=100]" + "'", str8, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", (int) (byte) 1, (int) (short) 1);
        cafe3.printMenu();
        java.lang.Class<?> wildcardClass5 = cafe3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=0]", (int) (short) 0, (int) '4');
        cafe3.printPendingOrders();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=35, decaf=false]", (double) (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        java.lang.String str7 = recipe2.getName();
        double double8 = recipe2.getPrice();
        boolean boolean9 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SKIMMED]", (double) (short) 1, "Welcome to Coffee [unit=GR, amount=8, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = coffee27.getUnit();
        java.lang.String str29 = coffee27.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit30 = coffee27.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        java.lang.String str32 = coffee27.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit30 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit30.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee" + "'", str32, "Coffee");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (short) 0, (int) '#');
        cafe3.printMenu();
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size7, 0);
        boolean boolean10 = cafe0.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size16, (int) (short) 10);
        boolean boolean20 = recipe18.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean29 = recipe18.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee30 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str31 = coffee30.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type32 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean33 = coffee30.equals((java.lang.Object) type32);
        java.lang.String str34 = coffee30.toString();
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee30);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size38 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size38, (int) (short) 10);
        boolean boolean41 = coffee30.equals((java.lang.Object) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size44 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe46 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size44, 0);
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe46, "Milk [unit=ML, amount=100, type=WHOLE]", (double) 'a', "Order: ; For: ; Paid: 10.0");
        boolean boolean51 = coffee30.equals((java.lang.Object) recipe46);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee30);
        boolean boolean53 = recipe9.equals((java.lang.Object) coffee30);
        java.lang.String str54 = coffee30.toString();
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str31, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type32.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size38 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size38.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + size44 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size44.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str54, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) ' ', (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        java.lang.Class<?> wildcardClass8 = recipe6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.String str20 = order19.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: ; For: Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0; Paid: 8.0" + "'", str20, "Order: ; For: Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0; Paid: 8.0");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 1, size4, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe9.printPendingOrders();
        java.lang.String str11 = cafe9.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe9.getMenu();
        java.lang.String str13 = cafe9.getName();
        java.lang.String str14 = cafe9.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size17, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe19.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = cafe9.addRecipe(recipe19);
        uk.ac.sheffield.com1003.cafe.Order order27 = cafe9.serveOrder();
        boolean boolean28 = recipe8.equals((java.lang.Object) order27);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cafe" + "'", str13, "Cafe");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cafe" + "'", str14, "Cafe");
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(order27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=0]", (int) (short) 0, (int) '4');
        java.lang.String str4 = cafe3.getName();
        cafe3.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=0]" + "'", str4, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException5.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException19.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        boolean boolean40 = milk2.equals((java.lang.Object) recipeNotFoundException5);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type1);
        java.lang.String str3 = milk2.getName();
        java.lang.String str4 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=SEMI]" + "'", str4, "Milk [unit=ML, amount=-1, type=SEMI]");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.String str2 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = milk1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        int int11 = water0.getAmount();
        java.lang.String str12 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (int) (short) 10, 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray17 = cafe16.getMenu();
        java.lang.String str18 = cafe16.getName();
        boolean boolean19 = water0.equals((java.lang.Object) str18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str18, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = cafe0.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray18 = cafe0.getMenu();
        java.lang.String str19 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cafe0.placeOrder("Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0", "Order: ; For: Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0; Paid: 0.0", (double) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(recipeArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe12 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe12.printPendingOrders();
        cafe12.printPendingOrders();
        cafe12.printPendingOrders();
        java.lang.String str16 = cafe12.greeting();
        java.lang.String str17 = cafe12.getName();
        boolean boolean18 = water0.equals((java.lang.Object) cafe12);
        java.lang.Class<?> wildcardClass19 = water0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str16, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str17, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) -1);
        boolean boolean9 = cafe3.addRecipe(recipe8);
        double double10 = recipe8.getPrice();
        java.lang.Class<?> wildcardClass11 = recipe8.getClass();
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cafe1.placeOrder("Welcome to Milk [unit=ML, amount=100, type=WHOLE]", "Water", 35.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray15);
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str17 = recipe8.getName();
        java.lang.String str18 = recipe8.getName();
        boolean boolean19 = cafe3.addRecipe(recipe8);
        java.lang.String str20 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double27 = recipe23.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee29);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit31 = coffee29.getUnit();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee29);
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size38 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size38, (int) (short) 10);
        boolean boolean42 = recipe40.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk50 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean51 = recipe40.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee52 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str53 = coffee52.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type54 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean55 = coffee52.equals((java.lang.Object) type54);
        java.lang.String str56 = coffee52.toString();
        recipe40.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee52);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit58 = coffee52.getUnit();
        recipe35.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee52);
        java.lang.String str60 = coffee52.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe63 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        boolean boolean64 = recipe63.isReady();
        uk.ac.sheffield.com1003.cafe.Order order67 = new uk.ac.sheffield.com1003.cafe.Order(recipe63, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) (byte) 1);
        order67.serve();
        boolean boolean69 = coffee52.equals((java.lang.Object) order67);
        boolean boolean70 = coffee29.equals((java.lang.Object) coffee52);
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + size38 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size38.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str53, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type54 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type54.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str56, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit58 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit58.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str60, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        java.lang.Class<?> wildcardClass21 = recipeNotFoundException16.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = milk4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str11 = water10.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean14 = water10.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = water10.getUnit();
        int int16 = water10.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe();
        boolean boolean18 = water10.equals((java.lang.Object) cafe17);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type23 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type23);
        java.lang.String str25 = milk24.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean27 = milk24.equals((java.lang.Object) coffee26);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        boolean boolean30 = coffee26.equals((java.lang.Object) milk29);
        boolean boolean31 = recipe21.equals((java.lang.Object) boolean30);
        boolean boolean32 = recipe21.isReady();
        java.lang.String str33 = recipe21.getName();
        boolean boolean34 = cafe17.addRecipe(recipe21);
        boolean boolean35 = milk9.equals((java.lang.Object) recipe21);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size38 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size38, (int) (short) 10);
        double double41 = recipe40.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order51 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Milk [unit=ML, amount=100, type=SKIMMED]", (double) 30, "Water");
        boolean boolean52 = milk9.equals((java.lang.Object) "Water");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + type23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk" + "'", str25, "Milk");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str33, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + size38 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size38.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1, type1);
        java.lang.String str3 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = milk2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        java.lang.String str6 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;
        boolean boolean8 = milk5.equals((java.lang.Object) unit7);
        java.lang.String str9 = milk5.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str6, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str9, "Milk [unit=ML, amount=0, type=SKIMMED]");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 1, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (-1.0d), size8, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 8, size8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = cafe0.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water18 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str19 = water18.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean22 = water18.equals((java.lang.Object) 30);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water18);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Cafe", (double) 100, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]", (double) 35, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water" + "'", str19, "Water");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        java.lang.String str10 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str15 = order14.toString();
        order14.serve();
        order14.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0" + "'", str15, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type1);
        java.lang.String str3 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean5 = milk2.equals((java.lang.Object) coffee4);
        java.lang.String str6 = coffee4.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=true]");
        boolean boolean9 = coffee4.equals((java.lang.Object) "Coffee [unit=GR, amount=-1, decaf=true]");
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1));
        boolean boolean4 = water0.equals((java.lang.Object) (-1));
        java.lang.String str5 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size12, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to ]", (double) (byte) -1, size12, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=97]", (double) '#', size12, (int) (short) 10);
        boolean boolean19 = water0.equals((java.lang.Object) recipe18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: ; For: Water; Paid: 1.0", 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", "Coffee [unit=GR, amount=100, decaf=false]", (double) 1L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.Class<?> wildcardClass7 = recipe2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean12 = recipe4.isReady();
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = water1.equals((java.lang.Object) boolean13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=ALMOND]", (double) (-1), size4, 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) (byte) 1, size4, 35);
        java.lang.Class<?> wildcardClass9 = size4.getClass();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException11.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup" + "'", str5, "Welcome to Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup" + "'", str6, "Welcome to Syrup");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0", (double) 1L, size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        double double18 = recipe17.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water26 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str27 = water26.toString();
        recipe17.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water26);
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe29.printPendingOrders();
        java.lang.String str31 = cafe29.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray32 = cafe29.getMenu();
        cafe29.printMenu();
        boolean boolean34 = water26.equals((java.lang.Object) cafe29);
        java.lang.String str35 = water26.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean39 = water26.equals((java.lang.Object) 1.0f);
        uk.ac.sheffield.com1003.cafe.Cafe cafe41 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray42 = cafe41.getMenu();
        boolean boolean43 = water26.equals((java.lang.Object) recipeArray42);
        uk.ac.sheffield.com1003.cafe.Cafe cafe44 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe44.printPendingOrders();
        java.lang.String str46 = cafe44.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray47 = cafe44.getMenu();
        java.lang.String str48 = cafe44.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray49 = cafe44.getMenu();
        java.lang.String str50 = cafe44.greeting();
        boolean boolean51 = water26.equals((java.lang.Object) str50);
        // The following exception was thrown during execution in test generation
        try {
            recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water26);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=30]" + "'", str27, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Water" + "'", str35, "Water");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(recipeArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Welcome to Cafe" + "'", str46, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cafe" + "'", str48, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Welcome to Cafe" + "'", str50, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Welcome to hi!");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException26 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray27 = cafeOutOfCapacityException26.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException26);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException34.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException31);
        java.lang.String str40 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str40, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean12 = recipe4.isReady();
        java.lang.String str13 = recipe4.getName();
        boolean boolean14 = coffee1.equals((java.lang.Object) recipe4);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup16 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Milk");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup16);
        boolean boolean18 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Welcome to ");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100, false);
        java.lang.String str3 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=true]", 32, 1);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=0, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = null;
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) -1, "");
        boolean boolean7 = syrup1.equals((java.lang.Object) order6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int2 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = milk1.getUnit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 35, 32);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=0, decaf=false]");
        cafe1.printMenu();
        cafe1.printMenu();
        java.lang.String str4 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Coffee [unit=GR, amount=0, decaf=false]" + "'", str4, "Welcome to Welcome to Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup11 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup11);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient13 = null;
        recipe2.addIngredient(ingredient13);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Cafe", (double) 0L);
        order17.serve();
        java.lang.String str19 = order17.toString();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Welcome to Cafe; Paid: 0.0" + "'", str19, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) (byte) 10, "Coffee [unit=GR, amount=0, decaf=false]");
        java.lang.String str20 = order19.toString();
        order19.printReceipt();
        order19.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str20, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to ", (double) (byte) 100);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        double double11 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean16 = cafe3.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        recipe19.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee26);
        boolean boolean28 = recipe8.equals((java.lang.Object) coffee26);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=1, type=WHOLE]", (double) 35);
        order31.serve();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        int int3 = milk1.getAmount();
        java.lang.String str4 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Water; Paid: 1.0", (double) (byte) 100);
        java.lang.String str14 = order13.toString();
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0" + "'", str14, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str7 = coffee6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean9 = coffee6.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type8);
        boolean boolean12 = coffee3.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) ' ', size10, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) 1.0f, size10, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size10, 0);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup", (double) '4', size10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.greeting();
        java.lang.String str7 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe0.placeOrder("Welcome to Welcome to ", "Welcome to ", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray8);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        int int2 = water1.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe3.printPendingOrders();
        java.lang.String str5 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        java.lang.String str7 = cafe3.greeting();
        cafe3.printMenu();
        cafe3.printPendingOrders();
        boolean boolean10 = water1.equals((java.lang.Object) cafe3);
        java.lang.String str11 = water1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str11, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean7 = milk5.equals((java.lang.Object) type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type6);
        int int12 = milk11.getAmount();
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException21 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray22 = cafeOutOfCapacityException21.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException21);
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        boolean boolean33 = water1.equals((java.lang.Object) recipeNotFoundException25);
        int int34 = water1.getAmount();
        java.lang.Class<?> wildcardClass35 = water1.getClass();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (-1.0f), "Welcome to ");
        java.lang.String str9 = order8.toString();
        order8.printReceipt();
        java.lang.String str11 = order8.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0" + "'", str9, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0" + "'", str11, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = cafe0.placeOrder("Milk [unit=ML, amount=10, type=WHOLE]", "Syrup", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Water; Paid: 1.0", (-1.0d));
        order12.printReceipt();
        order12.serve();
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        java.lang.String str7 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe9.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe9.getMenu();
        java.lang.String str12 = cafe9.getName();
        java.lang.String str13 = cafe9.getName();
        boolean boolean14 = milk5.equals((java.lang.Object) cafe9);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = milk5.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.getName();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=SKIMMED]", (int) '4', (int) (byte) 100);
        java.lang.String str4 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Welcome to Syrup", "Syrup [unit=ML, amount=10, flavour=Syrup]", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]" + "'", str4, "Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.String str6 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int14 = water13.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException16.getSuppressed();
        boolean boolean20 = water13.equals((java.lang.Object) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException16.getSuppressed();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException37 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray38 = cafeOutOfCapacityException37.getSuppressed();
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException37);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        java.lang.String str51 = recipeNotFoundException42.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str51, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        java.lang.String str5 = coffee1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = coffee1.equals(obj6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type12 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean13 = milk11.equals((java.lang.Object) type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type12);
        boolean boolean16 = coffee1.equals((java.lang.Object) type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException34 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray35 = cafeOutOfCapacityException34.getSuppressed();
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException34);
        java.lang.Throwable[] throwableArray37 = cafeOutOfCapacityException34.getSuppressed();
        java.lang.Throwable[] throwableArray38 = cafeOutOfCapacityException34.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException34);
        java.lang.Throwable[] throwableArray40 = cafeOutOfCapacityException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException48 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray49 = cafeOutOfCapacityException48.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException48);
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException41.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException54.getSuppressed();
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException61 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException62 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray63 = recipeNotFoundException62.getSuppressed();
        recipeNotFoundException61.addSuppressed((java.lang.Throwable) recipeNotFoundException62);
        recipeNotFoundException59.addSuppressed((java.lang.Throwable) recipeNotFoundException61);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException66 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray67 = cafeOutOfCapacityException66.getSuppressed();
        recipeNotFoundException59.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException66);
        java.lang.Throwable[] throwableArray69 = cafeOutOfCapacityException66.getSuppressed();
        java.lang.Throwable[] throwableArray70 = cafeOutOfCapacityException66.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException66);
        cafeOutOfCapacityException34.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        java.lang.String str73 = cafeOutOfCapacityException34.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str73, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", 10, (int) (short) 100);
        cafe6.printMenu();
        boolean boolean8 = coffee0.equals((java.lang.Object) cafe6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe6.placeOrder("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0", "Order: ; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: 10.0", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        order9.printReceipt();
        order9.printReceipt();
        java.lang.String str12 = order9.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str12, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        java.lang.String str7 = recipe2.getName();
        double double8 = recipe2.getPrice();
        boolean boolean9 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SKIMMED]", (double) (short) 1, "Welcome to Coffee [unit=GR, amount=8, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = coffee27.getUnit();
        java.lang.String str29 = coffee27.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit30 = coffee27.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        int int32 = coffee27.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit30 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit30.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, true);
        java.lang.String str6 = coffee5.toString();
        boolean boolean7 = coffee0.equals((java.lang.Object) str6);
        java.lang.String str8 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=10, decaf=true]" + "'", str6, "Coffee [unit=GR, amount=10, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        boolean boolean4 = milk1.equals((java.lang.Object) 8);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 1.0", (double) 'a');
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        order6.serve();
        order6.printReceipt();
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=SKIMMED]", (double) (short) -1);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size9, (int) '4');
        boolean boolean13 = recipe11.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Welcome to Cafe", 0.0d);
        boolean boolean18 = recipe11.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        boolean boolean23 = milk5.equals((java.lang.Object) recipe11);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) (byte) 0, "Welcome to Order: ; For: hi!; Paid: 0.0");
        order27.serve();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ');
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=32, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=32, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe0.getMenu();
        java.lang.String str3 = cafe0.getName();
        java.lang.String str4 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=-1, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        java.lang.String str7 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int9 = water8.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException11.getSuppressed();
        boolean boolean15 = water8.equals((java.lang.Object) recipeNotFoundException11);
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException11.getSuppressed();
        boolean boolean18 = milk5.equals((java.lang.Object) recipeNotFoundException11);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException11.getSuppressed();
        java.lang.String str21 = recipeNotFoundException11.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30 + "'", int9 == 30);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Welcome to Cafe" + "'", str2, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        int int4 = coffee1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.getName();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee0.getUnit();
        java.lang.String str4 = coffee0.toString();
        java.lang.String str5 = coffee0.toString();
        java.lang.String str6 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size13, 0);
        boolean boolean16 = recipe6.equals((java.lang.Object) size13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size13, 10);
        boolean boolean19 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water22 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int23 = water22.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException25.getSuppressed();
        boolean boolean29 = water22.equals((java.lang.Object) recipeNotFoundException25);
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException25.getSuppressed();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException46 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray47 = cafeOutOfCapacityException46.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException46);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        boolean boolean51 = recipe18.equals((java.lang.Object) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Order: ; For: Welcome to Cafe; Paid: 10.0", 10.0d);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30 + "'", int23 == 30);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException14 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray15 = cafeOutOfCapacityException14.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException14);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException18 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water20 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int21 = water20.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException23.getSuppressed();
        boolean boolean27 = water20.equals((java.lang.Object) recipeNotFoundException23);
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException23.getSuppressed();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.String str31 = recipeNotFoundException23.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size9, (int) '4');
        boolean boolean13 = recipe11.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Welcome to Cafe", 0.0d);
        boolean boolean18 = recipe11.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        boolean boolean23 = milk5.equals((java.lang.Object) recipe11);
        java.lang.String str24 = milk5.toString();
        java.lang.String str25 = milk5.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str24, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str25, "Milk [unit=ML, amount=10, type=SKIMMED]");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException36 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray37 = cafeOutOfCapacityException36.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water43 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str44 = water43.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk46 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean47 = water43.equals((java.lang.Object) 30);
        java.lang.String str48 = water43.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException56 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray57 = cafeOutOfCapacityException56.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException56);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        boolean boolean63 = water43.equals((java.lang.Object) recipeNotFoundException59);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        java.lang.Throwable throwable66 = null;
        // The following exception was thrown during execution in test generation
        try {
            recipeNotFoundException2.addSuppressed(throwable66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Water" + "'", str44, "Water");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Water [unit=ML, amount=30]" + "'", str48, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size4, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size4, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException25 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray26 = cafeOutOfCapacityException25.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        boolean boolean29 = milk10.equals((java.lang.Object) recipeNotFoundException11);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean32 = milk10.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(35, false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        int int6 = milk1.getAmount();
        boolean boolean8 = milk1.equals((java.lang.Object) "Water [unit=ML, amount=100]");
        int int9 = milk1.getAmount();
        java.lang.String str10 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=10, type=WHOLE]");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe5.printPendingOrders();
        java.lang.String str7 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size10, (int) (short) 10);
        java.lang.String str13 = recipe12.getName();
        boolean boolean14 = cafe5.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size17, (int) '4');
        boolean boolean20 = cafe5.addRecipe(recipe19);
        cafe5.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size24, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee30 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str31 = coffee30.toString();
        boolean boolean32 = recipe26.equals((java.lang.Object) str31);
        java.lang.String str33 = recipe26.getName();
        boolean boolean34 = cafe5.addRecipe(recipe26);
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) '#', "Milk [unit=ML, amount=1, type=WHOLE]");
        boolean boolean39 = cafe3.addRecipe(recipe26);
        double double40 = recipe26.getPrice();
        boolean boolean41 = coffee2.equals((java.lang.Object) double40);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str31, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        order19.serve();
        order19.serve();
        order19.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=0]", (double) (byte) 100, "Coffee [unit=GR, amount=0, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj22 = null;
        boolean boolean23 = milk21.equals(obj22);
        java.lang.String str24 = milk21.toString();
        java.lang.String str25 = milk21.getName();
        java.lang.String str26 = milk21.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        boolean boolean29 = recipe2.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]", 1.0d, "Welcome to Coffee [unit=GR, amount=8, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee34 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str35 = coffee34.toString();
        java.lang.String str36 = coffee34.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit37 = coffee34.getUnit();
        java.lang.String str38 = coffee34.toString();
        java.lang.String str39 = coffee34.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee34);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee43 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, true);
        java.lang.String str44 = coffee43.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size47 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size47, (int) '4');
        boolean boolean51 = recipe49.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Welcome to Cafe", 0.0d);
        boolean boolean56 = recipe49.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        boolean boolean61 = coffee43.equals((java.lang.Object) "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        // The following exception was thrown during execution in test generation
        try {
            recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee43);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str24, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk" + "'", str25, "Milk");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str36, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str44, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertTrue("'" + size47 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size47.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        java.lang.Class<?> wildcardClass2 = cafe0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", 10.0d);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException7 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray8 = cafeOutOfCapacityException7.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException7);
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            cafeOutOfCapacityException7.addSuppressed(throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.toString();
        int int11 = water0.getAmount();
        java.lang.String str12 = water0.toString();
        java.lang.String str13 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = water0.getUnit();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=30]" + "'", str13, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) 'a');
        java.lang.String str2 = water1.toString();
        java.lang.String str3 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        java.lang.String str11 = milk10.toString();
        boolean boolean12 = water1.equals((java.lang.Object) str11);
        java.lang.String str13 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=97]" + "'", str2, "Water [unit=ML, amount=97]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=97]" + "'", str3, "Water [unit=ML, amount=97]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=10, type=SEMI]" + "'", str11, "Milk [unit=ML, amount=10, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=97]" + "'", str13, "Water [unit=ML, amount=97]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee", (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean25 = cafe1.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe28.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe28.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean38 = cafe34.addRecipe(recipe37);
        boolean boolean39 = cafe32.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        boolean boolean44 = cafe28.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size47 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size47, (int) (short) 10);
        boolean boolean51 = recipe49.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean59 = recipe37.equals((java.lang.Object) order58);
        uk.ac.sheffield.com1003.cafe.Order order62 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0", (double) 30);
        boolean boolean63 = cafe1.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray64 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertNotNull(recipeArray30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + size47 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size47.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(recipeArray64);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Cafe]", (double) (short) 10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Water [unit=ML, amount=32]", 100.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str8 = cafe7.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size11, (int) (short) 10);
        boolean boolean15 = recipe13.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "hi!", (double) 0L);
        boolean boolean19 = cafe7.addRecipe(recipe13);
        java.lang.String str20 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean31 = cafe7.addRecipe(recipe23);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray32 = cafe7.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe34.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe34.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe38 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe40 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean44 = cafe40.addRecipe(recipe43);
        boolean boolean45 = cafe38.addRecipe(recipe43);
        uk.ac.sheffield.com1003.cafe.Order order49 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        boolean boolean50 = cafe34.addRecipe(recipe43);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size53 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe55 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size53, (int) (short) 10);
        boolean boolean57 = recipe55.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe55, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order64 = new uk.ac.sheffield.com1003.cafe.Order(recipe55, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean65 = recipe43.equals((java.lang.Object) order64);
        uk.ac.sheffield.com1003.cafe.Order order68 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0", (double) 30);
        boolean boolean69 = cafe7.addRecipe(recipe43);
        boolean boolean70 = milk4.equals((java.lang.Object) boolean69);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to hi!" + "'", str20, "Welcome to hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(recipeArray32);
        org.junit.Assert.assertNotNull(recipeArray36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + size53 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size53.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", 0, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        java.lang.Class<?> wildcardClass5 = cafe3.getClass();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=SEMI]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=SEMI]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=SEMI]]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int3 = water2.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        boolean boolean9 = water2.equals((java.lang.Object) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException19 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray20 = cafeOutOfCapacityException19.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException19);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException24.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException31.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException35.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray51);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str5 = syrup4.toString();
        java.lang.String str6 = syrup4.toString();
        boolean boolean7 = coffee2.equals((java.lang.Object) syrup4);
        java.lang.String str8 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe12 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe12.getMenu();
        boolean boolean14 = coffee2.equals((java.lang.Object) cafe12);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        java.lang.String str17 = coffee16.getName();
        boolean boolean18 = coffee2.equals((java.lang.Object) str17);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee" + "'", str17, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size4, (int) '4');
        boolean boolean8 = recipe6.equals((java.lang.Object) 10.0d);
        boolean boolean9 = milk1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size12, (int) '4');
        boolean boolean16 = recipe14.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Welcome to Cafe", 0.0d);
        boolean boolean20 = milk1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk25);
        java.lang.String str27 = recipe23.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean31 = recipe30.isReady();
        java.lang.String str32 = recipe30.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee33 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe30.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee33);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee33);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException36 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException37 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray38 = cafeOutOfCapacityException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException41.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException46.getSuppressed();
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        cafeOutOfCapacityException37.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        cafeOutOfCapacityException36.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException37);
        boolean boolean52 = recipe23.equals((java.lang.Object) cafeOutOfCapacityException37);
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Welcome to Syrup", (double) 0, "Welcome to Coffee [unit=GR, amount=30, decaf=false]");
        boolean boolean57 = milk1.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water [unit=ML, amount=30]" + "'", str32, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        boolean boolean8 = water0.equals((java.lang.Object) cafe7);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean16 = recipe15.isReady();
        java.lang.String str17 = recipe15.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee18);
        boolean boolean20 = coffee12.equals((java.lang.Object) recipe15);
        boolean boolean21 = water10.equals((java.lang.Object) recipe15);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Coffee", (double) (-1.0f), "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean29 = recipe15.equals((java.lang.Object) recipe24);
        java.lang.String str30 = recipe24.getName();
        boolean boolean31 = water0.equals((java.lang.Object) recipe24);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type35 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean36 = milk34.equals((java.lang.Object) type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk37 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type35);
        java.lang.String str38 = milk37.toString();
        boolean boolean39 = water0.equals((java.lang.Object) milk37);
        java.lang.String str40 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=30]" + "'", str17, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Water [unit=ML, amount=30]" + "'", str30, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str38, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Water [unit=ML, amount=30]" + "'", str40, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        boolean boolean7 = coffee1.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException12 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray13 = cafeOutOfCapacityException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        cafeOutOfCapacityException12.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.String str42 = recipeNotFoundException26.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str42, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean5 = recipe4.isReady();
        java.lang.String str6 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee7);
        boolean boolean9 = coffee1.equals((java.lang.Object) recipe4);
        java.lang.String str10 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe14.printPendingOrders();
        cafe14.printPendingOrders();
        cafe14.printPendingOrders();
        java.lang.String str18 = cafe14.greeting();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe14.serveOrder();
        java.lang.String str20 = cafe14.getName();
        boolean boolean21 = coffee1.equals((java.lang.Object) cafe14);
        cafe14.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=30, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str18, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str20, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water; Paid: 1.0", (double) (-1));
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", 1.0d, "Coffee");
        boolean boolean12 = coffee2.equals((java.lang.Object) recipe7);
        int int13 = coffee2.getAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup0 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup();
        java.lang.String str1 = syrup0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) 10L, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        boolean boolean11 = syrup0.equals((java.lang.Object) order10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str1, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 0, (int) 'a');
        java.lang.String str4 = cafe3.greeting();
        cafe3.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException16 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray17 = cafeOutOfCapacityException16.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException16);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        boolean boolean20 = milk1.equals((java.lang.Object) recipeNotFoundException2);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException22 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray23 = cafeOutOfCapacityException22.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        cafeOutOfCapacityException22.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.String str52 = recipeNotFoundException26.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str52, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        java.lang.String str10 = water3.getName();
        java.lang.String str11 = water3.toString();
        java.lang.String str12 = water3.toString();
        java.lang.String str13 = water3.toString();
        int int14 = water3.getAmount();
        java.lang.String str15 = water3.toString();
        boolean boolean17 = water3.equals((java.lang.Object) "Water");
        java.lang.String str18 = water3.getName();
        boolean boolean19 = coffee2.equals((java.lang.Object) str18);
        java.lang.String str20 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=WHOLE]");
        boolean boolean23 = coffee2.equals((java.lang.Object) syrup22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=30]" + "'", str13, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=30]" + "'", str15, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water" + "'", str18, "Water");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Water]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        java.lang.String str2 = milk1.toString();
        boolean boolean4 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=10, decaf=true]");
        java.lang.String str5 = milk1.toString();
        java.lang.Class<?> wildcardClass6 = milk1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (int) (short) 10, 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=100, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        java.lang.String str5 = cafe0.getName();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        java.lang.String str5 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) 30, "Coffee");
        order9.printReceipt();
        order9.serve();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        java.lang.String str6 = cafe3.getName();
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=35, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str4, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type5);
        int int10 = milk9.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str12 = cafe11.getName();
        cafe11.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe11.getMenu();
        boolean boolean15 = milk9.equals((java.lang.Object) cafe11);
        // The following exception was thrown during execution in test generation
        try {
            cafe11.removeRecipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cafe" + "'", str12, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException10 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray11 = cafeOutOfCapacityException10.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException28 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray29 = cafeOutOfCapacityException28.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException31.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException38.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException53 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException53.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException56 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray57 = recipeNotFoundException56.getSuppressed();
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException56);
        recipeNotFoundException53.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException60 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray61 = cafeOutOfCapacityException60.getSuppressed();
        recipeNotFoundException53.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException60);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        java.lang.Throwable[] throwableArray65 = recipeNotFoundException63.getSuppressed();
        recipeNotFoundException53.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water67 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str68 = water67.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk70 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean71 = water67.equals((java.lang.Object) 30);
        java.lang.String str72 = water67.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException73 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException73.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException75 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException76 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException76.getSuppressed();
        recipeNotFoundException75.addSuppressed((java.lang.Throwable) recipeNotFoundException76);
        recipeNotFoundException73.addSuppressed((java.lang.Throwable) recipeNotFoundException75);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException80 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray81 = cafeOutOfCapacityException80.getSuppressed();
        recipeNotFoundException73.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException80);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException83 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray84 = recipeNotFoundException83.getSuppressed();
        java.lang.Throwable[] throwableArray85 = recipeNotFoundException83.getSuppressed();
        recipeNotFoundException73.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        boolean boolean87 = water67.equals((java.lang.Object) recipeNotFoundException83);
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        java.lang.String str91 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Water" + "'", str68, "Water");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Water [unit=ML, amount=30]" + "'", str72, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str91, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str3 = water2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean6 = water2.equals((java.lang.Object) 30);
        java.lang.String str7 = water2.toString();
        java.lang.String str8 = water2.getName();
        boolean boolean10 = water2.equals((java.lang.Object) (byte) -1);
        java.lang.String str11 = water2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit12 = water2.getUnit();
        boolean boolean13 = milk1.equals((java.lang.Object) water2);
        java.lang.String str14 = water2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water" + "'", str14, "Water");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]", (double) (-1.0f), "Milk [unit=ML, amount=35, type=WHOLE]");
        order4.serve();
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", (int) (short) 10, 100);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        java.lang.String str6 = cafe3.getName();
        cafe3.printPendingOrders();
        java.lang.String str8 = cafe3.getName();
        cafe3.printPendingOrders();
        java.lang.String str10 = cafe3.greeting();
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str6, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str8, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str10, "Welcome to Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) (short) 1, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        double double12 = recipe11.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size18 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size18, 0);
        boolean boolean21 = recipe11.equals((java.lang.Object) size18);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size18, 10);
        boolean boolean24 = recipe23.isReady();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water27 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int28 = water27.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException30.getSuppressed();
        boolean boolean34 = water27.equals((java.lang.Object) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException30.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException51 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray52 = cafeOutOfCapacityException51.getSuppressed();
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException51);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        boolean boolean56 = recipe23.equals((java.lang.Object) recipeNotFoundException44);
        boolean boolean57 = cafe3.addRecipe(recipe23);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + size18 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size18.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 30 + "'", int28 == 30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = coffee2.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = milk7.getUnit();
        java.lang.String str9 = milk7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=-1, type=SKIMMED]" + "'", str9, "Milk [unit=ML, amount=-1, type=SKIMMED]");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: hi!; Paid: 0.0");
        java.lang.String str12 = cafe11.greeting();
        java.lang.String str13 = cafe11.greeting();
        boolean boolean14 = coffee8.equals((java.lang.Object) str13);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Order: ; For: hi!; Paid: 0.0" + "'", str12, "Welcome to Order: ; For: hi!; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Order: ; For: hi!; Paid: 0.0" + "'", str13, "Welcome to Order: ; For: hi!; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=10, type=SEMI]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 100);
        java.lang.String str2 = water1.toString();
        java.lang.String str3 = water1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        java.lang.String str18 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size21, (int) (short) 10);
        double double24 = recipe23.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water32 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str33 = water32.toString();
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water32);
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe35.printPendingOrders();
        java.lang.String str37 = cafe35.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray38 = cafe35.getMenu();
        cafe35.printMenu();
        boolean boolean40 = water32.equals((java.lang.Object) cafe35);
        boolean boolean41 = recipe8.equals((java.lang.Object) cafe35);
        boolean boolean42 = water1.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=100]" + "'", str2, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Water [unit=ML, amount=30]" + "'", str33, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Welcome to Cafe" + "'", str37, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8, true);
        java.lang.String str3 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("", "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        int int2 = coffee0.getAmount();
        java.lang.String str3 = coffee0.toString();
        java.lang.String str4 = coffee0.toString();
        java.lang.String str5 = coffee0.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        cafe7.printPendingOrders();
        java.lang.String str9 = cafe7.greeting();
        boolean boolean10 = coffee0.equals((java.lang.Object) str9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee" + "'", str5, "Coffee");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Welcome to Cafe" + "'", str9, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean7 = recipe6.isReady();
        java.lang.String str8 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        boolean boolean11 = coffee3.equals((java.lang.Object) recipe6);
        boolean boolean12 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = water1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe14.printPendingOrders();
        boolean boolean16 = water1.equals((java.lang.Object) cafe14);
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) ' ', (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean24 = cafe20.addRecipe(recipe23);
        boolean boolean25 = cafe14.addRecipe(recipe23);
        double double26 = recipe23.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Cafe");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Cafe]");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk4);
        java.lang.String str6 = milk4.toString();
        java.lang.String str7 = milk4.toString();
        java.lang.String str8 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type11);
        boolean boolean14 = milk4.equals((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.getName();
        cafe0.printMenu();
        cafe0.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cafe" + "'", str10, "Cafe");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        java.lang.String str8 = cafe3.getName();
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        cafe0.printMenu();
        java.lang.String str5 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=-1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str8 = coffee7.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean10 = coffee7.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type9);
        boolean boolean14 = water3.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type9);
        java.lang.String str17 = milk16.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk" + "'", str17, "Milk");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size10, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        double double19 = recipe12.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        boolean boolean23 = cafe3.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str25 = coffee24.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type26 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean27 = coffee24.equals((java.lang.Object) type26);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup29 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str30 = syrup29.toString();
        boolean boolean31 = coffee24.equals((java.lang.Object) syrup29);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee24);
        java.lang.Object obj33 = null;
        boolean boolean34 = coffee24.equals(obj33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str30, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        boolean boolean8 = recipe4.equals((java.lang.Object) "Milk [unit=ML, amount=30, type=WHOLE]");
        java.lang.String str9 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 35);
        order12.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        boolean boolean11 = cafe0.addRecipe(recipe8);
        java.lang.String str12 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order14 = cafe0.serveOrder();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertNull(order14);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        java.lang.Class<?> wildcardClass6 = cafe0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        java.lang.String str8 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Milk", (double) 1);
        double double12 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        boolean boolean4 = water0.equals((java.lang.Object) "Milk");
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        boolean boolean7 = water0.equals((java.lang.Object) cafe6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe6.placeOrder("Milk [unit=ML, amount=30, type=WHOLE]", "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0", (double) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.getName();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Syrup]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cafe" + "'", str10, "Cafe");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 30, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Welcome to Welcome to hi!", "Milk [unit=ML, amount=30, type=WHOLE]", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException0.getSuppressed();
        java.lang.String str4 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = milk6.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type7);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        java.lang.String str6 = order5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Welcome to Cafe; Paid: 10.0; Paid: 1.0" + "'", str6, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Welcome to Cafe; Paid: 10.0; Paid: 1.0");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=WHOLE]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", 0, (int) (short) 1);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0" + "'", str4, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]]", "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 1.0", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException7 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray8 = cafeOutOfCapacityException7.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException7);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int11 = water10.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException13.getSuppressed();
        boolean boolean17 = water10.equals((java.lang.Object) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException44 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray45 = cafeOutOfCapacityException44.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException44);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException58.getSuppressed();
        recipeNotFoundException57.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException62 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray63 = cafeOutOfCapacityException62.getSuppressed();
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException62);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException65 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray66 = recipeNotFoundException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException65.getSuppressed();
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException70 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException70.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException72.getSuppressed();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException72.getSuppressed();
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) recipeNotFoundException72);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException76 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException76.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException78 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException79 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray80 = recipeNotFoundException79.getSuppressed();
        recipeNotFoundException78.addSuppressed((java.lang.Throwable) recipeNotFoundException79);
        recipeNotFoundException76.addSuppressed((java.lang.Throwable) recipeNotFoundException78);
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) recipeNotFoundException76);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException70);
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray80);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=0, decaf=false]", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Welcome to ; Paid: 10.0", 100.0d);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        java.lang.String str2 = milk1.getName();
        java.lang.String str3 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk" + "'", str2, "Milk");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: ; Paid: 10.0");
        int int2 = syrup1.getAmount();
        java.lang.Class<?> wildcardClass3 = syrup1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 100.0", (int) '#', (int) (short) 1);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=10]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=10]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=10]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean11 = cafe7.addRecipe(recipe10);
        boolean boolean12 = cafe5.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        boolean boolean17 = cafe1.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size20, (int) (short) 10);
        boolean boolean24 = recipe22.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean32 = recipe10.equals((java.lang.Object) order31);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0", (double) 30);
        order35.printReceipt();
        order35.printReceipt();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException7 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray8 = cafeOutOfCapacityException7.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException7);
        java.lang.Throwable[] throwableArray10 = cafeOutOfCapacityException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException11.getSuppressed();
        cafeOutOfCapacityException7.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.Throwable[] throwableArray15 = cafeOutOfCapacityException7.getSuppressed();
        java.lang.String str16 = cafeOutOfCapacityException7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str16, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        double double8 = recipe7.getPrice();
        boolean boolean9 = cafe1.addRecipe(recipe7);
        java.lang.String str10 = recipe7.getName();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) 10.0f);
        boolean boolean4 = recipe2.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30, false);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=30, decaf=false]");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        java.lang.String str15 = milk13.getName();
        java.lang.String str16 = milk13.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk" + "'", str15, "Milk");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk" + "'", str16, "Milk");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = recipe2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        java.lang.String str5 = milk4.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        double double8 = recipe7.getPrice();
        boolean boolean9 = cafe1.addRecipe(recipe7);
        boolean boolean10 = recipe7.isReady();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str5 = syrup4.toString();
        java.lang.String str6 = syrup4.toString();
        boolean boolean7 = coffee2.equals((java.lang.Object) syrup4);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit11 = coffee10.getUnit();
        java.lang.String str12 = coffee10.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee10.getUnit();
        boolean boolean14 = coffee2.equals((java.lang.Object) unit13);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + unit11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean4 = coffee2.equals((java.lang.Object) 10L);
        boolean boolean6 = coffee2.equals((java.lang.Object) (-1.0f));
        java.lang.String str7 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=52, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=52, decaf=true]");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int10 = water9.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException12.getSuppressed();
        boolean boolean16 = water9.equals((java.lang.Object) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException12.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException12.getSuppressed();
        java.lang.String str21 = recipeNotFoundException12.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException10 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray11 = cafeOutOfCapacityException10.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException47.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException53 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException53.getSuppressed();
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException53);
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException57 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray58 = cafeOutOfCapacityException57.getSuppressed();
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException57);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException60.getSuppressed();
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException60.getSuppressed();
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        java.lang.Throwable[] throwableArray66 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        java.lang.String str68 = recipeNotFoundException47.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str68, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        double double8 = recipe7.getPrice();
        boolean boolean9 = cafe1.addRecipe(recipe7);
        cafe1.printPendingOrders();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.Object obj3 = null;
        boolean boolean4 = coffee2.equals(obj3);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=WHOLE]");
        boolean boolean7 = coffee2.equals((java.lang.Object) syrup6);
        java.lang.String str8 = coffee2.toString();
        java.lang.String str9 = coffee2.getName();
        java.lang.Class<?> wildcardClass10 = coffee2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str8, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee" + "'", str9, "Coffee");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        boolean boolean5 = milk2.equals((java.lang.Object) 30);
        java.lang.String str6 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]");
        boolean boolean9 = milk2.equals((java.lang.Object) syrup8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        java.lang.String str14 = cafe13.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe13.getMenu();
        boolean boolean16 = syrup8.equals((java.lang.Object) recipeArray15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=100, type=null]" + "'", str6, "Milk [unit=ML, amount=100, type=null]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0" + "'", str14, "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0");
        org.junit.Assert.assertNotNull(recipeArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=WHOLE]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        java.lang.String str7 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee3.getUnit();
        java.lang.String str9 = coffee3.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size10, 1);
        boolean boolean13 = cafe3.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Milk [unit=ML, amount=-1, type=WHOLE]", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe21.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk26);
        double double28 = recipe21.getPrice();
        boolean boolean29 = recipe21.isReady();
        boolean boolean30 = recipe12.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException10.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        java.lang.String str21 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to ", (double) (short) 100);
        order17.serve();
        order17.serve();
        order17.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        order12.serve();
        java.lang.String str14 = order12.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Water; Paid: 100.0" + "'", str14, "Order: ; For: Water; Paid: 100.0");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(8);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, true);
        boolean boolean6 = water1.equals((java.lang.Object) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=8]" + "'", str2, "Water [unit=ML, amount=8]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (int) (byte) 0, 1);
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0", "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }
}

