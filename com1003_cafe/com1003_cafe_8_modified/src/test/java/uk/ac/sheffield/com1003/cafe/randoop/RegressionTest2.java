package uk.ac.sheffield.com1003.cafe.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (-1.0d));
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0", 32.0d, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", "Milk [unit=ML, amount=0, type=SEMI]", 1.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.String str68 = tooManyIngredientsException0.toString();
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str68, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double11 = recipe6.getPrice();
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=ALMOND]", (-1.0d));
        boolean boolean17 = water1.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printPendingOrders();
        cafe1.printMenu();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 100.0d, "Milk");
        boolean boolean24 = cafe1.addRecipe(recipe6);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        java.lang.String str25 = recipe22.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Welcome to Cafe" + "'", str6, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.String str89 = tooManyIngredientsException75.toString();
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
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str89, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        java.lang.String str8 = cafe3.greeting();
        int int9 = cafe3.getIndexNextOrderToServe();
        java.lang.Class<?> wildcardClass10 = cafe3.getClass();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=8]", 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Coffee [unit=GR, amount=-1, decaf=false]", "Milk [unit=ML, amount=1, type=SEMI]", (double) 52);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        cafe1.printPendingOrders();
        java.lang.String str39 = cafe1.getName();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Cafe" + "'", str39, "Cafe");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        int int2 = syrup1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        int int4 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.String str15 = coffee7.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size2, (int) (short) 0);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, false);
        java.lang.String str9 = coffee8.toString();
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", 0.0d);
        boolean boolean33 = water0.equals((java.lang.Object) 0.0d);
        java.lang.String str34 = water0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water [unit=ML, amount=30]" + "'", str34, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit20 = syrup12.getUnit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str10 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 1);
        boolean boolean14 = cafe0.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) (byte) 1);
        order17.serve();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe1.getOrders();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        order21.serve();
        order21.printReceipt();
        java.lang.String str24 = order21.toString();
        java.time.LocalDateTime localDateTime25 = order21.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Order: ; For: Syrup; Paid: 0.0" + "'", str24, "Order: ; For: Syrup; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str11 = recipe7.getName();
        boolean boolean12 = cafe3.addRecipe(recipe7);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        int int2 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str3, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.lang.String str23 = coffee12.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order29.serve();
        order29.serve();
        boolean boolean32 = coffee12.equals((java.lang.Object) order29);
        order29.serve();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee" + "'", str23, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        java.lang.String str23 = cafe1.greeting();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean16 = cafe1.addRecipe(recipe4);
        java.lang.String str17 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str17, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        cafe17.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe17.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = cafe17.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) 1L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(order22);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", 52, (int) '#');
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
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
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException17 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException20 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException20.getSuppressed();
        java.lang.Throwable[] throwableArray22 = tooManyIngredientsException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException20.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException18.getSuppressed();
        cafeOutOfCapacityException17.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException18.getSuppressed();
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.String str34 = recipeNotFoundException18.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (-1), size14, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.lang.String str47 = recipeNotFoundException34.toString();
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = cafe0.addRecipe(recipe5);
        java.lang.String str10 = recipe5.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0", (double) 10.0f, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=1, decaf=false]; Paid: 1.0");
        java.lang.String str15 = order14.toString();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0; Paid: 10.0" + "'", str15, "Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0; Paid: 10.0");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        java.lang.String str6 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        java.lang.String str6 = recipe5.getName();
        boolean boolean7 = cafe0.addRecipe(recipe5);
        int int8 = cafe0.getIndexNextOrderToPlace();
        java.lang.String str9 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order11.serve();
        java.lang.String str13 = order11.toString();
        java.lang.String str14 = order11.toString();
        java.lang.String str15 = order11.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str13, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str14, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0" + "'", str15, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        java.lang.String str5 = water1.toString();
        java.lang.String str6 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=10]" + "'", str5, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=10]" + "'", str6, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToServe();
        java.lang.Class<?> wildcardClass6 = cafe3.getClass();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Syrup; Paid: 0.0");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        java.lang.String str5 = milk4.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=97, decaf=false]", 1, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe8.addRecipe(recipe11);
        boolean boolean17 = recipe11.isReady();
        boolean boolean18 = cafe3.addRecipe(recipe11);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        int int3 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Welcome to Coffee [unit=GR, amount=1, decaf=false]", "Coffee [unit=GR, amount=8, decaf=false]", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        int int7 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size32 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (-1), size32, (int) (short) 10);
        java.lang.String str35 = recipe34.getName();
        boolean boolean36 = water1.equals((java.lang.Object) str35);
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str35, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=100]", (int) (short) 10, 100);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        int int2 = cafe1.getIndexNextOrderToPlace();
        cafe1.printPendingOrders();
        cafe1.printMenu();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Coffee [unit=GR, amount=-1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        int int4 = cafe0.getIndexNextOrderToServe();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", "Milk [unit=ML, amount=32, type=WHOLE]", (double) 30);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        boolean boolean22 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52);
        uk.ac.sheffield.com1003.cafe.Cafe cafe2 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = cafe2.addRecipe(recipe5);
        java.lang.String str11 = cafe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe2.getMenu();
        boolean boolean13 = milk1.equals((java.lang.Object) cafe2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cafe" + "'", str11, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size9, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100L);
        boolean boolean17 = cafe3.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 100);
        boolean boolean21 = cafe3.addRecipe(recipe20);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Milk [unit=ML, amount=10, type=ALMOND]", (double) (short) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Cafe" + "'", str4, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str11 = recipe7.getName();
        boolean boolean12 = cafe3.addRecipe(recipe7);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe3.getOrders();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray14);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 100L);
        boolean boolean16 = cafe0.addRecipe(recipe15);
        java.lang.Class<?> wildcardClass17 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=97]", 10.0d, "Welcome to Water [unit=ML, amount=97]");
        java.lang.String str38 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = coffee1.equals((java.lang.Object) str13);
        java.lang.String str15 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        java.lang.Class<?> wildcardClass4 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        int int48 = milk15.getAmount();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str16, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException33 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException33.getSuppressed();
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) tooManyIngredientsException33);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException33);
        java.lang.Class<?> wildcardClass37 = tooManyIngredientsException33.getClass();
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
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0" + "'", str2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        order52.serve();
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray45 = cafe0.getOrders();
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
        org.junit.Assert.assertNotNull(orderArray45);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException0.getSuppressed();
        java.lang.String str8 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        java.lang.Class<?> wildcardClass12 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str4 = cafe3.greeting();
        int int5 = cafe3.getIndexNextOrderToServe();
        java.lang.String str6 = cafe3.getName();
        boolean boolean7 = coffee1.equals((java.lang.Object) cafe3);
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
        boolean boolean37 = coffee1.equals((java.lang.Object) water9);
        java.lang.String str38 = water9.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str38, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=SEMI]; Paid: 8.0");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=10, decaf=false]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (double) (-1.0f));
        boolean boolean29 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", (-1.0d));
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.getName();
        int int4 = cafe0.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        java.lang.String str5 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Order: ; For: Cafe; Paid: -1.0" + "'", str3, "Welcome to Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", 0.0d);
        boolean boolean33 = water0.equals((java.lang.Object) 0.0d);
        java.lang.String str34 = water0.toString();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water [unit=ML, amount=30]" + "'", str34, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str4 = cafe3.greeting();
        int int5 = cafe3.getIndexNextOrderToServe();
        java.lang.String str6 = cafe3.getName();
        boolean boolean7 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str8 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cafe" + "'", str8, "Cafe");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", (double) (byte) 1, size2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = size2.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        java.lang.String str25 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=true]" + "'", str25, "Coffee [unit=GR, amount=-1, decaf=true]");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (int) (short) 10, 100);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "", (double) 8, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean41 = water1.equals((java.lang.Object) "Coffee [unit=GR, amount=8, decaf=false]");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk5.getUnit();
        boolean boolean7 = recipe2.equals((java.lang.Object) milk5);
        java.lang.String str8 = milk5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = milk5.getUnit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee2.getUnit();
        java.lang.String str5 = coffee2.getName();
        java.lang.String str6 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee" + "'", str5, "Coffee");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        java.lang.Object obj5 = null;
        boolean boolean6 = water1.equals(obj5);
        java.lang.Object obj7 = null;
        boolean boolean8 = water1.equals(obj7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe10.serveOrder();
        int int12 = cafe10.getIndexNextOrderToServe();
        boolean boolean13 = water1.equals((java.lang.Object) int12);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe15.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray17 = cafe15.getOrders();
        boolean boolean18 = water1.equals((java.lang.Object) orderArray17);
        java.lang.String str19 = water1.toString();
        java.lang.String str20 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str27 = recipe23.getName();
        java.lang.String str28 = recipe23.getName();
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Welcome to ", (double) 10, "Coffee");
        order32.printReceipt();
        boolean boolean34 = water1.equals((java.lang.Object) order32);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException37 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = tooManyIngredientsException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        tooManyIngredientsException37.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException37.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        boolean boolean46 = water1.equals((java.lang.Object) recipeNotFoundException43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(orderArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=10]" + "'", str19, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=10]" + "'", str20, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]", 52, 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        int int5 = milk1.getAmount();
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water23 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str24 = water23.toString();
        java.lang.String str25 = water23.toString();
        java.lang.String str26 = water23.toString();
        boolean boolean27 = milk18.equals((java.lang.Object) water23);
        java.lang.Object obj28 = null;
        boolean boolean29 = water23.equals(obj28);
        boolean boolean30 = milk1.equals((java.lang.Object) water23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str19, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=30]" + "'", str25, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water [unit=ML, amount=30]" + "'", str26, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        cafe1.printPendingOrders();
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size12, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size12, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size12, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size12, 52);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", 10.0d, size12, 0);
        boolean boolean23 = cafe1.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray24 = cafe1.getOrders();
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(orderArray24);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) 'a');
        boolean boolean3 = water1.equals((java.lang.Object) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 100, "Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean26 = milk23.equals((java.lang.Object) cafe25);
        uk.ac.sheffield.com1003.cafe.Order order27 = cafe25.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order28 = cafe25.serveOrder();
        boolean boolean29 = recipe9.equals((java.lang.Object) cafe25);
        boolean boolean30 = water1.equals((java.lang.Object) cafe25);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(order27);
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) 10L);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        java.time.LocalDateTime localDateTime17 = order16.getOrderServed();
        order16.serve();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        int int5 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        java.lang.String str7 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=-1, type=WHOLE]");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=null]");
        int int2 = syrup1.getAmount();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str3, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        int int5 = cafe3.getIndexNextOrderToPlace();
        java.lang.String str6 = cafe3.greeting();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee1.getUnit();
        java.lang.String str5 = coffee1.toString();
        java.lang.Object obj6 = null;
        boolean boolean7 = coffee1.equals(obj6);
        java.lang.String str8 = coffee1.getName();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee" + "'", str8, "Coffee");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup1.getUnit();
        java.lang.String str7 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        int int6 = coffee1.getAmount();
        java.lang.String str7 = coffee1.toString();
        boolean boolean8 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]", 32.0d);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cafe17.placeOrder("Syrup [unit=ML, amount=10, flavour=]", "", (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        cafe0.printMenu();
        int int6 = cafe0.getIndexNextOrderToServe();
        cafe0.printPendingOrders();
        java.lang.String str8 = cafe0.getName();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cafe" + "'", str8, "Cafe");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Plain", (double) (short) 0, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order17.serve();
        java.time.LocalDateTime localDateTime19 = order17.getOrderServed();
        boolean boolean20 = recipe2.equals((java.lang.Object) order17);
        order17.serve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = milk7.getUnit();
        boolean boolean9 = coffee1.equals((java.lang.Object) unit8);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean11 = coffee1.equals((java.lang.Object) size10);
        java.lang.String str12 = coffee1.toString();
        boolean boolean13 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = coffee1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee", (double) 32);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) 0, size2, 52);
        java.lang.String str5 = recipe4.getName();
        boolean boolean6 = recipe4.isReady();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str5 = water4.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type19 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type19);
        java.lang.String str21 = milk20.toString();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        boolean boolean27 = recipe10.equals((java.lang.Object) (short) -1);
        boolean boolean28 = water4.equals((java.lang.Object) recipe10);
        boolean boolean29 = cafe1.addRecipe(recipe10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=10]" + "'", str5, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        java.lang.Throwable[] throwableArray14 = cafeOutOfCapacityException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException17 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray18 = tooManyIngredientsException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        tooManyIngredientsException17.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException24.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray37 = tooManyIngredientsException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        tooManyIngredientsException36.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        java.lang.Throwable[] throwableArray44 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException47 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray48 = tooManyIngredientsException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = tooManyIngredientsException47.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        tooManyIngredientsException47.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException53 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException47.addSuppressed((java.lang.Throwable) recipeNotFoundException53);
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException53);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup57 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str58 = syrup57.getFlavour();
        int int59 = syrup57.getAmount();
        java.lang.String str60 = syrup57.toString();
        java.lang.String str61 = syrup57.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException62 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean63 = syrup57.equals((java.lang.Object) tooManyIngredientsException62);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException64 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException62.addSuppressed((java.lang.Throwable) tooManyIngredientsException64);
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) tooManyIngredientsException64);
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        java.lang.String str69 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str60, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str69, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.Object obj10 = null;
        boolean boolean11 = water0.equals(obj10);
        java.lang.String str12 = water0.getName();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]", (double) 1.0f, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        double double57 = recipe39.getPrice();
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
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 32.0d + "'", double57 == 32.0d);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        order21.serve();
        order21.printReceipt();
        java.lang.String str24 = order21.toString();
        java.lang.String str25 = order21.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Order: ; For: Syrup; Paid: 0.0" + "'", str24, "Order: ; For: Syrup; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Order: ; For: Syrup; Paid: 0.0" + "'", str25, "Order: ; For: Syrup; Paid: 0.0");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (byte) 10, 30);
        int int4 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException7 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray8 = tooManyIngredientsException7.getSuppressed();
        java.lang.Throwable[] throwableArray9 = tooManyIngredientsException7.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        tooManyIngredientsException7.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
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
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException24 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException27 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray28 = tooManyIngredientsException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = tooManyIngredientsException27.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException30.getSuppressed();
        tooManyIngredientsException27.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException27.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException25.getSuppressed();
        cafeOutOfCapacityException24.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        tooManyIngredientsException7.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray38);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", "Milk [unit=ML, amount=100, type=SOY]", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        java.lang.String str4 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Syrup [unit=ML, amount=10, flavour=Milk]", 32.0d, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        java.time.LocalDateTime localDateTime41 = order40.getOrderServed();
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
        org.junit.Assert.assertNull(localDateTime41);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        int int4 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee" + "'", str2, "Coffee");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = milk12.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=WHOLE]", (double) 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        java.lang.String str5 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=SEMI]; Paid: 8.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        java.lang.String str22 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str22, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup; Paid: 0.0", (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str4 = water3.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean12 = water3.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        double double16 = recipe7.getPrice();
        boolean boolean17 = milk1.equals((java.lang.Object) double16);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type20 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type20);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type20);
        java.lang.String str23 = milk22.toString();
        java.lang.String str24 = milk22.toString();
        java.lang.String str25 = milk22.toString();
        boolean boolean26 = milk1.equals((java.lang.Object) milk22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str23, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str24, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str25, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.Class<?> wildcardClass25 = milk22.getClass();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean16 = cafe1.addRecipe(recipe4);
        java.lang.Class<?> wildcardClass17 = cafe1.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=ALMOND]", (int) ' ', (int) (short) 10);
        int int4 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        int int16 = water1.getAmount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) ' ', 8);
        cafe3.printPendingOrders();
        cafe3.printMenu();
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        java.lang.String str5 = coffee2.toString();
        java.lang.String str6 = coffee2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size19, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size19, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size19, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size19, 52);
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", 10.0d, size19, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=WHOLE]", (double) (short) 1, size19, (int) '4');
        boolean boolean32 = coffee2.equals((java.lang.Object) size19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=32, decaf=false]", 8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Cafe]", (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Milk [unit=ML, amount=32, type=WHOLE]", "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str7 = water6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean9 = water6.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type8);
        boolean boolean12 = water1.equals((java.lang.Object) (byte) 100);
        java.lang.String str13 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str2, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=10]" + "'", str7, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str13, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) (-1L));
        order13.serve();
        java.lang.String str15 = order13.toString();
        order13.serve();
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: Cafe; Paid: -1.0" + "'", str15, "Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean17 = recipe13.isReady();
        double double18 = recipe13.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order22.serve();
        boolean boolean24 = water10.equals((java.lang.Object) order22);
        boolean boolean25 = milk8.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0", (double) 100);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) 0.0f);
        boolean boolean6 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) 'a');
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        double double32 = recipe15.getPrice();
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
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        boolean boolean12 = recipe6.isReady();
        double double13 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ');
        java.lang.String str16 = coffee15.toString();
        java.lang.String str17 = coffee15.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=32, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=32, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=32, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=32, decaf=false]");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        boolean boolean3 = coffee1.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str7 = syrup6.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = syrup6.getUnit();
        java.lang.String str9 = syrup6.toString();
        java.lang.String str10 = syrup6.getName();
        boolean boolean11 = coffee1.equals((java.lang.Object) str10);
        boolean boolean12 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup" + "'", str7, "Syrup");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Syrup" + "'", str10, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size10, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size10, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) (byte) 10, size10, 30);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Syrup; Paid: 0.0", (double) (short) 10, size10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 100.0", (double) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        boolean boolean6 = recipe2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=SEMI]", (int) (short) 0, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        java.lang.String str20 = cafe0.greeting();
        int int21 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Cafe" + "'", str20, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", (double) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        java.lang.String str7 = cafe4.greeting();
        int int8 = cafe4.getIndexNextOrderToServe();
        java.lang.String str9 = cafe4.greeting();
        boolean boolean10 = recipe2.equals((java.lang.Object) str9);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", 0.0d, size2, (int) (byte) 0);
        java.lang.String str5 = recipe4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=52]" + "'", str5, "Water [unit=ML, amount=52]");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean12 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        boolean boolean16 = coffee15.getDecaf();
        java.lang.String str17 = coffee15.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe20.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk26);
        boolean boolean29 = milk26.equals((java.lang.Object) (byte) 0);
        boolean boolean30 = coffee15.equals((java.lang.Object) (byte) 0);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee15);
        java.lang.String str32 = coffee15.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str17, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str32, "Coffee [unit=GR, amount=100, decaf=true]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) (-1.0f));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (int) (byte) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size12, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 100.0", (double) 1L, size12, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=WHOLE]", (double) (short) 10, size12, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 10L, size12, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
        boolean boolean3 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe1.getOrders();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe1.getOrders();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type1);
        java.lang.String str3 = milk2.toString();
        java.lang.String str4 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", 10.0d);
        boolean boolean8 = milk2.equals((java.lang.Object) recipe7);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str3, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str4, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Welcome to Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe5.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe5.getOrders();
        boolean boolean8 = coffee1.equals((java.lang.Object) cafe5);
        // The following exception was thrown during execution in test generation
        try {
            cafe5.removeRecipe("Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk4.getUnit();
        java.lang.String str7 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=100, type=SOY]" + "'", str5, "Milk [unit=ML, amount=100, type=SOY]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=100, type=SOY]" + "'", str7, "Milk [unit=ML, amount=100, type=SOY]");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean10 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str11 = milk1.getName();
        java.lang.String str12 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk" + "'", str11, "Milk");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        double double12 = recipe6.getPrice();
        double double13 = recipe6.getPrice();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to ");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee1.getUnit();
        java.lang.String str5 = coffee1.toString();
        java.lang.String str6 = coffee1.toString();
        java.lang.String str7 = coffee1.toString();
        boolean boolean8 = coffee1.getDecaf();
        boolean boolean10 = coffee1.equals((java.lang.Object) "Milk");
        java.lang.String str11 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        java.lang.String str72 = recipeNotFoundException44.toString();
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str72, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        int int4 = cafe1.getIndexNextOrderToPlace();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        double double11 = recipe10.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) 'a', "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe1.addRecipe(recipe10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        int int2 = milk1.getAmount();
        uk.ac.sheffield.com1003.cafe.App app3 = new uk.ac.sheffield.com1003.cafe.App();
        boolean boolean4 = milk1.equals((java.lang.Object) app3);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water6 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str7 = water6.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean15 = water6.equals((java.lang.Object) recipe10);
        boolean boolean16 = milk1.equals((java.lang.Object) recipe10);
        int int17 = milk1.getAmount();
        java.lang.String str18 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean26 = recipe21.isReady();
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean31 = milk1.equals((java.lang.Object) (byte) 10);
        java.lang.Class<?> wildcardClass32 = milk1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=52]" + "'", str7, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk" + "'", str18, "Milk");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk5.getUnit();
        boolean boolean7 = recipe2.equals((java.lang.Object) milk5);
        java.lang.String str8 = milk5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.lang.String str14 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean30 = recipe21.isReady();
        boolean boolean31 = syrup18.equals((java.lang.Object) recipe21);
        java.lang.String str32 = recipe21.getName();
        double double33 = recipe21.getPrice();
        boolean boolean34 = recipe21.isReady();
        boolean boolean35 = cafe16.addRecipe(recipe21);
        boolean boolean36 = milk1.equals((java.lang.Object) boolean35);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str43 = recipe39.getName();
        java.lang.String str44 = recipe39.getName();
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Welcome to ", (double) 10, "Coffee");
        order48.printReceipt();
        java.time.LocalDateTime localDateTime50 = order48.getOrderServed();
        boolean boolean51 = milk1.equals((java.lang.Object) localDateTime50);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk" + "'", str14, "Milk");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str32, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str43, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str44, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNull(localDateTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = milk7.getUnit();
        boolean boolean9 = coffee1.equals((java.lang.Object) unit8);
        boolean boolean10 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water12 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str13 = water12.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type14 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean15 = water12.equals((java.lang.Object) type14);
        java.lang.Object obj16 = null;
        boolean boolean17 = water12.equals(obj16);
        java.lang.Object obj18 = null;
        boolean boolean19 = water12.equals(obj18);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe21.serveOrder();
        int int23 = cafe21.getIndexNextOrderToServe();
        boolean boolean24 = water12.equals((java.lang.Object) int23);
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe26.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray28 = cafe26.getOrders();
        boolean boolean29 = water12.equals((java.lang.Object) orderArray28);
        java.lang.String str30 = water12.toString();
        java.lang.String str31 = water12.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str38 = recipe34.getName();
        java.lang.String str39 = recipe34.getName();
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Welcome to ", (double) 10, "Coffee");
        order43.printReceipt();
        boolean boolean45 = water12.equals((java.lang.Object) order43);
        boolean boolean46 = coffee1.equals((java.lang.Object) order43);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=10]" + "'", str13, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(orderArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Water [unit=ML, amount=10]" + "'", str30, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=10]" + "'", str31, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException60.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException62 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray63 = tooManyIngredientsException62.getSuppressed();
        java.lang.Throwable[] throwableArray64 = tooManyIngredientsException62.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException65 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray66 = recipeNotFoundException65.getSuppressed();
        tooManyIngredientsException62.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException68 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException62.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        recipeNotFoundException60.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        java.lang.String str72 = recipeNotFoundException40.toString();
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
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str72, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        java.lang.String str11 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=32, type=WHOLE]", (double) 1);
        order14.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 1L, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(32);
        boolean boolean9 = recipe2.equals((java.lang.Object) coffee8);
        boolean boolean10 = recipe2.isReady();
        double double11 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = recipe14.isReady();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup32 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        java.lang.String str33 = syrup32.toString();
        java.lang.String str34 = syrup32.toString();
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup32);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str33, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]" + "'", str34, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Throwable[] throwableArray29 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException30 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException30.getSuppressed();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException30.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        tooManyIngredientsException30.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException30.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException39 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException39.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException41 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray42 = tooManyIngredientsException41.getSuppressed();
        java.lang.Throwable[] throwableArray43 = tooManyIngredientsException41.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException44 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException44.getSuppressed();
        tooManyIngredientsException41.addSuppressed((java.lang.Throwable) recipeNotFoundException44);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException41.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException52 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray53 = tooManyIngredientsException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = tooManyIngredientsException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        tooManyIngredientsException52.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException52.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException58.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        java.lang.Throwable[] throwableArray65 = recipeNotFoundException36.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]]", "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]]", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean30 = recipe25.isReady();
        boolean boolean31 = water17.equals((java.lang.Object) boolean30);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water33 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str34 = water33.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe37, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean42 = water33.equals((java.lang.Object) recipe37);
        java.lang.Object obj43 = null;
        boolean boolean44 = water33.equals(obj43);
        boolean boolean45 = water17.equals(obj43);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water [unit=ML, amount=52]" + "'", str34, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        order6.serve();
        java.time.LocalDateTime localDateTime11 = order6.getOrderServed();
        order6.serve();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=true]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size12, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (-1L), size12, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=8]", (double) (byte) 100, size12, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 1.0", 100.0d, size12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=WHOLE]", (double) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe1.getMenu();
        int int9 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray10 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(orderArray10);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=35, decaf=true]");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe1.getOrders();
        int int6 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(orderArray3);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        cafe3.printMenu();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        int int22 = coffee1.getAmount();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        double double10 = recipe2.getPrice();
        java.lang.String str11 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10.0f, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
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
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.printReceipt();
        order11.printReceipt();
        order11.serve();
        java.lang.String str15 = order11.toString();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=100, decaf=true]");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]", "Water [unit=ML, amount=97]", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        java.lang.String str20 = milk0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water22 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj23 = null;
        boolean boolean24 = water22.equals(obj23);
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe27, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double32 = recipe27.getPrice();
        boolean boolean33 = recipe27.isReady();
        boolean boolean34 = water22.equals((java.lang.Object) recipe27);
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient35 = null;
        recipe27.addIngredient(ingredient35);
        boolean boolean37 = recipe27.isReady();
        boolean boolean38 = milk0.equals((java.lang.Object) recipe27);
        boolean boolean39 = recipe27.isReady();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str4, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk" + "'", str20, "Milk");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        int int6 = cafe1.getIndexNextOrderToServe();
        int int7 = cafe1.getIndexNextOrderToServe();
        cafe1.printPendingOrders();
        int int9 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str10 = cafe1.getName();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=8, type=SOY]", (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean2 = water0.equals((java.lang.Object) (short) -1);
        java.lang.String str3 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        boolean boolean11 = water0.equals((java.lang.Object) milk10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str14 = syrup13.getName();
        java.lang.String str15 = syrup13.toString();
        boolean boolean16 = water0.equals((java.lang.Object) str15);
        java.lang.String str17 = water0.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup" + "'", str14, "Syrup");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=30]" + "'", str17, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        int int21 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=10]; Paid: 100.0", "Coffee [unit=GR, amount=-1, decaf=false]", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(recipeArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (int) (short) 100, 52);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        int int4 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) ' ');
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=WHOLE]", 10, (int) '4');
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=35, decaf=false]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.time.LocalDateTime localDateTime48 = order47.getOrderServed();
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
        org.junit.Assert.assertNull(localDateTime48);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", 52.0d);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        java.lang.String str15 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cafe3.placeOrder("Water [unit=ML, amount=0]", "Milk [unit=ML, amount=-1, type=SOY]", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order16);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=SOY]", (double) 1, size6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = recipe12.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        int int2 = cafe1.getIndexNextOrderToServe();
        java.lang.String str3 = cafe1.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str3, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) 0, size2, 52);
        double double5 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException5 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = tooManyIngredientsException5.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException8 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException8.getSuppressed();
        tooManyIngredientsException5.addSuppressed((java.lang.Throwable) recipeNotFoundException8);
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException5.getSuppressed();
        boolean boolean12 = milk1.equals((java.lang.Object) throwableArray11);
        java.lang.String str13 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str13, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean10 = water8.equals((java.lang.Object) type9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = milk11.getUnit();
        java.lang.String str14 = milk11.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.String str24 = cafeOutOfCapacityException0.toString();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        order7.printReceipt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", 0, 0);
        boolean boolean26 = recipe7.equals((java.lang.Object) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup28 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean40 = recipe31.isReady();
        boolean boolean41 = syrup28.equals((java.lang.Object) recipe31);
        java.lang.String str42 = syrup28.getFlavour();
        boolean boolean43 = recipe7.equals((java.lang.Object) syrup28);
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 'a', "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        java.lang.String str8 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = water0.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = water0.getUnit();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=-1]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=-1]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=-1]]");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        uk.ac.sheffield.com1003.cafe.Order order45 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Syrup [unit=ML, amount=10, flavour=Milk]", 52.0d);
        order45.printReceipt();
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
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        cafe3.printMenu();
        cafe3.printPendingOrders();
        int int7 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        boolean boolean57 = coffee18.getDecaf();
        boolean boolean58 = coffee18.getDecaf();
        boolean boolean59 = coffee18.getDecaf();
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = milk7.getUnit();
        boolean boolean9 = coffee1.equals((java.lang.Object) unit8);
        java.lang.String str10 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", 1.0d);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        double double17 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str15, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
        order23.printReceipt();
        order23.serve();
        order23.serve();
        order23.printReceipt();
        order23.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 1L, "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient7 = null;
        recipe2.addIngredient(ingredient7);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean22 = recipe13.isReady();
        boolean boolean23 = syrup10.equals((java.lang.Object) recipe13);
        java.lang.String str24 = recipe13.getName();
        double double25 = recipe13.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        boolean boolean29 = coffee27.getDecaf();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        double double31 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException3 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) tooManyIngredientsException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException0.getSuppressed();
        java.lang.String str7 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        java.lang.String str9 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe7.getMenu();
        boolean boolean11 = milk2.equals((java.lang.Object) cafe7);
        // The following exception was thrown during execution in test generation
        try {
            cafe7.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=10]; Paid: 100.0");
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
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
            boolean boolean14 = cafe1.placeOrder("Coffee [unit=GR, amount=0, decaf=false]", "Water [unit=ML, amount=1]", (double) (-1.0f));
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
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=52, decaf=false]");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk", (int) '#', (int) (byte) 10);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size4, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size4, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", (double) (-1L));
        boolean boolean12 = recipe8.isReady();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 10);
        int int2 = water1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str5 = syrup4.getFlavour();
        int int6 = syrup4.getAmount();
        java.lang.String str7 = syrup4.toString();
        java.lang.String str8 = syrup4.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean10 = syrup4.equals((java.lang.Object) tooManyIngredientsException9);
        boolean boolean11 = water1.equals((java.lang.Object) tooManyIngredientsException9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type15 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type15);
        boolean boolean19 = water1.equals((java.lang.Object) milk18);
        java.lang.String str20 = water1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=10]" + "'", str20, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray21 = cafe17.getOrders();
        int int22 = cafe17.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = cafe17.placeOrder("Milk [unit=ML, amount=-1, type=WHOLE]", "Welcome to Water [unit=ML, amount=30]", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(orderArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee", 0, (int) (byte) 1);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        java.lang.String str7 = cafe1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=100]", (double) (byte) 0, "Coffee [unit=GR, amount=52, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        int int11 = milk10.getAmount();
        uk.ac.sheffield.com1003.cafe.App app12 = new uk.ac.sheffield.com1003.cafe.App();
        boolean boolean13 = milk10.equals((java.lang.Object) app12);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str16 = water15.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean24 = water15.equals((java.lang.Object) recipe19);
        boolean boolean25 = milk10.equals((java.lang.Object) recipe19);
        int int26 = milk10.getAmount();
        java.lang.String str27 = milk10.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean35 = recipe30.isReady();
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean40 = milk10.equals((java.lang.Object) (byte) 10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=52]" + "'", str16, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk" + "'", str27, "Milk");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
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
        int int38 = coffee2.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean45 = recipe41.isReady();
        boolean boolean46 = coffee2.equals((java.lang.Object) recipe41);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee1.getUnit();
        int int4 = coffee1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f, size6, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 100L, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0", (double) 0L, size6, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) (-1.0f));
        java.lang.String str30 = recipe29.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup32 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        recipe29.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup32);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str22, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str23, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Welcome to Coffee [unit=GR, amount=1, decaf=false]" + "'", str30, "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=8]", 52.0d);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) '4', size6, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) (-1), size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (short) 1, size6, 8);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", 52.0d, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        order16.serve();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk]", (double) '#');
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        java.lang.Class<?> wildcardClass6 = cafe3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray21 = cafe17.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str28 = recipe24.getName();
        java.lang.String str29 = recipe24.getName();
        boolean boolean30 = cafe17.addRecipe(recipe24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = cafe17.placeOrder("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", "Coffee [unit=GR, amount=0, decaf=true]", 8.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(orderArray21);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        cafe0.printPendingOrders();
        int int4 = cafe0.getIndexNextOrderToPlace();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        java.lang.Class<?> wildcardClass6 = syrup1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = syrup8.getUnit();
        boolean boolean10 = milk6.equals((java.lang.Object) syrup8);
        java.lang.String str11 = milk6.toString();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=10, type=SOY]" + "'", str11, "Milk [unit=ML, amount=10, type=SOY]");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = milk8.toString();
        java.lang.String str11 = milk8.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        int int5 = cafe1.getIndexNextOrderToPlace();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee1.getUnit();
        java.lang.String str5 = coffee1.toString();
        java.lang.String str6 = coffee1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int10 = coffee9.getAmount();
        java.lang.String str11 = coffee9.toString();
        boolean boolean13 = coffee9.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        java.lang.String str14 = coffee9.getName();
        boolean boolean15 = coffee1.equals((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee" + "'", str14, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        boolean boolean12 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        boolean boolean16 = coffee15.getDecaf();
        java.lang.String str17 = coffee15.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe20.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk26);
        boolean boolean29 = milk26.equals((java.lang.Object) (byte) 0);
        boolean boolean30 = coffee15.equals((java.lang.Object) (byte) 0);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee15);
        double double32 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str17, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 32.0d + "'", double32 == 32.0d);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(97);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=false]");
        java.lang.String str2 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=1, decaf=false]; Paid: 1.0", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Coffee [unit=GR, amount=-1, decaf=false]" + "'", str2, "Welcome to Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type1);
        java.lang.String str3 = milk2.toString();
        java.lang.String str4 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=SOY]" + "'", str3, "Milk [unit=ML, amount=-1, type=SOY]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=SOY]" + "'", str4, "Milk [unit=ML, amount=-1, type=SOY]");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 10L, size6, (int) (byte) 0);
        double double13 = recipe12.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Coffee [unit=GR, amount=0, decaf=false]", (double) (short) -1, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (int) (short) 10, 100);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Welcome to Welcome to Cafe", "Milk [unit=ML, amount=32, type=ALMOND]", 10.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException5 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException5.getSuppressed();
        boolean boolean7 = milk4.equals((java.lang.Object) throwableArray6);
        java.lang.String str8 = milk4.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        java.lang.Throwable throwable29 = null;
        // The following exception was thrown during execution in test generation
        try {
            tooManyIngredientsException9.addSuppressed(throwable29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        java.lang.String str3 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (double) (short) 100, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        java.time.LocalDateTime localDateTime8 = order7.getOrderServed();
        order7.printReceipt();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=97]", 10.0d, "Welcome to Water [unit=ML, amount=97]");
        uk.ac.sheffield.com1003.cafe.Cafe cafe38 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean47 = cafe39.addRecipe(recipe42);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray48 = cafe39.getOrders();
        java.lang.String str49 = cafe39.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe50 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe53 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order57 = new uk.ac.sheffield.com1003.cafe.Order(recipe53, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean58 = cafe50.addRecipe(recipe53);
        boolean boolean59 = cafe39.addRecipe(recipe53);
        boolean boolean60 = cafe38.addRecipe(recipe53);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray61 = cafe38.getOrders();
        boolean boolean62 = recipe2.equals((java.lang.Object) cafe38);
        cafe38.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(orderArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Welcome to Cafe" + "'", str49, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(orderArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Milk [unit=ML, amount=32, type=WHOLE]", "Syrup [unit=ML, amount=10, flavour=]", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        boolean boolean9 = recipe2.isReady();
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        int int16 = coffee12.getAmount();
        boolean boolean18 = coffee12.equals((java.lang.Object) 0.0d);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        java.lang.String str20 = coffee12.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit21 = coffee12.getUnit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (int) (byte) 0, 1);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        cafe4.printPendingOrders();
        java.lang.String str51 = cafe4.getName();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Cafe" + "'", str51, "Cafe");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = syrup1.equals(obj4);
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 0L, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        java.lang.String str26 = recipe7.getName();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean38 = recipe33.isReady();
        java.lang.String str39 = recipe33.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water41 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type42 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean43 = water41.equals((java.lang.Object) type42);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk44 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type42);
        java.lang.String str45 = milk44.toString();
        boolean boolean46 = recipe33.equals((java.lang.Object) milk44);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk47 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        boolean boolean48 = milk44.equals((java.lang.Object) milk47);
        boolean boolean49 = syrup28.equals((java.lang.Object) boolean48);
        java.lang.String str50 = syrup28.toString();
        java.lang.Class<?> wildcardClass51 = syrup28.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type42.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str45, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str50, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        java.lang.String str43 = tooManyIngredientsException34.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str43, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe0.getOrders();
        int int14 = cafe0.getIndexNextOrderToServe();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=-1, type=null]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        java.lang.String str7 = recipe2.getName();
        boolean boolean8 = recipe2.isReady();
        double double9 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=100, type=WHOLE]", (double) (short) 100, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        order13.printReceipt();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        boolean boolean23 = cafe0.placeOrder("", "Order: ; For: Coffee [unit=GR, amount=-1, decaf=false]; Paid: 0.0", (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.Class<?> wildcardClass4 = recipeArray3.getClass();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        java.lang.String str12 = milk9.toString();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str12, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.getFlavour();
        java.lang.String str7 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup" + "'", str7, "Syrup");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe2 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = cafe2.addRecipe(recipe5);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray11 = cafe2.getOrders();
        java.lang.String str12 = cafe2.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean19 = recipe15.isReady();
        boolean boolean20 = cafe2.addRecipe(recipe15);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray21 = cafe2.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean29 = recipe24.isReady();
        java.lang.String str30 = recipe24.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe33, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type39 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk40 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type39);
        java.lang.String str41 = milk40.toString();
        recipe33.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk40);
        boolean boolean43 = recipe24.equals((java.lang.Object) recipe33);
        boolean boolean44 = cafe2.addRecipe(recipe33);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray45 = cafe2.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray46 = cafe2.getMenu();
        boolean boolean47 = milk1.equals((java.lang.Object) recipeArray46);
        java.lang.String str48 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(orderArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(recipeArray21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str30, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type39.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str41, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(recipeArray45);
        org.junit.Assert.assertNotNull(recipeArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str48, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) '4', size10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) (-1), size10, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (short) 1, size10, 8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 10, size10, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", 100.0d, size10, 0);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        cafe4.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray51 = cafe4.getOrders();
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
        org.junit.Assert.assertNotNull(orderArray51);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
        java.time.LocalDateTime localDateTime4 = order3.getOrderServed();
        java.time.LocalDateTime localDateTime5 = order3.getOrderServed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = order3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime4);
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=WHOLE]");
        boolean boolean5 = milk2.equals((java.lang.Object) cafe4);
        int int6 = cafe4.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type12 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type12);
        java.lang.String str14 = milk13.toString();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        double double16 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        java.time.LocalDateTime localDateTime21 = order20.getOrderServed();
        boolean boolean22 = coffee2.equals((java.lang.Object) localDateTime21);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = coffee2.getUnit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str14, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0" + "'", str12, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0" + "'", str13, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str36 = cafe35.greeting();
        java.lang.String str37 = cafe35.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray38 = cafe35.getMenu();
        boolean boolean39 = coffee30.equals((java.lang.Object) recipeArray38);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Welcome to Cafe" + "'", str36, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Welcome to Cafe" + "'", str37, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=52, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=52, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=52, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=52, decaf=false]");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        boolean boolean18 = recipe2.equals((java.lang.Object) "");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup20 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup20);
        double double22 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient23 = null;
        recipe2.addIngredient(ingredient23);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", 0, 0);
        boolean boolean26 = recipe7.equals((java.lang.Object) 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe27 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean35 = cafe27.addRecipe(recipe30);
        uk.ac.sheffield.com1003.cafe.Cafe cafe36 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean44 = cafe36.addRecipe(recipe39);
        boolean boolean45 = cafe27.addRecipe(recipe39);
        int int46 = cafe27.getIndexNextOrderToPlace();
        cafe27.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Cafe cafe48 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe51 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order55 = new uk.ac.sheffield.com1003.cafe.Order(recipe51, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean56 = cafe48.addRecipe(recipe51);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray57 = cafe48.getOrders();
        java.lang.String str58 = cafe48.greeting();
        cafe48.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe62 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean63 = cafe48.addRecipe(recipe62);
        uk.ac.sheffield.com1003.cafe.Recipe recipe66 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order70 = new uk.ac.sheffield.com1003.cafe.Order(recipe66, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk72 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe66.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk72);
        boolean boolean74 = recipe62.equals((java.lang.Object) recipe66);
        boolean boolean75 = cafe27.addRecipe(recipe66);
        uk.ac.sheffield.com1003.cafe.Order order79 = new uk.ac.sheffield.com1003.cafe.Order(recipe66, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100.0f, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Order order83 = new uk.ac.sheffield.com1003.cafe.Order(recipe66, "Milk [unit=ML, amount=0, type=ALMOND]", 0.0d, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]");
        boolean boolean84 = recipe7.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(orderArray57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Welcome to Cafe" + "'", str58, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        boolean boolean15 = recipe7.isReady();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=0, type=SEMI]");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray16 = cafe0.getOrders();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(orderArray16);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", 100.0d);
        boolean boolean3 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        order6.printReceipt();
        order6.printReceipt();
        order6.serve();
        order6.printReceipt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        java.lang.String str7 = cafe3.greeting();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size50 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size50, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size50, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe56 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size50, (int) (short) 100);
        boolean boolean57 = cafe0.addRecipe(recipe56);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
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
        org.junit.Assert.assertTrue("'" + size50 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size50.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
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
        java.lang.String str46 = recipeNotFoundException40.toString();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str46, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]", (int) '#', (int) (short) 100);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) 'a');
        java.lang.String str2 = water1.getName();
        java.lang.String str3 = water1.toString();
        java.lang.String str4 = water1.toString();
        java.lang.String str5 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water" + "'", str2, "Water");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=97]" + "'", str3, "Water [unit=ML, amount=97]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=97]" + "'", str4, "Water [unit=ML, amount=97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=97]" + "'", str5, "Water [unit=ML, amount=97]");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        int int9 = cafe7.getIndexNextOrderToServe();
        boolean boolean10 = milk2.equals((java.lang.Object) cafe7);
        int int11 = cafe7.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe7.getMenu();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(recipeArray12);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk1.getUnit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Cafe; Paid: -1.0", (double) 100L);
        order14.serve();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 1, 0);
        int int4 = cafe3.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        java.lang.String str22 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str22, "Coffee [unit=GR, amount=1, decaf=true]");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe0.getOrders();
        int int14 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe0.getMenu();
        int int16 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(recipeArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        int int51 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException39.getSuppressed();
        tooManyIngredientsException12.addSuppressed((java.lang.Throwable) recipeNotFoundException39);
        java.lang.String str45 = recipeNotFoundException39.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str45, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", 0, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", (double) 10);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) '4', "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0", (double) (byte) 10);
        java.lang.String str14 = order13.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0; Paid: 10.0" + "'", str14, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0; Paid: 10.0");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = milk2.getUnit();
        java.lang.String str4 = milk2.toString();
        java.lang.String str5 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        cafe0.printMenu();
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
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        int int6 = coffee1.getAmount();
        java.lang.String str7 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type9 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type9);
        java.lang.String str11 = milk10.toString();
        int int12 = milk10.getAmount();
        java.lang.String str13 = milk10.getName();
        java.lang.String str14 = milk10.toString();
        boolean boolean15 = coffee1.equals((java.lang.Object) milk10);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str11, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk" + "'", str13, "Milk");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str14, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", 0.0d, size4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", 1, 52);
        java.lang.String str4 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Order: ; For: Cafe; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size5, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type10 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type10);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type10);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException13 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray14 = tooManyIngredientsException13.getSuppressed();
        boolean boolean15 = milk12.equals((java.lang.Object) throwableArray14);
        boolean boolean16 = recipe7.equals((java.lang.Object) boolean15);
        boolean boolean17 = cafe1.addRecipe(recipe7);
        java.lang.String str18 = recipe7.getName();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Plain" + "'", str18, "Plain");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) 100L);
        java.lang.Class<?> wildcardClass8 = recipe4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = coffee1.getName();
        java.lang.String str7 = coffee1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee1.getUnit();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee" + "'", str6, "Coffee");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee" + "'", str7, "Coffee");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        java.lang.String str48 = milk15.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str16, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Milk" + "'", str48, "Milk");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        boolean boolean9 = recipe2.isReady();
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0", (double) (short) -1);
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("Milk", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(orderArray5);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!", (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        java.lang.String str10 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=100, type=null]", (double) 10L);
        java.lang.String str14 = order13.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Milk [unit=ML, amount=100, type=null]; Paid: 10.0" + "'", str14, "Order: ; For: Milk [unit=ML, amount=100, type=null]; Paid: 10.0");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) (short) 100);
        order13.printReceipt();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        boolean boolean9 = recipe2.isReady();
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0", (double) (short) -1);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SEMI]", (double) 8, "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        order17.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
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
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 32.0d, "Welcome to Coffee");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee31 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10);
        boolean boolean32 = recipe15.equals((java.lang.Object) coffee31);
        int int33 = coffee31.getAmount();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Coffee [unit=GR, amount=1, decaf=true]", (double) 1);
        order23.serve();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        java.lang.String str2 = coffee0.toString();
        int int3 = coffee0.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', false);
        boolean boolean7 = coffee6.getDecaf();
        java.lang.String str8 = coffee6.getName();
        boolean boolean9 = coffee6.getDecaf();
        boolean boolean10 = coffee0.equals((java.lang.Object) boolean9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee" + "'", str8, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        java.lang.String str8 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", "Welcome to Milk [unit=ML, amount=100, type=WHOLE]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.toString();
        java.lang.Object obj4 = null;
        boolean boolean5 = milk1.equals(obj4);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=0, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
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
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException0.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 10);
        boolean boolean8 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean22 = recipe13.isReady();
        boolean boolean23 = syrup10.equals((java.lang.Object) recipe13);
        double double24 = recipe13.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean28 = coffee27.getDecaf();
        java.lang.String str29 = coffee27.getName();
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        int int31 = coffee27.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        java.lang.String str35 = recipe34.getName();
        boolean boolean36 = coffee27.equals((java.lang.Object) recipe34);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water38 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        recipe34.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water38);
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water38);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit41 = water38.getUnit();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee" + "'", str29, "Coffee");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + unit41 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit41.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]]", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup35 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str36 = syrup35.getName();
        java.lang.String str37 = syrup35.toString();
        java.lang.String str38 = syrup35.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean47 = cafe39.addRecipe(recipe42);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray48 = cafe39.getOrders();
        java.lang.String str49 = cafe39.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order55 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean56 = recipe52.isReady();
        boolean boolean57 = cafe39.addRecipe(recipe52);
        boolean boolean58 = syrup35.equals((java.lang.Object) recipe52);
        uk.ac.sheffield.com1003.cafe.Cafe cafe60 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray61 = cafe60.getOrders();
        cafe60.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray63 = cafe60.getOrders();
        java.lang.String str64 = cafe60.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray65 = cafe60.getMenu();
        boolean boolean66 = syrup35.equals((java.lang.Object) recipeArray65);
        boolean boolean67 = milk2.equals((java.lang.Object) recipeArray65);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str3, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Syrup" + "'", str36, "Syrup");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str37, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Syrup" + "'", str38, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(orderArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Welcome to Cafe" + "'", str49, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(orderArray61);
        org.junit.Assert.assertNotNull(orderArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str64, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean2 = water0.equals((java.lang.Object) (short) -1);
        java.lang.String str3 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        boolean boolean11 = water0.equals((java.lang.Object) milk10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = coffee15.getUnit();
        java.lang.String str17 = coffee15.toString();
        java.lang.String str18 = coffee15.toString();
        int int19 = coffee15.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = milk21.getUnit();
        boolean boolean23 = coffee15.equals((java.lang.Object) unit22);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean25 = coffee15.equals((java.lang.Object) size24);
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (-1.0f), size24, 100);
        boolean boolean28 = water0.equals((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=35, decaf=true]", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 30, "Order: ; For: Milk [unit=ML, amount=100, type=null]; Paid: 10.0");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=ALMOND]", 1.0d);
        java.lang.Class<?> wildcardClass14 = recipe2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean16 = cafe1.addRecipe(recipe4);
        int int17 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = coffee1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0; Paid: 10.0");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size2, (int) ' ');
        double double5 = recipe4.getPrice();
        java.lang.String str6 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=-1]", (double) (short) 0);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=true]", (double) 'a', "");
        java.lang.String str8 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str8, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order5.serve();
        java.lang.String str7 = order5.toString();
        order5.serve();
        java.lang.String str9 = order5.toString();
        java.lang.String str10 = order5.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str9, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        java.lang.String str3 = water0.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        java.lang.String str2 = coffee0.toString();
        int int3 = coffee0.getAmount();
        java.lang.String str4 = coffee0.toString();
        java.lang.String str5 = coffee0.toString();
        boolean boolean6 = coffee0.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", (double) (byte) 1, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Cafe; Paid: -1.0", (double) (byte) -1, size4, 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Coffee [unit=GR, amount=52, decaf=false]", (double) 1L, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water18 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str19 = water18.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type20 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean21 = water18.equals((java.lang.Object) type20);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type20);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type20);
        boolean boolean24 = coffee7.equals((java.lang.Object) type20);
        java.lang.String str25 = coffee7.toString();
        java.lang.String str26 = coffee7.getName();
        boolean boolean27 = coffee7.getDecaf();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=10]" + "'", str19, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type20.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee" + "'", str26, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", "", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException19.getSuppressed();
        java.lang.String str36 = recipeNotFoundException19.toString();
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
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str36, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order9.printReceipt();
        order9.printReceipt();
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        order6.serve();
        order6.printReceipt();
        order6.serve();
        order6.serve();
        order6.serve();
        java.time.LocalDateTime localDateTime13 = order6.getOrderServed();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = cafe7.addRecipe(recipe10);
        boolean boolean17 = recipe10.equals((java.lang.Object) 10L);
        boolean boolean18 = cafe3.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) 10);
        java.lang.String str25 = order24.toString();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0" + "'", str25, "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        java.lang.String str7 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to ", (double) 10, "Coffee");
        java.time.LocalDateTime localDateTime12 = order11.getOrderServed();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee", (double) (byte) -1);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", 52.0d, "Welcome to Cafe");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size4, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (short) 100, size4, (int) 'a');
        boolean boolean9 = recipe8.isReady();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", 0.0d);
        boolean boolean33 = water0.equals((java.lang.Object) 0.0d);
        java.lang.String str34 = water0.getName();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Water" + "'", str34, "Water");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe53 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe53, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        order56.serve();
        java.lang.String str58 = order56.toString();
        order56.serve();
        boolean boolean60 = recipe49.equals((java.lang.Object) order56);
        double double61 = recipe49.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe64 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 10);
        boolean boolean65 = recipe49.equals((java.lang.Object) 10);
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
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str58, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe4.getOrders();
        java.lang.String str14 = cafe4.greeting();
        cafe4.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean19 = cafe4.addRecipe(recipe18);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type22 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type22);
        java.lang.String str25 = milk24.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = coffee27.getUnit();
        java.lang.String str29 = coffee27.toString();
        java.lang.String str30 = coffee27.toString();
        int int31 = coffee27.getAmount();
        boolean boolean33 = coffee27.equals((java.lang.Object) 0.0d);
        boolean boolean34 = milk24.equals((java.lang.Object) coffee27);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit35 = coffee27.getUnit();
        boolean boolean36 = recipe18.equals((java.lang.Object) coffee27);
        boolean boolean37 = cafe3.addRecipe(recipe18);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str25, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str30, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + unit35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type3);
        int int7 = milk6.getAmount();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        java.lang.String str18 = syrup12.toString();
        java.lang.String str19 = syrup12.getName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str18, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup" + "'", str19, "Syrup");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean10 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str11 = milk1.getName();
        java.lang.String str12 = milk1.toString();
        java.lang.String str13 = milk1.getName();
        int int14 = milk1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk" + "'", str11, "Milk");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk" + "'", str13, "Milk");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        boolean boolean2 = coffee1.getDecaf();
        java.lang.String str3 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str4 = water3.toString();
        int int5 = water3.getAmount();
        boolean boolean6 = syrup1.equals((java.lang.Object) water3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=100]" + "'", str4, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Water [unit=ML, amount=52]", "Welcome to Water [unit=ML, amount=-1]", 8.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray21 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray22 = cafe1.getMenu();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = cafe1.placeOrder("Milk", "Water [unit=ML, amount=35]", (double) (short) 1);
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
        org.junit.Assert.assertNotNull(orderArray21);
        org.junit.Assert.assertNotNull(recipeArray22);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", "", (-1.0d));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", 32.0d, "Welcome to Water [unit=ML, amount=30]");
        double double9 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (int) (short) 10, 100);
        java.lang.String str4 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size10, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 100.0", (double) 1L, size10, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", (double) (-1.0f), size10, 8);
        boolean boolean21 = recipe20.isReady();
        boolean boolean22 = recipe20.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup24 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str25 = syrup24.getName();
        java.lang.String str26 = syrup24.toString();
        java.lang.String str27 = syrup24.getFlavour();
        java.lang.String str28 = syrup24.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = syrup24.getUnit();
        recipe20.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup24);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup" + "'", str25, "Syrup");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str26, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Welcome to Cafe" + "'", str27, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Syrup" + "'", str28, "Syrup");
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=97, type=WHOLE]");
        java.lang.String str2 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Milk [unit=ML, amount=97, type=WHOLE]" + "'", str2, "Welcome to Milk [unit=ML, amount=97, type=WHOLE]");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        java.lang.String str5 = milk4.toString();
        java.lang.Class<?> wildcardClass6 = milk4.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        cafe0.printMenu();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe0.getOrders();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type11);
        java.lang.String str13 = milk12.toString();
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water20 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str21 = water20.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type22 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean23 = water20.equals((java.lang.Object) type22);
        boolean boolean24 = recipe5.equals((java.lang.Object) water20);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit25 = water20.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit26 = water20.getUnit();
        int int27 = water20.getAmount();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water20);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str13, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water [unit=ML, amount=10]" + "'", str21, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", (double) (byte) 1);
        java.lang.String str10 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0", (double) 0.0f, size15, 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", (double) (byte) -1, size15, (int) (short) 0);
        boolean boolean20 = recipe2.equals((java.lang.Object) size15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
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
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=8, decaf=true]");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, true);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=10, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=10, decaf=true]");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0]");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        java.lang.String str5 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=1, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=1, type=ALMOND]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Coffee [unit=GR, amount=1, decaf=true]", (double) 1);
        java.time.LocalDateTime localDateTime24 = order23.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        int int9 = cafe7.getIndexNextOrderToServe();
        boolean boolean10 = milk2.equals((java.lang.Object) cafe7);
        java.lang.String str11 = cafe7.greeting();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean29 = cafe21.addRecipe(recipe24);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray30 = cafe21.getOrders();
        java.lang.String str31 = cafe21.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean38 = recipe34.isReady();
        boolean boolean39 = cafe21.addRecipe(recipe34);
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Syrup", (double) (short) 0);
        order42.serve();
        order42.printReceipt();
        java.lang.String str45 = order42.toString();
        boolean boolean46 = milk6.equals((java.lang.Object) str45);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(orderArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Order: ; For: Syrup; Paid: 0.0" + "'", str45, "Order: ; For: Syrup; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException70 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray71 = tooManyIngredientsException70.getSuppressed();
        java.lang.Throwable[] throwableArray72 = tooManyIngredientsException70.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException73 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException73.getSuppressed();
        tooManyIngredientsException70.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) tooManyIngredientsException70);
        java.lang.Throwable[] throwableArray77 = tooManyIngredientsException70.getSuppressed();
        tooManyIngredientsException46.addSuppressed((java.lang.Throwable) tooManyIngredientsException70);
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
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray77);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        int int5 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        int int5 = cafe1.getIndexNextOrderToServe();
        int int6 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=10, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", 0.0d);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Order: ; For: Cafe; Paid: -1.0");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Order: ; For: Cafe; Paid: -1.0" + "'", str2, "Welcome to Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Syrup [unit=ML, amount=10, flavour=Milk]", 32.0d, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0");
        java.lang.String str41 = order40.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Milk]; Paid: 32.0" + "'", str41, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Milk]; Paid: 32.0");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        java.lang.String str13 = tooManyIngredientsException3.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str13, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = cafe11.placeOrder("Welcome to Milk [unit=ML, amount=100, type=WHOLE]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) 100);
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
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str22 = cafe21.greeting();
        int int23 = cafe21.getIndexNextOrderToPlace();
        boolean boolean24 = recipe14.equals((java.lang.Object) cafe21);
        java.lang.String str25 = cafe21.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Welcome to Cafe" + "'", str22, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        java.lang.Class<?> wildcardClass26 = recipe10.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) (-1L));
        boolean boolean14 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Milk [unit=ML, amount=100, type=WHOLE]", 0.0d, "Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type22 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup27 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str28 = syrup27.getName();
        java.lang.String str29 = syrup27.toString();
        java.lang.String str30 = syrup27.getName();
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
        boolean boolean50 = syrup27.equals((java.lang.Object) recipe44);
        boolean boolean51 = milk25.equals((java.lang.Object) syrup27);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk25);
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=32, type=WHOLE]", (double) 97, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Syrup" + "'", str28, "Syrup");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str29, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Syrup" + "'", str30, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(orderArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Welcome to Cafe" + "'", str41, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime23 = order22.getOrderServed();
        boolean boolean24 = water5.equals((java.lang.Object) order22);
        order22.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type7);
        java.lang.String str10 = milk9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        int int16 = coffee12.getAmount();
        boolean boolean18 = coffee12.equals((java.lang.Object) 0.0d);
        boolean boolean19 = milk9.equals((java.lang.Object) coffee12);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water23 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str24 = water23.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type25 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean26 = water23.equals((java.lang.Object) type25);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type25);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type25);
        boolean boolean29 = coffee12.equals((java.lang.Object) type25);
        java.lang.String str30 = coffee12.toString();
        boolean boolean31 = milk1.equals((java.lang.Object) coffee12);
        java.lang.String str32 = coffee12.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=10]" + "'", str24, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str30, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str32, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        java.time.LocalDateTime localDateTime24 = order22.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(52, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type6);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe1.getMenu();
        java.lang.String str9 = cafe1.getName();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        boolean boolean2 = coffee0.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', false);
        java.lang.String str6 = coffee5.toString();
        boolean boolean7 = coffee0.equals((java.lang.Object) str6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0; Paid: 10.0", 52, 30);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        int int5 = milk4.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup7 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        boolean boolean8 = milk4.equals((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) 0L, size8, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str6 = recipe5.getName();
        boolean boolean7 = milk2.equals((java.lang.Object) str6);
        java.lang.String str8 = milk2.getName();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) -1, "Milk [unit=ML, amount=0, type=SEMI]");
        java.time.LocalDateTime localDateTime21 = order20.getOrderServed();
        java.time.LocalDateTime localDateTime22 = order20.getOrderServed();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
        java.lang.Class<?> wildcardClass17 = tooManyIngredientsException8.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double12 = recipe7.getPrice();
        boolean boolean13 = recipe7.isReady();
        boolean boolean14 = cafe3.addRecipe(recipe7);
        java.lang.String str15 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray17 = cafe3.getOrders();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertNotNull(orderArray17);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
        java.lang.String str2 = coffee1.toString();
        boolean boolean3 = coffee1.getDecaf();
        java.lang.String str4 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean3 = water1.equals((java.lang.Object) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type6);
        boolean boolean9 = water1.equals((java.lang.Object) type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type13);
        java.lang.String str16 = milk15.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean26 = milk18.equals((java.lang.Object) recipe21);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type28 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type28);
        java.lang.String str30 = milk29.toString();
        int int31 = milk29.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit32 = milk29.getUnit();
        recipe21.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk29);
        double double34 = recipe21.getPrice();
        boolean boolean35 = milk15.equals((java.lang.Object) recipe21);
        java.lang.String str36 = milk15.toString();
        boolean boolean37 = milk10.equals((java.lang.Object) milk15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=32, type=SOY]" + "'", str16, "Milk [unit=ML, amount=32, type=SOY]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str30, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + unit32 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit32.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 32.0d + "'", double34 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk [unit=ML, amount=32, type=SOY]" + "'", str36, "Milk [unit=ML, amount=32, type=SOY]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        int int5 = cafe1.getIndexNextOrderToServe();
        cafe1.printPendingOrders();
        int int7 = cafe1.getIndexNextOrderToServe();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]]");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) '4', "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        java.lang.String str14 = recipe13.getName();
        java.lang.String str15 = recipe13.getName();
        boolean boolean16 = recipe2.equals((java.lang.Object) recipe13);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=SEMI]", 97.0d, "Welcome to Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = coffee1.equals(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type7);
        boolean boolean10 = milk1.equals((java.lang.Object) 10);
        java.lang.String str11 = milk1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk" + "'", str11, "Milk");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        java.lang.String str8 = order6.toString();
        order6.serve();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray8 = cafe7.getOrders();
        boolean boolean9 = coffee1.equals((java.lang.Object) orderArray8);
        java.lang.String str10 = coffee1.toString();
        boolean boolean12 = coffee1.equals((java.lang.Object) "Welcome to Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(orderArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe1.getMenu();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        int int7 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        int int9 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str10 = cafe1.getName();
        java.lang.Class<?> wildcardClass11 = cafe1.getClass();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = coffee9.getUnit();
        java.lang.String str11 = coffee9.toString();
        java.lang.String str12 = coffee9.toString();
        int int13 = coffee9.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = milk15.getUnit();
        boolean boolean17 = coffee9.equals((java.lang.Object) unit16);
        boolean boolean18 = coffee7.equals((java.lang.Object) unit16);
        boolean boolean19 = milk4.equals((java.lang.Object) boolean18);
        java.lang.String str20 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=8, type=SOY]" + "'", str20, "Milk [unit=ML, amount=8, type=SOY]");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        boolean boolean4 = coffee2.getDecaf();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=97]", 10.0d, "Welcome to Water [unit=ML, amount=97]");
        double double38 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 32.0d + "'", double38 == 32.0d);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.lang.String str13 = order11.toString();
        java.time.LocalDateTime localDateTime14 = order11.getOrderServed();
        order11.serve();
        java.time.LocalDateTime localDateTime16 = order11.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.getFlavour();
        java.lang.String str8 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size8, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) 10, size8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup1.getUnit();
        java.lang.String str7 = syrup1.getFlavour();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        int int12 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Cafe cafe18 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe18.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean31 = cafe18.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str36 = recipe22.getName();
        boolean boolean37 = recipe22.isReady();
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Coffee [unit=GR, amount=35, decaf=false]", (double) 10.0f);
        boolean boolean41 = cafe0.addRecipe(recipe22);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=32, type=SOY]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str36, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee0.getUnit();
        java.lang.String str3 = coffee0.toString();
        int int4 = coffee0.getAmount();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit27 = milk1.getUnit();
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
        org.junit.Assert.assertTrue("'" + unit27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime12 = order11.getOrderServed();
        boolean boolean13 = coffee2.equals((java.lang.Object) order11);
        order11.serve();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        int int51 = cafe0.getIndexNextOrderToServe();
        java.lang.String str52 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray53 = cafe0.getOrders();
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Cafe" + "'", str52, "Cafe");
        org.junit.Assert.assertNotNull(orderArray53);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        int int24 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str25 = cafe1.getName();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        order13.serve();
        java.time.LocalDateTime localDateTime21 = order13.getOrderServed();
        java.lang.String str22 = order13.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str14, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str22, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        java.lang.String str16 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = null;
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=-1, decaf=false]", 32.0d);
        boolean boolean21 = water1.equals((java.lang.Object) order20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str16, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        order6.printReceipt();
        java.time.LocalDateTime localDateTime11 = order6.getOrderServed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 100, "Order: ; For: Cafe; Paid: -1.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean22 = milk19.equals((java.lang.Object) cafe21);
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe21.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order24 = cafe21.serveOrder();
        boolean boolean25 = recipe5.equals((java.lang.Object) cafe21);
        java.lang.String str26 = cafe21.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertNull(order24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str26, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
        boolean boolean24 = coffee12.getDecaf();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        int int4 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str5 = cafe1.getName();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; Paid: 100.0");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        boolean boolean11 = recipe5.isReady();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.getName();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray19 = cafe3.getMenu();
        java.lang.Class<?> wildcardClass20 = recipeArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=100, decaf=false]", (int) (short) 1, (int) ' ');
        int int4 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup1.getUnit();
        java.lang.Class<?> wildcardClass5 = unit4.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        java.lang.String str31 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean39 = recipe34.isReady();
        java.lang.String str40 = recipe34.getName();
        boolean boolean41 = recipe34.isReady();
        boolean boolean42 = recipe34.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee44 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit45 = coffee44.getUnit();
        java.lang.String str46 = coffee44.toString();
        java.lang.String str47 = coffee44.toString();
        int int48 = coffee44.getAmount();
        boolean boolean50 = coffee44.equals((java.lang.Object) 0.0d);
        recipe34.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee44);
        boolean boolean52 = coffee44.getDecaf();
        boolean boolean53 = water1.equals((java.lang.Object) boolean52);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type55 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk56 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type55);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit57 = milk56.getUnit();
        java.lang.String str58 = milk56.toString();
        boolean boolean59 = water1.equals((java.lang.Object) str58);
        java.lang.String str60 = water1.toString();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str31, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str40, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + unit45 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit45.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str46, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str47, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + type55 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type55.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + unit57 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit57.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str58, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str60, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.String str4 = coffee2.toString();
        boolean boolean6 = coffee2.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        boolean boolean7 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=35, decaf=false]", (double) (-1L));
        boolean boolean11 = coffee2.equals((java.lang.Object) recipe10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: ; Paid: 100.0", "Coffee [unit=GR, amount=100, decaf=true]", (double) 52);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
        java.lang.String str31 = syrup28.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee4.getUnit();
        java.lang.String str6 = coffee4.toString();
        java.lang.String str7 = coffee4.toString();
        int int8 = coffee4.getAmount();
        boolean boolean10 = coffee4.equals((java.lang.Object) 0.0d);
        boolean boolean11 = coffee4.getDecaf();
        java.lang.String str12 = coffee4.toString();
        boolean boolean13 = coffee2.equals((java.lang.Object) coffee4);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) (-1.0f));
        java.lang.String str8 = recipe7.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup10);
        boolean boolean12 = cafe1.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=35]", (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException4 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray5 = tooManyIngredientsException4.getSuppressed();
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        tooManyIngredientsException4.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException4.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str15 = syrup14.getFlavour();
        int int16 = syrup14.getAmount();
        java.lang.String str17 = syrup14.toString();
        java.lang.String str18 = syrup14.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException19 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean20 = syrup14.equals((java.lang.Object) tooManyIngredientsException19);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException21 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException19.addSuppressed((java.lang.Throwable) tooManyIngredientsException21);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) tooManyIngredientsException21);
        boolean boolean24 = coffee1.equals((java.lang.Object) recipeNotFoundException2);
        boolean boolean25 = coffee1.getDecaf();
        java.lang.String str26 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        boolean boolean30 = milk28.equals((java.lang.Object) (-1L));
        java.lang.String str31 = milk28.toString();
        boolean boolean32 = coffee1.equals((java.lang.Object) milk28);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str31, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        int int4 = coffee2.getAmount();
        boolean boolean5 = coffee2.getDecaf();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=100, type=WHOLE]", (int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=0, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1);
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray48 = cafe4.getMenu();
        boolean boolean49 = milk3.equals((java.lang.Object) recipeArray48);
        boolean boolean50 = water1.equals((java.lang.Object) recipeArray48);
        java.lang.String str51 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup53 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str54 = syrup53.getFlavour();
        java.lang.String str55 = syrup53.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit56 = syrup53.getUnit();
        boolean boolean57 = water1.equals((java.lang.Object) syrup53);
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
        org.junit.Assert.assertNotNull(recipeArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Water [unit=ML, amount=32]" + "'", str51, "Water [unit=ML, amount=32]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Water [unit=ML, amount=30]" + "'", str54, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Water [unit=ML, amount=30]" + "'", str55, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit56 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit56.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        java.lang.String str21 = recipe7.getName();
        boolean boolean22 = recipe7.isReady();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 10);
        order25.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        order6.printReceipt();
        order6.printReceipt();
        java.lang.String str10 = order6.toString();
        java.time.LocalDateTime localDateTime11 = order6.getOrderServed();
        java.time.LocalDateTime localDateTime12 = order6.getOrderServed();
        order6.serve();
        order6.serve();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str10, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup44 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str45 = syrup44.toString();
        java.lang.String str46 = syrup44.getName();
        java.lang.String str47 = syrup44.getName();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup44);
        java.lang.String str49 = syrup44.toString();
        java.lang.String str50 = syrup44.getFlavour();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str45, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Syrup" + "'", str46, "Syrup");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Syrup" + "'", str47, "Syrup");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str49, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe4.getOrders();
        java.lang.String str14 = cafe4.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean23 = cafe15.addRecipe(recipe18);
        boolean boolean24 = cafe4.addRecipe(recipe18);
        boolean boolean25 = cafe3.addRecipe(recipe18);
        cafe3.printMenu();
        cafe3.printPendingOrders();
        boolean boolean28 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str29 = coffee1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        boolean boolean19 = recipe2.isReady();
        double double20 = recipe2.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str17, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.time.LocalDateTime localDateTime12 = order11.getOrderServed();
        boolean boolean13 = coffee2.equals((java.lang.Object) order11);
        order11.printReceipt();
        order11.serve();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        java.lang.String str29 = tooManyIngredientsException9.toString();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str29, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=1, decaf=false]; Paid: 1.0; Paid: 32.0", "Order: ; For: Syrup; Paid: 0.0", (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }
}

