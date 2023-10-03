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
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        java.lang.String str15 = order11.toString();
        order11.printReceipt();
        order11.printReceipt();
        java.lang.Class<?> wildcardClass18 = order11.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=1, type=WHOLE]");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        order22.printReceipt();
        order22.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        java.lang.Class<?> wildcardClass25 = recipeArray24.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        int int6 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", 1.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = milk7.equals((java.lang.Object) recipe10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type17);
        java.lang.String str19 = milk18.toString();
        int int20 = milk18.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit21 = milk18.getUnit();
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        double double23 = recipe10.getPrice();
        boolean boolean24 = milk4.equals((java.lang.Object) recipe10);
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean33 = cafe25.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean42 = cafe34.addRecipe(recipe37);
        boolean boolean43 = cafe25.addRecipe(recipe37);
        boolean boolean44 = recipe37.isReady();
        boolean boolean45 = recipe37.isReady();
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (-1.0d));
        boolean boolean49 = recipe10.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=32, type=SOY]" + "'", str5, "Milk [unit=ML, amount=32, type=SOY]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str19, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        java.lang.String str3 = recipe2.getName();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Coffee]", (double) (short) 10, "Order: ; For: Cafe; Paid: -1.0");
        double double9 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        boolean boolean5 = coffee1.equals((java.lang.Object) '4');
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        java.lang.String str8 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 10, size2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        int int6 = cafe1.getIndexNextOrderToServe();
        java.lang.String str7 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        boolean boolean9 = recipe3.isReady();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean14 = cafe6.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray15 = cafe6.getOrders();
        java.lang.String str16 = cafe6.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean23 = recipe19.isReady();
        boolean boolean24 = cafe6.addRecipe(recipe19);
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean36 = recipe27.isReady();
        boolean boolean37 = recipe19.equals((java.lang.Object) recipe27);
        java.lang.String str38 = recipe27.getName();
        boolean boolean39 = milk4.equals((java.lang.Object) str38);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to Cafe" + "'", str43, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray44);
        org.junit.Assert.assertNull(order45);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8, true);
        boolean boolean3 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.Class<?> wildcardClass5 = orderArray4.getClass();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, false);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type11);
        java.lang.String str13 = milk12.toString();
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        order18.printReceipt();
        boolean boolean20 = coffee2.equals((java.lang.Object) order18);
        java.lang.String str21 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str13, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type6);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str11 = recipe10.getName();
        boolean boolean12 = milk7.equals((java.lang.Object) str11);
        boolean boolean13 = syrup1.equals((java.lang.Object) str11);
        java.lang.String str14 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str14, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        order7.serve();
        order7.printReceipt();
        java.lang.Class<?> wildcardClass10 = order7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Order: ; For: ; Paid: 100.0", "Coffee [unit=GR, amount=35, decaf=true]", (double) 10);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order8.serve();
        order8.printReceipt();
        order8.serve();
        java.time.LocalDateTime localDateTime12 = order8.getOrderServed();
        boolean boolean13 = coffee2.equals((java.lang.Object) localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str4 = water3.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean12 = water3.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        double double16 = recipe7.getPrice();
        boolean boolean17 = milk1.equals((java.lang.Object) double16);
        java.lang.String str18 = milk1.getName();
        java.lang.String str19 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk" + "'", str18, "Milk");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str19, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str4 = water3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean6 = water3.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type5);
        java.lang.Object obj9 = null;
        boolean boolean10 = milk8.equals(obj9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=10]" + "'", str4, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.serve();
        order6.serve();
        order6.serve();
        java.lang.String str10 = order6.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str10, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        java.lang.String str15 = order11.toString();
        java.time.LocalDateTime localDateTime16 = order11.getOrderServed();
        java.lang.String str17 = order11.toString();
        order11.serve();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str17, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.String str14 = recipeNotFoundException11.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = syrup8.getUnit();
        boolean boolean10 = milk6.equals((java.lang.Object) syrup8);
        java.lang.String str11 = syrup8.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str11, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        java.lang.String str10 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=35, decaf=true]", (double) 100L);
        order13.printReceipt();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.lang.String str48 = cafe0.getName();
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
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cafe" + "'", str48, "Cafe");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=SEMI]", (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe1.getOrders();
        int int8 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        int int2 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type2);
        java.lang.String str5 = milk4.toString();
        java.lang.String str6 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = milk4.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=32, type=SOY]" + "'", str5, "Milk [unit=ML, amount=32, type=SOY]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=32, type=SOY]" + "'", str6, "Milk [unit=ML, amount=32, type=SOY]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException1.getSuppressed();
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException23 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException23.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) tooManyIngredientsException23);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.String str34 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.String str21 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe1.serveOrder();
        int int23 = cafe1.getIndexNextOrderToPlace();
        int int24 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cafe" + "'", str21, "Cafe");
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        int int16 = coffee12.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = milk18.getUnit();
        boolean boolean20 = coffee12.equals((java.lang.Object) unit19);
        boolean boolean21 = coffee10.equals((java.lang.Object) unit19);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee10);
        java.lang.String str23 = coffee10.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee" + "'", str23, "Coffee");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.lang.String str41 = recipeNotFoundException30.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str41, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        java.lang.String str9 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe7.getMenu();
        boolean boolean11 = milk2.equals((java.lang.Object) cafe7);
        int int12 = cafe7.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe7.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.String str76 = tooManyIngredientsException63.toString();
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
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str76, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray16 = cafe0.getMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(recipeArray16);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", 1.0d);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) 10.0f);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) (byte) 100, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        double double8 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.lang.String str23 = water17.toString();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=10]" + "'", str18, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Water [unit=ML, amount=10]" + "'", str23, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException9.getSuppressed();
        java.lang.Class<?> wildcardClass20 = throwableArray19.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.String str25 = syrup1.getName();
        java.lang.String str26 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup" + "'", str25, "Syrup");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str26, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.String str9 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str9, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray20 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = cafe0.placeOrder("Coffee [unit=GR, amount=35, decaf=true]", "Milk [unit=ML, amount=32, type=SOY]", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(recipeArray20);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = cafe1.placeOrder("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", "Coffee [unit=GR, amount=-1, decaf=false]", 0.0d);
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
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        order11.serve();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Welcome to Cafe");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order46 = cafe0.serveOrder();
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNull(order46);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        java.lang.String str7 = milk6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str10 = coffee9.toString();
        java.lang.String str11 = coffee9.toString();
        int int12 = coffee9.getAmount();
        boolean boolean13 = milk6.equals((java.lang.Object) int12);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.String str53 = recipeNotFoundException47.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str53, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        order10.serve();
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        java.lang.String str5 = coffee2.toString();
        java.lang.String str6 = coffee2.getName();
        java.lang.String str7 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee2.getUnit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Welcome to Water [unit=ML, amount=30]", "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0", "hi!", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=1, type=WHOLE]");
        java.lang.Class<?> wildcardClass2 = syrup1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = milk1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (byte) 10);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean6 = water4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type5);
        boolean boolean9 = coffee1.equals((java.lang.Object) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean11 = coffee10.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit12 = coffee10.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee14 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = coffee14.getUnit();
        java.lang.String str16 = coffee14.toString();
        java.lang.String str17 = coffee14.toString();
        int int18 = coffee14.getAmount();
        int int19 = coffee14.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit20 = coffee14.getUnit();
        boolean boolean21 = coffee10.equals((java.lang.Object) unit20);
        boolean boolean22 = coffee1.equals((java.lang.Object) unit20);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + unit20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray21 = cafe9.getOrders();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cafe" + "'", str18, "Cafe");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(orderArray21);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        int int16 = coffee12.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = milk18.getUnit();
        boolean boolean20 = coffee12.equals((java.lang.Object) unit19);
        boolean boolean21 = coffee10.equals((java.lang.Object) unit19);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee10);
        java.lang.String str23 = coffee10.toString();
        boolean boolean25 = coffee10.equals((java.lang.Object) "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=10, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=10, decaf=true]");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=32, decaf=false]", 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Cafe]", (int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        boolean boolean22 = milk18.equals((java.lang.Object) "Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=]; Paid: 52.0");
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean31 = cafe23.addRecipe(recipe26);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray32 = cafe23.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray33 = cafe23.getMenu();
        int int34 = cafe23.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order35 = cafe23.serveOrder();
        java.lang.String str36 = cafe23.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray37 = cafe23.getMenu();
        boolean boolean38 = milk18.equals((java.lang.Object) cafe23);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str19, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(orderArray32);
        org.junit.Assert.assertNotNull(recipeArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(order35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Cafe" + "'", str36, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup16 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str17 = syrup16.getFlavour();
        int int18 = syrup16.getAmount();
        java.lang.String str19 = syrup16.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup16);
        boolean boolean21 = coffee2.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee23 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str24 = coffee23.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee23);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean33 = recipe28.isReady();
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str38 = order37.toString();
        java.lang.String str39 = order37.toString();
        java.time.LocalDateTime localDateTime40 = order37.getOrderServed();
        java.lang.String str41 = order37.toString();
        java.time.LocalDateTime localDateTime42 = order37.getOrderServed();
        boolean boolean43 = coffee23.equals((java.lang.Object) order37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str38, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str39, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str41, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", 8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water [unit=ML, amount=-1]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", (-1.0d));
        boolean boolean3 = recipe2.isReady();
        boolean boolean4 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        boolean boolean5 = syrup1.equals((java.lang.Object) throwableArray4);
        java.lang.String str6 = syrup1.getFlavour();
        java.lang.String str7 = syrup1.getFlavour();
        java.lang.String str8 = syrup1.getFlavour();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.Class<?> wildcardClass3 = unit2.getClass();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup");
        java.lang.String str2 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean6 = water4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type5);
        boolean boolean9 = coffee1.equals((java.lang.Object) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = coffee1.getUnit();
        int int11 = coffee1.getAmount();
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException38 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray39 = tooManyIngredientsException38.getSuppressed();
        java.lang.Throwable[] throwableArray40 = tooManyIngredientsException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        tooManyIngredientsException38.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException38.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        java.lang.Throwable[] throwableArray46 = tooManyIngredientsException38.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) tooManyIngredientsException38);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup49 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str50 = syrup49.getFlavour();
        int int51 = syrup49.getAmount();
        java.lang.String str52 = syrup49.toString();
        java.lang.String str53 = syrup49.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException54 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean55 = syrup49.equals((java.lang.Object) tooManyIngredientsException54);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException56 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) tooManyIngredientsException56);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException58.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException60 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray61 = tooManyIngredientsException60.getSuppressed();
        java.lang.Throwable[] throwableArray62 = tooManyIngredientsException60.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        tooManyIngredientsException60.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException60.addSuppressed((java.lang.Throwable) recipeNotFoundException66);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException66);
        java.lang.Throwable[] throwableArray69 = recipeNotFoundException58.getSuppressed();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        java.lang.Throwable[] throwableArray71 = tooManyIngredientsException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException72.getSuppressed();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException72.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException75 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray76 = tooManyIngredientsException75.getSuppressed();
        java.lang.Throwable[] throwableArray77 = tooManyIngredientsException75.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException78 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray79 = recipeNotFoundException78.getSuppressed();
        tooManyIngredientsException75.addSuppressed((java.lang.Throwable) recipeNotFoundException78);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException81 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException75.addSuppressed((java.lang.Throwable) recipeNotFoundException81);
        recipeNotFoundException72.addSuppressed((java.lang.Throwable) tooManyIngredientsException75);
        java.lang.Throwable[] throwableArray84 = tooManyIngredientsException75.getSuppressed();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) tooManyIngredientsException75);
        tooManyIngredientsException38.addSuppressed((java.lang.Throwable) tooManyIngredientsException75);
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) tooManyIngredientsException75);
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) tooManyIngredientsException75);
        java.lang.Throwable[] throwableArray89 = tooManyIngredientsException75.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str52, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray89);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (-1));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order11.serve();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        boolean boolean15 = milk2.equals((java.lang.Object) order11);
        java.lang.String str16 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str16, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        boolean boolean21 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str19, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = milk1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        java.lang.String str6 = cafe1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", 97.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean8 = water6.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type7);
        boolean boolean12 = recipe2.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        order7.serve();
        java.time.LocalDateTime localDateTime9 = order7.getOrderServed();
        java.lang.String str10 = order7.toString();
        java.lang.String str11 = order7.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0" + "'", str10, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0" + "'", str11, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        java.lang.String str3 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order10.serve();
        boolean boolean12 = water1.equals((java.lang.Object) order10);
        java.lang.String str13 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient17 = null;
        recipe16.addIngredient(ingredient17);
        boolean boolean19 = recipe16.isReady();
        boolean boolean20 = water1.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=52]" + "'", str3, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=52]" + "'", str13, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a', false);
        java.lang.Class<?> wildcardClass3 = coffee2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        boolean boolean5 = milk2.equals((java.lang.Object) "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
        java.lang.String str6 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = milk11.equals((java.lang.Object) recipe14);
        boolean boolean20 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup22);
        boolean boolean24 = cafe1.addRecipe(recipe14);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 0L, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        java.lang.String str26 = order25.toString();
        java.lang.String str27 = order25.toString();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str26, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str27, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#');
        boolean boolean2 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order5.serve();
        order5.serve();
        order5.printReceipt();
        order5.printReceipt();
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean8 = recipe2.isReady();
        boolean boolean9 = recipe2.isReady();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", 0.0d, size2, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type7);
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe1.placeOrder("Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]", "Water [unit=ML, amount=-1]", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(orderArray7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException1.getSuppressed();
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        tooManyIngredientsException16.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException23 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException23.getSuppressed();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException23.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException23.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) tooManyIngredientsException23);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.String str34 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str6 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size11, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size11, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean19 = cafe5.addRecipe(recipe15);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 100);
        boolean boolean23 = cafe5.addRecipe(recipe22);
        boolean boolean24 = milk1.equals((java.lang.Object) recipe22);
        boolean boolean25 = recipe22.isReady();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Welcome to Cafe" + "'", str6, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe46 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order47 = cafe46.serveOrder();
        int int48 = cafe46.getIndexNextOrderToServe();
        java.lang.String str49 = cafe46.getName();
        java.lang.String str50 = cafe46.getName();
        boolean boolean51 = water0.equals((java.lang.Object) cafe46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = cafe46.placeOrder("Welcome to Water [unit=ML, amount=-1]", "Coffee [unit=GR, amount=1, decaf=true]", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(order47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str49, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str50, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.Class<?> wildcardClass2 = cafe1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        java.lang.String str23 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.Class<?> wildcardClass7 = order6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        java.lang.String str5 = milk2.getName();
        java.lang.String str6 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Milk", "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 52);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order6.serve();
        java.lang.String str8 = order6.toString();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        java.lang.String str10 = order6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", 32.0d, "Welcome to Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Water [unit=ML, amount=-1]", (double) 32, "Water [unit=ML, amount=8]");
        java.lang.String str13 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        int int5 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Milk", "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        double double13 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        java.lang.String str4 = cafe3.getName();
        java.lang.String str5 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        java.time.LocalDateTime localDateTime19 = order18.getOrderServed();
        order18.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        java.time.LocalDateTime localDateTime22 = order21.getOrderServed();
        order21.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean3 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int7 = coffee6.getAmount();
        boolean boolean8 = coffee2.equals((java.lang.Object) int7);
        java.lang.String str9 = coffee2.toString();
        java.lang.String str10 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str13 = syrup12.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = syrup12.getUnit();
        boolean boolean15 = coffee2.equals((java.lang.Object) unit14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup" + "'", str13, "Syrup");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = coffee1.equals((java.lang.Object) str13);
        boolean boolean15 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int18 = cafe17.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe17.getMenu();
        boolean boolean20 = coffee1.equals((java.lang.Object) cafe17);
        java.lang.String str21 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to Cafe" + "'", str43, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray44);
        org.junit.Assert.assertNull(order45);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Welcome to Cafe", 100.0d, "Order: ; For: ; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=32, type=WHOLE]", (double) ' ', "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", 32.0d);
        order47.serve();
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
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size4, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean12 = recipe8.isReady();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type1);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        java.lang.String str19 = syrup12.toString();
        java.lang.String str20 = syrup12.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 1);
        java.lang.String str2 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=1]" + "'", str2, "Water [unit=ML, amount=1]");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        int int4 = water1.getAmount();
        boolean boolean6 = water1.equals((java.lang.Object) "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ');
        java.lang.String str2 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=32, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=32, decaf=false]");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit18 = coffee17.getUnit();
        boolean boolean19 = recipe7.equals((java.lang.Object) unit18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        boolean boolean22 = recipe7.equals((java.lang.Object) recipeNotFoundException20);
        boolean boolean23 = recipe2.equals((java.lang.Object) boolean22);
        double double24 = recipe2.getPrice();
        java.lang.String str25 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 'a', "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str25, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe3.serveOrder();
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size19, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size19, (int) (short) 10);
        boolean boolean24 = cafe3.addRecipe(recipe23);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=8, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        java.lang.String str19 = tooManyIngredientsException9.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str19, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Welcome to Cafe");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        boolean boolean18 = recipe2.equals((java.lang.Object) "");
        java.lang.String str19 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.String str31 = coffee24.toString();
        boolean boolean32 = coffee24.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=35, decaf=true]" + "'", str31, "Coffee [unit=GR, amount=35, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type2);
        java.lang.String str5 = milk4.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.toString();
        int int3 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type11);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk15);
        java.lang.String str17 = milk15.getName();
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk" + "'", str17, "Milk");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size6, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size6, 0);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) 10.0f, size6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe3.getOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe3.getMenu();
        boolean boolean9 = water1.equals((java.lang.Object) recipeArray8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe10.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean27 = cafe19.addRecipe(recipe22);
        boolean boolean28 = cafe10.addRecipe(recipe22);
        boolean boolean29 = recipe22.isReady();
        boolean boolean30 = recipe22.isReady();
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water34 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str35 = water34.toString();
        java.lang.String str36 = water34.toString();
        java.lang.String str37 = water34.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk48 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe42.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk48);
        boolean boolean50 = recipe42.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup52 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str53 = syrup52.getFlavour();
        int int54 = syrup52.getAmount();
        java.lang.String str55 = syrup52.toString();
        recipe42.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup52);
        boolean boolean57 = cafe39.addRecipe(recipe42);
        java.lang.String str58 = cafe39.getName();
        cafe39.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray61 = cafe39.getOrders();
        java.lang.String str62 = cafe39.greeting();
        boolean boolean63 = water34.equals((java.lang.Object) cafe39);
        recipe22.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water34);
        boolean boolean65 = water1.equals((java.lang.Object) water34);
        int int66 = water34.getAmount();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(orderArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str7, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Water [unit=ML, amount=30]" + "'", str35, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Water [unit=ML, amount=30]" + "'", str36, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Water [unit=ML, amount=30]" + "'", str37, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str55, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Cafe" + "'", str58, "Cafe");
        org.junit.Assert.assertNotNull(orderArray61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Welcome to Cafe" + "'", str62, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 30 + "'", int66 == 30);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str10 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 1);
        boolean boolean14 = cafe0.addRecipe(recipe6);
        java.lang.Class<?> wildcardClass15 = recipe6.getClass();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=10, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        int int4 = syrup1.getAmount();
        int int5 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        int int10 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str14 = order13.toString();
        order13.printReceipt();
        order13.printReceipt();
        boolean boolean17 = recipe2.equals((java.lang.Object) order13);
        java.lang.String str18 = order13.toString();
        java.time.LocalDateTime localDateTime19 = order13.getOrderServed();
        order13.printReceipt();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100, true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=true]");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.String str72 = syrup1.toString();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str72, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(30);
        java.lang.String str2 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException22 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException22.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        tooManyIngredientsException22.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException22.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        java.lang.String str34 = recipeNotFoundException28.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee]", (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        int int5 = coffee2.getAmount();
        java.lang.String str6 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=8]");
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
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str5 = water4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean7 = water4.equals((java.lang.Object) type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=10]" + "'", str5, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe3.serveOrder();
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray15 = cafe3.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0", "Welcome to Plain", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertNotNull(orderArray15);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        java.lang.String str10 = recipe2.getName();
        java.lang.String str11 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str7 = coffee6.toString();
        boolean boolean8 = coffee1.equals((java.lang.Object) coffee6);
        boolean boolean9 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.lang.Class<?> wildcardClass32 = milk25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        int int12 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Water [unit=ML, amount=10]", "Milk [unit=ML, amount=0, type=WHOLE]", (double) 52);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = order4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=100, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = cafe0.addRecipe(recipe5);
        boolean boolean10 = recipe5.isReady();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 100);
        order5.printReceipt();
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.getFlavour();
        int int14 = syrup12.getAmount();
        java.lang.String str15 = syrup12.toString();
        java.lang.String str16 = syrup12.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException17 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean18 = syrup12.equals((java.lang.Object) tooManyIngredientsException17);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException19 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException17.addSuppressed((java.lang.Throwable) tooManyIngredientsException19);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException19);
        java.lang.String str22 = tooManyIngredientsException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str22, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order5.serve();
        java.lang.String str7 = order5.toString();
        order5.serve();
        java.time.LocalDateTime localDateTime9 = order5.getOrderServed();
        order5.printReceipt();
        order5.printReceipt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        java.lang.String str8 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=100, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Welcome to Cafe", 100.0d, "Order: ; For: ; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=32, type=WHOLE]", (double) ' ', "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", 32.0d);
        order47.printReceipt();
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
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException6.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean27 = recipe22.isReady();
        java.lang.String str28 = recipe22.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        recipe22.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double39 = recipe34.getPrice();
        boolean boolean40 = recipe34.isReady();
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean45 = milk30.equals((java.lang.Object) recipe34);
        boolean boolean46 = cafe1.addRecipe(recipe34);
        boolean boolean47 = recipe34.isReady();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water [unit=ML, amount=1]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type1);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = milk2.getUnit();
        java.lang.String str4 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str4, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
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
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.String str30 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str30, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Cafe");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Cafe]");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        java.lang.Throwable throwable37 = null;
        // The following exception was thrown during execution in test generation
        try {
            recipeNotFoundException0.addSuppressed(throwable37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        java.lang.Throwable[] throwableArray54 = tooManyIngredientsException6.getSuppressed();
        java.lang.String str55 = tooManyIngredientsException6.toString();
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
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str55, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        java.lang.String str5 = milk4.toString();
        int int6 = milk4.getAmount();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", 0, 100);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 100, (int) (byte) 10);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0", (-1.0d));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        java.lang.Class<?> wildcardClass13 = size6.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        int int1 = coffee0.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        java.lang.String str6 = cafe5.greeting();
        java.lang.String str7 = cafe5.greeting();
        boolean boolean8 = coffee0.equals((java.lang.Object) cafe5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe5.placeOrder("Water [unit=ML, amount=1]", "Syrup [unit=ML, amount=10, flavour=Coffee]", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) (short) 10, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]");
        java.lang.String str42 = order41.toString();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0" + "'", str42, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=97, decaf=false]", (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=52]", (int) (short) 10, 1);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        int int4 = cafe3.getIndexNextOrderToPlace();
        cafe3.printMenu();
        java.lang.String str6 = cafe3.greeting();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.String str14 = tooManyIngredientsException6.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        java.lang.String str23 = syrup21.toString();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]" + "'", str23, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee]", (double) 1.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; Paid: 100.0", (int) (short) 100, 10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str18 = water17.toString();
        java.lang.String str19 = water17.toString();
        java.lang.String str20 = water17.toString();
        boolean boolean21 = milk12.equals((java.lang.Object) water17);
        java.lang.String str22 = water17.toString();
        java.lang.String str23 = water17.toString();
        java.lang.String str24 = water17.getName();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str13, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water [unit=ML, amount=30]" + "'", str22, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Water [unit=ML, amount=30]" + "'", str23, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water" + "'", str24, "Water");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=97, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        java.lang.String str23 = tooManyIngredientsException16.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str23, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        java.lang.String str5 = milk4.toString();
        int int6 = milk4.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str13 = recipe9.getName();
        java.lang.String str14 = recipe9.getName();
        boolean boolean15 = milk4.equals((java.lang.Object) recipe9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = milk17.equals((java.lang.Object) recipe20);
        boolean boolean26 = recipe20.isReady();
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Coffee [unit=GR, amount=100, decaf=true]", 0.0d);
        order29.serve();
        boolean boolean31 = milk4.equals((java.lang.Object) order29);
        java.lang.String str32 = milk4.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type41 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk42 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type41);
        java.lang.String str43 = milk42.toString();
        recipe35.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk42);
        java.lang.String str45 = milk42.toString();
        boolean boolean46 = milk4.equals((java.lang.Object) str45);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit47 = milk4.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Milk" + "'", str32, "Milk");
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type41.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str43, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str45, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + unit47 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit47.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Milk [unit=ML, amount=100, type=SOY]", "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        java.lang.String str16 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=-1, decaf=false]", (double) 100, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str7 = syrup6.getFlavour();
        java.lang.String str8 = syrup6.getFlavour();
        boolean boolean9 = milk4.equals((java.lang.Object) syrup6);
        java.lang.Class<?> wildcardClass10 = milk4.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = milk11.equals((java.lang.Object) recipe14);
        boolean boolean20 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup22);
        boolean boolean24 = cafe1.addRecipe(recipe14);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = milk11.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup28 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str29 = syrup28.getFlavour();
        int int30 = syrup28.getAmount();
        java.lang.String str31 = syrup28.toString();
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup28);
        boolean boolean33 = cafe15.addRecipe(recipe18);
        java.lang.String str34 = cafe15.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray35 = cafe15.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe15.getMenu();
        boolean boolean37 = milk11.equals((java.lang.Object) recipeArray36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str31, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Cafe" + "'", str34, "Cafe");
        org.junit.Assert.assertNotNull(orderArray35);
        org.junit.Assert.assertNotNull(recipeArray36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=null]");
        int int2 = syrup1.getAmount();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient3 = null;
        recipe2.addIngredient(ingredient3);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = coffee6.getUnit();
        java.lang.String str8 = coffee6.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        boolean boolean19 = recipe11.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup21 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str22 = syrup21.getFlavour();
        int int23 = syrup21.getAmount();
        java.lang.String str24 = syrup21.toString();
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup21);
        boolean boolean26 = coffee6.equals((java.lang.Object) recipe11);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int30 = coffee29.getAmount();
        java.lang.String str31 = coffee29.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit32 = coffee29.getUnit();
        boolean boolean33 = recipe11.equals((java.lang.Object) coffee29);
        boolean boolean35 = coffee29.equals((java.lang.Object) 8);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit36 = coffee29.getUnit();
        boolean boolean37 = recipe2.equals((java.lang.Object) coffee29);
        boolean boolean38 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str24, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str31, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit32 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit32.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + unit36 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit36.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str7 = milk6.toString();
        boolean boolean8 = water1.equals((java.lang.Object) str7);
        java.lang.Object obj9 = null;
        boolean boolean10 = water1.equals(obj9);
        java.lang.String str11 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=10]" + "'", str11, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        java.lang.String str14 = recipeNotFoundException9.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee2.getUnit();
        boolean boolean4 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        java.lang.String str15 = order11.toString();
        order11.printReceipt();
        java.time.LocalDateTime localDateTime17 = order11.getOrderServed();
        java.lang.String str18 = order11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj7 = null;
        boolean boolean8 = water6.equals(obj7);
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double16 = recipe11.getPrice();
        boolean boolean17 = recipe11.isReady();
        boolean boolean18 = water6.equals((java.lang.Object) recipe11);
        boolean boolean19 = milk4.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", 100.0d);
        java.lang.Class<?> wildcardClass19 = recipe2.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        int int2 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", 97.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean16 = milk13.equals((java.lang.Object) (byte) 0);
        java.lang.String str17 = milk13.toString();
        boolean boolean18 = recipe2.equals((java.lang.Object) milk13);
        double double19 = recipe2.getPrice();
        double double20 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str17, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=ALMOND]", (int) ' ', (int) (short) 10);
        java.lang.String str4 = cafe3.greeting();
        java.lang.String str5 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", "Welcome to Welcome to Cafe", 32.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str4, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str5, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=SEMI]", (double) (-1L));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        int int4 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        int int7 = cafe3.getIndexNextOrderToServe();
        java.lang.String str8 = cafe3.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe3.placeOrder("Welcome to Plain", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        cafe3.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        order61.printReceipt();
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
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=100, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int5 = coffee4.getAmount();
        java.lang.String str6 = coffee4.toString();
        boolean boolean8 = coffee4.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        boolean boolean9 = coffee4.getDecaf();
        boolean boolean10 = syrup1.equals((java.lang.Object) coffee4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0", (double) 32);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        java.lang.String str13 = milk11.toString();
        int int14 = milk11.getAmount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str13, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size2, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.String str7 = water6.toString();
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water6);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str7, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0", "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size4, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, (int) '#');
        java.lang.String str9 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Water", (double) (byte) 0, "Syrup [unit=ML, amount=10, flavour=]");
        java.lang.String str14 = order13.toString();
        order13.serve();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Welcome to Cafe; For: Water; Paid: 0.0" + "'", str14, "Order: Welcome to Cafe; For: Water; Paid: 0.0");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit18 = coffee17.getUnit();
        boolean boolean19 = recipe7.equals((java.lang.Object) unit18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        boolean boolean22 = recipe7.equals((java.lang.Object) recipeNotFoundException20);
        boolean boolean23 = recipe2.equals((java.lang.Object) boolean22);
        double double24 = recipe2.getPrice();
        java.lang.String str25 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean34 = cafe26.addRecipe(recipe29);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray35 = cafe26.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe26.getMenu();
        cafe26.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray38 = cafe26.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray39 = cafe26.getMenu();
        int int40 = cafe26.getIndexNextOrderToPlace();
        boolean boolean41 = recipe2.equals((java.lang.Object) int40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str25, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(orderArray35);
        org.junit.Assert.assertNotNull(recipeArray36);
        org.junit.Assert.assertNotNull(recipeArray38);
        org.junit.Assert.assertNotNull(recipeArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", "Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException12 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException12.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException12);
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException12.getSuppressed();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException12.getSuppressed();
        java.lang.String str21 = tooManyIngredientsException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
        boolean boolean8 = milk4.equals((java.lang.Object) cafe7);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        java.lang.String str13 = milk11.toString();
        boolean boolean14 = coffee2.equals((java.lang.Object) milk11);
        java.lang.String str15 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str15, "Coffee [unit=GR, amount=100, decaf=true]");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        java.lang.String str16 = recipe2.getName();
        java.lang.String str17 = recipe2.getName();
        java.lang.String str18 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        double double14 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray8 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException18 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException18.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) tooManyIngredientsException18);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup29 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str30 = syrup29.getFlavour();
        int int31 = syrup29.getAmount();
        java.lang.String str32 = syrup29.toString();
        java.lang.String str33 = syrup29.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException34 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean35 = syrup29.equals((java.lang.Object) tooManyIngredientsException34);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException34.addSuppressed((java.lang.Throwable) tooManyIngredientsException36);
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
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException38.getSuppressed();
        tooManyIngredientsException34.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        java.lang.Throwable[] throwableArray51 = tooManyIngredientsException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException55 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray56 = tooManyIngredientsException55.getSuppressed();
        java.lang.Throwable[] throwableArray57 = tooManyIngredientsException55.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException58.getSuppressed();
        tooManyIngredientsException55.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException61 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException55.addSuppressed((java.lang.Throwable) recipeNotFoundException61);
        recipeNotFoundException52.addSuppressed((java.lang.Throwable) tooManyIngredientsException55);
        java.lang.Throwable[] throwableArray64 = tooManyIngredientsException55.getSuppressed();
        tooManyIngredientsException34.addSuppressed((java.lang.Throwable) tooManyIngredientsException55);
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) tooManyIngredientsException55);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException55);
        uk.ac.sheffield.com1003.cafe.Recipe recipe70 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order74 = new uk.ac.sheffield.com1003.cafe.Order(recipe70, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order78 = new uk.ac.sheffield.com1003.cafe.Order(recipe70, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee80 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit81 = coffee80.getUnit();
        boolean boolean82 = recipe70.equals((java.lang.Object) unit81);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException83 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray84 = recipeNotFoundException83.getSuppressed();
        boolean boolean85 = recipe70.equals((java.lang.Object) recipeNotFoundException83);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str32, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertTrue("'" + unit81 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit81.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        java.lang.String str3 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=10]" + "'", str3, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = milk8.getName();
        java.lang.String str11 = milk8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk" + "'", str10, "Milk");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.lang.String str30 = tooManyIngredientsException24.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str30, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        cafe3.printMenu();
        java.lang.String str6 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Welcome to Cafe" + "'", str6, "Welcome to Welcome to Cafe");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (short) 0);
        boolean boolean19 = cafe0.addRecipe(recipe18);
        java.lang.String str20 = cafe0.greeting();
        java.lang.String str21 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=10, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Cafe" + "'", str20, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cafe" + "'", str21, "Cafe");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.getName();
        java.lang.String str7 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup" + "'", str6, "Syrup");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", (double) (-1L));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Water [unit=ML, amount=30]", (double) (-1L));
        order18.serve();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        cafe29.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str11 = coffee1.toString();
        boolean boolean12 = coffee1.getDecaf();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", 0, (int) (short) 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        java.lang.Class<?> wildcardClass6 = cafe3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size10, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size10, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Cafe; Paid: -1.0", 97.0d, size10, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", (double) 10.0f, size10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee14 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str15 = coffee14.toString();
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee14);
        java.lang.String str17 = coffee14.toString();
        java.lang.String str18 = coffee14.toString();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.lang.String str21 = syrup12.getName();
        java.lang.Class<?> wildcardClass22 = syrup12.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup" + "'", str19, "Syrup");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Syrup" + "'", str21, "Syrup");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (int) 'a', (int) 'a');
        cafe3.printMenu();
        int int5 = cafe3.getIndexNextOrderToPlace();
        java.lang.Class<?> wildcardClass6 = cafe3.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=0]");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean15 = recipe7.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup17 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str18 = syrup17.getFlavour();
        int int19 = syrup17.getAmount();
        java.lang.String str20 = syrup17.toString();
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup17);
        java.lang.String str22 = syrup17.getFlavour();
        java.lang.Class<?> wildcardClass23 = syrup17.getClass();
        boolean boolean24 = milk4.equals((java.lang.Object) syrup17);
        int int25 = milk4.getAmount();
        java.lang.Class<?> wildcardClass26 = milk4.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str10 = order9.toString();
        order9.serve();
        order9.printReceipt();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException6.getSuppressed();
        java.lang.String str11 = tooManyIngredientsException6.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = coffee1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 100);
        boolean boolean10 = coffee1.equals((java.lang.Object) order9);
        java.lang.String str11 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.toString();
        java.lang.String str8 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.getName();
        int int4 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe1.getOrders();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.String str10 = tooManyIngredientsException8.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str7 = water6.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean15 = water6.equals((java.lang.Object) recipe10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 100, "Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water [unit=ML, amount=10]", (double) 100.0f, "Milk [unit=ML, amount=0, type=SEMI]");
        boolean boolean27 = milk4.equals((java.lang.Object) 100.0f);
        java.lang.String str28 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=52]" + "'", str7, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str28, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = cafe0.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (double) (short) 100);
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 0, true);
        java.lang.String str3 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=-1]" + "'", str5, "Welcome to Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str6, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = coffee9.getUnit();
        java.lang.String str11 = coffee9.toString();
        java.lang.String str12 = coffee9.toString();
        int int13 = coffee9.getAmount();
        boolean boolean15 = coffee9.equals((java.lang.Object) 0.0d);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        boolean boolean17 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.getName();
        java.lang.String str5 = syrup1.toString();
        java.lang.String str6 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (short) 1, size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]", (double) (short) 100, size8, (int) (short) 0);
        boolean boolean17 = recipe16.isReady();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        int int6 = cafe1.getIndexNextOrderToServe();
        int int7 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", (int) (byte) 100, 0);
        int int4 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean3 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee2.getUnit();
        java.lang.String str5 = coffee2.toString();
        boolean boolean6 = coffee1.equals((java.lang.Object) str5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=0, type=WHOLE]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=0, type=WHOLE]");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size8, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size8, 52);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) (byte) 0);
        order19.serve();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (double) 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        double double14 = recipe2.getPrice();
        double double15 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        int int11 = cafe0.getIndexNextOrderToServe();
        cafe0.printMenu();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", 1, 52);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.serve();
        order6.printReceipt();
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]");
        int int9 = cafe8.getIndexNextOrderToServe();
        boolean boolean10 = milk6.equals((java.lang.Object) int9);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 0L, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        java.lang.String str26 = order25.toString();
        java.lang.Class<?> wildcardClass27 = order25.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str26, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = coffee8.getUnit();
        java.lang.String str10 = coffee8.toString();
        java.lang.String str11 = coffee8.toString();
        int int12 = coffee8.getAmount();
        int int13 = coffee8.getAmount();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
        java.lang.String str15 = coffee8.toString();
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size8, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size8, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Cafe; Paid: -1.0", 97.0d, size8, (int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str19 = syrup18.getName();
        java.lang.String str20 = syrup18.toString();
        java.lang.String str21 = syrup18.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean30 = cafe22.addRecipe(recipe25);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray31 = cafe22.getOrders();
        java.lang.String str32 = cafe22.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean39 = recipe35.isReady();
        boolean boolean40 = cafe22.addRecipe(recipe35);
        boolean boolean41 = syrup18.equals((java.lang.Object) recipe35);
        recipe16.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        java.lang.String str43 = syrup18.getFlavour();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup" + "'", str19, "Syrup");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Syrup" + "'", str21, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(orderArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Welcome to Cafe" + "'", str32, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str43, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=null]", (int) '4', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray20 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order21 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray22 = cafe0.getMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(recipeArray20);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNotNull(recipeArray22);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 100, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean11 = water9.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str14 = water13.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean22 = water13.equals((java.lang.Object) recipe17);
        boolean boolean23 = water9.equals((java.lang.Object) water13);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        boolean boolean30 = water9.equals((java.lang.Object) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int33 = cafe32.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray34 = cafe32.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray35 = cafe32.getMenu();
        boolean boolean36 = water9.equals((java.lang.Object) recipeArray35);
        int int37 = water9.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type39 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk40 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type39);
        boolean boolean41 = water9.equals((java.lang.Object) milk40);
        boolean boolean42 = recipe2.equals((java.lang.Object) water9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=52]" + "'", str14, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(recipeArray34);
        org.junit.Assert.assertNotNull(recipeArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type39.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size8, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Cafe; Paid: -1.0", (double) 1L, size8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 10, size8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=ALMOND]", (double) 32);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Milk [unit=ML, amount=0, type=ALMOND]", "", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (double) (byte) 100);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        java.lang.String str10 = cafe1.greeting();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        boolean boolean4 = coffee1.getDecaf();
        boolean boolean5 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double13 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order17.printReceipt();
        java.lang.String str19 = order17.toString();
        boolean boolean20 = coffee1.equals((java.lang.Object) str19);
        java.lang.String str21 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0" + "'", str19, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        int int58 = cafe0.getIndexNextOrderToServe();
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        double double3 = recipe2.getPrice();
        boolean boolean4 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee]");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        int int16 = coffee12.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = milk18.getUnit();
        boolean boolean20 = coffee12.equals((java.lang.Object) unit19);
        boolean boolean21 = coffee10.equals((java.lang.Object) unit19);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee10);
        java.lang.String str23 = coffee10.toString();
        boolean boolean24 = coffee10.getDecaf();
        java.lang.String str25 = coffee10.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        java.lang.String str7 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to ", (double) 10, "Coffee");
        order11.printReceipt();
        java.lang.String str13 = order11.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to ; Paid: 10.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to ; Paid: 10.0");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = recipe9.isReady();
        java.lang.String str15 = recipe9.getName();
        boolean boolean16 = recipe9.isReady();
        boolean boolean17 = recipe9.isReady();
        boolean boolean18 = cafe3.addRecipe(recipe9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("", "Milk [unit=ML, amount=0, type=ALMOND]", 10.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (int) (short) 0, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=10, decaf=false]", (double) 32);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=1, type=ALMOND]");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=ALMOND]" + "'", str2, "Milk [unit=ML, amount=1, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str11 = recipe7.getName();
        boolean boolean12 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cafe3.placeOrder("", "Water [unit=ML, amount=97]", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(recipeArray13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.String str22 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cafe" + "'", str22, "Cafe");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (byte) 10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=10, type=ALMOND]", (double) (short) -1);
        java.time.LocalDateTime localDateTime13 = order12.getOrderServed();
        java.time.LocalDateTime localDateTime14 = order12.getOrderServed();
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Welcome to Cafe; For: Water; Paid: 0.0", (double) (short) 10);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup12);
        boolean boolean14 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee]", 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.getName();
        cafe0.printPendingOrders();
        java.lang.String str7 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe0.placeOrder("Milk [unit=ML, amount=10, type=SOY]", "Milk [unit=ML, amount=32, type=ALMOND]", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8, true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=true]");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray3);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Plain", (double) (short) 100);
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
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        boolean boolean18 = cafe0.addRecipe(recipe12);
        boolean boolean19 = recipe12.isReady();
        boolean boolean20 = recipe12.isReady();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water24 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str25 = water24.toString();
        java.lang.String str26 = water24.toString();
        java.lang.String str27 = water24.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe29 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe32.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        boolean boolean40 = recipe32.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup42 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str43 = syrup42.getFlavour();
        int int44 = syrup42.getAmount();
        java.lang.String str45 = syrup42.toString();
        recipe32.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup42);
        boolean boolean47 = cafe29.addRecipe(recipe32);
        java.lang.String str48 = cafe29.getName();
        cafe29.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray51 = cafe29.getOrders();
        java.lang.String str52 = cafe29.greeting();
        boolean boolean53 = water24.equals((java.lang.Object) cafe29);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water24);
        java.lang.String str55 = water24.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=30]" + "'", str25, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water [unit=ML, amount=30]" + "'", str26, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=30]" + "'", str27, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str45, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Cafe" + "'", str48, "Cafe");
        org.junit.Assert.assertNotNull(orderArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Welcome to Cafe" + "'", str52, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Water [unit=ML, amount=30]" + "'", str55, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=SOY]", (double) 1, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) 0.0f, "Milk [unit=ML, amount=97, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        boolean boolean5 = coffee1.equals((java.lang.Object) '4');
        boolean boolean6 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = coffee1.getUnit();
        int int8 = coffee1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        order15.serve();
        java.lang.String str20 = order15.toString();
        order15.printReceipt();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0" + "'", str20, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException72.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException74 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray75 = tooManyIngredientsException74.getSuppressed();
        java.lang.Throwable[] throwableArray76 = tooManyIngredientsException74.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException77 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray78 = recipeNotFoundException77.getSuppressed();
        tooManyIngredientsException74.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        recipeNotFoundException72.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException81 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray82 = tooManyIngredientsException81.getSuppressed();
        java.lang.Throwable[] throwableArray83 = tooManyIngredientsException81.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException84 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray85 = recipeNotFoundException84.getSuppressed();
        tooManyIngredientsException81.addSuppressed((java.lang.Throwable) recipeNotFoundException84);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException87 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException81.addSuppressed((java.lang.Throwable) recipeNotFoundException87);
        java.lang.Throwable[] throwableArray89 = tooManyIngredientsException81.getSuppressed();
        recipeNotFoundException77.addSuppressed((java.lang.Throwable) tooManyIngredientsException81);
        recipeNotFoundException44.addSuppressed((java.lang.Throwable) tooManyIngredientsException81);
        java.lang.String str92 = tooManyIngredientsException81.toString();
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
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray85);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str92, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        cafe0.printPendingOrders();
        int int48 = cafe0.getIndexNextOrderToServe();
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        int int12 = cafe0.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=WHOLE]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=97]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        int int14 = milk1.getAmount();
        int int15 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=10, type=ALMOND]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str2, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", (double) (-1L));
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup", (double) 0L);
        boolean boolean7 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size2, (int) (short) 0);
        double double5 = recipe4.getPrice();
        double double6 = recipe4.getPrice();
        boolean boolean7 = recipe4.isReady();
        double double8 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size47 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size47, (int) ' ');
        boolean boolean50 = cafe0.addRecipe(recipe49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean54 = cafe0.placeOrder("Coffee [unit=GR, amount=1, decaf=true]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", (double) 'a');
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
        org.junit.Assert.assertTrue("'" + size47 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size47.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 1L, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
        java.lang.Object obj7 = null;
        boolean boolean8 = recipe2.equals(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        java.lang.String str2 = cafe1.getName();
        java.lang.Class<?> wildcardClass3 = cafe1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str2, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (int) (short) 10, 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 1L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30, false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        int int6 = cafe1.getIndexNextOrderToServe();
        cafe1.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        int int1 = coffee0.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        java.lang.String str6 = cafe5.greeting();
        java.lang.String str7 = cafe5.greeting();
        boolean boolean8 = coffee0.equals((java.lang.Object) cafe5);
        java.lang.String str9 = cafe5.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe5.getOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(orderArray10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        java.lang.String str6 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (byte) 1);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        java.lang.String str47 = cafe0.greeting();
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Welcome to Cafe" + "'", str47, "Welcome to Cafe");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=32, type=SOY]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=-1, type=SOY]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type1);
        java.lang.String str3 = milk2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk4.getUnit();
        boolean boolean6 = coffee2.equals((java.lang.Object) milk4);
        java.lang.String str7 = milk4.toString();
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 1.0");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        java.lang.String str8 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (int) (byte) 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size6, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (short) 100);
        java.lang.String str13 = recipe12.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size9, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size9, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = milk17.equals((java.lang.Object) recipe20);
        boolean boolean26 = recipe20.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe27 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order28 = cafe27.serveOrder();
        java.lang.String str29 = cafe27.greeting();
        java.lang.String str30 = cafe27.getName();
        uk.ac.sheffield.com1003.cafe.Order order31 = cafe27.serveOrder();
        boolean boolean32 = recipe20.equals((java.lang.Object) cafe27);
        boolean boolean33 = recipe15.equals((java.lang.Object) recipe20);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee35 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit36 = coffee35.getUnit();
        java.lang.String str37 = coffee35.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit38 = coffee35.getUnit();
        java.lang.String str39 = coffee35.toString();
        java.lang.Object obj40 = null;
        boolean boolean41 = coffee35.equals(obj40);
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee35);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee35);
        boolean boolean44 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Welcome to Cafe" + "'", str29, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Cafe" + "'", str30, "Cafe");
        org.junit.Assert.assertNull(order31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + unit36 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit36.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str37, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit38 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit38.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printMenu();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup7 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean19 = recipe10.isReady();
        boolean boolean20 = syrup7.equals((java.lang.Object) recipe10);
        java.lang.String str21 = recipe10.getName();
        double double22 = recipe10.getPrice();
        boolean boolean23 = recipe10.isReady();
        boolean boolean24 = cafe0.addRecipe(recipe10);
        double double25 = recipe10.getPrice();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Plain", (double) (short) 0, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        order7.printReceipt();
        order7.serve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe0.getMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertNotNull(recipeArray14);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        int int9 = cafe7.getIndexNextOrderToServe();
        boolean boolean10 = milk2.equals((java.lang.Object) cafe7);
        cafe7.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe7.placeOrder("Water [unit=ML, amount=52]", "Welcome to Water [unit=ML, amount=97]", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = syrup8.getUnit();
        boolean boolean10 = milk6.equals((java.lang.Object) syrup8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order16.serve();
        java.time.LocalDateTime localDateTime18 = order16.getOrderServed();
        order16.printReceipt();
        boolean boolean20 = milk6.equals((java.lang.Object) order16);
        order16.printReceipt();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        int int30 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, false);
        java.lang.String str3 = coffee2.toString();
        int int4 = coffee2.getAmount();
        java.lang.String str5 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee" + "'", str5, "Coffee");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        cafe1.printMenu();
        java.lang.String str8 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe1.placeOrder("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", "hi!", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cafe" + "'", str8, "Cafe");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.String str21 = milk8.getName();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Cafe" + "'", str18, "Cafe");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk" + "'", str21, "Milk");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type6);
        boolean boolean8 = milk1.equals((java.lang.Object) milk7);
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order15.serve();
        java.lang.String str17 = order15.toString();
        java.time.LocalDateTime localDateTime18 = order15.getOrderServed();
        boolean boolean19 = milk7.equals((java.lang.Object) localDateTime18);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit20 = milk7.getUnit();
        java.lang.String str21 = milk7.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str17, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + unit20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        boolean boolean6 = coffee2.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        java.lang.String str7 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
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
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException6.getSuppressed();
        java.lang.String str25 = tooManyIngredientsException6.toString();
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
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str25, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.String str62 = milk8.toString();
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str62, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        boolean boolean18 = recipe4.equals((java.lang.Object) milk17);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (byte) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water25 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type26 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean27 = water25.equals((java.lang.Object) type26);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type26);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type26);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type26);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk30);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException12.getSuppressed();
        java.lang.String str18 = recipeNotFoundException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str18, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        double double8 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        double double16 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe20.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double29 = recipe24.getPrice();
        boolean boolean30 = recipe24.isReady();
        boolean boolean31 = cafe20.addRecipe(recipe24);
        java.lang.String str32 = cafe20.getName();
        boolean boolean33 = recipe4.equals((java.lang.Object) cafe20);
        java.lang.String str34 = cafe20.greeting();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str32, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str34, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str12 = milk10.toString();
        boolean boolean13 = coffee1.equals((java.lang.Object) str12);
        java.lang.String str14 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Coffee");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        cafe1.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(recipeArray23);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=1, type=ALMOND]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size8, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=SOY]", (double) 100L, size8, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Coffee [unit=GR, amount=-1, decaf=false]", 32.0d);
        java.time.LocalDateTime localDateTime4 = order3.getOrderServed();
        // The following exception was thrown during execution in test generation
        try {
            order3.printReceipt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=8, type=SOY]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        int int1 = coffee0.getAmount();
        java.lang.String str2 = coffee0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException14 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray15 = tooManyIngredientsException14.getSuppressed();
        java.lang.Throwable[] throwableArray16 = tooManyIngredientsException14.getSuppressed();
        boolean boolean17 = syrup13.equals((java.lang.Object) throwableArray16);
        java.lang.String str18 = syrup13.getFlavour();
        java.lang.String str19 = syrup13.getFlavour();
        boolean boolean20 = milk9.equals((java.lang.Object) str19);
        java.lang.String str21 = milk9.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean29 = recipe24.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee31 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit32 = coffee31.getUnit();
        java.lang.String str33 = coffee31.toString();
        java.lang.String str34 = coffee31.toString();
        int int35 = coffee31.getAmount();
        boolean boolean37 = coffee31.equals((java.lang.Object) 0.0d);
        recipe24.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee31);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water42 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str43 = water42.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type44 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean45 = water42.equals((java.lang.Object) type44);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk46 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type44);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk47 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type44);
        recipe24.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk47);
        boolean boolean49 = milk9.equals((java.lang.Object) milk47);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + unit32 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit32.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str33, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Water [unit=ML, amount=10]" + "'", str43, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type44.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type6);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk7);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=ALMOND]", (double) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order49 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean50 = recipe41.isReady();
        uk.ac.sheffield.com1003.cafe.Order order53 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Coffee [unit=GR, amount=10, decaf=false]", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup55 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe58 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order62 = new uk.ac.sheffield.com1003.cafe.Order(recipe58, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order66 = new uk.ac.sheffield.com1003.cafe.Order(recipe58, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean67 = recipe58.isReady();
        boolean boolean68 = syrup55.equals((java.lang.Object) recipe58);
        java.lang.String str69 = recipe58.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk71 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        boolean boolean72 = recipe58.equals((java.lang.Object) milk71);
        recipe41.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk71);
        boolean boolean74 = coffee2.equals((java.lang.Object) milk71);
        java.lang.String str75 = coffee2.getName();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str69, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Coffee" + "'", str75, "Coffee");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100);
        java.lang.String str7 = milk6.toString();
        boolean boolean8 = milk4.equals((java.lang.Object) str7);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        int int9 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = milk2.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str14 = order13.toString();
        boolean boolean15 = milk2.equals((java.lang.Object) order13);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '#');
        uk.ac.sheffield.com1003.cafe.Cafe cafe2 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int3 = cafe2.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe2.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe2.serveOrder();
        boolean boolean6 = water1.equals((java.lang.Object) order5);
        java.lang.String str7 = water1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=35]" + "'", str7, "Water [unit=ML, amount=35]");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = cafe0.placeOrder("Water [unit=ML, amount=0]", "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (byte) -1);
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
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) 52);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = syrup1.getUnit();
        java.lang.String str9 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str4 = water3.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean12 = water3.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        double double16 = recipe7.getPrice();
        boolean boolean17 = milk1.equals((java.lang.Object) double16);
        java.lang.String str18 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean27 = cafe19.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray28 = cafe19.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray29 = cafe19.getMenu();
        cafe19.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray31 = cafe19.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray32 = cafe19.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order33 = cafe19.serveOrder();
        boolean boolean34 = milk1.equals((java.lang.Object) cafe19);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk" + "'", str18, "Milk");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(orderArray28);
        org.junit.Assert.assertNotNull(recipeArray29);
        org.junit.Assert.assertNotNull(recipeArray31);
        org.junit.Assert.assertNotNull(recipeArray32);
        org.junit.Assert.assertNull(order33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee22 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = coffee22.getUnit();
        java.lang.String str24 = coffee22.toString();
        java.lang.String str25 = coffee22.toString();
        int int26 = coffee22.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = milk28.getUnit();
        boolean boolean30 = coffee22.equals((java.lang.Object) unit29);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size31 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean32 = coffee22.equals((java.lang.Object) size31);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee22);
        double double34 = recipe13.getPrice();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + size31 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size31.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 32.0d + "'", double34 == 32.0d);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", (double) 8);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        java.lang.String str18 = water0.toString();
        java.lang.String str19 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 1, 0);
        boolean boolean24 = water0.equals((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: Cafe; Paid: -1.0", "Milk [unit=ML, amount=-1, type=null]", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, true);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee]", (int) (byte) 10, 10);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = cafe34.placeOrder("hi!", "Welcome to Plain", 1.0d);
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
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        boolean boolean3 = milk1.equals((java.lang.Object) (-1L));
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str18 = water0.toString();
        java.lang.String str19 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean23 = water21.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water25 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str26 = water25.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean34 = water25.equals((java.lang.Object) recipe29);
        boolean boolean35 = water21.equals((java.lang.Object) water25);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray37 = tooManyIngredientsException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        boolean boolean42 = water21.equals((java.lang.Object) tooManyIngredientsException36);
        uk.ac.sheffield.com1003.cafe.Cafe cafe44 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int45 = cafe44.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe44.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray47 = cafe44.getMenu();
        boolean boolean48 = water21.equals((java.lang.Object) recipeArray47);
        java.lang.String str49 = water21.toString();
        int int50 = water21.getAmount();
        java.lang.String str51 = water21.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe54, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean59 = recipe54.isReady();
        java.lang.String str60 = recipe54.getName();
        boolean boolean61 = recipe54.isReady();
        boolean boolean62 = recipe54.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee64 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit65 = coffee64.getUnit();
        java.lang.String str66 = coffee64.toString();
        java.lang.String str67 = coffee64.toString();
        int int68 = coffee64.getAmount();
        boolean boolean70 = coffee64.equals((java.lang.Object) 0.0d);
        recipe54.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee64);
        boolean boolean72 = coffee64.getDecaf();
        boolean boolean73 = water21.equals((java.lang.Object) boolean72);
        boolean boolean74 = water0.equals((java.lang.Object) water21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water [unit=ML, amount=52]" + "'", str26, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertNotNull(recipeArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str49, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str51, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str60, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + unit65 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit65.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str66, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str67, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe1.getMenu();
        int int12 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.getName();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cafe3.placeOrder("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", 100.0d);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        java.lang.String str10 = recipe2.getName();
        boolean boolean11 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean25 = recipe16.isReady();
        boolean boolean26 = syrup13.equals((java.lang.Object) recipe16);
        java.lang.String str27 = recipe16.getName();
        double double28 = recipe16.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee30 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        recipe16.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee30);
        boolean boolean32 = coffee30.getDecaf();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee30);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee36 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean43 = recipe39.isReady();
        double double44 = recipe39.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe47 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order51 = new uk.ac.sheffield.com1003.cafe.Order(recipe47, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type53 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk54 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type53);
        java.lang.String str55 = milk54.toString();
        recipe47.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk54);
        recipe39.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk54);
        boolean boolean58 = coffee36.equals((java.lang.Object) milk54);
        boolean boolean59 = coffee36.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe63 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe66 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order70 = new uk.ac.sheffield.com1003.cafe.Order(recipe66, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean71 = cafe63.addRecipe(recipe66);
        int int72 = cafe63.getIndexNextOrderToPlace();
        boolean boolean73 = coffee36.equals((java.lang.Object) cafe63);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee36);
        boolean boolean75 = recipe2.isReady();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 32.0d + "'", double44 == 32.0d);
        org.junit.Assert.assertTrue("'" + type53 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type53.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str55, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getName();
        int int6 = syrup1.getAmount();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (int) (short) 10, 100);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        java.lang.String str6 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str6, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        boolean boolean53 = recipe47.isReady();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=32, type=SOY]", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=97, type=WHOLE]");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) '4', size2, 1);
        double double5 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type1);
        java.lang.String str3 = milk2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=100, type=null]" + "'", str3, "Milk [unit=ML, amount=100, type=null]");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup16 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str17 = syrup16.getFlavour();
        int int18 = syrup16.getAmount();
        java.lang.String str19 = syrup16.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup16);
        boolean boolean21 = coffee1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int25 = coffee24.getAmount();
        java.lang.String str26 = coffee24.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit27 = coffee24.getUnit();
        boolean boolean28 = recipe6.equals((java.lang.Object) coffee24);
        boolean boolean30 = coffee24.equals((java.lang.Object) 8);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit31 = coffee24.getUnit();
        boolean boolean32 = coffee24.getDecaf();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size39 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size39, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size39, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe45 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size39, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee47 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str48 = coffee47.toString();
        recipe45.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee47);
        java.lang.String str50 = coffee47.toString();
        boolean boolean51 = coffee24.equals((java.lang.Object) str50);
        java.lang.String str52 = coffee24.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + size39 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size39.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str48, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str50, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str52, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe1.getMenu();
        java.lang.String str9 = cafe1.getName();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str7 = syrup6.getName();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup" + "'", str7, "Syrup");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        double double14 = recipe5.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 100.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee20 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int21 = coffee20.getAmount();
        java.lang.String str22 = coffee20.toString();
        java.lang.String str23 = coffee20.toString();
        boolean boolean24 = recipe17.equals((java.lang.Object) str23);
        double double25 = recipe17.getPrice();
        boolean boolean26 = recipe5.equals((java.lang.Object) double25);
        java.lang.String str27 = recipe5.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str22, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str23, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        int int2 = cafe1.getIndexNextOrderToPlace();
        cafe1.printMenu();
        int int4 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=0, type=ALMOND]", 1.0d);
        boolean boolean27 = cafe0.addRecipe(recipe15);
        int int28 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = null;
        boolean boolean24 = cafe0.addRecipe(recipe23);
        int int25 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray26 = cafe0.getOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(orderArray26);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = syrup1.equals((java.lang.Object) order12);
        java.lang.String str14 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = syrup1.getUnit();
        java.lang.Class<?> wildcardClass16 = syrup1.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.getName();
        cafe0.printPendingOrders();
        java.lang.String str7 = cafe0.getName();
        java.lang.String str8 = cafe0.greeting();
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe0.getOrders();
        java.lang.String str11 = cafe0.getName();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cafe" + "'", str11, "Cafe");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        java.lang.String str16 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = cafe17.addRecipe(recipe20);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray26 = cafe17.getOrders();
        java.lang.String str27 = cafe17.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean34 = recipe30.isReady();
        boolean boolean35 = cafe17.addRecipe(recipe30);
        boolean boolean36 = water5.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=52]" + "'", str16, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(orderArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Welcome to Cafe" + "'", str27, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        int int7 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray8 = cafe3.getOrders();
        java.lang.Class<?> wildcardClass9 = orderArray8.getClass();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(orderArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        int int5 = cafe3.getIndexNextOrderToPlace();
        java.lang.String str6 = cafe3.getName();
        cafe3.printMenu();
        cafe3.printMenu();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.lang.String str26 = coffee1.toString();
        java.lang.String str27 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 1, false);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray27 = cafe26.getOrders();
        cafe26.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray29 = cafe26.getOrders();
        java.lang.String str30 = cafe26.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray31 = cafe26.getMenu();
        boolean boolean32 = syrup1.equals((java.lang.Object) recipeArray31);
        java.lang.String str33 = syrup1.toString();
        java.lang.String str34 = syrup1.getFlavour();
        int int35 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(orderArray27);
        org.junit.Assert.assertNotNull(orderArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str30, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str33, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str34, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (byte) -1);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Welcome to Cafe", 100.0d, "Order: ; For: ; Paid: 100.0");
        java.lang.String str41 = recipe5.getName();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str41, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=100, decaf=false]");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f, size4, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '#', size4, 30);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '#');
        uk.ac.sheffield.com1003.cafe.Cafe cafe2 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int3 = cafe2.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe2.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe2.serveOrder();
        boolean boolean6 = water1.equals((java.lang.Object) order5);
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException19 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException19.getSuppressed();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        tooManyIngredientsException19.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException7.addSuppressed((java.lang.Throwable) tooManyIngredientsException19);
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException19.getSuppressed();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException19.getSuppressed();
        boolean boolean28 = water1.equals((java.lang.Object) throwableArray27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (byte) 100);
        boolean boolean3 = recipe2.isReady();
        double double4 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (int) (short) 10, 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=true]", 52, 10);
        cafe3.printPendingOrders();
        int int5 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup16 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str17 = syrup16.getFlavour();
        int int18 = syrup16.getAmount();
        java.lang.String str19 = syrup16.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup16);
        boolean boolean21 = coffee1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int25 = coffee24.getAmount();
        java.lang.String str26 = coffee24.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit27 = coffee24.getUnit();
        boolean boolean28 = recipe6.equals((java.lang.Object) coffee24);
        java.lang.String str29 = coffee24.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str29, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        int int5 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        java.lang.String str2 = cafe1.greeting();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Water [unit=ML, amount=30]", "Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        int int12 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str17 = coffee16.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean25 = coffee16.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup27 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str28 = syrup27.toString();
        boolean boolean29 = coffee16.equals((java.lang.Object) str28);
        boolean boolean30 = coffee16.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int33 = cafe32.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray34 = cafe32.getMenu();
        boolean boolean35 = coffee16.equals((java.lang.Object) cafe32);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray36 = cafe32.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str43 = recipe39.getName();
        java.lang.String str44 = recipe39.getName();
        boolean boolean45 = cafe32.addRecipe(recipe39);
        boolean boolean46 = cafe0.addRecipe(recipe39);
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order53 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order53.serve();
        java.lang.String str55 = order53.toString();
        order53.serve();
        boolean boolean57 = recipe39.equals((java.lang.Object) order53);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str28, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(recipeArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(orderArray36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str43, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str44, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str55, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        java.lang.String str56 = coffee18.toString();
        int int57 = coffee18.getAmount();
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str56, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = syrup1.equals(obj4);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = syrup8.getUnit();
        boolean boolean10 = milk6.equals((java.lang.Object) syrup8);
        java.lang.String str11 = syrup8.getFlavour();
        java.lang.String str12 = syrup8.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = syrup8.getUnit();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 0, "Water [unit=ML, amount=10]");
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int20 = cafe19.getIndexNextOrderToServe();
        boolean boolean21 = recipe6.equals((java.lang.Object) cafe19);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Milk [unit=ML, amount=100, type=WHOLE]", (double) 0L, "");
        java.lang.String str26 = recipe6.getName();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f, size4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Plain", (double) 100L, size4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        java.lang.String str16 = order15.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]; Paid: 10.0" + "'", str16, "Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]; Paid: 10.0");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        cafe1.printPendingOrders();
        java.lang.String str7 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.String str15 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray18 = cafe17.getOrders();
        boolean boolean19 = coffee2.equals((java.lang.Object) orderArray18);
        java.lang.String str20 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=35, decaf=true]" + "'", str14, "Coffee [unit=GR, amount=35, decaf=true]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=35, decaf=true]" + "'", str15, "Coffee [unit=GR, amount=35, decaf=true]");
        org.junit.Assert.assertNotNull(orderArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee" + "'", str20, "Coffee");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size2, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type7);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException10 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException10.getSuppressed();
        boolean boolean12 = milk9.equals((java.lang.Object) throwableArray11);
        boolean boolean13 = recipe4.equals((java.lang.Object) boolean12);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup15 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup15);
        java.lang.String str17 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Plain" + "'", str17, "Plain");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=97]", 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = cafe3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str5, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        java.lang.Class<?> wildcardClass5 = cafe1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (short) 100, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee1.getUnit();
        boolean boolean5 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup16 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str17 = syrup16.getFlavour();
        int int18 = syrup16.getAmount();
        java.lang.String str19 = syrup16.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup16);
        boolean boolean21 = coffee1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee24 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int25 = coffee24.getAmount();
        java.lang.String str26 = coffee24.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit27 = coffee24.getUnit();
        boolean boolean28 = recipe6.equals((java.lang.Object) coffee24);
        boolean boolean30 = coffee24.equals((java.lang.Object) 8);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit31 = coffee24.getUnit();
        boolean boolean32 = coffee24.getDecaf();
        boolean boolean33 = coffee24.getDecaf();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str41 = recipe40.getName();
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) 100);
        order44.serve();
        java.time.LocalDateTime localDateTime46 = order44.getOrderServed();
        boolean boolean47 = recipe10.equals((java.lang.Object) localDateTime46);
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str41, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", 100.0d);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee16 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str17 = coffee16.getName();
        boolean boolean18 = milk15.equals((java.lang.Object) coffee16);
        boolean boolean19 = recipe2.equals((java.lang.Object) coffee16);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Water [unit=ML, amount=30]", (double) (short) 10);
        java.lang.String str23 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean32 = cafe24.addRecipe(recipe27);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray33 = cafe24.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray34 = cafe24.getMenu();
        int int35 = cafe24.getIndexNextOrderToServe();
        cafe24.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray37 = cafe24.getOrders();
        boolean boolean38 = recipe2.equals((java.lang.Object) orderArray37);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee" + "'", str17, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(orderArray33);
        org.junit.Assert.assertNotNull(recipeArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(orderArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) -1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        java.lang.String str16 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = syrup18.getUnit();
        java.lang.String str20 = syrup18.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        java.lang.String str22 = syrup18.getFlavour();
        java.lang.String str23 = syrup18.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str22, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str23, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        java.lang.String str4 = cafe1.greeting();
        int int5 = cafe1.getIndexNextOrderToPlace();
        int int6 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        int int14 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe0.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(order15);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        int int29 = water1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type31 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk32 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type31);
        boolean boolean33 = water1.equals((java.lang.Object) milk32);
        java.lang.String str34 = water1.toString();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str34, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        int int14 = coffee13.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe18 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        java.lang.String str19 = cafe18.greeting();
        java.lang.String str20 = cafe18.greeting();
        boolean boolean21 = coffee13.equals((java.lang.Object) cafe18);
        // The following exception was thrown during execution in test generation
        try {
            recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee13);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
        java.time.LocalDateTime localDateTime4 = order3.getOrderServed();
        java.time.LocalDateTime localDateTime5 = order3.getOrderServed();
        order3.serve();
        // The following exception was thrown during execution in test generation
        try {
            order3.printReceipt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.time.LocalDateTime localDateTime21 = order20.getOrderServed();
        order20.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        int int2 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        java.lang.String str5 = syrup4.toString();
        boolean boolean6 = milk1.equals((java.lang.Object) syrup4);
        java.lang.String str7 = syrup4.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = cafe0.addRecipe(recipe5);
        java.lang.String str10 = recipe5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient11 = null;
        recipe5.addIngredient(ingredient11);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe13.getMenu();
        boolean boolean15 = recipe5.equals((java.lang.Object) recipeArray14);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk24);
        boolean boolean26 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type29 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type29);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk31 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type29);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str33 = coffee32.getName();
        boolean boolean34 = milk31.equals((java.lang.Object) coffee32);
        boolean boolean35 = recipe18.equals((java.lang.Object) coffee32);
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Welcome to Water [unit=ML, amount=30]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order49 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str50 = order49.toString();
        boolean boolean51 = recipe18.equals((java.lang.Object) str50);
        uk.ac.sheffield.com1003.cafe.Order order55 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 1, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        boolean boolean56 = recipe5.equals((java.lang.Object) recipe18);
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(recipeArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coffee" + "'", str33, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0" + "'", str50, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        java.lang.String str30 = milk22.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit31 = milk22.getUnit();
        java.lang.Class<?> wildcardClass32 = unit31.getClass();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str28, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str30, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) 'a');
        boolean boolean3 = water1.equals((java.lang.Object) (byte) 100);
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe4.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean31 = recipe26.isReady();
        java.lang.String str32 = recipe26.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type41 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk42 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type41);
        java.lang.String str43 = milk42.toString();
        recipe35.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk42);
        boolean boolean45 = recipe26.equals((java.lang.Object) recipe35);
        boolean boolean46 = cafe4.addRecipe(recipe35);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray47 = cafe4.getMenu();
        boolean boolean48 = water1.equals((java.lang.Object) cafe4);
        cafe4.printPendingOrders();
        int int50 = cafe4.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(recipeArray23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str32, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type41.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str43, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(recipeArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, true);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=10, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=10, decaf=true]");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        boolean boolean18 = cafe0.addRecipe(recipe12);
        boolean boolean19 = recipe12.isReady();
        boolean boolean20 = recipe12.isReady();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.Recipe.Size size28 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size28, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size28, (int) (short) 1);
        boolean boolean33 = recipe12.equals((java.lang.Object) recipe32);
        java.lang.String str34 = recipe12.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + size28 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size28.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) 100, (int) (short) 10);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe6.getOrders();
        boolean boolean8 = coffee4.equals((java.lang.Object) cafe6);
        java.lang.String str9 = coffee4.toString();
        boolean boolean10 = coffee4.getDecaf();
        int int11 = coffee4.getAmount();
        boolean boolean12 = coffee0.equals((java.lang.Object) coffee4);
        boolean boolean13 = coffee0.getDecaf();
        java.lang.String str14 = coffee0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertNotNull(orderArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order11.serve();
        java.lang.String str13 = order11.toString();
        java.lang.String str14 = order11.toString();
        order11.serve();
        java.lang.String str16 = order11.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str13, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str14, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str16, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 0, "Water [unit=ML, amount=10]");
        double double18 = recipe6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", 0, (int) (short) 0);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = milk8.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = cafe11.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray20 = cafe11.getOrders();
        java.lang.String str21 = cafe11.greeting();
        cafe11.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean26 = cafe11.addRecipe(recipe25);
        boolean boolean27 = milk8.equals((java.lang.Object) boolean26);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = milk8.getUnit();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk" + "'", str10, "Milk");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(orderArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", 1.0d);
        java.lang.Class<?> wildcardClass3 = recipe2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
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
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray30);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.Throwable[] throwableArray23 = tooManyIngredientsException16.getSuppressed();
        java.lang.Throwable[] throwableArray24 = tooManyIngredientsException16.getSuppressed();
        java.lang.String str25 = tooManyIngredientsException16.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str25, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray20 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray21 = cafe0.getOrders();
        int int22 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe0.getMenu();
        int int24 = cafe0.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(recipeArray20);
        org.junit.Assert.assertNotNull(orderArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(recipeArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        int int2 = coffee1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        boolean boolean5 = coffee1.equals((java.lang.Object) '4');
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        boolean boolean8 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30, true);
        boolean boolean12 = coffee1.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        int int2 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.getName();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(recipeArray19);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        cafe1.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
    }
}

