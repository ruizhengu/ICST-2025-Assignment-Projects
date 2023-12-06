package uk.ac.sheffield.com1003.cafe.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup2 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str3 = syrup2.toString();
        java.lang.String str4 = syrup2.getName();
        boolean boolean5 = water0.equals((java.lang.Object) syrup2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray9 = tooManyIngredientsException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        boolean boolean17 = water0.equals((java.lang.Object) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe21.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean34 = cafe21.addRecipe(recipe25);
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str39 = recipe25.getName();
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 0L, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        boolean boolean44 = water0.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee46 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
        boolean boolean47 = coffee46.getDecaf();
        boolean boolean48 = water0.equals((java.lang.Object) boolean47);
        java.lang.String str49 = water0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Water [unit=ML, amount=30]" + "'", str49, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        java.lang.String str4 = cafe3.getName();
        int int5 = cafe3.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0", "Water [unit=ML, amount=-1]", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str12 = order11.toString();
        order11.printReceipt();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        order11.serve();
        java.time.LocalDateTime localDateTime16 = order11.getOrderServed();
        boolean boolean17 = coffee2.equals((java.lang.Object) order11);
        java.lang.String str18 = order11.toString();
        order11.printReceipt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]", 52, 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=97]", (double) 0L);
        java.lang.Object obj3 = null;
        boolean boolean4 = recipe2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        cafe0.printMenu();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        java.lang.String str15 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cafe" + "'", str15, "Cafe");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray18 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray19 = cafe3.getOrders();
        java.lang.Class<?> wildcardClass20 = cafe3.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(orderArray18);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type11);
        java.lang.String str13 = milk12.toString();
        int int14 = milk12.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = milk12.getUnit();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str13, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = syrup1.equals((java.lang.Object) order12);
        java.lang.String str14 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = syrup1.getUnit();
        java.lang.Class<?> wildcardClass16 = unit15.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean10 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str11 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException10.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException10.getSuppressed();
        java.lang.String str24 = recipeNotFoundException10.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", 100.0d);
        double double3 = recipe2.getPrice();
        java.lang.String str4 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) 10.0f);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", (double) (short) 0, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        java.time.LocalDateTime localDateTime8 = order7.getOrderServed();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", 10.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, true);
        boolean boolean6 = recipe2.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        java.lang.String str2 = water0.toString();
        java.lang.String str3 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk14);
        boolean boolean16 = recipe8.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str19 = syrup18.getFlavour();
        int int20 = syrup18.getAmount();
        java.lang.String str21 = syrup18.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        boolean boolean23 = cafe5.addRecipe(recipe8);
        java.lang.String str24 = cafe5.getName();
        cafe5.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray27 = cafe5.getOrders();
        java.lang.String str28 = cafe5.greeting();
        boolean boolean29 = water0.equals((java.lang.Object) cafe5);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe5.getMenu();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str21, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cafe" + "'", str24, "Cafe");
        org.junit.Assert.assertNotNull(orderArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Welcome to Cafe" + "'", str28, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(recipeArray30);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        java.lang.String str2 = water1.toString();
        java.lang.Class<?> wildcardClass3 = water1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=0]" + "'", str2, "Water [unit=ML, amount=0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (double) 10, size6, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Water [unit=ML, amount=97]", (double) '4', "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]]");
        order16.serve();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a', false);
        java.lang.String str3 = coffee2.toString();
        boolean boolean4 = coffee2.getDecaf();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        int int4 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        boolean boolean4 = coffee1.getDecaf();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0", (double) 0.0f, size4, 10);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 52.0d, size4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=52]");
        java.lang.String str2 = syrup1.toString();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        java.lang.String str19 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray1 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException5 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = tooManyIngredientsException5.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException8.getSuppressed();
        tooManyIngredientsException5.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException12.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) tooManyIngredientsException12);
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException12.getSuppressed();
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException12);
        java.lang.String str24 = tooManyIngredientsException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe11.serveOrder();
        java.lang.String str13 = cafe11.greeting();
        java.lang.String str14 = cafe11.getName();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe11.serveOrder();
        boolean boolean16 = recipe4.equals((java.lang.Object) cafe11);
        cafe11.printPendingOrders();
        java.lang.String str18 = cafe11.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]", 10.0d);
        boolean boolean22 = cafe11.addRecipe(recipe21);
        // The following exception was thrown during execution in test generation
        try {
            cafe11.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cafe" + "'", str14, "Cafe");
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Syrup", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee24);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup27 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str28 = syrup27.getFlavour();
        java.lang.String str29 = syrup27.toString();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup27);
        java.lang.String str31 = syrup27.getFlavour();
        java.lang.String str32 = syrup27.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str28, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str29, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str31, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str32, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        order6.printReceipt();
        order6.serve();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=SOY]");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean22 = milk14.equals((java.lang.Object) recipe17);
        boolean boolean23 = recipe17.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe24.serveOrder();
        java.lang.String str26 = cafe24.greeting();
        java.lang.String str27 = cafe24.getName();
        uk.ac.sheffield.com1003.cafe.Order order28 = cafe24.serveOrder();
        boolean boolean29 = recipe17.equals((java.lang.Object) cafe24);
        boolean boolean30 = recipe12.equals((java.lang.Object) recipe17);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit33 = coffee32.getUnit();
        java.lang.String str34 = coffee32.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit35 = coffee32.getUnit();
        java.lang.String str36 = coffee32.toString();
        java.lang.Object obj37 = null;
        boolean boolean38 = coffee32.equals(obj37);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee32);
        java.lang.String str40 = coffee32.toString();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to Cafe" + "'", str26, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + unit33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str36, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str40, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        double double15 = recipe7.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type17);
        java.lang.String str19 = milk18.toString();
        boolean boolean21 = milk18.equals((java.lang.Object) 10);
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean26 = coffee25.getDecaf();
        java.lang.String str27 = coffee25.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee30 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit33 = coffee32.getUnit();
        java.lang.String str34 = coffee32.toString();
        java.lang.String str35 = coffee32.toString();
        int int36 = coffee32.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit39 = milk38.getUnit();
        boolean boolean40 = coffee32.equals((java.lang.Object) unit39);
        boolean boolean41 = coffee30.equals((java.lang.Object) unit39);
        boolean boolean42 = coffee25.equals((java.lang.Object) unit39);
        boolean boolean43 = milk18.equals((java.lang.Object) boolean42);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type44 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        boolean boolean45 = milk18.equals((java.lang.Object) type44);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str19, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee" + "'", str27, "Coffee");
        org.junit.Assert.assertTrue("'" + unit33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + unit39 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit39.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type44.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Cafe");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Cafe" + "'", str2, "Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Cafe]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException12.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException19 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        tooManyIngredientsException19.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException26.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) tooManyIngredientsException26);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup37 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str38 = syrup37.getFlavour();
        int int39 = syrup37.getAmount();
        java.lang.String str40 = syrup37.toString();
        java.lang.String str41 = syrup37.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException42 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean43 = syrup37.equals((java.lang.Object) tooManyIngredientsException42);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException44 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException42.addSuppressed((java.lang.Throwable) tooManyIngredientsException44);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException46.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException48 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray49 = tooManyIngredientsException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = tooManyIngredientsException48.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException51.getSuppressed();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        java.lang.Throwable[] throwableArray57 = recipeNotFoundException46.getSuppressed();
        tooManyIngredientsException42.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        java.lang.Throwable[] throwableArray59 = tooManyIngredientsException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException60.getSuppressed();
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException60.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException63 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray64 = tooManyIngredientsException63.getSuppressed();
        java.lang.Throwable[] throwableArray65 = tooManyIngredientsException63.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        tooManyIngredientsException63.addSuppressed((java.lang.Throwable) recipeNotFoundException66);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException69 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException63.addSuppressed((java.lang.Throwable) recipeNotFoundException69);
        recipeNotFoundException60.addSuppressed((java.lang.Throwable) tooManyIngredientsException63);
        java.lang.Throwable[] throwableArray72 = tooManyIngredientsException63.getSuppressed();
        tooManyIngredientsException42.addSuppressed((java.lang.Throwable) tooManyIngredientsException63);
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) tooManyIngredientsException63);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) tooManyIngredientsException63);
        java.lang.String str76 = recipeNotFoundException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str40, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str76, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException23 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException39.getSuppressed();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException39.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        java.lang.String str47 = recipeNotFoundException10.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str47, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (int) (short) 10, 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        int int6 = cafe3.getIndexNextOrderToServe();
        cafe3.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", 8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("", "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean2 = water0.equals((java.lang.Object) (short) -1);
        java.lang.String str3 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        boolean boolean11 = water0.equals((java.lang.Object) milk10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str14 = syrup13.getFlavour();
        int int15 = syrup13.getAmount();
        java.lang.String str16 = syrup13.toString();
        java.lang.String str17 = syrup13.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException18 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean19 = syrup13.equals((java.lang.Object) tooManyIngredientsException18);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) tooManyIngredientsException20);
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        boolean boolean26 = water0.equals((java.lang.Object) recipeNotFoundException23);
        java.lang.String str27 = water0.toString();
        java.lang.String str28 = water0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=30]" + "'", str27, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water [unit=ML, amount=30]" + "'", str28, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.getName();
        java.lang.String str4 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        order6.serve();
        order6.printReceipt();
        order6.printReceipt();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.Class<?> wildcardClass17 = recipe7.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 100.0d, "Milk");
        java.lang.Class<?> wildcardClass20 = order19.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException23 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException34 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray35 = tooManyIngredientsException34.getSuppressed();
        java.lang.Throwable[] throwableArray36 = tooManyIngredientsException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        tooManyIngredientsException34.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException34.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException34);
        java.lang.Throwable[] throwableArray43 = tooManyIngredientsException34.getSuppressed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        order15.serve();
        order15.serve();
        java.time.LocalDateTime localDateTime18 = order15.getOrderServed();
        java.time.LocalDateTime localDateTime19 = order15.getOrderServed();
        java.time.LocalDateTime localDateTime20 = order15.getOrderServed();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", 1.0d);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe3.getOrders();
        java.lang.String str13 = cafe3.greeting();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean18 = cafe3.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (short) 0);
        boolean boolean22 = cafe3.addRecipe(recipe21);
        boolean boolean23 = recipe2.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, true);
        boolean boolean6 = coffee5.getDecaf();
        boolean boolean7 = syrup1.equals((java.lang.Object) coffee5);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = syrup1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        int int6 = coffee1.getAmount();
        boolean boolean8 = coffee1.equals((java.lang.Object) "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type17);
        java.lang.String str19 = milk18.toString();
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        boolean boolean21 = recipe2.equals((java.lang.Object) recipe11);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup23 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str24 = syrup23.getFlavour();
        java.lang.String str25 = syrup23.toString();
        java.lang.String str26 = syrup23.getFlavour();
        java.lang.String str27 = syrup23.getFlavour();
        java.lang.String str28 = syrup23.getName();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup23);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str19, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str24, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str26, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str27, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Syrup" + "'", str28, "Syrup");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) (-1.0f));
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", 52.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=0]", 10.0d, "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = recipe5.isReady();
        double double10 = recipe5.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type19 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type19);
        java.lang.String str21 = milk20.toString();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        boolean boolean24 = coffee2.equals((java.lang.Object) milk20);
        boolean boolean25 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean37 = cafe29.addRecipe(recipe32);
        int int38 = cafe29.getIndexNextOrderToPlace();
        boolean boolean39 = coffee2.equals((java.lang.Object) cafe29);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee41 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit42 = coffee41.getUnit();
        java.lang.String str43 = coffee41.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit44 = coffee41.getUnit();
        java.lang.String str45 = coffee41.toString();
        java.lang.String str46 = coffee41.toString();
        java.lang.String str47 = coffee41.toString();
        boolean boolean48 = coffee41.getDecaf();
        boolean boolean50 = coffee41.equals((java.lang.Object) "Milk");
        java.lang.String str51 = coffee41.getName();
        boolean boolean52 = coffee2.equals((java.lang.Object) coffee41);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water56 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str57 = water56.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type58 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean59 = water56.equals((java.lang.Object) type58);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk60 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type58);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk61 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type58);
        boolean boolean62 = coffee41.equals((java.lang.Object) type58);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + unit42 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit42.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str43, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit44 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit44.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str45, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str46, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str47, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Coffee" + "'", str51, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Water [unit=ML, amount=10]" + "'", str57, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type58 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type58.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type3);
        java.lang.String str7 = milk6.toString();
        java.lang.String str8 = milk6.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=32, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=32, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=32, type=ALMOND]" + "'", str8, "Milk [unit=ML, amount=32, type=ALMOND]");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.printReceipt();
        order11.printReceipt();
        order11.serve();
        order11.serve();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        java.lang.String str5 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray16 = cafe7.getOrders();
        java.lang.String str17 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe18 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean26 = cafe18.addRecipe(recipe21);
        boolean boolean27 = cafe7.addRecipe(recipe21);
        boolean boolean28 = cafe6.addRecipe(recipe21);
        cafe6.printMenu();
        cafe6.printPendingOrders();
        boolean boolean31 = coffee2.equals((java.lang.Object) cafe6);
        java.lang.String str32 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Cafe" + "'", str17, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str32, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double19 = recipe14.getPrice();
        boolean boolean20 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean25 = milk10.equals((java.lang.Object) recipe14);
        java.lang.String str26 = milk10.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean33 = recipe29.isReady();
        double double34 = recipe29.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        boolean boolean38 = milk10.equals((java.lang.Object) 10);
        java.lang.String str39 = milk10.getName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 32.0d + "'", double34 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk" + "'", str39, "Milk");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean22 = milk14.equals((java.lang.Object) recipe17);
        boolean boolean23 = recipe17.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe24.serveOrder();
        java.lang.String str26 = cafe24.greeting();
        java.lang.String str27 = cafe24.getName();
        uk.ac.sheffield.com1003.cafe.Order order28 = cafe24.serveOrder();
        boolean boolean29 = recipe17.equals((java.lang.Object) cafe24);
        boolean boolean30 = recipe12.equals((java.lang.Object) recipe17);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit33 = coffee32.getUnit();
        java.lang.String str34 = coffee32.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit35 = coffee32.getUnit();
        java.lang.String str36 = coffee32.toString();
        java.lang.Object obj37 = null;
        boolean boolean38 = coffee32.equals(obj37);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee32);
        int int40 = coffee32.getAmount();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to Cafe" + "'", str26, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + unit33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str36, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 100, "Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Water [unit=ML, amount=10]", (double) 100.0f, "Milk [unit=ML, amount=0, type=SEMI]");
        java.lang.String str22 = order21.toString();
        java.time.LocalDateTime localDateTime23 = order21.getOrderServed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=10]; Paid: 100.0" + "'", str22, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=10]; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(8);
        java.lang.String str2 = water1.toString();
        int int3 = water1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = milk5.equals((java.lang.Object) recipe8);
        boolean boolean14 = recipe8.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe15.serveOrder();
        java.lang.String str17 = cafe15.greeting();
        java.lang.String str18 = cafe15.getName();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe15.serveOrder();
        boolean boolean20 = recipe8.equals((java.lang.Object) cafe15);
        cafe15.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe15.serveOrder();
        boolean boolean23 = water1.equals((java.lang.Object) cafe15);
        java.lang.String str24 = cafe15.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=8]" + "'", str2, "Water [unit=ML, amount=8]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Cafe" + "'", str17, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cafe" + "'", str18, "Cafe");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cafe" + "'", str24, "Cafe");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Water [unit=ML, amount=-1]", (double) 100L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        double double18 = recipe13.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup20 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException21 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException21.getSuppressed();
        boolean boolean24 = syrup20.equals((java.lang.Object) throwableArray23);
        java.lang.String str25 = syrup20.getFlavour();
        java.lang.String str26 = syrup20.getFlavour();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup20);
        boolean boolean28 = cafe0.addRecipe(recipe13);
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Welcome to Cafe" + "'", str25, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to Cafe" + "'", str26, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray43 = cafe0.getMenu();
        java.lang.String str44 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean48 = cafe0.placeOrder("Welcome to Water [unit=ML, amount=30]", "Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(recipeArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Cafe" + "'", str44, "Cafe");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=52]", (double) 0, "Milk [unit=ML, amount=32, type=SOY]");
        java.lang.String str15 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        cafe0.removeRecipe("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        boolean boolean3 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe4.getOrders();
        java.lang.String str14 = cafe4.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean21 = recipe17.isReady();
        boolean boolean22 = cafe4.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean34 = recipe25.isReady();
        boolean boolean35 = recipe17.equals((java.lang.Object) recipe25);
        java.lang.Class<?> wildcardClass36 = recipe25.getClass();
        boolean boolean37 = coffee2.equals((java.lang.Object) wildcardClass36);
        java.lang.String str38 = coffee2.toString();
        java.lang.String str39 = coffee2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee" + "'", str39, "Coffee");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.toString();
        int int7 = syrup1.getAmount();
        java.lang.String str8 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size8, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size8, 52);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) (byte) 0);
        java.lang.Class<?> wildcardClass20 = order19.getClass();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type1);
        java.lang.String str3 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        java.lang.String str8 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.toString();
        java.lang.String str8 = syrup1.toString();
        java.lang.String str9 = syrup1.getFlavour();
        java.lang.String str10 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type6);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException5 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException5.getSuppressed();
        boolean boolean7 = milk4.equals((java.lang.Object) throwableArray6);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size12, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size12, (int) (short) 1);
        boolean boolean17 = milk4.equals((java.lang.Object) (short) 1);
        java.lang.String str18 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str18, "Milk [unit=ML, amount=0, type=SEMI]");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        int int2 = syrup1.getAmount();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size8, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size8, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) (short) 1, size8, 0);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=35, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=35, decaf=true]");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = syrup1.equals((java.lang.Object) order12);
        java.lang.String str14 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = syrup1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit18 = milk17.getUnit();
        java.lang.String str19 = milk17.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException22 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException22.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        tooManyIngredientsException22.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        boolean boolean29 = milk17.equals((java.lang.Object) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean37 = recipe32.isReady();
        java.lang.String str38 = recipe32.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk40 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        recipe32.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk40);
        boolean boolean42 = milk17.equals((java.lang.Object) milk40);
        boolean boolean43 = syrup1.equals((java.lang.Object) boolean42);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk" + "'", str19, "Milk");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type3);
        java.lang.String str7 = milk6.toString();
        java.lang.String str8 = milk6.getName();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=100, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double11 = recipe6.getPrice();
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient14 = null;
        recipe6.addIngredient(ingredient14);
        boolean boolean16 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str19 = syrup18.getFlavour();
        java.lang.String str20 = syrup18.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str19, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        int int6 = coffee1.getAmount();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str9 = coffee8.toString();
        java.lang.String str10 = coffee8.getName();
        boolean boolean11 = milk1.equals((java.lang.Object) coffee8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean23 = cafe15.addRecipe(recipe18);
        boolean boolean24 = recipe18.isReady();
        boolean boolean25 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 0, "Water [unit=ML, amount=10]");
        boolean boolean30 = coffee8.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe34.printMenu();
        boolean boolean36 = coffee8.equals((java.lang.Object) cafe34);
        java.lang.Class<?> wildcardClass37 = coffee8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean3 = water1.equals((java.lang.Object) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type6);
        boolean boolean9 = water1.equals((java.lang.Object) type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk4.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', false);
        java.lang.String str3 = coffee2.getName();
        java.lang.Class<?> wildcardClass4 = coffee2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        order7.serve();
        java.lang.String str9 = order7.toString();
        order7.printReceipt();
        java.time.LocalDateTime localDateTime11 = order7.getOrderServed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0" + "'", str9, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException9.getSuppressed();
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) tooManyIngredientsException9);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup20 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str21 = syrup20.getFlavour();
        int int22 = syrup20.getAmount();
        java.lang.String str23 = syrup20.toString();
        java.lang.String str24 = syrup20.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean26 = syrup20.equals((java.lang.Object) tooManyIngredientsException25);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException27 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) tooManyIngredientsException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException29.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        java.lang.Throwable[] throwableArray42 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException43.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException46 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray47 = tooManyIngredientsException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = tooManyIngredientsException46.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        tooManyIngredientsException46.addSuppressed((java.lang.Throwable) recipeNotFoundException49);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException46.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException43.addSuppressed((java.lang.Throwable) tooManyIngredientsException46);
        java.lang.Throwable[] throwableArray55 = tooManyIngredientsException46.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) tooManyIngredientsException46);
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) tooManyIngredientsException46);
        java.lang.Throwable[] throwableArray58 = tooManyIngredientsException46.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str23, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray58);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray23 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray24 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray25 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray27 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=97, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(orderArray23);
        org.junit.Assert.assertNotNull(orderArray24);
        org.junit.Assert.assertNotNull(orderArray25);
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertNotNull(recipeArray27);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = cafe5.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe5.getOrders();
        java.lang.String str15 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean22 = recipe18.isReady();
        boolean boolean23 = cafe5.addRecipe(recipe18);
        boolean boolean24 = syrup1.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean33 = cafe25.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray34 = cafe25.getOrders();
        java.lang.String str35 = cafe25.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean42 = recipe38.isReady();
        boolean boolean43 = cafe25.addRecipe(recipe38);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray44 = cafe25.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe47 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order51 = new uk.ac.sheffield.com1003.cafe.Order(recipe47, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean52 = recipe47.isReady();
        java.lang.String str53 = recipe47.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe56 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe56, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type62 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk63 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type62);
        java.lang.String str64 = milk63.toString();
        recipe56.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk63);
        boolean boolean66 = recipe47.equals((java.lang.Object) recipe56);
        boolean boolean67 = cafe25.addRecipe(recipe56);
        java.lang.String str68 = cafe25.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray69 = cafe25.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order70 = cafe25.serveOrder();
        boolean boolean71 = syrup1.equals((java.lang.Object) cafe25);
        java.lang.String str72 = cafe25.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray73 = cafe25.getMenu();
        java.lang.String str74 = cafe25.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(orderArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Cafe" + "'", str35, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(recipeArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str53, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type62.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str64, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Welcome to Cafe" + "'", str68, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray69);
        org.junit.Assert.assertNull(order70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Cafe" + "'", str72, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Cafe" + "'", str74, "Cafe");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=true]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 0, false);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 100L, "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
        double double7 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size6, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=SEMI]", (double) 10, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=ALMOND]", (double) (-1L));
        boolean boolean16 = recipe12.equals((java.lang.Object) "Milk [unit=ML, amount=0, type=ALMOND]");
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (short) 1);
        java.lang.String str20 = recipe12.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str20, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=ALMOND]", 30, (int) (short) 1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 'a');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (-1), "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0" + "'", str3, "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Plain", 32, (int) 'a');
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk", (int) '#', (int) (byte) 10);
        cafe3.printPendingOrders();
        java.lang.String str5 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order11.serve();
        order11.serve();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        java.lang.String str4 = cafe3.greeting();
        cafe3.printMenu();
        java.lang.String str6 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str4, "Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str6, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 10L, size6, (int) (byte) 0);
        double double13 = recipe12.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = cafe17.addRecipe(recipe20);
        int int26 = cafe17.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = null;
        boolean boolean28 = cafe17.addRecipe(recipe27);
        uk.ac.sheffield.com1003.cafe.Order order29 = cafe17.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray30 = cafe17.getOrders();
        boolean boolean31 = recipe12.equals((java.lang.Object) cafe17);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray32 = cafe17.getOrders();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(order29);
        org.junit.Assert.assertNotNull(orderArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(orderArray32);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException10 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        tooManyIngredientsException10.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException10);
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException6.getSuppressed();
        java.lang.Class<?> wildcardClass18 = tooManyIngredientsException6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (double) '4');
        double double3 = recipe2.getPrice();
        double double4 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        java.lang.String str15 = recipe7.getName();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]]", "Order: ; For: Milk [unit=ML, amount=10, type=ALMOND]; Paid: -1.0", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup12);
        boolean boolean14 = recipe4.isReady();
        double double15 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk5.getUnit();
        boolean boolean7 = recipe2.equals((java.lang.Object) milk5);
        java.lang.String str8 = milk5.getName();
        int int9 = milk5.getAmount();
        java.lang.String str10 = milk5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        int int5 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe0.serveOrder();
        java.lang.String str11 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cafe" + "'", str11, "Cafe");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str6 = recipe5.getName();
        boolean boolean7 = recipe5.isReady();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        java.lang.Class<?> wildcardClass11 = order10.getClass();
        boolean boolean12 = coffee2.equals((java.lang.Object) wildcardClass11);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", (-1.0d));
        java.lang.String str3 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str3, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        int int5 = milk4.getAmount();
        java.lang.String str6 = milk4.toString();
        java.lang.String str7 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str6, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type1);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Syrup", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee24);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean27 = coffee26.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = coffee26.getUnit();
        java.lang.String str29 = coffee26.toString();
        boolean boolean30 = coffee24.equals((java.lang.Object) coffee26);
        java.lang.String str31 = coffee26.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) 100, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray36 = cafe35.getOrders();
        boolean boolean37 = coffee26.equals((java.lang.Object) cafe35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str31, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertNotNull(orderArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        order6.printReceipt();
        order6.printReceipt();
        java.lang.String str10 = order6.toString();
        java.time.LocalDateTime localDateTime11 = order6.getOrderServed();
        java.time.LocalDateTime localDateTime12 = order6.getOrderServed();
        java.time.LocalDateTime localDateTime13 = order6.getOrderServed();
        order6.printReceipt();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str10, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = coffee1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 100);
        boolean boolean10 = coffee1.equals((java.lang.Object) order9);
        order9.serve();
        order9.serve();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        int int5 = cafe1.getIndexNextOrderToServe();
        java.lang.String str6 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) (-1L));
        boolean boolean14 = recipe2.isReady();
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str17 = coffee16.getName();
        boolean boolean18 = coffee16.getDecaf();
        boolean boolean19 = coffee16.getDecaf();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee16);
        java.lang.String str21 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=10, decaf=false]", 32.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee" + "'", str17, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 100, "");
        java.lang.String str8 = order7.toString();
        order7.printReceipt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0" + "'", str8, "Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size2, (int) (short) 0);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) 'a', "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.Class<?> wildcardClass10 = recipe4.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Plain");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Plain" + "'", str2, "Welcome to Plain");
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean19 = coffee18.getDecaf();
        java.lang.String str20 = coffee18.getName();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee18);
        int int22 = coffee18.getAmount();
        boolean boolean23 = coffee18.getDecaf();
        boolean boolean24 = coffee18.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee" + "'", str20, "Coffee");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray3);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray23 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=8, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(orderArray23);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size2, (int) (short) 0);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        java.lang.String str9 = coffee8.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = coffee8.getUnit();
        boolean boolean11 = coffee8.getDecaf();
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup2 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str3 = syrup2.toString();
        java.lang.String str4 = syrup2.getName();
        boolean boolean5 = water0.equals((java.lang.Object) syrup2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray9 = tooManyIngredientsException8.getSuppressed();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        boolean boolean17 = water0.equals((java.lang.Object) recipeNotFoundException6);
        java.lang.String str18 = recipeNotFoundException6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str18, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type2);
        java.lang.String str5 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=-1, type=SEMI]");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException9.getSuppressed();
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) tooManyIngredientsException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException21 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        tooManyIngredientsException21.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup31 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str32 = syrup31.getFlavour();
        int int33 = syrup31.getAmount();
        java.lang.String str34 = syrup31.toString();
        java.lang.String str35 = syrup31.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean37 = syrup31.equals((java.lang.Object) tooManyIngredientsException36);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException38 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) tooManyIngredientsException38);
        java.lang.Throwable[] throwableArray40 = tooManyIngredientsException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) tooManyIngredientsException36);
        java.lang.String str45 = tooManyIngredientsException36.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str34, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str45, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=SEMI]", (-1.0d));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        int int4 = cafe0.getIndexNextOrderToServe();
        cafe0.printMenu();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.getName();
        cafe0.printMenu();
        cafe0.printMenu();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        java.lang.String str6 = cafe3.getName();
        int int7 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk5.getUnit();
        boolean boolean7 = recipe2.equals((java.lang.Object) milk5);
        java.lang.String str8 = milk5.getName();
        int int9 = milk5.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe11.serveOrder();
        int int13 = cafe11.getIndexNextOrderToServe();
        cafe11.printMenu();
        boolean boolean15 = milk5.equals((java.lang.Object) cafe11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        java.lang.String str3 = cafe1.greeting();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str3, "Welcome to Water [unit=ML, amount=30]");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", (double) 100L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        int int21 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(order23);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str5 = coffee4.toString();
        boolean boolean6 = water0.equals((java.lang.Object) coffee4);
        java.lang.Object obj7 = null;
        boolean boolean8 = coffee4.equals(obj7);
        boolean boolean10 = coffee4.equals((java.lang.Object) "Order: ; For: Milk [unit=ML, amount=10, type=ALMOND]; Paid: -1.0");
        java.lang.String str11 = coffee4.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        boolean boolean14 = recipe2.equals((java.lang.Object) unit13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        boolean boolean17 = recipe2.equals((java.lang.Object) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str20 = syrup19.getFlavour();
        int int21 = syrup19.getAmount();
        java.lang.String str22 = syrup19.toString();
        java.lang.String str23 = syrup19.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean25 = syrup19.equals((java.lang.Object) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) tooManyIngredientsException26);
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException24.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException30 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException35.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException40.getSuppressed();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        cafeOutOfCapacityException30.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException46.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException48 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray49 = tooManyIngredientsException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = tooManyIngredientsException48.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException51.getSuppressed();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        java.lang.Throwable[] throwableArray57 = recipeNotFoundException46.getSuppressed();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException46.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        java.lang.String str60 = recipeNotFoundException46.toString();
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str22, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str60, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double19 = recipe14.getPrice();
        boolean boolean20 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean25 = milk10.equals((java.lang.Object) recipe14);
        int int26 = milk10.getAmount();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        java.lang.String str43 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size50 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size50, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size50, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe56 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size50, (int) 'a');
        boolean boolean57 = cafe0.addRecipe(recipe56);
        uk.ac.sheffield.com1003.cafe.Order order61 = new uk.ac.sheffield.com1003.cafe.Order(recipe56, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) 100.0f, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str62 = recipe56.getName();
        java.lang.String str63 = recipe56.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to Cafe" + "'", str43, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size50 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size50.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10);
        boolean boolean2 = coffee1.getDecaf();
        boolean boolean3 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=10, type=ALMOND]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=ALMOND]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=ALMOND]]");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean8 = recipe2.isReady();
        java.lang.Object obj9 = null;
        boolean boolean10 = recipe2.equals(obj9);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        boolean boolean17 = recipe2.equals((java.lang.Object) recipeNotFoundException14);
        java.lang.String str18 = recipeNotFoundException14.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str18, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        java.lang.String str4 = cafe1.greeting();
        int int5 = cafe1.getIndexNextOrderToPlace();
        int int6 = cafe1.getIndexNextOrderToPlace();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe1.serveOrder();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk0 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        java.lang.String str4 = milk3.toString();
        int int5 = milk3.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk3.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str14 = order13.toString();
        order13.printReceipt();
        java.time.LocalDateTime localDateTime16 = order13.getOrderServed();
        order13.printReceipt();
        boolean boolean18 = milk3.equals((java.lang.Object) order13);
        boolean boolean19 = milk0.equals((java.lang.Object) boolean18);
        java.lang.String str20 = milk0.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str4, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str20, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        order20.printReceipt();
        order20.serve();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type5);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order9.serve();
        java.time.LocalDateTime localDateTime11 = order9.getOrderServed();
        java.time.LocalDateTime localDateTime12 = order9.getOrderServed();
        java.time.LocalDateTime localDateTime13 = order9.getOrderServed();
        java.lang.String str14 = order9.toString();
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str2, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 100.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int6 = coffee5.getAmount();
        java.lang.String str7 = coffee5.toString();
        java.lang.String str8 = coffee5.toString();
        boolean boolean9 = recipe2.equals((java.lang.Object) str8);
        double double10 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str13 = coffee12.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean21 = coffee12.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = coffee12.getUnit();
        java.lang.String str24 = coffee12.toString();
        boolean boolean25 = coffee12.getDecaf();
        java.lang.String str26 = coffee12.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Plain");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Coffee [unit=GR, amount=32, decaf=false]", "Water [unit=ML, amount=32]", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        boolean boolean6 = coffee2.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        boolean boolean7 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee2.getUnit();
        java.lang.String str9 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        java.lang.String str7 = milk6.getName();
        java.lang.String str8 = milk6.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk" + "'", str7, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str8, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str3 = water2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean5 = water2.equals((java.lang.Object) type4);
        java.lang.Object obj6 = null;
        boolean boolean7 = water2.equals(obj6);
        java.lang.Object obj8 = null;
        boolean boolean9 = water2.equals(obj8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe11.serveOrder();
        int int13 = cafe11.getIndexNextOrderToServe();
        boolean boolean14 = water2.equals((java.lang.Object) int13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean23 = cafe15.addRecipe(recipe18);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray24 = cafe15.getOrders();
        java.lang.String str25 = cafe15.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean32 = recipe28.isReady();
        boolean boolean33 = cafe15.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray34 = cafe15.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean42 = recipe37.isReady();
        java.lang.String str43 = recipe37.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe46 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe46, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type52 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk53 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type52);
        java.lang.String str54 = milk53.toString();
        recipe46.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk53);
        boolean boolean56 = recipe37.equals((java.lang.Object) recipe46);
        boolean boolean57 = cafe15.addRecipe(recipe46);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray58 = cafe15.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray59 = cafe15.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray60 = cafe15.getMenu();
        boolean boolean61 = water2.equals((java.lang.Object) recipeArray60);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type64 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk65 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type64);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk66 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type64);
        boolean boolean67 = water2.equals((java.lang.Object) type64);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk68 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1, type64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=10]" + "'", str3, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(orderArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Welcome to Cafe" + "'", str25, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(recipeArray34);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str43, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type52 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type52.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str54, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(recipeArray58);
        org.junit.Assert.assertNotNull(recipeArray59);
        org.junit.Assert.assertNotNull(recipeArray60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type64.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=-1]]");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=35, decaf=true]");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", 0, (int) (short) 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        int int7 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray19 = cafe0.getOrders();
        int int20 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean8 = recipe4.isReady();
        double double9 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order13.serve();
        boolean boolean15 = water1.equals((java.lang.Object) order13);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = water1.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean24 = recipe19.isReady();
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Water [unit=ML, amount=52]", (double) (short) 100);
        boolean boolean28 = water1.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        int int2 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = recipe5.isReady();
        java.lang.String str11 = recipe5.getName();
        boolean boolean12 = recipe5.isReady();
        boolean boolean13 = recipe5.isReady();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0", (double) (short) -1);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Water [unit=ML, amount=1]", 1.0d);
        boolean boolean20 = milk1.equals((java.lang.Object) recipe5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        int int2 = syrup1.getAmount();
        java.lang.String str3 = syrup1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee2.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = coffee6.getUnit();
        java.lang.String str8 = coffee6.toString();
        java.lang.String str9 = coffee6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type11);
        boolean boolean13 = coffee6.equals((java.lang.Object) milk12);
        java.lang.String str14 = milk12.toString();
        java.lang.String str15 = milk12.toString();
        boolean boolean16 = coffee2.equals((java.lang.Object) milk12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException20.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) tooManyIngredientsException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray37 = tooManyIngredientsException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException47.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException50 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray51 = tooManyIngredientsException50.getSuppressed();
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) tooManyIngredientsException50);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) tooManyIngredientsException50);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException56 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray57 = tooManyIngredientsException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = tooManyIngredientsException56.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        tooManyIngredientsException56.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException62 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException56.addSuppressed((java.lang.Throwable) recipeNotFoundException62);
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException62);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException65 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray66 = recipeNotFoundException65.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException67 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray68 = tooManyIngredientsException67.getSuppressed();
        java.lang.Throwable[] throwableArray69 = tooManyIngredientsException67.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException70 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException70.getSuppressed();
        tooManyIngredientsException67.addSuppressed((java.lang.Throwable) recipeNotFoundException70);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException73 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException67.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        recipeNotFoundException65.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        tooManyIngredientsException50.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        boolean boolean78 = coffee2.equals((java.lang.Object) tooManyIngredientsException50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str14, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str15, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        java.lang.String str7 = milk6.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 100, (int) (short) 1);
        boolean boolean12 = milk6.equals((java.lang.Object) "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk" + "'", str7, "Milk");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Plain");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        int int3 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe14.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient27 = null;
        recipe14.addIngredient(ingredient27);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Coffee [unit=GR, amount=10, decaf=false]", 0.0d);
        java.lang.Class<?> wildcardClass32 = recipe14.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Coffee [unit=GR, amount=10, decaf=false]", (double) 10L, "Milk [unit=ML, amount=32, type=ALMOND]");
        order4.serve();
        java.time.LocalDateTime localDateTime6 = order4.getOrderServed();
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        boolean boolean13 = recipe6.equals((java.lang.Object) 10L);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        java.lang.String str17 = order16.toString();
        java.time.LocalDateTime localDateTime18 = order16.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0" + "'", str17, "Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0");
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str18 = cafe17.greeting();
        java.lang.String str19 = cafe17.greeting();
        java.lang.String str20 = cafe17.getName();
        java.lang.String str21 = cafe17.greeting();
        cafe17.printPendingOrders();
        cafe17.printPendingOrders();
        boolean boolean24 = recipe2.equals((java.lang.Object) cafe17);
        java.lang.String str25 = cafe17.getName();
        int int26 = cafe17.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        boolean boolean17 = recipe2.isReady();
        double double18 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean27 = cafe19.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray28 = cafe19.getOrders();
        java.lang.String str29 = cafe19.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe30 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean38 = cafe30.addRecipe(recipe33);
        boolean boolean39 = cafe19.addRecipe(recipe33);
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100.0f);
        order42.serve();
        boolean boolean44 = recipe2.equals((java.lang.Object) order42);
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]", 52.0d, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to ; Paid: 10.0");
        order48.printReceipt();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(orderArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Welcome to Cafe" + "'", str29, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) '4', 1);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException11 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException14 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray15 = tooManyIngredientsException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException12.getSuppressed();
        cafeOutOfCapacityException11.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException29 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray30 = tooManyIngredientsException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException40 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray41 = tooManyIngredientsException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = tooManyIngredientsException40.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        tooManyIngredientsException40.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException40.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException27.getSuppressed();
        java.lang.String str56 = recipeNotFoundException27.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str56, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=1, decaf=false]; Paid: 1.0", (double) 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (byte) -1);
        double double19 = recipe4.getPrice();
        double double20 = recipe4.getPrice();
        double double21 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str9 = coffee8.toString();
        java.lang.String str10 = coffee8.getName();
        boolean boolean11 = milk1.equals((java.lang.Object) coffee8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str16 = cafe15.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str23 = recipe19.getName();
        boolean boolean24 = cafe15.addRecipe(recipe19);
        boolean boolean25 = milk1.equals((java.lang.Object) boolean24);
        int int26 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        boolean boolean30 = coffee29.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe31 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean39 = cafe31.addRecipe(recipe34);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray40 = cafe31.getOrders();
        java.lang.String str41 = cafe31.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe44 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe44, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean48 = recipe44.isReady();
        boolean boolean49 = cafe31.addRecipe(recipe44);
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean61 = recipe52.isReady();
        boolean boolean62 = recipe44.equals((java.lang.Object) recipe52);
        java.lang.Class<?> wildcardClass63 = recipe52.getClass();
        boolean boolean64 = coffee29.equals((java.lang.Object) wildcardClass63);
        int int65 = coffee29.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe66 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe69 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order73 = new uk.ac.sheffield.com1003.cafe.Order(recipe69, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean74 = cafe66.addRecipe(recipe69);
        uk.ac.sheffield.com1003.cafe.Cafe cafe75 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe78 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order82 = new uk.ac.sheffield.com1003.cafe.Order(recipe78, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean83 = cafe75.addRecipe(recipe78);
        boolean boolean84 = cafe66.addRecipe(recipe78);
        boolean boolean85 = recipe78.isReady();
        boolean boolean86 = coffee29.equals((java.lang.Object) boolean85);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water88 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str89 = water88.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type90 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean91 = water88.equals((java.lang.Object) type90);
        java.lang.Object obj92 = null;
        boolean boolean93 = water88.equals(obj92);
        java.lang.Object obj94 = null;
        boolean boolean95 = water88.equals(obj94);
        boolean boolean96 = coffee29.equals(obj94);
        boolean boolean97 = milk1.equals((java.lang.Object) boolean96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str16, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(orderArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Welcome to Cafe" + "'", str41, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Water [unit=ML, amount=10]" + "'", str89, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type90 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type90.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str9 = coffee8.toString();
        java.lang.String str10 = coffee8.getName();
        boolean boolean11 = milk1.equals((java.lang.Object) coffee8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean23 = cafe15.addRecipe(recipe18);
        boolean boolean24 = recipe18.isReady();
        boolean boolean25 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 0, "Water [unit=ML, amount=10]");
        boolean boolean30 = coffee8.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe34.printMenu();
        boolean boolean36 = coffee8.equals((java.lang.Object) cafe34);
        int int37 = cafe34.getIndexNextOrderToServe();
        java.lang.String str38 = cafe34.greeting();
        java.lang.String str39 = cafe34.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = cafe34.placeOrder("Milk [unit=ML, amount=100, type=WHOLE]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Welcome to Welcome to Cafe" + "'", str38, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Welcome to Cafe" + "'", str39, "Welcome to Cafe");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order12.serve();
        order12.serve();
        order12.printReceipt();
        boolean boolean16 = milk6.equals((java.lang.Object) order12);
        java.time.LocalDateTime localDateTime17 = order12.getOrderServed();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        int int7 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = null;
        boolean boolean9 = cafe1.addRecipe(recipe8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        int int12 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean20 = recipe15.isReady();
        java.lang.String str21 = recipe15.getName();
        boolean boolean22 = cafe0.addRecipe(recipe15);
        double double23 = recipe15.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe27 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean28 = milk25.equals((java.lang.Object) cafe27);
        java.lang.Object obj29 = null;
        boolean boolean30 = milk25.equals(obj29);
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk25);
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order33 = cafe32.serveOrder();
        cafe32.printPendingOrders();
        java.lang.String str35 = cafe32.greeting();
        uk.ac.sheffield.com1003.cafe.Order order36 = cafe32.serveOrder();
        cafe32.printMenu();
        int int38 = cafe32.getIndexNextOrderToServe();
        cafe32.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray40 = cafe32.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray41 = cafe32.getMenu();
        boolean boolean42 = milk25.equals((java.lang.Object) cafe32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(order33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Cafe" + "'", str35, "Welcome to Cafe");
        org.junit.Assert.assertNull(order36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(recipeArray40);
        org.junit.Assert.assertNotNull(recipeArray41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str10 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 1);
        boolean boolean14 = cafe0.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", 0.0d, "Water [unit=ML, amount=8]");
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe14.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean28 = coffee27.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean37 = cafe29.addRecipe(recipe32);
        uk.ac.sheffield.com1003.cafe.Cafe cafe38 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean46 = cafe38.addRecipe(recipe41);
        boolean boolean47 = cafe29.addRecipe(recipe41);
        int int48 = cafe29.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray49 = cafe29.getMenu();
        boolean boolean50 = coffee27.equals((java.lang.Object) cafe29);
        boolean boolean51 = recipe18.equals((java.lang.Object) cafe29);
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe54, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean59 = recipe54.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type62 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk63 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type62);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk64 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type62);
        recipe54.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk64);
        double double66 = recipe54.getPrice();
        boolean boolean67 = cafe29.addRecipe(recipe54);
        int int68 = cafe29.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = cafe29.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", "Welcome to Milk [unit=ML, amount=97, type=WHOLE]", (double) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(recipeArray49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type62.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        boolean boolean9 = recipe2.isReady();
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0", (double) (short) -1);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SEMI]", (double) 8, "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        java.lang.Class<?> wildcardClass18 = order17.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        cafe3.printPendingOrders();
        java.lang.Class<?> wildcardClass5 = cafe3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        java.lang.String str8 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean16 = recipe11.isReady();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str21 = order20.toString();
        order20.printReceipt();
        boolean boolean23 = water0.equals((java.lang.Object) order20);
        java.lang.String str24 = water0.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str21, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 52);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean6 = coffee4.equals((java.lang.Object) (byte) -1);
        boolean boolean8 = coffee4.equals((java.lang.Object) '4');
        boolean boolean9 = recipe2.equals((java.lang.Object) boolean8);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100);
        boolean boolean12 = coffee11.getDecaf();
        boolean boolean13 = coffee11.getDecaf();
        java.lang.String str14 = coffee11.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Cafe; Paid: -1.0", (double) (byte) 1);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Cafe; Paid: -1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Cafe; Paid: -1.0" + "'", str2, "Order: ; For: Cafe; Paid: -1.0");
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup3.getUnit();
        boolean boolean5 = water1.equals((java.lang.Object) syrup3);
        java.lang.String str6 = syrup3.getName();
        java.lang.String str7 = syrup3.getFlavour();
        int int8 = syrup3.getAmount();
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup" + "'", str6, "Syrup");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean19 = coffee18.getDecaf();
        java.lang.String str20 = coffee18.getName();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee18);
        int int22 = coffee18.getAmount();
        java.lang.String str23 = coffee18.toString();
        java.lang.Class<?> wildcardClass24 = coffee18.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee" + "'", str20, "Coffee");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order9 = cafe0.serveOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ', true);
        boolean boolean3 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        boolean boolean22 = water1.equals((java.lang.Object) tooManyIngredientsException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) tooManyIngredientsException26);
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException23.getSuppressed();
        java.lang.String str37 = recipeNotFoundException23.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str37, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        java.lang.String str9 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0", (double) 0.0f, size14, 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", (double) (byte) -1, size14, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Welcome to Water [unit=ML, amount=-1]", (double) (-1));
        boolean boolean22 = recipe2.equals((java.lang.Object) order21);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean29 = recipe25.isReady();
        double double30 = recipe25.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        double double35 = recipe25.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Water [unit=ML, amount=-1]", (double) 'a', "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
        boolean boolean40 = recipe2.equals((java.lang.Object) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 32.0d + "'", double35 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str2, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str3, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.getName();
        boolean boolean2 = coffee0.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee0.getUnit();
        java.lang.String str4 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee" + "'", str1, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup3.getUnit();
        boolean boolean5 = water1.equals((java.lang.Object) syrup3);
        java.lang.String str6 = syrup3.getName();
        java.lang.String str7 = syrup3.toString();
        java.lang.String str8 = syrup3.getFlavour();
        java.lang.String str9 = syrup3.toString();
        java.lang.String str10 = syrup3.toString();
        int int11 = syrup3.getAmount();
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup" + "'", str6, "Syrup");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str10, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean11 = coffee10.getDecaf();
        boolean boolean12 = coffee10.getDecaf();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException13 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray14 = cafeOutOfCapacityException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = cafeOutOfCapacityException13.getSuppressed();
        boolean boolean16 = coffee10.equals((java.lang.Object) throwableArray15);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str5 = coffee4.toString();
        boolean boolean6 = water0.equals((java.lang.Object) coffee4);
        java.lang.Object obj7 = null;
        boolean boolean8 = coffee4.equals(obj7);
        int int9 = coffee4.getAmount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee2.getUnit();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        java.lang.String str43 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray44 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order45 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        int int47 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray48 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray49 = cafe0.getMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to Cafe" + "'", str43, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray44);
        org.junit.Assert.assertNull(order45);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(recipeArray48);
        org.junit.Assert.assertNotNull(recipeArray49);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type11);
        java.lang.String str13 = milk12.toString();
        int int14 = milk12.getAmount();
        java.lang.String str15 = milk12.toString();
        java.lang.String str16 = milk12.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str13, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str15, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str16, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) (-1L));
        order13.serve();
        order13.printReceipt();
        java.lang.String str16 = order13.toString();
        order13.serve();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Cafe; Paid: -1.0" + "'", str16, "Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.getName();
        java.lang.String str5 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
        boolean boolean8 = coffee7.getDecaf();
        java.lang.Class<?> wildcardClass9 = coffee7.getClass();
        boolean boolean10 = syrup1.equals((java.lang.Object) coffee7);
        java.lang.String str11 = coffee7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) 1L, size6, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size9, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean17 = cafe3.addRecipe(recipe13);
        java.lang.String str18 = recipe13.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Cafe" + "'", str4, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe14.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Plain", (double) 8);
        java.lang.String str30 = recipe18.getName();
        double double31 = recipe18.getPrice();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException11 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException14 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray15 = tooManyIngredientsException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException12.getSuppressed();
        cafeOutOfCapacityException11.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException12.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException29 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray30 = tooManyIngredientsException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException29.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException40 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray41 = tooManyIngredientsException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = tooManyIngredientsException40.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        tooManyIngredientsException40.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException40.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException27.getSuppressed();
        java.lang.String str54 = recipeNotFoundException27.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str54, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        boolean boolean19 = recipe10.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee21 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean23 = coffee21.equals((java.lang.Object) (byte) -1);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee21);
        java.lang.String str25 = coffee21.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str30 = cafe29.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str37 = recipe33.getName();
        boolean boolean38 = cafe29.addRecipe(recipe33);
        int int39 = cafe29.getIndexNextOrderToServe();
        boolean boolean40 = coffee21.equals((java.lang.Object) cafe29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str30, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str37, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str18 = water17.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type19 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean20 = water17.equals((java.lang.Object) type19);
        boolean boolean21 = recipe2.equals((java.lang.Object) water17);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = water17.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = water17.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit24 = water17.getUnit();
        java.lang.String str25 = water17.toString();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=10]" + "'", str18, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=10]" + "'", str25, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        int int5 = milk1.getAmount();
        java.lang.String str6 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str12 = cafe11.greeting();
        boolean boolean13 = milk9.equals((java.lang.Object) cafe11);
        int int14 = cafe11.getIndexNextOrderToPlace();
        boolean boolean15 = milk1.equals((java.lang.Object) cafe11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 1);
        java.time.LocalDateTime localDateTime23 = order22.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", (double) 52);
        java.lang.String str25 = recipe10.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order32.serve();
        boolean boolean34 = recipe10.equals((java.lang.Object) order32);
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe35.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order37 = cafe35.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order38 = cafe35.serveOrder();
        boolean boolean39 = recipe10.equals((java.lang.Object) order38);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(recipeArray36);
        org.junit.Assert.assertNull(order37);
        org.junit.Assert.assertNull(order38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str5, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        int int12 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = null;
        boolean boolean14 = cafe3.addRecipe(recipe13);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray16 = cafe3.getMenu();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(recipeArray16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk", 8, 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        cafe3.printMenu();
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray43 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray44 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe47 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order51 = new uk.ac.sheffield.com1003.cafe.Order(recipe47, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean52 = cafe0.addRecipe(recipe47);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup54 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]");
        boolean boolean55 = recipe47.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(recipeArray43);
        org.junit.Assert.assertNotNull(recipeArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        cafe0.printPendingOrders();
        int int4 = cafe0.getIndexNextOrderToPlace();
        int int5 = cafe0.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        boolean boolean5 = coffee1.equals((java.lang.Object) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean14 = cafe6.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray15 = cafe6.getOrders();
        java.lang.String str16 = cafe6.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = cafe17.addRecipe(recipe20);
        boolean boolean26 = cafe6.addRecipe(recipe20);
        boolean boolean27 = coffee1.equals((java.lang.Object) cafe6);
        int int28 = cafe6.getIndexNextOrderToServe();
        int int29 = cafe6.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        int int21 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        java.lang.String str23 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray24 = cafe1.getMenu();
        cafe1.printMenu();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray24);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(97, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = milk8.getUnit();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException6 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException7.getSuppressed();
        cafeOutOfCapacityException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        java.lang.Throwable[] throwableArray20 = cafeOutOfCapacityException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str23 = syrup22.getFlavour();
        int int24 = syrup22.getAmount();
        java.lang.String str25 = syrup22.toString();
        java.lang.String str26 = syrup22.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException27 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean28 = syrup22.equals((java.lang.Object) tooManyIngredientsException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException42 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray43 = tooManyIngredientsException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = tooManyIngredientsException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        tooManyIngredientsException42.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException48 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException42.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException54 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray55 = tooManyIngredientsException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = tooManyIngredientsException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        java.lang.Throwable[] throwableArray63 = recipeNotFoundException52.getSuppressed();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        java.lang.Throwable[] throwableArray68 = recipeNotFoundException66.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException69 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray70 = recipeNotFoundException69.getSuppressed();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException69.getSuppressed();
        recipeNotFoundException66.addSuppressed((java.lang.Throwable) recipeNotFoundException69);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) recipeNotFoundException69);
        tooManyIngredientsException27.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        cafeOutOfCapacityException6.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=52]", (double) 0, "Milk [unit=ML, amount=32, type=SOY]");
        java.lang.String str15 = order14.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: Water [unit=ML, amount=52]; Paid: 0.0" + "'", str15, "Order: ; For: Water [unit=ML, amount=52]; Paid: 0.0");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        java.lang.String str5 = milk4.toString();
        int int6 = milk4.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe8.getOrders();
        cafe8.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray11 = cafe8.getOrders();
        java.lang.String str12 = cafe8.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe8.getMenu();
        boolean boolean14 = milk4.equals((java.lang.Object) cafe8);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str12, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printPendingOrders();
        int int5 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double10 = recipe5.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = coffee15.getUnit();
        java.lang.String str17 = coffee15.toString();
        java.lang.String str18 = coffee15.toString();
        int int19 = coffee15.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = milk21.getUnit();
        boolean boolean23 = coffee15.equals((java.lang.Object) unit22);
        boolean boolean24 = coffee13.equals((java.lang.Object) unit22);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee13);
        boolean boolean26 = cafe0.addRecipe(recipe5);
        java.lang.String str27 = cafe0.getName();
        cafe0.printMenu();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water6.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe8.addRecipe(recipe11);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray17 = cafe8.getOrders();
        java.lang.String str18 = cafe8.greeting();
        boolean boolean19 = water6.equals((java.lang.Object) str18);
        java.lang.String str20 = water6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str23 = syrup22.getFlavour();
        boolean boolean24 = water6.equals((java.lang.Object) str23);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water6);
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean34 = cafe26.addRecipe(recipe29);
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean43 = cafe35.addRecipe(recipe38);
        boolean boolean44 = cafe26.addRecipe(recipe38);
        boolean boolean45 = water6.equals((java.lang.Object) cafe26);
        java.lang.String str46 = water6.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe48 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int49 = cafe48.getIndexNextOrderToServe();
        java.lang.String str50 = cafe48.getName();
        boolean boolean51 = water6.equals((java.lang.Object) cafe48);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(orderArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=52]" + "'", str20, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Water [unit=ML, amount=52]" + "'", str46, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str50, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=ALMOND]", (int) ' ', (int) (short) 10);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str4, "Milk [unit=ML, amount=0, type=ALMOND]");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk", 52, (int) (short) 100);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size9, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", 32.0d, size9, (int) (short) 0);
        boolean boolean14 = cafe3.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a', true);
        // The following exception was thrown during execution in test generation
        try {
            recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee17);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk" + "'", str4, "Milk");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe1.getOrders();
        java.lang.String str8 = cafe1.greeting();
        java.lang.String str9 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to " + "'", str8, "Welcome to ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to " + "'", str9, "Welcome to ");
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee]", 10, 0);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        int int6 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup3.getUnit();
        boolean boolean5 = water1.equals((java.lang.Object) syrup3);
        java.lang.String str6 = syrup3.getName();
        java.lang.String str7 = syrup3.toString();
        java.lang.String str8 = syrup3.getFlavour();
        java.lang.String str9 = syrup3.getFlavour();
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup" + "'", str6, "Syrup");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str9, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe11.serveOrder();
        java.lang.String str13 = cafe11.greeting();
        java.lang.String str14 = cafe11.getName();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe11.serveOrder();
        boolean boolean16 = recipe4.equals((java.lang.Object) cafe11);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = milk21.getUnit();
        boolean boolean23 = coffee19.equals((java.lang.Object) milk21);
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean30 = recipe26.isReady();
        double double31 = recipe26.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Order: ; For: ; Paid: 100.0", (double) (short) 100);
        java.time.LocalDateTime localDateTime35 = order34.getOrderServed();
        boolean boolean36 = coffee19.equals((java.lang.Object) localDateTime35);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        double double38 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cafe" + "'", str14, "Cafe");
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
        org.junit.Assert.assertNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 32.0d + "'", double38 == 32.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.serve();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type3);
        java.lang.String str7 = milk6.toString();
        java.lang.String str8 = milk6.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=8, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=8, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=8, type=ALMOND]" + "'", str8, "Milk [unit=ML, amount=8, type=ALMOND]");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean15 = recipe6.isReady();
        boolean boolean16 = syrup3.equals((java.lang.Object) recipe6);
        java.lang.String str17 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Water [unit=ML, amount=30]", (double) (-1L));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee23 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean24 = coffee23.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int28 = coffee27.getAmount();
        boolean boolean29 = coffee23.equals((java.lang.Object) int28);
        java.lang.String str30 = coffee23.getName();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee23);
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) (byte) 1);
        boolean boolean35 = water1.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee" + "'", str30, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException10.getSuppressed();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException10.getSuppressed();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        java.lang.String str24 = tooManyIngredientsException8.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f, size10, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 100L, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]", (double) (short) 0, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]", (double) (-1), size10, 52);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        int int5 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        java.lang.String str8 = coffee1.getName();
        boolean boolean9 = coffee1.getDecaf();
        java.lang.String str10 = coffee1.toString();
        java.lang.Object obj11 = null;
        boolean boolean12 = coffee1.equals(obj11);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee" + "'", str8, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a', false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee2.getUnit();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=100, type=ALMOND]");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        java.lang.Object obj11 = null;
        boolean boolean12 = water1.equals(obj11);
        int int13 = water1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 1);
        java.lang.String str10 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean14 = recipe2.equals((java.lang.Object) true);
        java.lang.String str15 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        java.lang.String str7 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double15 = recipe10.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup17 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean29 = recipe20.isReady();
        boolean boolean30 = syrup17.equals((java.lang.Object) recipe20);
        java.lang.String str31 = recipe20.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk33 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        boolean boolean34 = recipe20.equals((java.lang.Object) milk33);
        java.lang.String str35 = milk33.toString();
        boolean boolean36 = recipe10.equals((java.lang.Object) str35);
        boolean boolean37 = cafe1.addRecipe(recipe10);
        java.lang.String str38 = cafe1.getName();
        int int39 = cafe1.getIndexNextOrderToPlace();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray41 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str31, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str35, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cafe" + "'", str38, "Cafe");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(recipeArray41);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.getName();
        boolean boolean7 = milk4.equals((java.lang.Object) coffee5);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee5.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str7 = syrup6.getFlavour();
        java.lang.String str8 = syrup6.getFlavour();
        boolean boolean9 = milk4.equals((java.lang.Object) syrup6);
        int int10 = milk4.getAmount();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str12 = milk10.toString();
        boolean boolean13 = coffee1.equals((java.lang.Object) str12);
        java.lang.String str14 = coffee1.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee" + "'", str14, "Coffee");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (byte) -1);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        int int10 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=10]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.printReceipt();
        order11.printReceipt();
        order11.serve();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=null]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk5.getUnit();
        boolean boolean7 = recipe2.equals((java.lang.Object) milk5);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str12 = order11.toString();
        order11.printReceipt();
        order11.serve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0; Paid: 10.0" + "'", str12, "Order: ; For: Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0; Paid: 10.0");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        java.lang.Object obj5 = null;
        boolean boolean6 = water1.equals(obj5);
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", (double) (-1L));
        java.lang.String str10 = recipe9.getName();
        boolean boolean11 = water1.equals((java.lang.Object) str10);
        int int12 = water1.getAmount();
        java.lang.String str13 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=52]" + "'", str10, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=10]" + "'", str13, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee7.getUnit();
        java.lang.String str9 = coffee7.toString();
        java.lang.String str10 = coffee7.toString();
        int int11 = coffee7.getAmount();
        boolean boolean13 = coffee7.equals((java.lang.Object) 0.0d);
        boolean boolean14 = milk4.equals((java.lang.Object) coffee7);
        boolean boolean15 = coffee7.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        boolean boolean19 = coffee18.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean28 = cafe20.addRecipe(recipe23);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray29 = cafe20.getOrders();
        java.lang.String str30 = cafe20.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean37 = recipe33.isReady();
        boolean boolean38 = cafe20.addRecipe(recipe33);
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order49 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean50 = recipe41.isReady();
        boolean boolean51 = recipe33.equals((java.lang.Object) recipe41);
        java.lang.Class<?> wildcardClass52 = recipe41.getClass();
        boolean boolean53 = coffee18.equals((java.lang.Object) wildcardClass52);
        boolean boolean54 = coffee7.equals((java.lang.Object) coffee18);
        boolean boolean55 = coffee18.getDecaf();
        boolean boolean56 = coffee18.getDecaf();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(orderArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Welcome to Cafe" + "'", str30, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type6);
        boolean boolean8 = coffee1.equals((java.lang.Object) milk7);
        java.lang.String str9 = milk7.toString();
        java.lang.String str10 = milk7.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order17.printReceipt();
        order17.printReceipt();
        order17.printReceipt();
        java.lang.String str21 = order17.toString();
        java.time.LocalDateTime localDateTime22 = order17.getOrderServed();
        java.time.LocalDateTime localDateTime23 = order17.getOrderServed();
        java.time.LocalDateTime localDateTime24 = order17.getOrderServed();
        java.time.LocalDateTime localDateTime25 = order17.getOrderServed();
        java.lang.String str26 = order17.toString();
        boolean boolean27 = milk7.equals((java.lang.Object) str26);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str9, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str10, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str21, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertNull(localDateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str26, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException13 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = tooManyIngredientsException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        tooManyIngredientsException13.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException20.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) tooManyIngredientsException20);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException32 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        tooManyIngredientsException32.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.getName();
        java.lang.String str4 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=32, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100);
        boolean boolean2 = coffee1.getDecaf();
        boolean boolean3 = coffee1.getDecaf();
        boolean boolean4 = coffee1.getDecaf();
        boolean boolean5 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", 0, 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException15 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException15.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        tooManyIngredientsException15.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException15.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException13.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException13 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = tooManyIngredientsException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        tooManyIngredientsException13.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException13.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException23.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException40.getSuppressed();
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        java.lang.String str45 = recipeNotFoundException40.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str45, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        int int5 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = milk11.getUnit();
        java.lang.Class<?> wildcardClass14 = milk11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.time.LocalDateTime localDateTime10 = order9.getOrderServed();
        order9.printReceipt();
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1));
        java.lang.String str2 = coffee1.toString();
        int int3 = coffee1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.getName();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0", "Order: ; For: Cafe; Paid: -1.0", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        boolean boolean12 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Coffee]", 100.0d);
        java.lang.String str16 = order15.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee]; Paid: 100.0" + "'", str16, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee]; Paid: 100.0");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; For: ; Paid: 100.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) -1, "Milk");
        double double9 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=35, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", 10.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.getName();
        boolean boolean7 = milk4.equals((java.lang.Object) coffee5);
        java.lang.String str8 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str8, "Milk [unit=ML, amount=0, type=SEMI]");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean22 = milk14.equals((java.lang.Object) recipe17);
        boolean boolean23 = recipe17.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe24.serveOrder();
        java.lang.String str26 = cafe24.greeting();
        java.lang.String str27 = cafe24.getName();
        uk.ac.sheffield.com1003.cafe.Order order28 = cafe24.serveOrder();
        boolean boolean29 = recipe17.equals((java.lang.Object) cafe24);
        boolean boolean30 = recipe12.equals((java.lang.Object) recipe17);
        double double31 = recipe17.getPrice();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to Cafe" + "'", str26, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 32.0d + "'", double31 == 32.0d);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        java.lang.String str5 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray16 = cafe7.getOrders();
        java.lang.String str17 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe18 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean26 = cafe18.addRecipe(recipe21);
        boolean boolean27 = cafe7.addRecipe(recipe21);
        boolean boolean28 = cafe6.addRecipe(recipe21);
        cafe6.printMenu();
        cafe6.printPendingOrders();
        boolean boolean31 = coffee2.equals((java.lang.Object) cafe6);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray32 = cafe6.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order33 = cafe6.serveOrder();
        int int34 = cafe6.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(orderArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Cafe" + "'", str17, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(recipeArray32);
        org.junit.Assert.assertNull(order33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=10, decaf=true]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.Class<?> wildcardClass3 = syrup1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Milk [unit=ML, amount=10, type=ALMOND]", "Coffee [unit=GR, amount=8, decaf=true]", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (-1L), size8, 1);
        boolean boolean17 = recipe16.isReady();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str8 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size13, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size13, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean21 = cafe7.addRecipe(recipe17);
        boolean boolean22 = cafe1.addRecipe(recipe17);
        boolean boolean23 = recipe17.isReady();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Welcome to Cafe" + "'", str8, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) (byte) 0);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        java.lang.String str7 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to ", (double) 10, "Coffee");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str14 = coffee13.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean22 = coffee13.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup24 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str25 = syrup24.toString();
        boolean boolean26 = coffee13.equals((java.lang.Object) str25);
        java.lang.String str27 = coffee13.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean37 = milk29.equals((java.lang.Object) recipe32);
        boolean boolean38 = recipe32.isReady();
        java.lang.String str39 = recipe32.getName();
        boolean boolean40 = coffee13.equals((java.lang.Object) recipe32);
        double double41 = recipe32.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Coffee [unit=GR, amount=-1, decaf=false]", 0.0d);
        java.lang.String str45 = order44.toString();
        boolean boolean46 = recipe2.equals((java.lang.Object) order44);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 32.0d + "'", double41 == 32.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0" + "'", str45, "Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        java.lang.String str11 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", 10.0d);
        java.time.LocalDateTime localDateTime15 = order14.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.String str7 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        java.lang.Object obj5 = null;
        boolean boolean6 = milk1.equals(obj5);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size11, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size11, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean19 = milk1.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=52]", (int) (short) 10, 1);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe3.getOrders();
        java.lang.String str13 = cafe3.greeting();
        boolean boolean14 = water1.equals((java.lang.Object) str13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str17 = milk16.toString();
        java.lang.String str18 = milk16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = milk16.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type21 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type21);
        boolean boolean23 = milk16.equals((java.lang.Object) milk22);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup25 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit26 = syrup25.getUnit();
        boolean boolean27 = milk16.equals((java.lang.Object) syrup25);
        boolean boolean28 = water1.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str17, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str18, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + unit26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Order: ; For: Cafe; Paid: -1.0", "Syrup [unit=ML, amount=10, flavour=Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException]", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = cafe1.addRecipe(recipe4);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe1.getOrders();
        java.lang.String str11 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe12 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean20 = cafe12.addRecipe(recipe15);
        boolean boolean21 = cafe1.addRecipe(recipe15);
        boolean boolean22 = cafe0.addRecipe(recipe15);
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray24 = cafe0.getOrders();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(orderArray24);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        int int11 = cafe0.getIndexNextOrderToServe();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water14 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type15 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean16 = water14.equals((java.lang.Object) type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type15);
        java.lang.String str18 = milk17.toString();
        int int19 = milk17.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str26 = recipe22.getName();
        java.lang.String str27 = recipe22.getName();
        boolean boolean28 = milk17.equals((java.lang.Object) recipe22);
        boolean boolean29 = cafe0.addRecipe(recipe22);
        java.lang.String str30 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str18, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cafe" + "'", str30, "Cafe");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type2);
        java.lang.String str5 = milk4.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        java.lang.String str19 = recipe10.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup21 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=1, decaf=true]");
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup21);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=32, decaf=false]", (double) (-1), "Milk [unit=ML, amount=10, type=SOY]");
        order26.serve();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=52, decaf=false]", 32.0d);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, true);
        boolean boolean6 = coffee5.getDecaf();
        boolean boolean7 = syrup1.equals((java.lang.Object) coffee5);
        java.lang.String str8 = syrup1.getFlavour();
        java.lang.String str9 = syrup1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=10, type=SOY]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=SOY]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=SOY]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=SOY]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=SOY]]");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        order6.printReceipt();
        order6.printReceipt();
        java.lang.String str10 = order6.toString();
        order6.serve();
        order6.printReceipt();
        java.time.LocalDateTime localDateTime13 = order6.getOrderServed();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str10, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", (double) 100);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) 0.0f);
        boolean boolean9 = coffee1.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        java.lang.Object obj5 = null;
        boolean boolean6 = recipe4.equals(obj5);
        boolean boolean7 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean23 = milk15.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type25 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type25);
        java.lang.String str27 = milk26.toString();
        int int28 = milk26.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = milk26.getUnit();
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk26);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water31 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str32 = water31.toString();
        java.lang.String str33 = water31.toString();
        java.lang.String str34 = water31.toString();
        boolean boolean35 = milk26.equals((java.lang.Object) water31);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water31);
        java.lang.String str37 = water31.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit38 = water31.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str27, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water [unit=ML, amount=30]" + "'", str32, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Water [unit=ML, amount=30]" + "'", str33, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water [unit=ML, amount=30]" + "'", str34, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Water [unit=ML, amount=30]" + "'", str37, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit38 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit38.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=52, decaf=false]", (int) '4', 0);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = milk8.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe11.serveOrder();
        java.lang.String str13 = cafe11.greeting();
        boolean boolean14 = milk8.equals((java.lang.Object) str13);
        java.lang.String str15 = milk8.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type24 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type24);
        java.lang.String str26 = milk25.toString();
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk25);
        double double28 = recipe18.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        boolean boolean33 = recipe18.isReady();
        double double34 = recipe18.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean43 = cafe35.addRecipe(recipe38);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray44 = cafe35.getOrders();
        java.lang.String str45 = cafe35.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe46 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order53 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean54 = cafe46.addRecipe(recipe49);
        boolean boolean55 = cafe35.addRecipe(recipe49);
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100.0f);
        order58.serve();
        boolean boolean60 = recipe18.equals((java.lang.Object) order58);
        boolean boolean61 = milk8.equals((java.lang.Object) order58);
        int int62 = milk8.getAmount();
        java.lang.String str63 = milk8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk" + "'", str15, "Milk");
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str26, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(orderArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Welcome to Cafe" + "'", str45, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 32 + "'", int62 == 32);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str63, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = syrup1.getFlavour();
        java.lang.String str16 = syrup1.getName();
        java.lang.String str17 = syrup1.getName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup" + "'", str16, "Syrup");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup" + "'", str17, "Syrup");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        int int4 = cafe1.getIndexNextOrderToPlace();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = coffee1.equals((java.lang.Object) str13);
        java.lang.String str15 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = milk17.equals((java.lang.Object) recipe20);
        boolean boolean26 = recipe20.isReady();
        java.lang.String str27 = recipe20.getName();
        boolean boolean28 = coffee1.equals((java.lang.Object) recipe20);
        double double29 = recipe20.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Coffee [unit=GR, amount=-1, decaf=false]", 0.0d);
        java.lang.String str33 = order32.toString();
        order32.serve();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 32.0d + "'", double29 == 32.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0" + "'", str33, "Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        boolean boolean22 = water1.equals((java.lang.Object) tooManyIngredientsException16);
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int25 = cafe24.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe24.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray27 = cafe24.getMenu();
        boolean boolean28 = water1.equals((java.lang.Object) recipeArray27);
        java.lang.String str29 = water1.toString();
        int int30 = water1.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe32.printPendingOrders();
        java.lang.String str34 = cafe32.greeting();
        cafe32.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order36 = cafe32.serveOrder();
        cafe32.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray38 = cafe32.getOrders();
        int int39 = cafe32.getIndexNextOrderToServe();
        boolean boolean40 = water1.equals((java.lang.Object) int39);
        java.lang.String str41 = water1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertNotNull(recipeArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str29, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Welcome to " + "'", str34, "Welcome to ");
        org.junit.Assert.assertNull(order36);
        org.junit.Assert.assertNotNull(orderArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str41, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee7.getUnit();
        java.lang.String str9 = coffee7.toString();
        java.lang.String str10 = coffee7.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type12 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type12);
        boolean boolean14 = coffee7.equals((java.lang.Object) milk13);
        java.lang.String str15 = milk13.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]; Paid: 10.0", (double) 100L, "Cafe");
        order20.printReceipt();
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str15, "Milk [unit=ML, amount=-1, type=null]");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type1);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        java.lang.String str8 = order6.toString();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        boolean boolean18 = cafe0.addRecipe(recipe12);
        int int19 = cafe0.getIndexNextOrderToPlace();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean29 = cafe21.addRecipe(recipe24);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray30 = cafe21.getOrders();
        java.lang.String str31 = cafe21.greeting();
        cafe21.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean36 = cafe21.addRecipe(recipe35);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk45 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe39.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk45);
        boolean boolean47 = recipe35.equals((java.lang.Object) recipe39);
        boolean boolean48 = cafe0.addRecipe(recipe39);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100.0f, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Milk [unit=ML, amount=0, type=ALMOND]", 0.0d, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]");
        boolean boolean57 = recipe39.isReady();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(orderArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException15 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException15.getSuppressed();
        boolean boolean18 = syrup14.equals((java.lang.Object) throwableArray17);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        java.lang.String str20 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) 0.0f, "Milk [unit=ML, amount=-1, type=null]");
        java.time.LocalDateTime localDateTime25 = order24.getOrderServed();
        order24.serve();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        int int5 = cafe1.getIndexNextOrderToServe();
        int int6 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe1.getOrders();
        cafe1.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(orderArray7);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        cafe1.printMenu();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(orderArray3);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.printReceipt();
        order11.printReceipt();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=WHOLE]");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        java.lang.String str15 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe3.serveOrder();
        int int17 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str12 = milk10.toString();
        boolean boolean13 = coffee1.equals((java.lang.Object) str12);
        boolean boolean14 = coffee1.getDecaf();
        boolean boolean15 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit18 = water17.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean27 = cafe19.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray28 = cafe19.getOrders();
        java.lang.String str29 = cafe19.greeting();
        boolean boolean30 = water17.equals((java.lang.Object) str29);
        java.lang.String str31 = water17.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee34 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean35 = coffee34.getDecaf();
        boolean boolean36 = water17.equals((java.lang.Object) coffee34);
        java.lang.String str37 = coffee34.toString();
        boolean boolean38 = coffee1.equals((java.lang.Object) coffee34);
        boolean boolean39 = coffee34.getDecaf();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(orderArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Welcome to Cafe" + "'", str29, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=52]" + "'", str31, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str37, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 100, "");
        java.time.LocalDateTime localDateTime8 = order7.getOrderServed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToPlace();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        java.lang.String str8 = cafe3.greeting();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Water [unit=ML, amount=-1]" + "'", str8, "Welcome to Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=32, type=WHOLE]", 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        cafe3.printPendingOrders();
        cafe3.printMenu();
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size11, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size11, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size11, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Cafe; Paid: -1.0", 97.0d, size11, (int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup21 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str22 = syrup21.getName();
        java.lang.String str23 = syrup21.toString();
        java.lang.String str24 = syrup21.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean33 = cafe25.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray34 = cafe25.getOrders();
        java.lang.String str35 = cafe25.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean42 = recipe38.isReady();
        boolean boolean43 = cafe25.addRecipe(recipe38);
        boolean boolean44 = syrup21.equals((java.lang.Object) recipe38);
        recipe19.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup21);
        boolean boolean46 = cafe1.addRecipe(recipe19);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Syrup" + "'", str22, "Syrup");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str23, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Syrup" + "'", str24, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(orderArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Cafe" + "'", str35, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        boolean boolean4 = coffee1.getDecaf();
        java.lang.String str5 = coffee1.toString();
        java.lang.String str6 = coffee1.toString();
        java.lang.String str7 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean3 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int7 = coffee6.getAmount();
        boolean boolean8 = coffee2.equals((java.lang.Object) int7);
        boolean boolean9 = coffee2.getDecaf();
        java.lang.String str10 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str5 = syrup4.getFlavour();
        int int6 = syrup4.getAmount();
        java.lang.String str7 = syrup4.toString();
        java.lang.String str8 = syrup4.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean10 = syrup4.equals((java.lang.Object) tooManyIngredientsException9);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) tooManyIngredientsException11);
        boolean boolean13 = coffee2.equals((java.lang.Object) tooManyIngredientsException9);
        java.lang.String str14 = coffee2.toString();
        boolean boolean15 = coffee2.getDecaf();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=35, decaf=true]" + "'", str14, "Coffee [unit=GR, amount=35, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        order15.serve();
        order15.serve();
        java.time.LocalDateTime localDateTime18 = order15.getOrderServed();
        order15.printReceipt();
        java.time.LocalDateTime localDateTime20 = order15.getOrderServed();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.greeting();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type3);
        java.lang.String str6 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = coffee8.getUnit();
        java.lang.String str10 = coffee8.toString();
        java.lang.String str11 = coffee8.toString();
        int int12 = coffee8.getAmount();
        boolean boolean14 = coffee8.equals((java.lang.Object) 0.0d);
        boolean boolean15 = milk5.equals((java.lang.Object) coffee8);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water19 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str20 = water19.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type21 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean22 = water19.equals((java.lang.Object) type21);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type21);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type21);
        boolean boolean25 = coffee8.equals((java.lang.Object) type21);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type21);
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str30 = recipe29.getName();
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 100, "");
        boolean boolean35 = milk26.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=10]" + "'", str20, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type6);
        boolean boolean8 = coffee1.equals((java.lang.Object) milk7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe10.getMenu();
        boolean boolean12 = coffee1.equals((java.lang.Object) recipeArray11);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water6.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe8.addRecipe(recipe11);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray17 = cafe8.getOrders();
        java.lang.String str18 = cafe8.greeting();
        boolean boolean19 = water6.equals((java.lang.Object) str18);
        java.lang.String str20 = water6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str23 = syrup22.getFlavour();
        boolean boolean24 = water6.equals((java.lang.Object) str23);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water6);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=32, decaf=false]", (double) 97, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(orderArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=52]" + "'", str20, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        java.lang.String str2 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; For: ; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=8, type=ALMOND]");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 0L, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        order25.printReceipt();
        java.time.LocalDateTime localDateTime27 = order25.getOrderServed();
        order25.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNull(localDateTime27);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size2, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type7);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException10 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException10.getSuppressed();
        boolean boolean12 = milk9.equals((java.lang.Object) throwableArray11);
        boolean boolean13 = recipe4.equals((java.lang.Object) boolean12);
        double double14 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Welcome to Water [unit=ML, amount=30]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 1.0", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        java.lang.Class<?> wildcardClass6 = cafe3.getClass();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type4);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        java.lang.String str18 = cafe9.getName();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe9.serveOrder();
        boolean boolean20 = milk8.equals((java.lang.Object) cafe9);
        cafe9.printPendingOrders();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cafe" + "'", str18, "Cafe");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=true]", (double) (short) 10);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double11 = recipe6.getPrice();
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) recipe6);
        java.lang.String str14 = water1.toString();
        int int15 = water1.getAmount();
        java.lang.String str16 = water1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str14, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str16, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type16 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type16);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type16);
        java.lang.String str19 = milk18.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe22.serveOrder();
        boolean boolean24 = milk18.equals((java.lang.Object) cafe22);
        java.lang.String str25 = cafe22.getName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str19, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        cafe0.printMenu();
        int int6 = cafe0.getIndexNextOrderToServe();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray9 = cafe0.getMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertNotNull(recipeArray9);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        java.lang.String str8 = order6.toString();
        order6.printReceipt();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        double double14 = recipe2.getPrice();
        boolean boolean15 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe1.serveOrder();
        int int24 = cafe1.getIndexNextOrderToServe();
        java.lang.String str25 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray26 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray27 = cafe1.getOrders();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray26);
        org.junit.Assert.assertNotNull(orderArray27);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.getName();
        boolean boolean2 = coffee0.getDecaf();
        boolean boolean3 = coffee0.getDecaf();
        java.lang.String str4 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee" + "'", str1, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        int int6 = cafe3.getIndexNextOrderToPlace();
        int int7 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str15 = cafe14.greeting();
        java.lang.String str16 = cafe14.greeting();
        java.lang.String str17 = cafe14.getName();
        java.lang.String str18 = cafe14.greeting();
        boolean boolean19 = recipe2.equals((java.lang.Object) cafe14);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean24 = milk21.equals((java.lang.Object) cafe23);
        java.lang.Object obj25 = null;
        boolean boolean26 = milk21.equals(obj25);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        java.lang.String str28 = milk21.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Cafe" + "'", str17, "Cafe");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str28, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        java.time.LocalDateTime localDateTime22 = order21.getOrderServed();
        java.lang.String str23 = order21.toString();
        order21.printReceipt();
        order21.serve();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0" + "'", str23, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=1]");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee3.getUnit();
        java.lang.String str5 = coffee3.toString();
        java.lang.String str6 = coffee3.toString();
        int int7 = coffee3.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = milk9.getUnit();
        boolean boolean11 = coffee3.equals((java.lang.Object) unit10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean13 = coffee3.equals((java.lang.Object) size12);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=WHOLE]", (double) 1, size12, 0);
        boolean boolean16 = recipe15.isReady();
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        boolean boolean14 = recipe2.equals((java.lang.Object) unit13);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 1, "Coffee [unit=GR, amount=1, decaf=true]");
        order18.printReceipt();
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe10.addRecipe(recipe13);
        boolean boolean19 = recipe13.isReady();
        boolean boolean20 = milk6.equals((java.lang.Object) recipe13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = milk22.getUnit();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk22);
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type33 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type33);
        java.lang.String str35 = milk34.toString();
        recipe27.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Coffee [unit=GR, amount=52, decaf=false]", 0.0d);
        boolean boolean40 = milk22.equals((java.lang.Object) order39);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size49 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe51 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size49, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe53 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size49, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe55 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size49, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe57 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 32, size49, (int) (byte) 100);
        boolean boolean58 = milk22.equals((java.lang.Object) recipe57);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str35, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + size49 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size49.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        java.lang.String str20 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray21 = cafe0.getMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray21);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (short) 0);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=true]", (double) 'a', "");
        boolean boolean8 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        double double15 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (byte) -1);
        java.lang.String str19 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]; Paid: 52.0", (double) '#', "Milk [unit=ML, amount=10, type=ALMOND]");
        order23.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray23 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray24 = cafe1.getMenu();
        int int25 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(orderArray23);
        org.junit.Assert.assertNotNull(recipeArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=false]", (double) 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=SEMI]", (int) (byte) 10, 100);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        java.lang.String str8 = coffee1.getName();
        java.lang.String str9 = coffee1.getName();
        java.lang.String str10 = coffee1.getName();
        boolean boolean11 = coffee1.getDecaf();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee" + "'", str8, "Coffee");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee" + "'", str9, "Coffee");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        int int6 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException6.getSuppressed();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException6.getSuppressed();
        java.lang.String str10 = recipeNotFoundException6.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) 100, (int) (short) 10);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=8, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 100);
        java.lang.String str9 = order8.toString();
        boolean boolean10 = water1.equals((java.lang.Object) str9);
        java.lang.String str11 = water1.toString();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0" + "'", str9, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=0]" + "'", str11, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = null;
        boolean boolean21 = cafe0.addRecipe(recipe20);
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.getName();
        int int4 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        boolean boolean17 = recipe9.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str20 = syrup19.getFlavour();
        int int21 = syrup19.getAmount();
        java.lang.String str22 = syrup19.toString();
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup19);
        boolean boolean24 = cafe6.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 1);
        boolean boolean28 = recipe9.isReady();
        boolean boolean29 = cafe1.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe31 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean39 = cafe31.addRecipe(recipe34);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray40 = cafe31.getOrders();
        java.lang.String str41 = cafe31.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe44 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe44, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean48 = recipe44.isReady();
        boolean boolean49 = cafe31.addRecipe(recipe44);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe44, "Syrup", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee55 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        recipe44.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee55);
        boolean boolean57 = cafe1.addRecipe(recipe44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str22, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(recipeArray30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(orderArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Welcome to Cafe" + "'", str41, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        java.lang.String str7 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        cafe0.printPendingOrders();
        java.lang.String str4 = cafe0.greeting();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        order6.printReceipt();
        java.lang.String str9 = order6.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str9, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type9);
        boolean boolean11 = water0.equals((java.lang.Object) milk10);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException15 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException15.getSuppressed();
        boolean boolean18 = syrup14.equals((java.lang.Object) throwableArray17);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        java.lang.String str20 = recipe2.getName();
        java.lang.String str21 = recipe2.getName();
        boolean boolean22 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        boolean boolean18 = recipe10.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup20 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str21 = syrup20.getFlavour();
        int int22 = syrup20.getAmount();
        java.lang.String str23 = syrup20.toString();
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup20);
        boolean boolean25 = cafe7.addRecipe(recipe10);
        boolean boolean26 = cafe1.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Cafe", 0.0d, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        java.time.LocalDateTime localDateTime31 = order30.getOrderServed();
        java.time.LocalDateTime localDateTime32 = order30.getOrderServed();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str23, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(localDateTime31);
        org.junit.Assert.assertNull(localDateTime32);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe5.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe5.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException26.addSuppressed((java.lang.Throwable) recipeNotFoundException32);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) tooManyIngredientsException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException35.getSuppressed();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        boolean boolean40 = recipe9.equals((java.lang.Object) recipeNotFoundException23);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        java.lang.String str42 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str42, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe10.addRecipe(recipe13);
        boolean boolean19 = recipe13.isReady();
        boolean boolean20 = milk6.equals((java.lang.Object) recipe13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        boolean boolean24 = milk22.equals((java.lang.Object) (-1L));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100);
        boolean boolean27 = milk22.equals((java.lang.Object) (byte) 100);
        java.lang.String str28 = milk22.toString();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk22);
        java.lang.String str30 = milk22.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order35 = cafe34.serveOrder();
        int int36 = cafe34.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray37 = cafe34.getOrders();
        boolean boolean38 = milk22.equals((java.lang.Object) orderArray37);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str28, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk" + "'", str30, "Milk");
        org.junit.Assert.assertNull(order35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(orderArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException10 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        tooManyIngredientsException10.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException19 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        tooManyIngredientsException19.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException19.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException28 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException29.getSuppressed();
        cafeOutOfCapacityException28.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException29.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException46 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray47 = tooManyIngredientsException46.getSuppressed();
        java.lang.Throwable[] throwableArray48 = tooManyIngredientsException46.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        tooManyIngredientsException46.addSuppressed((java.lang.Throwable) recipeNotFoundException49);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException46.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException57 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray58 = tooManyIngredientsException57.getSuppressed();
        java.lang.Throwable[] throwableArray59 = tooManyIngredientsException57.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException60.getSuppressed();
        tooManyIngredientsException57.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException57.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException44.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        java.lang.Throwable[] throwableArray69 = recipeNotFoundException44.getSuppressed();
        java.lang.Throwable[] throwableArray70 = recipeNotFoundException44.getSuppressed();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        java.lang.Throwable[] throwableArray72 = tooManyIngredientsException8.getSuppressed();
        java.lang.String str73 = tooManyIngredientsException8.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str73, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) 10, size2, (int) (short) 10);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee14 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str15 = coffee14.toString();
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee14);
        java.lang.String str17 = coffee14.toString();
        java.lang.String str18 = coffee14.getName();
        java.lang.String str19 = coffee14.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee" + "'", str18, "Coffee");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee" + "'", str19, "Coffee");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        java.lang.String str21 = cafe1.greeting();
        int int22 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe1.getMenu();
        java.lang.String str24 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray25 = cafe1.getMenu();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(recipeArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cafe" + "'", str24, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray25);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        java.lang.String str5 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = water1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=10]" + "'", str5, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        java.lang.String str21 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray22 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe1.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray22);
        org.junit.Assert.assertNull(order23);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        int int5 = milk4.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk4.getUnit();
        java.lang.String str7 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup14);
        boolean boolean19 = cafe1.addRecipe(recipe4);
        java.lang.String str20 = cafe1.getName();
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray23 = cafe1.getOrders();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe1.serveOrder();
        cafe1.printMenu();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(orderArray23);
        org.junit.Assert.assertNull(order25);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size4, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, (int) '#');
        java.lang.String str9 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Water", (double) (byte) 0, "Syrup [unit=ML, amount=10, flavour=]");
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Plain", (double) 1.0f, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=8, type=SOY]", (-1.0d));
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type1);
        java.lang.String str3 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean12 = recipe8.isReady();
        double double13 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order17.serve();
        boolean boolean19 = water5.equals((java.lang.Object) order17);
        boolean boolean20 = milk2.equals((java.lang.Object) order17);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean28 = recipe23.isReady();
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean33 = milk2.equals((java.lang.Object) "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean42 = cafe34.addRecipe(recipe37);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray43 = cafe34.getOrders();
        java.lang.String str44 = cafe34.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe47 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe47, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean51 = recipe47.isReady();
        boolean boolean52 = cafe34.addRecipe(recipe47);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray53 = cafe34.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe56 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe56, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean61 = recipe56.isReady();
        java.lang.String str62 = recipe56.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe65 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order69 = new uk.ac.sheffield.com1003.cafe.Order(recipe65, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type71 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk72 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type71);
        java.lang.String str73 = milk72.toString();
        recipe65.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk72);
        boolean boolean75 = recipe56.equals((java.lang.Object) recipe65);
        boolean boolean76 = cafe34.addRecipe(recipe65);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray77 = cafe34.getMenu();
        boolean boolean78 = milk2.equals((java.lang.Object) cafe34);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str3, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(orderArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Welcome to Cafe" + "'", str44, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(recipeArray53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str62, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type71.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str73, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(recipeArray77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        java.lang.String str43 = cafe0.getName();
        java.lang.String str44 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Cafe" + "'", str43, "Cafe");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Welcome to Cafe" + "'", str44, "Welcome to Cafe");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        java.lang.String str6 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        boolean boolean18 = cafe0.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean41 = recipe22.equals((java.lang.Object) recipe31);
        boolean boolean42 = cafe0.addRecipe(recipe31);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray43 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray44 = cafe0.getMenu();
        java.lang.String str45 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = cafe0.placeOrder("Coffee [unit=GR, amount=100, decaf=false]", "Order: ; For: Syrup; Paid: 0.0", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(recipeArray43);
        org.junit.Assert.assertNotNull(recipeArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Cafe" + "'", str45, "Cafe");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(orderArray7);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=8, type=SOY]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        cafe1.printPendingOrders();
        cafe1.printMenu();
        cafe1.printPendingOrders();
        int int5 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = cafe11.addRecipe(recipe14);
        boolean boolean20 = cafe0.addRecipe(recipe14);
        boolean boolean21 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Coffee [unit=GR, amount=-1, decaf=true]", (double) 100L, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        order25.printReceipt();
        order25.printReceipt();
        order25.serve();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size6, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type14 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type14);
        java.lang.String str16 = milk15.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water18 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean25 = recipe21.isReady();
        double double26 = recipe21.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order30.serve();
        boolean boolean32 = water18.equals((java.lang.Object) order30);
        boolean boolean33 = milk15.equals((java.lang.Object) order30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean41 = recipe36.isReady();
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean46 = milk15.equals((java.lang.Object) "Water [unit=ML, amount=30]");
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee49 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str50 = coffee49.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe53 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order57 = new uk.ac.sheffield.com1003.cafe.Order(recipe53, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean58 = coffee49.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup60 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str61 = syrup60.toString();
        boolean boolean62 = coffee49.equals((java.lang.Object) str61);
        boolean boolean63 = coffee49.getDecaf();
        boolean boolean64 = coffee49.getDecaf();
        boolean boolean65 = milk15.equals((java.lang.Object) boolean64);
        uk.ac.sheffield.com1003.cafe.Recipe recipe68 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order71 = new uk.ac.sheffield.com1003.cafe.Order(recipe68, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str72 = recipe68.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe75 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order79 = new uk.ac.sheffield.com1003.cafe.Order(recipe75, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str80 = order79.toString();
        order79.printReceipt();
        order79.printReceipt();
        boolean boolean83 = recipe68.equals((java.lang.Object) order79);
        java.lang.String str84 = order79.toString();
        java.time.LocalDateTime localDateTime85 = order79.getOrderServed();
        order79.serve();
        boolean boolean87 = milk15.equals((java.lang.Object) order79);
        int int88 = milk15.getAmount();
        java.lang.Class<?> wildcardClass89 = milk15.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str16, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str50, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str61, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str72, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str80, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str84, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        order15.serve();
        order15.serve();
        java.time.LocalDateTime localDateTime18 = order15.getOrderServed();
        java.time.LocalDateTime localDateTime19 = order15.getOrderServed();
        order15.printReceipt();
        java.lang.String str21 = order15.toString();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0" + "'", str21, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str12 = order11.toString();
        boolean boolean13 = milk1.equals((java.lang.Object) order11);
        java.lang.String str14 = order11.toString();
        order11.serve();
        order11.printReceipt();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str12, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str14, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printMenu();
        int int2 = cafe0.getIndexNextOrderToServe();
        java.lang.String str3 = cafe0.getName();
        int int4 = cafe0.getIndexNextOrderToServe();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        java.time.LocalDateTime localDateTime22 = order21.getOrderServed();
        java.lang.String str23 = order21.toString();
        java.time.LocalDateTime localDateTime24 = order21.getOrderServed();
        order21.serve();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0" + "'", str23, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        boolean boolean22 = water1.equals((java.lang.Object) tooManyIngredientsException16);
        java.lang.String str23 = water1.toString();
        java.lang.String str24 = water1.toString();
        java.lang.String str25 = water1.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str23, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str24, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water" + "'", str25, "Water");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.serve();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        order6.printReceipt();
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean12 = water10.equals((java.lang.Object) type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type11);
        java.lang.String str14 = milk13.toString();
        boolean boolean15 = recipe2.equals((java.lang.Object) milk13);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=97, decaf=false]", (double) 52);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type21 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type21);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type21);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup25 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit26 = syrup25.getUnit();
        java.lang.String str27 = syrup25.toString();
        java.lang.String str28 = syrup25.getFlavour();
        java.lang.String str29 = syrup25.getName();
        boolean boolean30 = milk23.equals((java.lang.Object) syrup25);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup25);
        java.lang.String str32 = syrup25.getName();
        java.lang.String str33 = syrup25.toString();
        java.lang.String str34 = syrup25.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + unit26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str27, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str28, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Syrup" + "'", str29, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup" + "'", str32, "Syrup");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str33, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", (int) 'a', 52);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Water [unit=ML, amount=10]" + "'", str4, "Welcome to Water [unit=ML, amount=10]");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.getFlavour();
        java.lang.String str8 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException10.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException27 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = tooManyIngredientsException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        tooManyIngredientsException27.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException27.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) tooManyIngredientsException27);
        java.lang.Throwable[] throwableArray36 = tooManyIngredientsException27.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk39 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit40 = milk39.getUnit();
        java.lang.String str41 = milk39.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException44 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray45 = tooManyIngredientsException44.getSuppressed();
        java.lang.Throwable[] throwableArray46 = tooManyIngredientsException44.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        tooManyIngredientsException44.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        boolean boolean51 = milk39.equals((java.lang.Object) recipeNotFoundException47);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException47.getSuppressed();
        java.lang.String str54 = recipeNotFoundException47.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + unit40 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit40.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Milk" + "'", str41, "Milk");
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str54, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size12, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size12, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]", (double) 32, size12, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 100.0", (double) ' ', size12, (int) (short) 10);
        boolean boolean23 = syrup1.equals((java.lang.Object) size12);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        double double15 = recipe7.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type17);
        java.lang.String str19 = milk18.toString();
        boolean boolean21 = milk18.equals((java.lang.Object) 10);
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        java.lang.String str23 = milk18.toString();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str19, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str23, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1);
        java.lang.String str2 = coffee1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee" + "'", str2, "Coffee");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", 10, (int) '4');
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe3.getOrders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size14, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size14, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size14, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (-1L), size14, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=8]", (double) (byte) 100, size14, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=SEMI]", (double) '4', size14, 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", 97.0d, size14, 0);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = coffee5.getUnit();
        java.lang.String str7 = coffee5.toString();
        java.lang.String str8 = coffee5.toString();
        int int9 = coffee5.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit12 = milk11.getUnit();
        boolean boolean13 = coffee5.equals((java.lang.Object) unit12);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean15 = coffee5.equals((java.lang.Object) size14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (-1.0f), size14, 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]", 100.0d, size14, (int) (short) 0);
        java.lang.String str20 = recipe19.getName();
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("hi!", (double) (-1.0f));
        double double3 = recipe2.getPrice();
        java.lang.String str4 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 0L);
        boolean boolean6 = syrup1.equals((java.lang.Object) 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", 10, (int) '4');
        java.lang.String str4 = cafe3.greeting();
        java.lang.String str5 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0" + "'", str5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("hi!", (double) 0.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((-1));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water4);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        boolean boolean2 = coffee1.getDecaf();
        java.lang.String str3 = coffee1.getName();
        java.lang.String str4 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        boolean boolean19 = recipe10.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee21 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean23 = coffee21.equals((java.lang.Object) (byte) -1);
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee21);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0", (double) 32);
        java.lang.String str28 = recipe10.getName();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        int int6 = cafe3.getIndexNextOrderToServe();
        cafe3.printMenu();
        java.lang.String str8 = cafe3.getName();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=ALMOND]", 1.0d);
        order13.printReceipt();
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type15 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str19 = coffee18.getName();
        boolean boolean20 = milk17.equals((java.lang.Object) coffee18);
        boolean boolean21 = recipe4.equals((java.lang.Object) coffee18);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Water [unit=ML, amount=30]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", 0.0d, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        boolean boolean29 = water1.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee" + "'", str19, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        java.time.LocalDateTime localDateTime22 = order21.getOrderServed();
        java.lang.String str23 = order21.toString();
        order21.printReceipt();
        order21.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDateTime22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0" + "'", str23, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(97, false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size10, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size10, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) (byte) 10, size10, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=-1]]", (double) (-1.0f), size10, 0);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (int) 'a', (int) 'a');
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size11, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size11, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size11, (int) (short) 0);
        boolean boolean18 = cafe3.addRecipe(recipe17);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=32, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (double) (byte) 100);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) 8, "Milk [unit=ML, amount=8, type=SOY]");
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]", 100, 30);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=97]", (double) (-1L));
        boolean boolean3 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        java.lang.String str5 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe6.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe6.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double16 = recipe11.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee21 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = coffee21.getUnit();
        java.lang.String str23 = coffee21.toString();
        java.lang.String str24 = coffee21.toString();
        int int25 = coffee21.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = milk27.getUnit();
        boolean boolean29 = coffee21.equals((java.lang.Object) unit28);
        boolean boolean30 = coffee19.equals((java.lang.Object) unit28);
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        boolean boolean32 = cafe6.addRecipe(recipe11);
        java.lang.String str33 = cafe6.getName();
        boolean boolean34 = coffee2.equals((java.lang.Object) str33);
        java.lang.String str35 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Cafe" + "'", str33, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str35, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Milk [unit=ML, amount=52, type=ALMOND]", 100.0d, "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = order4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order5.serve();
        order5.serve();
        java.lang.String str8 = order5.toString();
        java.time.LocalDateTime localDateTime9 = order5.getOrderServed();
        java.time.LocalDateTime localDateTime10 = order5.getOrderServed();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        boolean boolean8 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = milk10.equals((java.lang.Object) recipe13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type20 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type20);
        java.lang.String str22 = milk21.toString();
        int int23 = milk21.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit24 = milk21.getUnit();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water26 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str27 = water26.toString();
        java.lang.String str28 = water26.toString();
        java.lang.String str29 = water26.toString();
        boolean boolean30 = milk21.equals((java.lang.Object) water26);
        java.lang.String str31 = water26.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water33 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit34 = water33.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean43 = cafe35.addRecipe(recipe38);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray44 = cafe35.getOrders();
        java.lang.String str45 = cafe35.greeting();
        boolean boolean46 = water33.equals((java.lang.Object) str45);
        java.lang.String str47 = water33.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee50 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean51 = coffee50.getDecaf();
        boolean boolean52 = water33.equals((java.lang.Object) coffee50);
        boolean boolean53 = water26.equals((java.lang.Object) water33);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException54 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray55 = tooManyIngredientsException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = tooManyIngredientsException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException57.getSuppressed();
        boolean boolean61 = water26.equals((java.lang.Object) throwableArray60);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water26);
        java.lang.String str63 = water26.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str22, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=30]" + "'", str27, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water [unit=ML, amount=30]" + "'", str28, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Water [unit=ML, amount=30]" + "'", str29, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=30]" + "'", str31, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit34 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit34.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(orderArray44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Welcome to Cafe" + "'", str45, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Water [unit=ML, amount=52]" + "'", str47, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Water [unit=ML, amount=30]" + "'", str63, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", (double) 0L);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe3.serveOrder();
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean24 = milk16.equals((java.lang.Object) recipe19);
        boolean boolean25 = recipe19.isReady();
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Coffee [unit=GR, amount=100, decaf=true]", 0.0d);
        java.lang.String str29 = recipe19.getName();
        boolean boolean30 = cafe3.addRecipe(recipe19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = cafe3.placeOrder("Water", "Order: ; For: Syrup; Paid: 0.0", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=10]");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) 10.0f);
        double double3 = recipe2.getPrice();
        java.lang.Object obj4 = null;
        boolean boolean5 = recipe2.equals(obj4);
        java.lang.String str6 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe14.equals((java.lang.Object) recipe18);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup28 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str29 = syrup28.getFlavour();
        boolean boolean30 = recipe14.equals((java.lang.Object) syrup28);
        java.lang.String str31 = syrup28.toString();
        java.lang.String str32 = syrup28.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str31, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup" + "'", str32, "Syrup");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.getName();
        java.lang.String str5 = coffee2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str10 = cafe9.greeting();
        boolean boolean11 = coffee2.equals((java.lang.Object) cafe9);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee" + "'", str5, "Coffee");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Welcome to Cafe" + "'", str10, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        boolean boolean14 = recipe2.equals((java.lang.Object) unit13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        boolean boolean17 = recipe2.equals((java.lang.Object) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str20 = syrup19.getFlavour();
        int int21 = syrup19.getAmount();
        java.lang.String str22 = syrup19.toString();
        java.lang.String str23 = syrup19.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean25 = syrup19.equals((java.lang.Object) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException26 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) tooManyIngredientsException26);
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException24.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) tooManyIngredientsException24);
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException15.getSuppressed();
        java.lang.String str31 = recipeNotFoundException15.toString();
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str22, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        boolean boolean2 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size9, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size9, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str18 = coffee17.toString();
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee17);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=0, type=SEMI]", (double) 0, "Coffee [unit=GR, amount=100, decaf=false]");
        order23.printReceipt();
        boolean boolean25 = coffee1.equals((java.lang.Object) order23);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type34 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk35 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type34);
        java.lang.String str36 = milk35.toString();
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk35);
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=0, type=ALMOND]", (double) 1L);
        boolean boolean41 = coffee1.equals((java.lang.Object) recipe28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type34.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str36, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", 100.0d);
        java.lang.String str19 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Coffee [unit=GR, amount=-1, decaf=false]", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = recipe5.isReady();
        double double10 = recipe5.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type19 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type19);
        java.lang.String str21 = milk20.toString();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        boolean boolean24 = coffee2.equals((java.lang.Object) milk20);
        boolean boolean25 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean37 = cafe29.addRecipe(recipe32);
        int int38 = cafe29.getIndexNextOrderToPlace();
        boolean boolean39 = coffee2.equals((java.lang.Object) cafe29);
        java.lang.String str40 = cafe29.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe29.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=ALMOND]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str40, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException10 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException10.getSuppressed();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException10.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        tooManyIngredientsException10.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException10.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException21 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        tooManyIngredientsException21.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException21.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException33 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = tooManyIngredientsException33.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        tooManyIngredientsException33.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException33.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException31.getSuppressed();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException31.getSuppressed();
        recipeNotFoundException8.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        java.lang.Throwable[] throwableArray47 = recipeNotFoundException45.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException48 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException48.getSuppressed();
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException31.getSuppressed();
        java.lang.String str55 = recipeNotFoundException31.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str55, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        java.lang.String str14 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cafe" + "'", str14, "Cafe");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe4.getOrders();
        java.lang.String str14 = cafe4.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean21 = recipe17.isReady();
        boolean boolean22 = cafe4.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean34 = recipe25.isReady();
        boolean boolean35 = recipe17.equals((java.lang.Object) recipe25);
        java.lang.String str36 = recipe25.getName();
        boolean boolean37 = cafe0.addRecipe(recipe25);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray38 = cafe0.getMenu();
        java.lang.Class<?> wildcardClass39 = cafe0.getClass();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str36, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(recipeArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Plain");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", (double) 52);
        order5.printReceipt();
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 1.0", "Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, false);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        int int9 = cafe7.getIndexNextOrderToServe();
        boolean boolean10 = milk2.equals((java.lang.Object) cafe7);
        cafe7.printPendingOrders();
        cafe7.printMenu();
        cafe7.printPendingOrders();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException0.getSuppressed();
        java.lang.String str4 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        cafe3.printMenu();
        cafe3.printPendingOrders();
        java.lang.String str8 = cafe3.greeting();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Milk [unit=ML, amount=0, type=SEMI]" + "'", str8, "Welcome to Milk [unit=ML, amount=0, type=SEMI]");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) 100, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (double) 10, size6, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Water [unit=ML, amount=97]", (double) '4', "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]]");
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: ; For: Cafe; Paid: -1.0", (double) 0.0f, "Welcome to Milk [unit=ML, amount=100, type=WHOLE]");
        java.lang.Class<?> wildcardClass21 = order20.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.getFlavour();
        int int14 = syrup12.getAmount();
        java.lang.String str15 = syrup12.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup12);
        java.lang.String str17 = syrup12.toString();
        int int18 = syrup12.getAmount();
        java.lang.String str19 = syrup12.getName();
        java.lang.String str20 = syrup12.toString();
        java.lang.String str21 = syrup12.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup" + "'", str19, "Syrup");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray7 = tooManyIngredientsException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = tooManyIngredientsException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        boolean boolean13 = milk1.equals((java.lang.Object) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = milk1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean5 = water3.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1, type4);
        java.lang.String str9 = milk8.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        boolean boolean13 = coffee12.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean22 = cafe14.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray23 = cafe14.getOrders();
        java.lang.String str24 = cafe14.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean31 = recipe27.isReady();
        boolean boolean32 = cafe14.addRecipe(recipe27);
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean44 = recipe35.isReady();
        boolean boolean45 = recipe27.equals((java.lang.Object) recipe35);
        java.lang.Class<?> wildcardClass46 = recipe35.getClass();
        boolean boolean47 = coffee12.equals((java.lang.Object) wildcardClass46);
        int int48 = coffee12.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe51 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe51, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe51, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str59 = order58.toString();
        order58.serve();
        java.time.LocalDateTime localDateTime61 = order58.getOrderServed();
        boolean boolean62 = coffee12.equals((java.lang.Object) localDateTime61);
        boolean boolean63 = milk8.equals((java.lang.Object) boolean62);
        uk.ac.sheffield.com1003.cafe.Cafe cafe64 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int65 = cafe64.getIndexNextOrderToServe();
        int int66 = cafe64.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order67 = cafe64.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray68 = cafe64.getMenu();
        boolean boolean69 = milk8.equals((java.lang.Object) cafe64);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=1, type=ALMOND]" + "'", str9, "Milk [unit=ML, amount=1, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(orderArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Welcome to Cafe" + "'", str24, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str59, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(order67);
        org.junit.Assert.assertNotNull(recipeArray68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        boolean boolean18 = cafe0.addRecipe(recipe12);
        int int19 = cafe0.getIndexNextOrderToPlace();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean29 = cafe21.addRecipe(recipe24);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray30 = cafe21.getOrders();
        java.lang.String str31 = cafe21.greeting();
        cafe21.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean36 = cafe21.addRecipe(recipe35);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk45 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe39.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk45);
        boolean boolean47 = recipe35.equals((java.lang.Object) recipe39);
        boolean boolean48 = cafe0.addRecipe(recipe39);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100.0f, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
        order52.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(orderArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        boolean boolean4 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean14 = milk6.equals((java.lang.Object) recipe9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type16 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type16);
        java.lang.String str18 = milk17.toString();
        int int19 = milk17.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit20 = milk17.getUnit();
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water22 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str23 = water22.toString();
        java.lang.String str24 = water22.toString();
        java.lang.String str25 = water22.toString();
        boolean boolean26 = milk17.equals((java.lang.Object) water22);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup28 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str29 = syrup28.getFlavour();
        int int30 = syrup28.getAmount();
        java.lang.String str31 = syrup28.toString();
        java.lang.String str32 = syrup28.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException33 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean34 = syrup28.equals((java.lang.Object) tooManyIngredientsException33);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException35 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException33.addSuppressed((java.lang.Throwable) tooManyIngredientsException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException39 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray40 = tooManyIngredientsException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = tooManyIngredientsException39.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        tooManyIngredientsException39.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException39.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException37.getSuppressed();
        tooManyIngredientsException33.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        java.lang.Throwable[] throwableArray50 = tooManyIngredientsException33.getSuppressed();
        boolean boolean51 = milk17.equals((java.lang.Object) tooManyIngredientsException33);
        java.lang.String str52 = milk17.toString();
        boolean boolean53 = coffee1.equals((java.lang.Object) milk17);
        int int54 = coffee1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str18, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + unit20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Water [unit=ML, amount=30]" + "'", str23, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=30]" + "'", str25, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str31, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str52, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", 10.0d, size2, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int8 = coffee7.getAmount();
        java.lang.String str9 = coffee7.toString();
        java.lang.String str10 = coffee7.toString();
        java.lang.String str11 = coffee7.getName();
        java.lang.String str12 = coffee7.toString();
        java.lang.String str13 = coffee7.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee7);
        double double15 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee" + "'", str11, "Coffee");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=100, decaf=false]", (int) '#', 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water6.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe8.addRecipe(recipe11);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray17 = cafe8.getOrders();
        java.lang.String str18 = cafe8.greeting();
        boolean boolean19 = water6.equals((java.lang.Object) str18);
        java.lang.String str20 = water6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str23 = syrup22.getFlavour();
        boolean boolean24 = water6.equals((java.lang.Object) str23);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water6);
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean34 = cafe26.addRecipe(recipe29);
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean43 = cafe35.addRecipe(recipe38);
        boolean boolean44 = cafe26.addRecipe(recipe38);
        boolean boolean45 = water6.equals((java.lang.Object) cafe26);
        int int46 = cafe26.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order53 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean54 = recipe49.isReady();
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order62 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Recipe recipe65 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 100L);
        boolean boolean66 = recipe65.isReady();
        double double67 = recipe65.getPrice();
        double double68 = recipe65.getPrice();
        boolean boolean69 = recipe49.equals((java.lang.Object) recipe65);
        boolean boolean70 = cafe26.addRecipe(recipe65);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(orderArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=52]" + "'", str20, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup5 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        java.lang.String str6 = syrup5.toString();
        boolean boolean7 = water1.equals((java.lang.Object) str6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        java.time.LocalDateTime localDateTime11 = order10.getOrderServed();
        order10.serve();
        order10.printReceipt();
        java.lang.String str14 = order10.toString();
        java.time.LocalDateTime localDateTime15 = order10.getOrderServed();
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=1]", (double) (byte) 10);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

