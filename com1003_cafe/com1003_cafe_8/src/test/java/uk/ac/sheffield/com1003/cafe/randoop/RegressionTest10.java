package uk.ac.sheffield.com1003.cafe.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str5 = milk4.toString();
        boolean boolean6 = milk1.equals((java.lang.Object) str5);
        boolean boolean8 = milk1.equals((java.lang.Object) "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size14, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 1, size14, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (-1.0d), size14, (int) ' ');
        boolean boolean21 = cafe0.addRecipe(recipe20);
        double double22 = recipe20.getPrice();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = cafe1.addRecipe(recipe7);
        java.lang.String str15 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size21, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 10L, size21, 0);
        boolean boolean26 = cafe1.addRecipe(recipe25);
        java.lang.Class<?> wildcardClass27 = recipe25.getClass();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Welcome to Cafe" + "'", str15, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) 'a');
        java.lang.String str6 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) 1, "Coffee");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.getName();
        java.lang.String str3 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean19 = recipe8.equals((java.lang.Object) 10);
        double double20 = recipe8.getPrice();
        boolean boolean21 = cafe1.addRecipe(recipe8);
        double double22 = recipe8.getPrice();
        double double23 = recipe8.getPrice();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size14, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) ' ', size14, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) 1.0f, size14, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) 10, size14, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 0L, size14, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=10, decaf=false]", 35.0d, size14, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (byte) 100, size14, (int) (byte) 1);
        double double29 = recipe28.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type32 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk33 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(35, type32);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type32);
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type32.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup0 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup();
        java.lang.String str1 = syrup0.toString();
        java.lang.String str2 = syrup0.getName();
        java.lang.String str3 = syrup0.getName();
        java.lang.String str4 = syrup0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str1, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, true);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0", 0.0d);
        java.lang.String str6 = recipe5.getName();
        boolean boolean7 = coffee2.equals((java.lang.Object) recipe5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0" + "'", str6, "Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
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
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Syrup [unit=ML, amount=10, flavour=Welcome to Milk]", (double) (byte) -1, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0", (double) 100L, "Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 1.0]");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
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
        java.lang.String str19 = coffee1.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=30]" + "'", str16, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee" + "'", str19, "Coffee");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        java.lang.String str16 = cafe0.greeting();
        cafe0.printPendingOrders();
        java.lang.String str18 = cafe0.greeting();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; Paid: 0.0");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee0.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size16, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size16, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size16, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=0]", (double) '#', size16, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=0, decaf=false]", (double) 52, size16, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Syrup [unit=ML, amount=10, flavour=Plain]; For: Welcome to Order: ; For: Water; Paid: 1.0; Paid: 35.0", 32.0d, size16, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=10]]", 32.0d);
        order31.serve();
        boolean boolean33 = coffee0.equals((java.lang.Object) order31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=30, type=WHOLE]", (double) (short) 10, size2, (int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water7 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str8 = water7.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean11 = water7.equals((java.lang.Object) 30);
        java.lang.String str12 = water7.toString();
        java.lang.String str13 = water7.getName();
        boolean boolean15 = water7.equals((java.lang.Object) (byte) -1);
        java.lang.String str16 = water7.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = water7.getUnit();
        boolean boolean18 = milk6.equals((java.lang.Object) water7);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=SEMI]", (int) '4', 10);
        boolean boolean24 = water7.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water [unit=ML, amount=30]" + "'", str12, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water" + "'", str16, "Water");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size13, 0);
        boolean boolean16 = recipe6.equals((java.lang.Object) size13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size13, 10);
        boolean boolean19 = recipe18.isReady();
        java.lang.String str20 = recipe18.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0" + "'", str20, "Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        java.lang.String str5 = cafe3.greeting();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=10, type=SKIMMED]", (double) (byte) 0);
        boolean boolean13 = cafe3.addRecipe(recipe9);
        java.lang.String str14 = cafe3.getName();
        cafe3.printMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str5, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str14, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        double double15 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=0]", (double) (byte) 100, "Coffee [unit=GR, amount=0, decaf=false]");
        java.lang.String str20 = order19.toString();
        order19.serve();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0" + "'", str20, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) -1);
        double double15 = recipe14.getPrice();
        boolean boolean16 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water18 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe21.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk23);
        boolean boolean25 = water18.equals((java.lang.Object) milk23);
        java.lang.String str26 = water18.toString();
        java.lang.String str27 = water18.toString();
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water [unit=ML, amount=10]" + "'", str26, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=10]" + "'", str27, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: -1.0", 0.0d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str36 = cafe35.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size39 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size39, (int) (short) 10);
        boolean boolean43 = recipe41.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "hi!", (double) 0L);
        boolean boolean47 = cafe35.addRecipe(recipe41);
        java.lang.String str48 = cafe35.greeting();
        cafe35.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order50 = cafe35.serveOrder();
        boolean boolean51 = water1.equals((java.lang.Object) cafe35);
        uk.ac.sheffield.com1003.cafe.Cafe cafe55 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=SKIMMED]", (int) '4', (int) (byte) 100);
        boolean boolean56 = water1.equals((java.lang.Object) "Milk [unit=ML, amount=-1, type=SKIMMED]");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + size39 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size39.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Welcome to hi!" + "'", str48, "Welcome to hi!");
        org.junit.Assert.assertNull(order50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 35.0", 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=true]", 1, 97);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.greeting();
        java.lang.String str7 = cafe0.getName();
        java.lang.String str8 = cafe0.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cafe" + "'", str8, "Cafe");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=10]]", "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) 8);
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
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", 100, (int) (short) 100);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = recipe7.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type12 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type12);
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk14);
        boolean boolean16 = recipe7.isReady();
        boolean boolean17 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size24, (int) '4');
        boolean boolean28 = recipe26.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Welcome to Cafe", 0.0d);
        java.lang.String str32 = recipe26.getName();
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean37 = cafe21.addRecipe(recipe26);
        boolean boolean38 = cafe3.addRecipe(recipe26);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water [unit=ML, amount=30]" + "'", str32, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        double double10 = recipe7.getPrice();
        boolean boolean11 = recipe7.isReady();
        boolean boolean12 = recipe7.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int14 = water13.getAmount();
        java.lang.String str15 = water13.toString();
        boolean boolean17 = water13.equals((java.lang.Object) 10);
        int int18 = water13.getAmount();
        java.lang.String str19 = water13.toString();
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water13);
        boolean boolean21 = recipe7.isReady();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=30]" + "'", str15, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = coffee5.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30, type1);
        java.lang.String str3 = milk2.getName();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", 0.0d);
        java.lang.String str14 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean19 = cafe3.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order order20 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order21 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order22 = cafe3.serveOrder();
        java.lang.String str23 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size28 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size28, (int) (short) 10);
        double double31 = recipe30.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size37 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size37, 0);
        boolean boolean40 = recipe30.equals((java.lang.Object) size37);
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size37, 10);
        boolean boolean43 = recipe42.isReady();
        boolean boolean44 = cafe3.addRecipe(recipe42);
        double double45 = recipe42.getPrice();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(order20);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertNull(order22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Syrup" + "'", str23, "Welcome to Syrup");
        org.junit.Assert.assertTrue("'" + size28 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size28.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + size37 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size37.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 1.0d + "'", double45 == 1.0d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean6 = recipe5.isReady();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) -1, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe11.printPendingOrders();
        java.lang.String str13 = cafe11.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe11.getMenu();
        java.lang.String str15 = cafe11.getName();
        java.lang.String str16 = cafe11.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe21.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk26);
        boolean boolean28 = cafe11.addRecipe(recipe21);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray29 = cafe11.getMenu();
        boolean boolean30 = recipe5.equals((java.lang.Object) cafe11);
        boolean boolean31 = cafe1.addRecipe(recipe5);
        uk.ac.sheffield.com1003.cafe.Order order32 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=52, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cafe" + "'", str15, "Cafe");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Cafe" + "'", str16, "Cafe");
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(recipeArray29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(order32);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        java.lang.String str13 = cafe0.getName();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cafe" + "'", str13, "Cafe");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 0.0f);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Water");
        boolean boolean8 = recipe2.equals((java.lang.Object) "Water");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size15, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size15, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", (double) (-1.0f));
        order24.printReceipt();
        boolean boolean26 = recipe2.equals((java.lang.Object) order24);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size22 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size22, (int) (short) 10);
        boolean boolean26 = recipe24.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Syrup [unit=ML, amount=10, flavour=Plain]", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) (byte) 100);
        boolean boolean36 = cafe0.addRecipe(recipe24);
        uk.ac.sheffield.com1003.cafe.Cafe cafe40 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=100, decaf=false]", (int) 'a', (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        boolean boolean44 = cafe40.addRecipe(recipe43);
        boolean boolean45 = cafe0.addRecipe(recipe43);
        cafe0.removeRecipe("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", "Welcome to Welcome to Welcome to ", (double) 1);
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
        org.junit.Assert.assertTrue("'" + size22 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size22.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size22 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size22, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) ' ', size22, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) 1.0f, size22, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) 10, size22, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 0L, size22, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) '4', size22, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size22, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100.0f, size22, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Cafe; For: Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]; Paid: 100.0", (double) (short) 10, size22, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) ' ', size22, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe44 = new uk.ac.sheffield.com1003.cafe.Recipe("", (-1.0d), size22, 100);
        org.junit.Assert.assertTrue("'" + size22 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size22.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray9 = tooManyIngredientsException8.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int11 = water10.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException12.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException13.getSuppressed();
        boolean boolean17 = water10.equals((java.lang.Object) recipeNotFoundException13);
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException13.getSuppressed();
        tooManyIngredientsException8.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.Throwable[] throwableArray21 = tooManyIngredientsException8.getSuppressed();
        java.lang.Class<?> wildcardClass22 = throwableArray21.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk4.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        java.lang.String str53 = water13.toString();
        java.lang.String str54 = water13.toString();
        java.lang.String str55 = water13.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Water [unit=ML, amount=30]" + "'", str53, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Water [unit=ML, amount=30]" + "'", str54, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Water [unit=ML, amount=30]" + "'", str55, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup0 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup();
        java.lang.String str1 = syrup0.toString();
        java.lang.String str2 = syrup0.getName();
        java.lang.String str3 = syrup0.getName();
        int int4 = syrup0.getAmount();
        java.lang.String str5 = syrup0.toString();
        java.lang.String str6 = syrup0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str1, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Plain]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Plain]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Plain]");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size13, (int) (short) 10);
        boolean boolean17 = recipe15.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean26 = recipe15.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee27 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str28 = coffee27.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type29 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean30 = coffee27.equals((java.lang.Object) type29);
        java.lang.String str31 = coffee27.toString();
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size35 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size35, (int) (short) 10);
        boolean boolean38 = coffee27.equals((java.lang.Object) (short) 10);
        java.lang.String str39 = coffee27.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee27);
        java.lang.String str41 = recipe4.getName();
        double double42 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str31, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size35 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size35.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", (double) 100L, size4, 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: ; Paid: 10.0");
        int int11 = syrup10.getAmount();
        java.lang.String str12 = syrup10.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup10);
        java.lang.String str14 = syrup10.toString();
        java.lang.String str15 = syrup10.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) 10L, size24, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", 1.0d, size24, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", 8.0d, size24, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=WHOLE]", (double) 0.0f, size24, 35);
        boolean boolean33 = syrup10.equals((java.lang.Object) 35);
        java.lang.Object obj34 = null;
        boolean boolean35 = syrup10.equals(obj34);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str14, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean13 = cafe1.addRecipe(recipe5);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe1.getMenu();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(recipeArray14);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj5 = null;
        boolean boolean6 = milk4.equals(obj5);
        java.lang.String str7 = milk4.toString();
        java.lang.String str8 = milk4.getName();
        java.lang.String str9 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str12 = coffee11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean14 = coffee11.equals((java.lang.Object) type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type13);
        boolean boolean16 = milk4.equals((java.lang.Object) type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException2 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray3 = cafeOutOfCapacityException2.getSuppressed();
        boolean boolean4 = coffee1.equals((java.lang.Object) cafeOutOfCapacityException2);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe5.printPendingOrders();
        java.lang.String str7 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe5.getMenu();
        java.lang.String str9 = cafe5.getName();
        java.lang.String str10 = cafe5.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size13, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk20);
        boolean boolean22 = cafe5.addRecipe(recipe15);
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe5.serveOrder();
        java.lang.String str24 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe5.serveOrder();
        java.lang.String str26 = cafe5.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray27 = cafe5.getMenu();
        boolean boolean28 = coffee1.equals((java.lang.Object) cafe5);
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        boolean boolean32 = recipe31.isReady();
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe31, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) (byte) 1);
        boolean boolean36 = cafe5.addRecipe(recipe31);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Cafe" + "'", str10, "Cafe");
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Welcome to Cafe" + "'", str24, "Welcome to Cafe");
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cafe" + "'", str26, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", (double) 8);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water [unit=ML, amount=10]", (double) (byte) 1, "Water [unit=ML, amount=52]");
        java.lang.String str10 = order9.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0; For: Water [unit=ML, amount=10]; Paid: 1.0" + "'", str10, "Order: Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0; For: Water [unit=ML, amount=10]; Paid: 1.0");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: ; Paid: 10.0", (double) 97);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str5 = water4.toString();
        java.lang.String str6 = water4.toString();
        int int7 = water4.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int10 = milk9.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water11 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str12 = water11.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean23 = water11.equals((java.lang.Object) "Welcome to Cafe");
        boolean boolean24 = milk9.equals((java.lang.Object) boolean23);
        boolean boolean25 = water4.equals((java.lang.Object) milk9);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water4);
        boolean boolean27 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; For: ; Paid: 10.0", (-1.0d), "Milk [unit=ML, amount=0, type=SEMI]");
        java.lang.String str32 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=100]" + "'", str5, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=100]" + "'", str6, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Welcome to Order: ; For: ; Paid: 10.0" + "'", str32, "Welcome to Order: ; For: ; Paid: 10.0");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        cafe0.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type2);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size7, 0);
        boolean boolean10 = cafe0.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean21 = recipe13.isReady();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: ; For: Water; Paid: 1.0", (double) (byte) 100);
        boolean boolean25 = cafe0.addRecipe(recipe13);
        boolean boolean26 = recipe13.isReady();
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean7 = recipe6.isReady();
        java.lang.String str8 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        boolean boolean11 = coffee3.equals((java.lang.Object) recipe6);
        boolean boolean12 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Coffee", (double) (-1.0f), "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean20 = recipe6.equals((java.lang.Object) recipe15);
        java.lang.String str21 = recipe15.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj24 = null;
        boolean boolean25 = milk23.equals(obj24);
        java.lang.String str26 = milk23.toString();
        java.lang.String str27 = milk23.getName();
        java.lang.String str28 = milk23.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe31 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) 100);
        boolean boolean32 = milk23.equals((java.lang.Object) recipe31);
        boolean boolean33 = recipe31.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water34 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str35 = water34.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk37 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean38 = water34.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit39 = water34.getUnit();
        java.lang.Object obj40 = null;
        boolean boolean41 = water34.equals(obj40);
        java.lang.String str42 = water34.toString();
        java.lang.String str43 = water34.toString();
        recipe31.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water34);
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water34);
        boolean boolean46 = recipe15.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size49 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe51 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size49, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order55 = new uk.ac.sheffield.com1003.cafe.Order(recipe51, "hi!", (double) (byte) 10, "Water [unit=ML, amount=30]");
        boolean boolean56 = recipe51.isReady();
        boolean boolean57 = recipe51.isReady();
        java.lang.String str58 = recipe51.getName();
        boolean boolean59 = recipe15.equals((java.lang.Object) str58);
        uk.ac.sheffield.com1003.cafe.Order order63 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water [unit=ML, amount=30]" + "'", str21, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk" + "'", str27, "Milk");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str28, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Water" + "'", str35, "Water");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + unit39 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit39.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Water [unit=ML, amount=30]" + "'", str42, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Water [unit=ML, amount=30]" + "'", str43, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + size49 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size49.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Coffee [unit=GR, amount=30, decaf=false]; Paid: -1.0");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=10, decaf=false]", (int) 'a', (int) (byte) 0);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        double double10 = recipe7.getPrice();
        boolean boolean11 = recipe7.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient12 = null;
        recipe7.addIngredient(ingredient12);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe15.printMenu();
        java.lang.String str17 = cafe15.getName();
        java.lang.String str18 = cafe15.getName();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe15.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray20 = cafe15.getMenu();
        boolean boolean21 = recipe7.equals((java.lang.Object) cafe15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertNotNull(recipeArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", (double) 1L);
        java.lang.String str9 = recipe4.getName();
        double double10 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) 32);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int14 = water13.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException16.getSuppressed();
        boolean boolean20 = water13.equals((java.lang.Object) recipeNotFoundException16);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
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
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        boolean boolean37 = coffee2.equals((java.lang.Object) recipeNotFoundException3);
        java.lang.String str38 = recipeNotFoundException3.toString();
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str38, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup4 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str5 = syrup4.toString();
        java.lang.String str6 = syrup4.toString();
        boolean boolean7 = coffee2.equals((java.lang.Object) syrup4);
        java.lang.String str8 = syrup4.toString();
        java.lang.String str9 = syrup4.toString();
        java.lang.String str10 = syrup4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str10, "Syrup [unit=ML, amount=10, flavour=Water]");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=0, decaf=false]", (double) (-1.0f), size2, 97);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0", (int) (byte) 1, (int) (byte) 100);
        java.lang.String str4 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = null;
        boolean boolean6 = cafe3.addRecipe(recipe5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: ; For: Water; Paid: 1.0" + "'", str4, "Welcome to Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) 10L, size8, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", 1.0d, size8, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 8.0d, size8, (int) (short) 0);
        boolean boolean15 = cafe1.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: Water [unit=ML, amount=30]; For: uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; Paid: 0.0", (double) (short) 10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0", (int) '#', 8);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0" + "'", str4, "Welcome to Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = water0.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe11.printMenu();
        java.lang.String str13 = cafe11.greeting();
        boolean boolean14 = water0.equals((java.lang.Object) str13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean18 = recipe17.isReady();
        java.lang.String str19 = recipe17.getName();
        java.lang.String str20 = recipe17.getName();
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "", (double) 30, "Coffee");
        boolean boolean25 = water0.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to " + "'", str13, "Welcome to ");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water [unit=ML, amount=30]" + "'", str19, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk0 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException1 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException1.getSuppressed();
        boolean boolean3 = milk0.equals((java.lang.Object) throwableArray2);
        java.lang.String str4 = milk0.toString();
        java.lang.String str5 = milk0.toString();
        java.lang.String str6 = milk0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1, type8);
        boolean boolean10 = milk0.equals((java.lang.Object) milk9);
        uk.ac.sheffield.com1003.cafe.Cafe cafe14 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        java.lang.String str15 = cafe14.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray16 = cafe14.getMenu();
        boolean boolean17 = milk9.equals((java.lang.Object) cafe14);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0" + "'", str15, "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0");
        org.junit.Assert.assertNotNull(recipeArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) 1);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.getName();
        int int4 = milk1.getAmount();
        java.lang.Class<?> wildcardClass5 = milk1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=97, type=WHOLE]", (double) (short) 1);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100);
        int int2 = coffee1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
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
        boolean boolean20 = water0.equals((java.lang.Object) recipeNotFoundException16);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit21 = water0.getUnit();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException22.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException32 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray33 = cafeOutOfCapacityException32.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException32);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        java.lang.Throwable[] throwableArray40 = recipeNotFoundException35.getSuppressed();
        boolean boolean41 = water0.equals((java.lang.Object) throwableArray40);
        uk.ac.sheffield.com1003.cafe.Recipe recipe44 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe44, "Milk [unit=ML, amount=10, type=SKIMMED]", (double) (byte) 0);
        java.lang.String str48 = order47.toString();
        java.lang.String str49 = order47.toString();
        boolean boolean50 = water0.equals((java.lang.Object) str49);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0" + "'", str48, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0" + "'", str49, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=true]", (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size7, 0);
        boolean boolean10 = cafe0.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str12 = coffee11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean14 = coffee11.equals((java.lang.Object) type13);
        java.lang.String str15 = coffee11.toString();
        java.lang.Object obj16 = null;
        boolean boolean17 = coffee11.equals(obj16);
        java.lang.String str18 = coffee11.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str21 = cafe20.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size24, (int) (short) 10);
        boolean boolean28 = recipe26.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "hi!", (double) 0L);
        boolean boolean32 = cafe20.addRecipe(recipe26);
        java.lang.String str33 = cafe20.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray34 = cafe20.getMenu();
        boolean boolean35 = coffee11.equals((java.lang.Object) recipeArray34);
        boolean boolean36 = recipe9.equals((java.lang.Object) coffee11);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Order: ; For: Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0; Paid: 0.0", (double) (-1));
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee" + "'", str18, "Coffee");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Welcome to hi!" + "'", str33, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]", (int) (byte) 0, 52);
        cafe3.printPendingOrders();
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order31 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray32 = cafe0.getMenu();
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
        org.junit.Assert.assertNull(order31);
        org.junit.Assert.assertNotNull(recipeArray32);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk4);
        java.lang.String str6 = milk4.toString();
        java.lang.String str7 = milk4.toString();
        java.lang.String str8 = milk4.toString();
        java.lang.String str9 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = milk4.getUnit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", "Syrup", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        java.lang.String str7 = water0.getName();
        java.lang.String str8 = water0.getName();
        java.lang.String str9 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 8);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) 10.0f);
        double double16 = recipe12.getPrice();
        java.lang.String str17 = recipe12.getName();
        boolean boolean18 = recipe12.isReady();
        boolean boolean19 = water0.equals((java.lang.Object) recipe12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 8.0d + "'", double16 == 8.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0; Paid: 100.0");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk33 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type34 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean35 = milk33.equals((java.lang.Object) type34);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk36 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type34);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk37 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type34);
        java.lang.String str38 = milk37.toString();
        boolean boolean39 = milk27.equals((java.lang.Object) milk37);
        int int40 = milk37.getAmount();
        java.lang.String str41 = milk37.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe43 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str44 = cafe43.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size47 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size47, (int) (short) 10);
        boolean boolean51 = recipe49.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order54 = new uk.ac.sheffield.com1003.cafe.Order(recipe49, "hi!", (double) 0L);
        boolean boolean55 = cafe43.addRecipe(recipe49);
        java.lang.String str56 = cafe43.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray57 = cafe43.getMenu();
        cafe43.printPendingOrders();
        cafe43.printMenu();
        boolean boolean60 = milk37.equals((java.lang.Object) cafe43);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=30, decaf=false]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type34.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Milk [unit=ML, amount=8, type=SKIMMED]" + "'", str38, "Milk [unit=ML, amount=8, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Milk [unit=ML, amount=8, type=SKIMMED]" + "'", str41, "Milk [unit=ML, amount=8, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + size47 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size47.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Welcome to hi!" + "'", str56, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.Object obj7 = null;
        boolean boolean8 = coffee6.equals(obj7);
        java.lang.String str9 = coffee6.getName();
        java.lang.String str10 = coffee6.toString();
        boolean boolean11 = coffee1.equals((java.lang.Object) str10);
        java.lang.String str12 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee" + "'", str9, "Coffee");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str10, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        int int11 = milk9.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        java.lang.String str14 = water13.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = water13.getUnit();
        boolean boolean16 = milk9.equals((java.lang.Object) water13);
        java.lang.String str17 = milk9.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type22 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean23 = milk21.equals((java.lang.Object) type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type22);
        boolean boolean26 = milk9.equals((java.lang.Object) milk25);
        java.lang.String str27 = milk25.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=0]" + "'", str14, "Water [unit=ML, amount=0]");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk" + "'", str17, "Milk");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk [unit=ML, amount=1, type=SKIMMED]" + "'", str27, "Milk [unit=ML, amount=1, type=SKIMMED]");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 10, size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0", (double) ' ', size8, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0]", (double) (byte) 0, size8, 35);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=100, decaf=false]]", (double) 1.0f);
        double double20 = recipe16.getPrice();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) 'a', 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        java.lang.String str2 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(52, true);
        boolean boolean6 = water0.equals((java.lang.Object) 52);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee13 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str14 = coffee13.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type15 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean16 = coffee13.equals((java.lang.Object) type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type15);
        boolean boolean20 = water9.equals((java.lang.Object) type15);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type15);
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean29 = cafe25.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup34 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=30, type=WHOLE]");
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup34);
        boolean boolean36 = milk21.equals((java.lang.Object) syrup34);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order42 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean47 = recipe39.isReady();
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Order: ; For: Water; Paid: 1.0", (double) (byte) 100);
        order50.serve();
        order50.serve();
        java.lang.String str53 = order50.toString();
        boolean boolean54 = milk21.equals((java.lang.Object) order50);
        java.lang.String str55 = order50.toString();
        boolean boolean56 = water0.equals((java.lang.Object) order50);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0" + "'", str53, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0" + "'", str55, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Water; Paid: 1.0; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str7 = coffee6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean9 = coffee6.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type8);
        boolean boolean12 = coffee3.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type8);
        int int14 = milk13.getAmount();
        java.lang.String str15 = milk13.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size18 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size18, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe20.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk25);
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe20, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0", (double) (-1), "Milk [unit=ML, amount=-1, type=WHOLE]");
        java.lang.String str31 = order30.toString();
        order30.serve();
        boolean boolean33 = milk13.equals((java.lang.Object) order30);
        order30.serve();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk" + "'", str15, "Milk");
        org.junit.Assert.assertTrue("'" + size18 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size18.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0" + "'", str31, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        double double11 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean16 = cafe3.addRecipe(recipe8);
        java.lang.String str17 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order18 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe3.serveOrder();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str17, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNull(order19);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0]", (double) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str4 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = coffee3.equals((java.lang.Object) type5);
        java.lang.String str7 = coffee3.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee3.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee3);
        java.lang.String str10 = coffee3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        java.lang.String str14 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = milk5.getUnit();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str8, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk" + "'", str9, "Milk");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str14, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 1.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1, true);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str11 = coffee10.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type12 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean13 = coffee10.equals((java.lang.Object) type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type12);
        boolean boolean16 = coffee7.equals((java.lang.Object) type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type12);
        boolean boolean18 = recipe3.equals((java.lang.Object) type12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        java.lang.String str2 = water0.toString();
        boolean boolean4 = water0.equals((java.lang.Object) 10);
        int int5 = water0.getAmount();
        java.lang.String str6 = water0.toString();
        java.lang.String str7 = water0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30 + "'", int5 == 30);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk", (double) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=true]", (double) 1L, "Order: ; For: Syrup; Paid: 35.0");
        java.lang.String str22 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", (int) (byte) 100, 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        java.lang.String str5 = cafe3.greeting();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water19 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str20 = water19.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        boolean boolean23 = water19.equals((java.lang.Object) "Milk");
        uk.ac.sheffield.com1003.cafe.Cafe cafe25 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        boolean boolean26 = water19.equals((java.lang.Object) cafe25);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water28 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        boolean boolean29 = water19.equals((java.lang.Object) '4');
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water19);
        uk.ac.sheffield.com1003.cafe.Recipe recipe33 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=SKIMMED]", (-1.0d));
        boolean boolean34 = recipe11.equals((java.lang.Object) (-1.0d));
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Order: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; For: Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]; Paid: 10.0", (double) 1, "Order: ; For: Milk [unit=ML, amount=-1, type=SKIMMED]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cafe" + "'", str15, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size14, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 1, size14, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (-1.0d), size14, (int) ' ');
        boolean boolean21 = cafe0.addRecipe(recipe20);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=SEMI]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
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
        java.lang.String str27 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException30 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray31 = cafeOutOfCapacityException30.getSuppressed();
        boolean boolean32 = coffee29.equals((java.lang.Object) cafeOutOfCapacityException30);
        uk.ac.sheffield.com1003.cafe.Cafe cafe33 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe33.printPendingOrders();
        java.lang.String str35 = cafe33.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray36 = cafe33.getMenu();
        java.lang.String str37 = cafe33.getName();
        java.lang.String str38 = cafe33.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size41 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size41, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk48 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe43.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk48);
        boolean boolean50 = cafe33.addRecipe(recipe43);
        uk.ac.sheffield.com1003.cafe.Order order51 = cafe33.serveOrder();
        java.lang.String str52 = cafe33.greeting();
        uk.ac.sheffield.com1003.cafe.Order order53 = cafe33.serveOrder();
        java.lang.String str54 = cafe33.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray55 = cafe33.getMenu();
        boolean boolean56 = coffee29.equals((java.lang.Object) cafe33);
        boolean boolean57 = water0.equals((java.lang.Object) cafe33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException58.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException61 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException61.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException64 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray65 = recipeNotFoundException64.getSuppressed();
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException64);
        recipeNotFoundException61.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException68 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray69 = cafeOutOfCapacityException68.getSuppressed();
        recipeNotFoundException61.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException68);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException71 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray72 = recipeNotFoundException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException71.getSuppressed();
        recipeNotFoundException61.addSuppressed((java.lang.Throwable) recipeNotFoundException71);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException71);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException76 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException76.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException78 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray79 = recipeNotFoundException78.getSuppressed();
        java.lang.Throwable[] throwableArray80 = recipeNotFoundException78.getSuppressed();
        recipeNotFoundException76.addSuppressed((java.lang.Throwable) recipeNotFoundException78);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException82 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray83 = recipeNotFoundException82.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException84 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException85 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray86 = recipeNotFoundException85.getSuppressed();
        recipeNotFoundException84.addSuppressed((java.lang.Throwable) recipeNotFoundException85);
        recipeNotFoundException82.addSuppressed((java.lang.Throwable) recipeNotFoundException84);
        recipeNotFoundException76.addSuppressed((java.lang.Throwable) recipeNotFoundException82);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException76);
        boolean boolean91 = water0.equals((java.lang.Object) recipeNotFoundException76);
        java.lang.String str92 = recipeNotFoundException76.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=30]" + "'", str27, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Cafe" + "'", str35, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Cafe" + "'", str37, "Cafe");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Cafe" + "'", str38, "Cafe");
        org.junit.Assert.assertTrue("'" + size41 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size41.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(order51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Welcome to Cafe" + "'", str52, "Welcome to Cafe");
        org.junit.Assert.assertNull(order53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cafe" + "'", str54, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray83);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str92, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup22 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup22);
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", 0.0d, "Order: ; For: ; Paid: 10.0");
        boolean boolean28 = water0.equals((java.lang.Object) 0.0d);
        java.lang.String str29 = water0.toString();
        int int30 = water0.getAmount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Water [unit=ML, amount=30]" + "'", str29, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(52);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        java.lang.Object obj4 = null;
        boolean boolean5 = water1.equals(obj4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=-1, type=WHOLE]", (double) 100L, size6, 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Order: ; For: ; Paid: 10.0", (double) 100L, size6, 97);
        double double13 = recipe12.getPrice();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size2, 0);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup", (double) (-1), "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        java.lang.String str9 = recipe4.getName();
        boolean boolean10 = recipe4.isReady();
        boolean boolean11 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
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
        java.lang.String str27 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        double double31 = recipe30.getPrice();
        boolean boolean32 = cafe1.addRecipe(recipe30);
        cafe1.removeRecipe("");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray35 = cafe1.getMenu();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Welcome to " + "'", str27, "Welcome to ");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(recipeArray35);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray1 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.Class<?> wildcardClass4 = throwableArray3.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean13 = cafe9.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=30, type=WHOLE]");
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Water [unit=ML, amount=30]; For: Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0; Paid: 100.0", (double) 8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        java.lang.String str6 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe7.printPendingOrders();
        java.lang.String str9 = cafe7.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size12, (int) (short) 10);
        java.lang.String str15 = recipe14.getName();
        boolean boolean16 = cafe7.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size19, (int) '4');
        boolean boolean22 = cafe7.addRecipe(recipe21);
        cafe7.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size26 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size26, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee32 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str33 = coffee32.toString();
        boolean boolean34 = recipe28.equals((java.lang.Object) str33);
        java.lang.String str35 = recipe28.getName();
        boolean boolean36 = cafe7.addRecipe(recipe28);
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) '#', "Milk [unit=ML, amount=1, type=WHOLE]");
        order40.printReceipt();
        java.lang.String str42 = order40.toString();
        boolean boolean43 = water0.equals((java.lang.Object) order40);
        int int44 = water0.getAmount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + size26 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size26.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str33, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; Paid: 35.0" + "'", str42, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; Paid: 35.0");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 30 + "'", int44 == 30);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Welcome to Cafe; For: Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; Paid: 35.0; Paid: 97.0");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) 100, size10, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) 10L, size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to hi!", (double) 1L, size10, 100);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        java.lang.String str7 = cafe3.getName();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=10, decaf=false]; Paid: 35.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        boolean boolean16 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Welcome to Cafe", 52.0d, "Order: Welcome to Coffee [unit=GR, amount=0, decaf=false]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 97.0");
        order20.printReceipt();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        cafe3.printPendingOrders();
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        java.lang.String str7 = cafe3.getName();
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe3.printPendingOrders();
        java.lang.String str5 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        java.lang.String str11 = recipe10.getName();
        boolean boolean12 = cafe3.addRecipe(recipe10);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        boolean boolean20 = cafe3.addRecipe(recipe16);
        boolean boolean21 = cafe1.addRecipe(recipe16);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException25 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray26 = recipeNotFoundException25.getSuppressed();
        recipeNotFoundException24.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water32 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str33 = water32.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk35 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean36 = water32.equals((java.lang.Object) 30);
        java.lang.String str37 = water32.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException40);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException45 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray46 = cafeOutOfCapacityException45.getSuppressed();
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException45);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException48 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException48.getSuppressed();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException48.getSuppressed();
        recipeNotFoundException38.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        boolean boolean52 = water32.equals((java.lang.Object) recipeNotFoundException48);
        recipeNotFoundException25.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException48);
        java.lang.String str55 = recipeNotFoundException13.toString();
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
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Water" + "'", str33, "Water");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Water [unit=ML, amount=30]" + "'", str37, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str55, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=30, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0", (int) (short) 10, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) (-1));
        boolean boolean7 = cafe3.addRecipe(recipe6);
        java.lang.String str8 = cafe3.getName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0" + "'", str8, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        boolean boolean11 = recipe7.equals((java.lang.Object) "Milk [unit=ML, amount=30, type=WHOLE]");
        java.lang.String str12 = recipe7.getName();
        boolean boolean13 = cafe0.addRecipe(recipe7);
        cafe0.printMenu();
        cafe0.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe0.serveOrder();
        java.lang.String str9 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size15, 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water20 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str21 = water20.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean24 = water20.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit25 = water20.getUnit();
        int int26 = water20.getAmount();
        boolean boolean27 = recipe19.equals((java.lang.Object) water20);
        double double28 = recipe19.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (double) 100.0f);
        boolean boolean32 = cafe0.addRecipe(recipe19);
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        boolean boolean37 = recipe36.isReady();
        boolean boolean38 = cafe0.addRecipe(recipe36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water" + "'", str21, "Water");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 30 + "'", int26 == 30);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 35.0d + "'", double28 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        cafe0.printPendingOrders();
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
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        java.lang.String str5 = coffee4.toString();
        java.lang.String str6 = coffee4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = coffee4.getUnit();
        java.lang.String str8 = coffee4.toString();
        boolean boolean9 = milk1.equals((java.lang.Object) coffee4);
        int int10 = coffee4.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str12 = cafe11.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe13.printPendingOrders();
        java.lang.String str15 = cafe13.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size18 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size18, (int) (short) 10);
        java.lang.String str21 = recipe20.getName();
        boolean boolean22 = cafe13.addRecipe(recipe20);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size25 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size25, (int) '4');
        boolean boolean28 = cafe13.addRecipe(recipe27);
        cafe13.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size32 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size32, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee38 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str39 = coffee38.toString();
        boolean boolean40 = recipe34.equals((java.lang.Object) str39);
        java.lang.String str41 = recipe34.getName();
        boolean boolean42 = cafe13.addRecipe(recipe34);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) '#', "Milk [unit=ML, amount=1, type=WHOLE]");
        boolean boolean47 = cafe11.addRecipe(recipe34);
        java.lang.String str48 = recipe34.getName();
        double double49 = recipe34.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order53 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Welcome to Milk", (double) (byte) 1, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order57 = new uk.ac.sheffield.com1003.cafe.Order(recipe34, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) (-1), "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0");
        order57.serve();
        boolean boolean59 = coffee4.equals((java.lang.Object) order57);
        int int60 = coffee4.getAmount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Cafe" + "'", str12, "Cafe");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size18 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size18.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + size25 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size25.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + size32 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size32.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str39, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        java.lang.String str16 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 10, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        order20.serve();
        order20.printReceipt();
        order20.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0", (double) (-1), "Milk [unit=ML, amount=-1, type=WHOLE]");
        double double15 = recipe4.getPrice();
        java.lang.String str16 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type18);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk19);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type25 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk26 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type25);
        java.lang.String str27 = milk26.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee28 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean29 = milk26.equals((java.lang.Object) coffee28);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk31 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        boolean boolean32 = coffee28.equals((java.lang.Object) milk31);
        boolean boolean33 = recipe23.equals((java.lang.Object) boolean32);
        boolean boolean34 = recipe23.isReady();
        uk.ac.sheffield.com1003.cafe.Order order38 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "hi!", 100.0d, "Coffee [unit=GR, amount=10, decaf=false]");
        boolean boolean39 = recipe4.equals((java.lang.Object) recipe23);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk" + "'", str27, "Milk");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
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
        boolean boolean30 = recipe21.isReady();
        double double31 = recipe21.getPrice();
        java.lang.Class<?> wildcardClass32 = recipe21.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        double double15 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to ", (double) (short) 100);
        boolean boolean22 = cafe0.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]", (-1.0d));
        order28.printReceipt();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", 10.0d, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", 32.0d, size8, 30);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Milk [unit=ML, amount=1, type=SKIMMED]", (double) (-1), "Welcome to Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=8, type=SKIMMED]", 8, (int) (byte) 1);
        cafe3.printMenu();
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(8, true);
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe6.getMenu();
        cafe6.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray9 = cafe6.getMenu();
        boolean boolean10 = coffee2.equals((java.lang.Object) recipeArray9);
        java.lang.String str11 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        uk.ac.sheffield.com1003.cafe.Order order16 = cafe15.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water; Paid: 1.0", (double) (short) -1);
        boolean boolean20 = cafe15.addRecipe(recipe19);
        boolean boolean21 = coffee2.equals((java.lang.Object) boolean20);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNotNull(recipeArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=8, decaf=true]" + "'", str11, "Coffee [unit=GR, amount=8, decaf=true]");
        org.junit.Assert.assertNull(order16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (-1L));
        double double3 = recipe2.getPrice();
        boolean boolean4 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size20, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 10, size20, 0);
        boolean boolean25 = recipe24.isReady();
        boolean boolean26 = cafe0.addRecipe(recipe24);
        java.lang.String str27 = cafe0.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", (double) (short) 0, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        order19.serve();
        order19.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size7, 0);
        boolean boolean10 = cafe0.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size13, (int) (short) 10);
        double double16 = recipe15.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Water", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean23 = recipe22.isReady();
        boolean boolean24 = recipe22.isReady();
        java.lang.String str25 = recipe22.getName();
        boolean boolean26 = recipe15.equals((java.lang.Object) recipe22);
        boolean boolean27 = cafe0.addRecipe(recipe15);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: ; Paid: 30.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water [unit=ML, amount=30]" + "'", str25, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size14, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size14, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 1L, size14, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Welcome to ; Paid: 10.0", (double) (byte) -1, size14, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=35, decaf=false]", 0.0d, size14, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Welcome to Cafe; For: Milk [unit=ML, amount=100, type=null]; Paid: 1.0", (double) (short) -1, size14, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) 10.0f, size14, 100);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
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
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException13 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray14 = cafeOutOfCapacityException13.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException13);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException16.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException16);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
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
        java.lang.String str14 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=30, decaf=false]");
        boolean boolean17 = milk1.equals((java.lang.Object) "Coffee [unit=GR, amount=30, decaf=false]");
        int int18 = milk1.getAmount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk" + "'", str14, "Milk");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=WHOLE]");
        java.lang.String str2 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Welcome to Cafe; Paid: 10.0; Paid: 1.0]", "", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Welcome to Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe10.getMenu();
        boolean boolean12 = recipe8.equals((java.lang.Object) cafe10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (byte) 100);
        boolean boolean16 = recipe8.isReady();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: 10.0", 100.0d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException52 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray53 = tooManyIngredientsException52.getSuppressed();
        recipeNotFoundException39.addSuppressed((java.lang.Throwable) tooManyIngredientsException52);
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
        org.junit.Assert.assertNotNull(throwableArray53);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Plain]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Milk [unit=ML, amount=0, type=SOY]", "Order: ; For: Welcome to Order: ; For: Water; Paid: 1.0; Paid: 10.0", (double) 52);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=hi!]", 10.0d, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str12 = coffee11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean14 = coffee11.equals((java.lang.Object) type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type13);
        boolean boolean19 = recipe6.equals((java.lang.Object) type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0", (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10);
        int int2 = coffee1.getAmount();
        java.lang.Object obj3 = null;
        boolean boolean4 = coffee1.equals(obj3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) -1, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        double double8 = recipe2.getPrice();
        boolean boolean9 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        java.lang.String str4 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee0.getUnit();
        java.lang.String str6 = coffee0.toString();
        java.lang.String str7 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 100);
        boolean boolean14 = cafe3.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=-1, type=WHOLE]", (double) 0.0f);
        double double18 = recipe13.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Water]; Paid: 0.0", (double) 100L, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=SKIMMED]; Paid: 0.0", 97.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0]]");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
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
        boolean boolean41 = milk22.equals((java.lang.Object) recipeNotFoundException23);
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException43 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray44 = cafeOutOfCapacityException43.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException52 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException52.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        cafeOutOfCapacityException43.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException59 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException59.getSuppressed();
        java.lang.Throwable[] throwableArray61 = recipeNotFoundException59.getSuppressed();
        recipeNotFoundException57.addSuppressed((java.lang.Throwable) recipeNotFoundException59);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException65 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        recipeNotFoundException65.addSuppressed((java.lang.Throwable) recipeNotFoundException66);
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        recipeNotFoundException57.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        java.lang.String str74 = recipeNotFoundException47.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str74, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=35, type=WHOLE]", (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        java.lang.Throwable[] throwableArray15 = cafeOutOfCapacityException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water16 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int17 = water16.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException19.getSuppressed();
        boolean boolean23 = water16.equals((java.lang.Object) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException28.getSuppressed();
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException37);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException19.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee44 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException45 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray46 = cafeOutOfCapacityException45.getSuppressed();
        boolean boolean47 = coffee44.equals((java.lang.Object) cafeOutOfCapacityException45);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException45);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray50 = cafeOutOfCapacityException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(throwableArray50);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.greeting();
        cafe1.printMenu();
        cafe1.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to hi!" + "'", str2, "Welcome to hi!");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean11 = coffee9.equals((java.lang.Object) 10L);
        boolean boolean13 = coffee9.equals((java.lang.Object) (-1.0f));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str16 = coffee15.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean18 = coffee15.equals((java.lang.Object) type17);
        java.lang.String str19 = coffee15.toString();
        java.lang.Object obj20 = null;
        boolean boolean21 = coffee15.equals(obj20);
        java.lang.String str22 = coffee15.getName();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee15);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size26 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=30, type=WHOLE]", (double) (short) 10, size26, (int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water31 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str32 = water31.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean35 = water31.equals((java.lang.Object) 30);
        java.lang.String str36 = water31.toString();
        java.lang.String str37 = water31.getName();
        boolean boolean39 = water31.equals((java.lang.Object) (byte) -1);
        java.lang.String str40 = water31.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit41 = water31.getUnit();
        boolean boolean42 = milk30.equals((java.lang.Object) water31);
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water31);
        boolean boolean44 = coffee15.equals((java.lang.Object) water31);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee47 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, true);
        boolean boolean48 = water31.equals((java.lang.Object) coffee47);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit49 = water31.getUnit();
        java.lang.Object obj50 = null;
        boolean boolean51 = water31.equals(obj50);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee" + "'", str22, "Coffee");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water" + "'", str32, "Water");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Water [unit=ML, amount=30]" + "'", str36, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Water" + "'", str37, "Water");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Water" + "'", str40, "Water");
        org.junit.Assert.assertTrue("'" + unit41 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit41.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + unit49 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit49.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray15 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size20, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (-1.0f), "Welcome to ");
        boolean boolean27 = coffee17.equals((java.lang.Object) recipe22);
        boolean boolean28 = cafe1.addRecipe(recipe22);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray29 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order30 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to hi!" + "'", str14, "Welcome to hi!");
        org.junit.Assert.assertNotNull(recipeArray15);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(recipeArray29);
        org.junit.Assert.assertNull(order30);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean8 = cafe4.addRecipe(recipe7);
        boolean boolean9 = syrup1.equals((java.lang.Object) recipe7);
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        boolean boolean14 = recipe7.equals((java.lang.Object) cafe13);
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe13.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray16 = cafe13.getMenu();
        java.lang.String str17 = cafe13.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = cafe13.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 1.0]", "Water [unit=ML, amount=52]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertNotNull(recipeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Welcome to Coffee [unit=GR, amount=0, decaf=false]" + "'", str17, "Welcome to Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        double double15 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to ", (double) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0; Paid: 8.0", (double) ' ');
        boolean boolean25 = cafe1.addRecipe(recipe8);
        cafe1.printMenu();
        java.lang.String str27 = cafe1.getName();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk" + "'", str27, "Milk");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) (-1));
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        java.lang.String str10 = water3.getName();
        java.lang.String str11 = water3.toString();
        java.lang.String str12 = water3.getName();
        boolean boolean13 = recipe2.equals((java.lang.Object) water3);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size16, (int) '4');
        boolean boolean20 = recipe18.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Welcome to Cafe", 0.0d);
        boolean boolean24 = recipe18.isReady();
        boolean boolean25 = recipe18.isReady();
        double double26 = recipe18.getPrice();
        boolean boolean27 = water3.equals((java.lang.Object) recipe18);
        java.lang.String str28 = water3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water [unit=ML, amount=30]" + "'", str28, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=true]");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, true);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", 0.0d);
        boolean boolean15 = recipe8.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        boolean boolean20 = coffee2.equals((java.lang.Object) "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.String str21 = coffee2.getName();
        int int22 = coffee2.getAmount();
        java.lang.String str23 = coffee2.toString();
        java.lang.String str24 = coffee2.toString();
        java.lang.String str25 = coffee2.toString();
        java.lang.String str26 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee" + "'", str21, "Coffee");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str23, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str24, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str25, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str26, "Coffee [unit=GR, amount=0, decaf=true]");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0; Paid: 30.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0; Paid: 8.0", "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]", (double) 30);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size9, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 1, size9, (int) ' ');
        boolean boolean16 = cafe0.addRecipe(recipe15);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (byte) 1, "Cafe");
        double double21 = recipe15.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water; Paid: 1.0", (double) (-1));
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe24, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", 1.0d, "Coffee");
        double double29 = recipe24.getPrice();
        boolean boolean30 = recipe15.equals((java.lang.Object) double29);
        uk.ac.sheffield.com1003.cafe.Cafe cafe34 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size37 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size37, (int) '4');
        boolean boolean41 = recipe39.equals((java.lang.Object) 10.0d);
        double double42 = recipe39.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean47 = cafe34.addRecipe(recipe39);
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe39, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0", 0.0d);
        double double51 = recipe39.getPrice();
        boolean boolean52 = recipe15.equals((java.lang.Object) recipe39);
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + size37 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size37.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
        java.lang.String str31 = water13.toString();
        java.lang.String str32 = water13.toString();
        java.lang.String str33 = water13.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe35 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=0, decaf=false]");
        cafe35.printMenu();
        java.lang.String str37 = cafe35.getName();
        cafe35.printMenu();
        boolean boolean39 = water13.equals((java.lang.Object) cafe35);
        java.lang.Class<?> wildcardClass40 = cafe35.getClass();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Water [unit=ML, amount=30]" + "'", str31, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water [unit=ML, amount=30]" + "'", str32, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Water [unit=ML, amount=30]" + "'", str33, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Welcome to Coffee [unit=GR, amount=0, decaf=false]" + "'", str37, "Welcome to Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException25 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray26 = cafeOutOfCapacityException25.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        java.lang.Throwable[] throwableArray28 = cafeOutOfCapacityException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException29.getSuppressed();
        cafeOutOfCapacityException25.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException36.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray46 = recipeNotFoundException45.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException48 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException48.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException50.getSuppressed();
        recipeNotFoundException48.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException50.getSuppressed();
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException65 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        recipeNotFoundException65.addSuppressed((java.lang.Throwable) recipeNotFoundException66);
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException70 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException70.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException73 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException73.getSuppressed();
        recipeNotFoundException72.addSuppressed((java.lang.Throwable) recipeNotFoundException73);
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) recipeNotFoundException72);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException77 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray78 = cafeOutOfCapacityException77.getSuppressed();
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException77);
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException70);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException81 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray82 = tooManyIngredientsException81.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water83 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int84 = water83.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException85 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException86 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray87 = recipeNotFoundException86.getSuppressed();
        recipeNotFoundException85.addSuppressed((java.lang.Throwable) recipeNotFoundException86);
        java.lang.Throwable[] throwableArray89 = recipeNotFoundException86.getSuppressed();
        boolean boolean90 = water83.equals((java.lang.Object) recipeNotFoundException86);
        java.lang.Throwable[] throwableArray91 = recipeNotFoundException86.getSuppressed();
        tooManyIngredientsException81.addSuppressed((java.lang.Throwable) recipeNotFoundException86);
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException86);
        java.lang.Throwable[] throwableArray94 = recipeNotFoundException63.getSuppressed();
        java.lang.Throwable[] throwableArray95 = recipeNotFoundException63.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray49);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 30 + "'", int84 == 30);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(throwableArray91);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray95);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str13 = order12.toString();
        order12.printReceipt();
        order12.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str13, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        java.lang.String str7 = water0.toString();
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe10.printPendingOrders();
        java.lang.String str12 = cafe10.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe10.getMenu();
        java.lang.String str14 = cafe10.greeting();
        cafe10.printPendingOrders();
        cafe10.printMenu();
        cafe10.printMenu();
        cafe10.printMenu();
        cafe10.printMenu();
        boolean boolean20 = water0.equals((java.lang.Object) cafe10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cafe10.placeOrder("Welcome to Coffee [unit=GR, amount=8, decaf=false]", "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: -1.0", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(35);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 30, (int) '4');
        java.lang.String str6 = cafe5.greeting();
        java.lang.String str7 = cafe5.greeting();
        boolean boolean8 = water1.equals((java.lang.Object) cafe5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str6, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str7, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        java.lang.String str4 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean9 = coffee7.equals((java.lang.Object) 10L);
        boolean boolean10 = coffee0.equals((java.lang.Object) boolean9);
        int int11 = coffee0.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str14 = syrup13.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException17.getSuppressed();
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException22.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException39 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray40 = cafeOutOfCapacityException39.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException39);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException42.getSuppressed();
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        boolean boolean48 = syrup13.equals((java.lang.Object) recipeNotFoundException26);
        int int49 = syrup13.getAmount();
        java.lang.String str50 = syrup13.toString();
        boolean boolean51 = coffee0.equals((java.lang.Object) syrup13);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str14, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str50, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.Object obj8 = null;
        boolean boolean9 = coffee7.equals(obj8);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup11 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=-1, type=WHOLE]");
        boolean boolean12 = coffee7.equals((java.lang.Object) syrup11);
        java.lang.String str13 = syrup11.toString();
        boolean boolean14 = milk4.equals((java.lang.Object) str13);
        int int15 = milk4.getAmount();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1, type2);
        java.lang.String str5 = milk4.getName();
        java.lang.String str6 = milk4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int9 = milk8.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str11 = water10.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean22 = water10.equals((java.lang.Object) "Welcome to Cafe");
        boolean boolean23 = milk8.equals((java.lang.Object) boolean22);
        java.lang.String str24 = milk8.getName();
        java.lang.String str25 = milk8.getName();
        int int26 = milk8.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, false);
        int int30 = coffee29.getAmount();
        boolean boolean31 = milk8.equals((java.lang.Object) coffee29);
        uk.ac.sheffield.com1003.cafe.Recipe recipe34 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean35 = coffee29.equals((java.lang.Object) recipe34);
        boolean boolean36 = milk4.equals((java.lang.Object) coffee29);
        java.lang.String str37 = coffee29.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk" + "'", str24, "Milk");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk" + "'", str25, "Milk");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str37, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=32, type=ALMOND]]");
        java.lang.String str5 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = milk2.getUnit();
        java.lang.String str7 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=-1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=-1, type=SEMI]" + "'", str7, "Milk [unit=ML, amount=-1, type=SEMI]");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 10, size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0]", 52.0d, size6, 100);
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
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
        boolean boolean52 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Welcome to Milk", (double) 35, "Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
        boolean boolean57 = recipe18.isReady();
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee2.getUnit();
        java.lang.String str6 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk [unit=ML, amount=-1, type=SKIMMED]; For: Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0; Paid: 1.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Water [unit=ML, amount=10]", "Welcome to Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 30.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: hi!; Paid: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=32, type=ALMOND]; Paid: 1.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size11, 0);
        boolean boolean14 = recipe4.equals((java.lang.Object) size11);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water [unit=ML, amount=-1]", (double) 8);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        order14.printReceipt();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=30]" + "'", str10, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0" + "'", str16, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = recipe4.getName();
        boolean boolean9 = recipe4.equals((java.lang.Object) "Coffee");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup11 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str12 = syrup11.toString();
        java.lang.String str13 = syrup11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = syrup11.getUnit();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup11);
        double double16 = recipe4.getPrice();
        boolean boolean17 = recipe4.isReady();
        java.lang.String str18 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type3);
        uk.ac.sheffield.com1003.cafe.Cafe cafe8 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=35]");
        java.lang.String str9 = cafe8.greeting();
        boolean boolean10 = milk6.equals((java.lang.Object) cafe8);
        java.lang.String str11 = cafe8.greeting();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Water [unit=ML, amount=35]" + "'", str9, "Welcome to Water [unit=ML, amount=35]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Water [unit=ML, amount=35]" + "'", str11, "Welcome to Water [unit=ML, amount=35]");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        double double15 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to ", (double) (short) 100);
        boolean boolean22 = cafe0.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean27 = coffee25.equals((java.lang.Object) 10L);
        boolean boolean29 = coffee25.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj30 = null;
        boolean boolean31 = coffee25.equals(obj30);
        boolean boolean33 = coffee25.equals((java.lang.Object) (short) 1);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee25);
        java.lang.String str35 = coffee25.toString();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=52, decaf=true]" + "'", str35, "Coffee [unit=GR, amount=52, decaf=true]");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water31 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str32 = water31.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean35 = water31.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit36 = water31.getUnit();
        java.lang.Class<?> wildcardClass37 = unit36.getClass();
        boolean boolean38 = milk30.equals((java.lang.Object) wildcardClass37);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size41 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size41, (int) (short) 10);
        boolean boolean45 = recipe43.equals((java.lang.Object) 10.0f);
        double double46 = recipe43.getPrice();
        boolean boolean47 = milk30.equals((java.lang.Object) recipe43);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit48 = milk30.getUnit();
        boolean boolean49 = coffee26.equals((java.lang.Object) milk30);
        java.lang.String str50 = milk30.toString();
        java.lang.String str51 = milk30.toString();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water" + "'", str32, "Water");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + unit36 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit36.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + size41 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size41.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit48.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Milk [unit=ML, amount=35, type=WHOLE]" + "'", str50, "Milk [unit=ML, amount=35, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Milk [unit=ML, amount=35, type=WHOLE]" + "'", str51, "Milk [unit=ML, amount=35, type=WHOLE]");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", (double) (-1.0f));
        java.lang.String str16 = order15.toString();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]; Paid: -1.0" + "'", str16, "Order: ; For: Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]; Paid: -1.0");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, false);
        java.lang.String str3 = coffee2.getName();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 0L, size9, 0);
        boolean boolean14 = coffee2.equals((java.lang.Object) 0);
        java.lang.String str15 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean6 = milk4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type5);
        java.lang.String str10 = milk9.toString();
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=100, type=SKIMMED]" + "'", str10, "Milk [unit=ML, amount=100, type=SKIMMED]");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size10, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=0]", (double) '#', size10, (int) (short) 0);
        boolean boolean19 = water1.equals((java.lang.Object) recipe18);
        java.lang.String str20 = water1.toString();
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=0]" + "'", str20, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str13 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient14 = null;
        recipe4.addIngredient(ingredient14);
        java.lang.String str16 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(32);
        java.lang.String str19 = coffee18.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee18);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=32, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=32, decaf=false]");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        java.lang.String str5 = cafe3.greeting();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=10, type=SKIMMED]", (double) (byte) 0);
        boolean boolean13 = cafe3.addRecipe(recipe9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type16 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type16);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type16);
        java.lang.String str19 = milk18.toString();
        boolean boolean20 = recipe9.equals((java.lang.Object) str19);
        double double21 = recipe9.getPrice();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str5, "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str19, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException9.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException23 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray24 = cafeOutOfCapacityException23.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException23);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException26.getSuppressed();
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        recipeNotFoundException33.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException38 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray39 = cafeOutOfCapacityException38.getSuppressed();
        recipeNotFoundException31.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException38);
        java.lang.Throwable[] throwableArray41 = cafeOutOfCapacityException38.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException42.getSuppressed();
        cafeOutOfCapacityException38.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException38);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException38);
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray49 = recipeNotFoundException3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray49);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Syrup]", (int) (short) 1, 30);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
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
        uk.ac.sheffield.com1003.cafe.Order order21 = cafe0.serveOrder();
        java.lang.String str22 = cafe0.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertNull(order20);
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cafe" + "'", str22, "Cafe");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        java.lang.String str9 = milk8.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee10 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str11 = coffee10.toString();
        java.lang.String str12 = coffee10.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee10.getUnit();
        boolean boolean14 = milk8.equals((java.lang.Object) coffee10);
        boolean boolean15 = recipe2.equals((java.lang.Object) boolean14);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        int int18 = water17.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe19 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe19.printPendingOrders();
        java.lang.String str21 = cafe19.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray22 = cafe19.getMenu();
        java.lang.String str23 = cafe19.greeting();
        cafe19.printMenu();
        cafe19.printPendingOrders();
        boolean boolean26 = water17.equals((java.lang.Object) cafe19);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water17);
        java.lang.String str28 = water17.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = water17.getUnit();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk" + "'", str9, "Milk");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str28, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException25 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray26 = cafeOutOfCapacityException25.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        java.lang.Throwable[] throwableArray28 = cafeOutOfCapacityException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException29.getSuppressed();
        cafeOutOfCapacityException25.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        java.lang.String str34 = recipeNotFoundException13.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]", (double) 0L, "Milk [unit=ML, amount=-1, type=SKIMMED]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup12);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size16, (int) (short) 10);
        double double19 = recipe18.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Welcome to Cafe", (double) 10);
        boolean boolean23 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size26 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size26, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk33 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk33);
        int int35 = milk33.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water37 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        java.lang.String str38 = water37.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit39 = water37.getUnit();
        boolean boolean40 = milk33.equals((java.lang.Object) water37);
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water37);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water37);
        java.lang.Class<?> wildcardClass43 = recipe2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + size26 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size26.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Water [unit=ML, amount=0]" + "'", str38, "Water [unit=ML, amount=0]");
        org.junit.Assert.assertTrue("'" + unit39 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit39.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray9 = cafe3.getMenu();
        cafe3.printMenu();
        cafe3.printPendingOrders();
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertNotNull(recipeArray9);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) ' ', (int) (byte) 1);
        cafe6.printMenu();
        boolean boolean8 = coffee0.equals((java.lang.Object) cafe6);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size11, 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str19 = coffee18.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean22 = coffee18.equals((java.lang.Object) cafe21);
        boolean boolean23 = water15.equals((java.lang.Object) boolean22);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water15);
        boolean boolean25 = cafe6.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order order26 = cafe6.serveOrder();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(order26);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", 97, (int) (short) 1);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=32, type=ALMOND]]");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk2.getUnit();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe30 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe30.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order32 = cafe30.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray33 = cafe30.getMenu();
        java.lang.String str34 = cafe30.greeting();
        java.lang.String str35 = cafe30.greeting();
        boolean boolean36 = water13.equals((java.lang.Object) str35);
        java.lang.Object obj37 = null;
        boolean boolean38 = water13.equals(obj37);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water" + "'", str22, "Water");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(order32);
        org.junit.Assert.assertNotNull(recipeArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str34, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str35, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) 100, size10, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Water; Paid: 1.0", 0.0d, size10, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=32, type=ALMOND]]; Paid: 97.0", (double) 1, size10, 10);
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        boolean boolean23 = recipe20.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=10, decaf=false]", (double) (-1));
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0", 100.0d, "Milk [unit=ML, amount=10, type=WHOLE]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Cafe" + "'", str9, "Cafe");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Welcome to Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (byte) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: ; For: Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]]; Paid: -1.0", "Coffee", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (-1.0f));
        boolean boolean6 = recipe2.isReady();
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Welcome to Cafe; For: Milk [unit=ML, amount=100, type=null]; Paid: 1.0", (double) 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]", 0, 10);
        java.lang.String str4 = cafe3.getName();
        java.lang.String str5 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=]]");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException1 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException9 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException10 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray11 = recipeNotFoundException10.getSuppressed();
        recipeNotFoundException9.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException10);
        cafeOutOfCapacityException1.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        cafeOutOfCapacityException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water19 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str20 = water19.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk22 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean23 = water19.equals((java.lang.Object) 30);
        java.lang.String str24 = water19.toString();
        java.lang.String str25 = water19.getName();
        boolean boolean27 = water19.equals((java.lang.Object) (byte) -1);
        java.lang.String str28 = water19.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup30 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str31 = syrup30.toString();
        java.lang.String str32 = syrup30.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit33 = syrup30.getUnit();
        boolean boolean34 = water19.equals((java.lang.Object) syrup30);
        recipe18.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water19);
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
        boolean boolean50 = water19.equals((java.lang.Object) recipeNotFoundException36);
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException36.getSuppressed();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException36.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException53 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray54 = recipeNotFoundException53.getSuppressed();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException53.getSuppressed();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException53.getSuppressed();
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException53);
        cafeOutOfCapacityException1.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water" + "'", str20, "Water");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Water" + "'", str25, "Water");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water" + "'", str28, "Water");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str31, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str32, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) (byte) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str10 = coffee9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean12 = coffee9.equals((java.lang.Object) type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str15 = syrup14.toString();
        boolean boolean16 = coffee9.equals((java.lang.Object) syrup14);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        java.lang.String str18 = coffee9.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee" + "'", str18, "Coffee");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
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
        java.lang.String str23 = cafe0.getName();
        java.lang.String str24 = cafe0.getName();
        cafe0.printMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cafe" + "'", str22, "Cafe");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Cafe" + "'", str23, "Cafe");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Cafe" + "'", str24, "Cafe");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 0.0", 52, (int) (short) 10);
        cafe3.printMenu();
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 0, (int) 'a');
        java.lang.String str4 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=SKIMMED]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe6.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe6.getMenu();
        java.lang.String str9 = cafe6.getName();
        java.lang.String str10 = cafe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe6.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Water", (double) 100.0f, "Milk");
        double double26 = recipe14.getPrice();
        boolean boolean27 = cafe6.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water29 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(8);
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water29);
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) (short) 10, "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean35 = coffee2.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type1);
        java.lang.String str3 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe7.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = null;
        boolean boolean10 = cafe7.addRecipe(recipe9);
        boolean boolean11 = milk2.equals((java.lang.Object) recipe9);
        java.lang.String str12 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size15 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size15, (int) (short) 10);
        boolean boolean19 = recipe17.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str26 = order25.toString();
        java.lang.String str27 = order25.toString();
        order25.serve();
        order25.printReceipt();
        boolean boolean30 = milk2.equals((java.lang.Object) order25);
        java.lang.Class<?> wildcardClass31 = order25.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=ALMOND]" + "'", str3, "Milk [unit=ML, amount=32, type=ALMOND]");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=ALMOND]" + "'", str12, "Milk [unit=ML, amount=32, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str26, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str27, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.toString();
        java.lang.String str6 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str10 = coffee9.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size13, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str20 = coffee19.toString();
        boolean boolean21 = recipe15.equals((java.lang.Object) str20);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        double double26 = recipe15.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        boolean boolean31 = coffee9.equals((java.lang.Object) "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
        int int32 = coffee9.getAmount();
        java.lang.String str33 = coffee9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit34 = coffee9.getUnit();
        boolean boolean35 = milk1.equals((java.lang.Object) coffee9);
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe39.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order41 = cafe39.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order42 = cafe39.serveOrder();
        java.lang.String str43 = cafe39.greeting();
        boolean boolean44 = coffee9.equals((java.lang.Object) cafe39);
        uk.ac.sheffield.com1003.cafe.Recipe recipe47 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) 1);
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe47, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10.0f);
        java.lang.String str51 = recipe47.getName();
        boolean boolean52 = cafe39.addRecipe(recipe47);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str5, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str33, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit34 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit34.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(order41);
        org.junit.Assert.assertNull(order42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str43, "Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Water [unit=ML, amount=100]" + "'", str51, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", 100.0d, size6, 32);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: -1.0]", 35.0d, size6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Cafe", (double) 100, size4, 10);
        double double9 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size14, (int) (short) 10);
        double double17 = recipe16.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        boolean boolean25 = milk11.equals((java.lang.Object) order24);
        java.lang.String str26 = milk11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0, true);
        java.lang.String str30 = coffee29.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size33 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size33, (int) '4');
        boolean boolean37 = recipe35.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order40 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "Welcome to Cafe", 0.0d);
        boolean boolean42 = recipe35.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe35, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        boolean boolean47 = coffee29.equals((java.lang.Object) "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.String str48 = coffee29.getName();
        int int49 = coffee29.getAmount();
        java.lang.String str50 = coffee29.toString();
        boolean boolean51 = milk11.equals((java.lang.Object) str50);
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk11);
        java.lang.String str53 = milk11.toString();
        java.lang.Object obj54 = null;
        boolean boolean55 = milk11.equals(obj54);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str30, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertTrue("'" + size33 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size33.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Coffee" + "'", str48, "Coffee");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str50, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str53, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size12, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size12, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size12, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=0]", (double) '#', size12, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0", (double) 100L, size12, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]", 0.0d, size12, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str27 = coffee26.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type28 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean29 = coffee26.equals((java.lang.Object) type28);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type28);
        java.lang.String str31 = milk30.getName();
        java.lang.String str32 = milk30.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe36 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size39 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe41 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size39, (int) '4');
        boolean boolean43 = recipe41.equals((java.lang.Object) 10.0d);
        double double44 = recipe41.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean49 = cafe36.addRecipe(recipe41);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe41, "Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0", 0.0d);
        order52.serve();
        boolean boolean54 = milk30.equals((java.lang.Object) order52);
        recipe24.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk30);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk" + "'", str31, "Milk");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str32, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + size39 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size39.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Coffee [unit=GR, amount=0, decaf=false]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Coffee [unit=GR, amount=0, decaf=false]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Coffee [unit=GR, amount=0, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Coffee [unit=GR, amount=0, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Coffee [unit=GR, amount=0, decaf=false]]");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        boolean boolean11 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water12 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str13 = water12.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = water12.getUnit();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water12);
        java.lang.String str16 = water12.toString();
        java.lang.String str17 = water12.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=30]" + "'", str16, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=30]" + "'", str17, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Order: ; For: Welcome to Cafe; Paid: 10.0; Paid: 1.0]");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=1, type=WHOLE]");
        cafe1.printPendingOrders();
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str10 = coffee9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean12 = coffee9.equals((java.lang.Object) type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type11);
        java.lang.String str14 = milk13.getName();
        java.lang.String str15 = milk13.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water16 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int17 = water16.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException19.getSuppressed();
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException19.getSuppressed();
        boolean boolean23 = water16.equals((java.lang.Object) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException19.getSuppressed();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException19.getSuppressed();
        boolean boolean26 = milk13.equals((java.lang.Object) recipeNotFoundException19);
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException19.getSuppressed();
        java.lang.String str29 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk" + "'", str14, "Milk");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str15, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str29, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=10, type=SKIMMED]");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean19 = milk17.equals((java.lang.Object) type18);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type18);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk21 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type18);
        java.lang.String str22 = milk21.toString();
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        boolean boolean24 = cafe1.addRecipe(recipe7);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Milk [unit=ML, amount=32, type=SKIMMED]" + "'", str22, "Milk [unit=ML, amount=32, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        java.lang.String str2 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe4.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe4.serveOrder();
        boolean boolean7 = milk1.equals((java.lang.Object) order6);
        boolean boolean9 = milk1.equals((java.lang.Object) "Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException10 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException11 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray12 = cafeOutOfCapacityException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException15.getSuppressed();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException15.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException15.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        cafeOutOfCapacityException11.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        cafeOutOfCapacityException10.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException11);
        boolean boolean26 = milk1.equals((java.lang.Object) cafeOutOfCapacityException11);
        java.lang.String str27 = milk1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str27, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }
}

