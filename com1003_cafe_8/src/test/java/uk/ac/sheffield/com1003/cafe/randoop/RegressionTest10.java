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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str5 = coffee4.toString();
        boolean boolean6 = water0.equals((java.lang.Object) coffee4);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water8 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = water8.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe10.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray19 = cafe10.getOrders();
        java.lang.String str20 = cafe10.greeting();
        boolean boolean21 = water8.equals((java.lang.Object) str20);
        java.lang.String str22 = water8.toString();
        boolean boolean23 = coffee4.equals((java.lang.Object) water8);
        java.lang.String str24 = water8.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Cafe" + "'", str20, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water [unit=ML, amount=52]" + "'", str22, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=52]" + "'", str24, "Water [unit=ML, amount=52]");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10);
        boolean boolean9 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee", 97.0d);
        boolean boolean13 = cafe1.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]", 100.0d, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str4 = cafe3.greeting();
        int int5 = cafe3.getIndexNextOrderToServe();
        java.lang.String str6 = cafe3.getName();
        boolean boolean7 = coffee1.equals((java.lang.Object) cafe3);
        int int8 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        java.lang.String str4 = coffee2.getName();
        java.lang.String str5 = coffee2.toString();
        java.lang.Class<?> wildcardClass6 = coffee2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        java.lang.String str4 = cafe3.greeting();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean15 = milk7.equals((java.lang.Object) recipe10);
        boolean boolean16 = recipe10.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order18 = cafe17.serveOrder();
        java.lang.String str19 = cafe17.greeting();
        java.lang.String str20 = cafe17.getName();
        uk.ac.sheffield.com1003.cafe.Order order21 = cafe17.serveOrder();
        boolean boolean22 = recipe10.equals((java.lang.Object) cafe17);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 32);
        boolean boolean26 = cafe3.addRecipe(recipe10);
        double double27 = recipe10.getPrice();
        boolean boolean28 = recipe10.isReady();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]" + "'", str4, "Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(order18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNull(order21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 32.0d + "'", double27 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str12 = order11.toString();
        boolean boolean13 = milk1.equals((java.lang.Object) order11);
        order11.printReceipt();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str12, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe4.getOrders();
        java.lang.String str14 = cafe4.greeting();
        cafe4.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean19 = cafe4.addRecipe(recipe18);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe22.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk28);
        boolean boolean30 = recipe18.equals((java.lang.Object) recipe22);
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Plain", (double) 8);
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
        java.lang.String str59 = syrup35.getFlavour();
        java.lang.String str60 = syrup35.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water62 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str63 = water62.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe66 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order70 = new uk.ac.sheffield.com1003.cafe.Order(recipe66, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean71 = water62.equals((java.lang.Object) recipe66);
        boolean boolean72 = syrup35.equals((java.lang.Object) recipe66);
        recipe22.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup35);
        uk.ac.sheffield.com1003.cafe.Order order77 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Order: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", 97.0d, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
        boolean boolean78 = milk1.equals((java.lang.Object) order77);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Syrup" + "'", str36, "Syrup");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str37, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Syrup" + "'", str38, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(orderArray48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Welcome to Cafe" + "'", str49, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str59, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str60, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Water [unit=ML, amount=52]" + "'", str63, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size14, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size14, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size14, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (byte) 10, size14, (int) ' ');
        boolean boolean23 = cafe1.addRecipe(recipe22);
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double11 = recipe6.getPrice();
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        boolean boolean16 = water1.equals((java.lang.Object) cafe15);
        java.lang.String str17 = cafe15.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = syrup1.getUnit();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.toString();
        int int7 = syrup1.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = syrup1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean17 = cafe9.addRecipe(recipe12);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray18 = cafe9.getOrders();
        java.lang.String str19 = cafe9.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean28 = cafe20.addRecipe(recipe23);
        boolean boolean29 = cafe9.addRecipe(recipe23);
        uk.ac.sheffield.com1003.cafe.Cafe cafe30 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str31 = cafe30.greeting();
        int int32 = cafe30.getIndexNextOrderToPlace();
        boolean boolean33 = recipe23.equals((java.lang.Object) cafe30);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size44 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe46 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size44, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe48 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size44, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe50 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (short) 1, size44, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (-1), size44, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]]", 100.0d, size44, 52);
        boolean boolean55 = cafe30.addRecipe(recipe54);
        boolean boolean56 = syrup1.equals((java.lang.Object) recipe54);
        java.lang.String str57 = syrup1.getFlavour();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(orderArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Welcome to Cafe" + "'", str31, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + size44 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size44.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str57, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=1]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Welcome to Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", "Welcome to Plain", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=97]");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.Class<?> wildcardClass5 = cafe1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Water [unit=ML, amount=97]" + "'", str2, "Welcome to Water [unit=ML, amount=97]");
        org.junit.Assert.assertNotNull(orderArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup11 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=10]");
        boolean boolean12 = water0.equals((java.lang.Object) syrup11);
        java.lang.String str13 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = water0.getUnit();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=30]" + "'", str13, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        java.lang.String str6 = syrup1.toString();
        java.lang.String str7 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = syrup1.getUnit();
        java.lang.String str9 = syrup1.toString();
        java.lang.String str10 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit11 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str10, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type3);
        java.lang.String str7 = milk6.toString();
        java.lang.Object obj8 = null;
        boolean boolean9 = milk6.equals(obj8);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=35, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=35, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 0.0f);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        int int4 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        int int5 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe3.getOrders();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
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
        java.lang.String str24 = water17.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe28.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double37 = recipe32.getPrice();
        boolean boolean38 = recipe32.isReady();
        boolean boolean39 = cafe28.addRecipe(recipe32);
        boolean boolean40 = water17.equals((java.lang.Object) boolean39);
        java.lang.String str41 = water17.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water43 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj44 = null;
        boolean boolean45 = water43.equals(obj44);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit46 = water43.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type50 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk51 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type50);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk52 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type50);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk53 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type50);
        boolean boolean54 = water43.equals((java.lang.Object) milk53);
        boolean boolean55 = water17.equals((java.lang.Object) water43);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=10]" + "'", str18, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=10]" + "'", str24, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Water [unit=ML, amount=10]" + "'", str41, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + unit46 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit46.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type50.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) '4', size10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", (double) (-1.0f), size10, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee", 100.0d, size10, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 8, size10, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) (-1.0f), size10, 52);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", (int) (byte) 100, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = null;
        boolean boolean5 = cafe3.addRecipe(recipe4);
        cafe3.printPendingOrders();
        int int7 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe0.getOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe0.getOrders();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertNotNull(orderArray7);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size16, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size16, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size16, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 100, size16, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (-1.0d), size16, 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=false]", 0.0d, size16, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=10, type=SOY]]", 8.0d, size16, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0", 52.0d, size16, 0);
        java.lang.String str33 = recipe32.getName();
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0" + "'", str33, "Order: ; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str34 = order33.toString();
        boolean boolean35 = recipe2.equals((java.lang.Object) str34);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to hi!", (double) 1.0f, "Coffee [unit=GR, amount=35, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee" + "'", str17, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0" + "'", str34, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Milk [unit=ML, amount=0, type=ALMOND]]", 8.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printMenu();
        int int5 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        order10.printReceipt();
        java.time.LocalDateTime localDateTime12 = order10.getOrderServed();
        java.lang.Class<?> wildcardClass13 = order10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = coffee8.getUnit();
        java.lang.String str10 = coffee8.toString();
        java.lang.String str11 = coffee8.toString();
        int int12 = coffee8.getAmount();
        int int13 = coffee8.getAmount();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
        boolean boolean15 = coffee8.getDecaf();
        boolean boolean16 = coffee8.getDecaf();
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type2);
        java.lang.Class<?> wildcardClass5 = type2.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        int int6 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup8 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean20 = recipe11.isReady();
        boolean boolean21 = syrup8.equals((java.lang.Object) recipe11);
        java.lang.String str22 = recipe11.getName();
        boolean boolean23 = cafe3.addRecipe(recipe11);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str22, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException31 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException31.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException31.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException34 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException34.getSuppressed();
        tooManyIngredientsException31.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
        recipeNotFoundException29.addSuppressed((java.lang.Throwable) recipeNotFoundException34);
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
        recipeNotFoundException34.addSuppressed((java.lang.Throwable) recipeNotFoundException46);
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException46.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException51.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException54 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray55 = tooManyIngredientsException54.getSuppressed();
        java.lang.Throwable[] throwableArray56 = tooManyIngredientsException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) tooManyIngredientsException54);
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        boolean boolean64 = water1.equals((java.lang.Object) recipeNotFoundException51);
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
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        int int5 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe1.placeOrder("Milk [unit=ML, amount=1, type=SEMI]", "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        boolean boolean10 = milk8.equals((java.lang.Object) (-1L));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100);
        boolean boolean13 = milk8.equals((java.lang.Object) (byte) 100);
        java.lang.String str14 = milk8.toString();
        java.lang.String str15 = milk8.toString();
        boolean boolean16 = milk6.equals((java.lang.Object) str15);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str14, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str15, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        java.lang.String str4 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str4, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        java.lang.String str3 = water1.getName();
        java.lang.String str4 = water1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=52]" + "'", str4, "Water [unit=ML, amount=52]");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (int) 'a', (int) 'a');
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size11, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (short) 0, size11, 32);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (byte) 10, size11, (int) (short) 0);
        boolean boolean18 = cafe3.addRecipe(recipe17);
        boolean boolean19 = recipe17.isReady();
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]; Paid: 97.0", 97.0d);
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        boolean boolean3 = milk1.equals((java.lang.Object) (-1L));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100);
        boolean boolean6 = milk1.equals((java.lang.Object) (byte) 100);
        java.lang.String str7 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup9 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str10 = syrup9.getFlavour();
        int int11 = syrup9.getAmount();
        java.lang.String str12 = syrup9.toString();
        java.lang.String str13 = syrup9.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException14 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean15 = syrup9.equals((java.lang.Object) tooManyIngredientsException14);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException16 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) tooManyIngredientsException16);
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
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        java.lang.Throwable[] throwableArray31 = tooManyIngredientsException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException32 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray33 = recipeNotFoundException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException35 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray36 = tooManyIngredientsException35.getSuppressed();
        java.lang.Throwable[] throwableArray37 = tooManyIngredientsException35.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException38.getSuppressed();
        tooManyIngredientsException35.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException35.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        recipeNotFoundException32.addSuppressed((java.lang.Throwable) tooManyIngredientsException35);
        java.lang.Throwable[] throwableArray44 = tooManyIngredientsException35.getSuppressed();
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) tooManyIngredientsException35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk47 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit48 = milk47.getUnit();
        java.lang.String str49 = milk47.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException52 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray53 = tooManyIngredientsException52.getSuppressed();
        java.lang.Throwable[] throwableArray54 = tooManyIngredientsException52.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        tooManyIngredientsException52.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        recipeNotFoundException50.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        boolean boolean59 = milk47.equals((java.lang.Object) recipeNotFoundException55);
        tooManyIngredientsException14.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        java.lang.Throwable[] throwableArray61 = tooManyIngredientsException14.getSuppressed();
        java.lang.Throwable[] throwableArray62 = tooManyIngredientsException14.getSuppressed();
        boolean boolean63 = milk1.equals((java.lang.Object) throwableArray62);
        java.lang.String str64 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit48.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Milk" + "'", str49, "Milk");
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray54);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str64, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str10 = water9.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean18 = water9.equals((java.lang.Object) recipe13);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk23 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean31 = milk23.equals((java.lang.Object) recipe26);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type33 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type33);
        java.lang.String str35 = milk34.toString();
        int int36 = milk34.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit37 = milk34.getUnit();
        recipe26.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water39 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str40 = water39.toString();
        java.lang.String str41 = water39.toString();
        java.lang.String str42 = water39.toString();
        boolean boolean43 = milk34.equals((java.lang.Object) water39);
        recipe13.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water39);
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Welcome to Cafe", 100.0d, "Order: ; For: ; Paid: 100.0");
        boolean boolean49 = cafe1.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe52 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order60 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee62 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit63 = coffee62.getUnit();
        boolean boolean64 = recipe52.equals((java.lang.Object) unit63);
        uk.ac.sheffield.com1003.cafe.Order order68 = new uk.ac.sheffield.com1003.cafe.Order(recipe52, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 1, "Coffee [unit=GR, amount=1, decaf=true]");
        boolean boolean69 = cafe1.addRecipe(recipe52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=52]" + "'", str10, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type33.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str35, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + unit37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Water [unit=ML, amount=30]" + "'", str40, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Water [unit=ML, amount=30]" + "'", str41, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Water [unit=ML, amount=30]" + "'", str42, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + unit63 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit63.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        java.lang.String str7 = milk6.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = coffee9.getUnit();
        java.lang.String str11 = coffee9.toString();
        java.lang.String str12 = coffee9.toString();
        int int13 = coffee9.getAmount();
        boolean boolean15 = coffee9.equals((java.lang.Object) 0.0d);
        boolean boolean16 = milk6.equals((java.lang.Object) coffee9);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water20 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str21 = water20.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type22 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean23 = water20.equals((java.lang.Object) type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk24 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk25 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type22);
        boolean boolean26 = coffee9.equals((java.lang.Object) type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30, type22);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk28 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type22);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str7, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water [unit=ML, amount=10]" + "'", str21, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0]");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=100]", (double) (short) -1);
        boolean boolean3 = recipe2.isReady();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.getName();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        int int6 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe1.serveOrder();
        int int8 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe1.getOrders();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(orderArray9);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8, type2);
        int int5 = milk4.getAmount();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        java.lang.Class<?> wildcardClass4 = coffee2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str6 = recipe2.getName();
        java.lang.String str7 = recipe2.getName();
        boolean boolean8 = recipe2.isReady();
        double double9 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=100, type=WHOLE]", (double) (short) 100, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        boolean boolean15 = recipe2.equals((java.lang.Object) "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0", (double) (byte) 1);
        order18.printReceipt();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        java.lang.String str13 = cafe0.getName();
        int int14 = cafe0.getIndexNextOrderToPlace();
        int int15 = cafe0.getIndexNextOrderToPlace();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cafe" + "'", str13, "Cafe");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Milk [unit=ML, amount=8, type=SOY]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=SEMI]; Paid: 8.0", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        java.lang.String str8 = recipe2.getName();
        boolean boolean9 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type13 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type13);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup18 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit19 = syrup18.getUnit();
        boolean boolean20 = milk16.equals((java.lang.Object) syrup18);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup18);
        java.lang.String str22 = syrup18.toString();
        java.lang.String str23 = syrup18.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + unit19 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit19.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str22, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str23, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
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
        cafe0.printPendingOrders();
        java.lang.String str47 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray48 = cafe0.getMenu();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Cafe" + "'", str47, "Cafe");
        org.junit.Assert.assertNotNull(recipeArray48);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 100.0");
        boolean boolean5 = coffee2.equals((java.lang.Object) cafe4);
        java.lang.String str6 = cafe4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str6, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 1, true);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=true]");
        boolean boolean5 = coffee2.equals((java.lang.Object) cafe4);
        java.lang.String str6 = cafe4.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=true]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=true]");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 10.0f, size10, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 100L, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=]", 0.0d, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=1, type=ALMOND]]", (double) (short) 0, size10, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (short) -1, size10, 52);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        java.lang.String str6 = cafe0.greeting();
        cafe0.printMenu();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        java.lang.String str41 = recipe7.getName();
        boolean boolean42 = recipe7.isReady();
        boolean boolean43 = recipe7.isReady();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str41, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=8, type=SEMI]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=100, type=WHOLE]");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=100, type=WHOLE]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=100, type=WHOLE]]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (short) 100, size8, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) 1, size8, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=52, type=ALMOND]]", 97.0d, size8, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        int int6 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe1.getMenu();
        java.lang.String str8 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
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
        java.lang.String str62 = order61.toString();
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
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Order: ; For: Welcome to Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0" + "'", str62, "Order: ; For: Welcome to Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        int int8 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        java.lang.String str15 = recipe11.getName();
        java.lang.String str16 = recipe11.getName();
        java.lang.String str17 = recipe11.getName();
        boolean boolean18 = cafe3.addRecipe(recipe11);
        int int19 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray20 = cafe3.getMenu();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(recipeArray20);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size8, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (short) 1, size8, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Water [unit=ML, amount=30]", (double) (-1), size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.String str20 = coffee19.toString();
        boolean boolean22 = coffee19.equals((java.lang.Object) "Coffee [unit=GR, amount=10, decaf=false]");
        java.lang.String str23 = coffee19.toString();
        // The following exception was thrown during execution in test generation
        try {
            recipe16.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str20, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str23, "Coffee [unit=GR, amount=100, decaf=true]");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean6 = water4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(1, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean20 = milk12.equals((java.lang.Object) recipe15);
        boolean boolean21 = recipe15.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe22 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe22.serveOrder();
        java.lang.String str24 = cafe22.greeting();
        java.lang.String str25 = cafe22.getName();
        uk.ac.sheffield.com1003.cafe.Order order26 = cafe22.serveOrder();
        boolean boolean27 = recipe15.equals((java.lang.Object) cafe22);
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0", (double) 32);
        order30.printReceipt();
        order30.printReceipt();
        boolean boolean33 = milk10.equals((java.lang.Object) order30);
        int int34 = milk10.getAmount();
        java.lang.String str35 = milk10.toString();
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(order23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Welcome to Cafe" + "'", str24, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Cafe" + "'", str25, "Cafe");
        org.junit.Assert.assertNull(order26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str35, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        cafe4.printPendingOrders();
        int int7 = cafe4.getIndexNextOrderToPlace();
        cafe4.printMenu();
        boolean boolean9 = water1.equals((java.lang.Object) cafe4);
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe4.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        java.time.LocalDateTime localDateTime11 = order10.getOrderServed();
        order10.serve();
        java.lang.Class<?> wildcardClass13 = order10.getClass();
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=100]", (double) (byte) 0, "Coffee [unit=GR, amount=52, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Welcome to Cafe", (double) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        uk.ac.sheffield.com1003.cafe.Cafe cafe13 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray14 = cafe13.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe13.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean22 = cafe13.addRecipe(recipe18);
        java.lang.String str23 = recipe18.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee26 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, false);
        java.lang.String str27 = coffee26.toString();
        boolean boolean28 = recipe18.equals((java.lang.Object) coffee26);
        java.lang.String str29 = coffee26.getName();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(recipeArray14);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=10, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee" + "'", str29, "Coffee");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
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
        order40.printReceipt();
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
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
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
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException69);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException75 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray76 = recipeNotFoundException75.getSuppressed();
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException75.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException78 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray79 = tooManyIngredientsException78.getSuppressed();
        java.lang.Throwable[] throwableArray80 = tooManyIngredientsException78.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException81 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray82 = recipeNotFoundException81.getSuppressed();
        tooManyIngredientsException78.addSuppressed((java.lang.Throwable) recipeNotFoundException81);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException84 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException78.addSuppressed((java.lang.Throwable) recipeNotFoundException84);
        recipeNotFoundException75.addSuppressed((java.lang.Throwable) tooManyIngredientsException78);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException87 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray88 = recipeNotFoundException87.getSuppressed();
        java.lang.Throwable[] throwableArray89 = recipeNotFoundException87.getSuppressed();
        java.lang.Throwable[] throwableArray90 = recipeNotFoundException87.getSuppressed();
        recipeNotFoundException75.addSuppressed((java.lang.Throwable) recipeNotFoundException87);
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException75);
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
        org.junit.Assert.assertNotNull(throwableArray76);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray79);
        org.junit.Assert.assertNotNull(throwableArray80);
        org.junit.Assert.assertNotNull(throwableArray82);
        org.junit.Assert.assertNotNull(throwableArray88);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray90);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        boolean boolean29 = milk10.equals((java.lang.Object) cafe28);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water34 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type35 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean36 = water34.equals((java.lang.Object) type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk37 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk39 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type35);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk40 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type35);
        boolean boolean41 = milk10.equals((java.lang.Object) type35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type35.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int14 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str19 = recipe18.getName();
        boolean boolean20 = recipe18.isReady();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean24 = recipe18.isReady();
        double double25 = recipe18.getPrice();
        java.lang.String str26 = recipe18.getName();
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "", (double) '#', "Welcome to Welcome to Cafe");
        boolean boolean31 = cafe0.addRecipe(recipe18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
        java.lang.String str2 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0" + "'", str2, "Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean12 = water10.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water14 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str15 = water14.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe18, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean23 = water14.equals((java.lang.Object) recipe18);
        boolean boolean24 = water10.equals((java.lang.Object) water14);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        boolean boolean31 = water10.equals((java.lang.Object) tooManyIngredientsException25);
        java.lang.Throwable[] throwableArray32 = tooManyIngredientsException25.getSuppressed();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException25.getSuppressed();
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) tooManyIngredientsException25);
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException5.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=52]" + "'", str15, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        int int3 = milk2.getAmount();
        java.lang.Object obj4 = null;
        boolean boolean5 = milk2.equals(obj4);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=8]", (double) 10.0f);
        java.lang.String str9 = recipe8.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe10 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean18 = cafe10.addRecipe(recipe13);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray19 = cafe10.getOrders();
        java.lang.String str20 = cafe10.greeting();
        cafe10.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe24 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean25 = cafe10.addRecipe(recipe24);
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe28.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        boolean boolean36 = recipe24.equals((java.lang.Object) recipe28);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee37 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean38 = coffee37.getDecaf();
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean47 = cafe39.addRecipe(recipe42);
        uk.ac.sheffield.com1003.cafe.Cafe cafe48 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe51 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order55 = new uk.ac.sheffield.com1003.cafe.Order(recipe51, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean56 = cafe48.addRecipe(recipe51);
        boolean boolean57 = cafe39.addRecipe(recipe51);
        int int58 = cafe39.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray59 = cafe39.getMenu();
        boolean boolean60 = coffee37.equals((java.lang.Object) cafe39);
        boolean boolean61 = recipe28.equals((java.lang.Object) cafe39);
        boolean boolean62 = recipe8.equals((java.lang.Object) boolean61);
        boolean boolean63 = milk2.equals((java.lang.Object) boolean61);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=8]" + "'", str9, "Water [unit=ML, amount=8]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(orderArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Cafe" + "'", str20, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(recipeArray59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
        java.lang.String str9 = recipe8.getName();
        boolean boolean10 = recipe8.isReady();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee23 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit24 = coffee23.getUnit();
        boolean boolean25 = recipe13.equals((java.lang.Object) unit24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        boolean boolean28 = recipe13.equals((java.lang.Object) recipeNotFoundException26);
        boolean boolean29 = recipe8.equals((java.lang.Object) boolean28);
        double double30 = recipe8.getPrice();
        java.lang.String str31 = recipe8.getName();
        boolean boolean32 = cafe1.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=SOY]", (double) 10.0f, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0");
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str5, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str31, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe1.serveOrder();
        java.lang.String str7 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Milk [unit=ML, amount=32, type=WHOLE]; For: Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        java.lang.String str14 = coffee12.toString();
        java.lang.String str15 = coffee12.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type17 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type17);
        boolean boolean19 = coffee12.equals((java.lang.Object) milk18);
        java.lang.String str20 = milk18.toString();
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk18);
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0", (double) 10L);
        boolean boolean25 = cafe1.addRecipe(recipe7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str20, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        java.lang.String str17 = milk6.toString();
        java.lang.String str18 = milk6.toString();
        java.lang.String str19 = milk6.getName();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str17, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str18, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk" + "'", str19, "Milk");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (short) 10, 8);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", 0.0d, size2, (int) (byte) 0);
        java.lang.Object obj5 = null;
        boolean boolean6 = recipe4.equals(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
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
        int int23 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup1.getUnit();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", (double) (byte) 1);
        boolean boolean3 = recipe2.isReady();
        boolean boolean5 = recipe2.equals((java.lang.Object) "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        int int4 = cafe1.getIndexNextOrderToPlace();
        java.lang.String str5 = cafe1.getName();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
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
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "", 1.0d, "Welcome to Water [unit=ML, amount=8]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean15 = recipe6.isReady();
        boolean boolean16 = syrup3.equals((java.lang.Object) recipe6);
        java.lang.String str17 = recipe6.getName();
        double double18 = recipe6.getPrice();
        boolean boolean19 = recipe6.isReady();
        boolean boolean20 = cafe1.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=-1, type=null]", (double) (short) 1);
        order23.serve();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) tooManyIngredientsException24);
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
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = recipeNotFoundException51.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException54 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray55 = tooManyIngredientsException54.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) tooManyIngredientsException54);
        recipeNotFoundException27.addSuppressed((java.lang.Throwable) tooManyIngredientsException54);
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException69 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray70 = recipeNotFoundException69.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException71 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray72 = tooManyIngredientsException71.getSuppressed();
        java.lang.Throwable[] throwableArray73 = tooManyIngredientsException71.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException74 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray75 = recipeNotFoundException74.getSuppressed();
        tooManyIngredientsException71.addSuppressed((java.lang.Throwable) recipeNotFoundException74);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException77 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException71.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        recipeNotFoundException69.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        tooManyIngredientsException54.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        boolean boolean82 = coffee12.equals((java.lang.Object) tooManyIngredientsException54);
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
        org.junit.Assert.assertNotNull(throwableArray22);
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
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        int int2 = syrup1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        java.lang.String str8 = coffee1.getName();
        boolean boolean9 = coffee1.getDecaf();
        java.lang.String str10 = coffee1.toString();
        boolean boolean11 = coffee1.getDecaf();
        java.lang.String str12 = coffee1.getName();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee" + "'", str8, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee" + "'", str12, "Coffee");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        java.lang.String str4 = cafe3.getName();
        cafe3.printMenu();
        cafe3.printPendingOrders();
        int int7 = cafe3.getIndexNextOrderToPlace();
        int int8 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=ALMOND]", (double) (byte) 100, "Water");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size21 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size21, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size21, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe27 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size21, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean37 = milk29.equals((java.lang.Object) recipe32);
        boolean boolean38 = recipe32.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order40 = cafe39.serveOrder();
        java.lang.String str41 = cafe39.greeting();
        java.lang.String str42 = cafe39.getName();
        uk.ac.sheffield.com1003.cafe.Order order43 = cafe39.serveOrder();
        boolean boolean44 = recipe32.equals((java.lang.Object) cafe39);
        boolean boolean45 = recipe27.equals((java.lang.Object) recipe32);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee47 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit48 = coffee47.getUnit();
        java.lang.String str49 = coffee47.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit50 = coffee47.getUnit();
        java.lang.String str51 = coffee47.toString();
        java.lang.Object obj52 = null;
        boolean boolean53 = coffee47.equals(obj52);
        recipe27.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee47);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee47);
        org.junit.Assert.assertTrue("'" + size21 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size21.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(order40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Welcome to Cafe" + "'", str41, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Cafe" + "'", str42, "Cafe");
        org.junit.Assert.assertNull(order43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + unit48 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit48.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str49, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit50 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit50.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str51, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size4, (int) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 'a', size4, 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee11 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int12 = coffee11.getAmount();
        java.lang.String str13 = coffee11.toString();
        boolean boolean15 = coffee11.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=SEMI]");
        java.lang.String str16 = coffee11.getName();
        int int17 = coffee11.getAmount();
        boolean boolean18 = recipe8.equals((java.lang.Object) coffee11);
        boolean boolean19 = coffee11.getDecaf();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee" + "'", str16, "Coffee");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee1.getUnit();
        java.lang.String str5 = coffee1.toString();
        java.lang.String str6 = coffee1.toString();
        java.lang.String str7 = coffee1.toString();
        boolean boolean8 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit9 = coffee1.getUnit();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + unit9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe32.printMenu();
        java.lang.String str34 = cafe32.greeting();
        java.lang.String str35 = cafe32.greeting();
        uk.ac.sheffield.com1003.cafe.Order order36 = cafe32.serveOrder();
        int int37 = cafe32.getIndexNextOrderToServe();
        java.lang.String str38 = cafe32.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray39 = cafe32.getOrders();
        boolean boolean40 = coffee1.equals((java.lang.Object) orderArray39);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(orderArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Cafe" + "'", str14, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str34, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str35, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str38, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(orderArray39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean14 = cafe6.addRecipe(recipe9);
        boolean boolean15 = coffee0.equals((java.lang.Object) cafe6);
        int int16 = cafe6.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]", "Syrup [unit=ML, amount=10, flavour=Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0]", (double) ' ');
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
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
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
        boolean boolean20 = coffee12.getDecaf();
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean27 = recipe23.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water29 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type30 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean31 = water29.equals((java.lang.Object) type30);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk32 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type30);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk32);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup35 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException36 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray37 = tooManyIngredientsException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = tooManyIngredientsException36.getSuppressed();
        boolean boolean39 = syrup35.equals((java.lang.Object) throwableArray38);
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup35);
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0", (double) 1.0f, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        boolean boolean45 = coffee12.equals((java.lang.Object) "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type30.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printPendingOrders();
        int int5 = cafe0.getIndexNextOrderToPlace();
        int int6 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        int int8 = cafe0.getIndexNextOrderToServe();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee56 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit57 = coffee56.getUnit();
        java.lang.String str58 = coffee56.toString();
        java.lang.String str59 = coffee56.toString();
        int int60 = coffee56.getAmount();
        int int61 = coffee56.getAmount();
        java.lang.String str62 = coffee56.toString();
        boolean boolean63 = coffee56.getDecaf();
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee56);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit65 = coffee56.getUnit();
        boolean boolean66 = coffee56.getDecaf();
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
        org.junit.Assert.assertTrue("'" + unit57 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit57.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str58, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str59, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str62, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + unit65 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit65.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray12 = cafe0.getMenu();
        java.lang.String str13 = cafe0.getName();
        int int14 = cafe0.getIndexNextOrderToServe();
        int int15 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=52]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(recipeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cafe" + "'", str13, "Cafe");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray47 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order48 = cafe0.serveOrder();
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
        org.junit.Assert.assertNotNull(recipeArray47);
        org.junit.Assert.assertNull(order48);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean26 = recipe17.isReady();
        boolean boolean27 = syrup14.equals((java.lang.Object) recipe17);
        java.lang.String str28 = recipe17.getName();
        double double29 = recipe17.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee31 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        recipe17.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee31);
        recipe12.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee31);
        int int34 = coffee31.getAmount();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str28, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
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
        java.lang.String str18 = order11.toString();
        java.lang.String str19 = order11.toString();
        java.lang.String str20 = order11.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str19, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str20, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        java.lang.String str5 = milk4.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException6.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException9 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray10 = tooManyIngredientsException9.getSuppressed();
        java.lang.Throwable[] throwableArray11 = tooManyIngredientsException9.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException12 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException12.getSuppressed();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException12);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException15 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException9.addSuppressed((java.lang.Throwable) recipeNotFoundException15);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException9);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException18 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = recipeNotFoundException18.getSuppressed();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException18.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException18);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException25 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException25.getSuppressed();
        java.lang.Throwable[] throwableArray27 = tooManyIngredientsException25.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException28.getSuppressed();
        tooManyIngredientsException25.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException32 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        tooManyIngredientsException32.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException38 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException32.addSuppressed((java.lang.Throwable) recipeNotFoundException38);
        java.lang.Throwable[] throwableArray40 = tooManyIngredientsException32.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) tooManyIngredientsException32);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup43 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str44 = syrup43.getFlavour();
        int int45 = syrup43.getAmount();
        java.lang.String str46 = syrup43.toString();
        java.lang.String str47 = syrup43.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException48 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean49 = syrup43.equals((java.lang.Object) tooManyIngredientsException48);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException50 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) tooManyIngredientsException50);
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
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) recipeNotFoundException52);
        java.lang.Throwable[] throwableArray65 = tooManyIngredientsException48.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException66 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray67 = recipeNotFoundException66.getSuppressed();
        java.lang.Throwable[] throwableArray68 = recipeNotFoundException66.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException69 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray70 = tooManyIngredientsException69.getSuppressed();
        java.lang.Throwable[] throwableArray71 = tooManyIngredientsException69.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException72.getSuppressed();
        tooManyIngredientsException69.addSuppressed((java.lang.Throwable) recipeNotFoundException72);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException75 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException69.addSuppressed((java.lang.Throwable) recipeNotFoundException75);
        recipeNotFoundException66.addSuppressed((java.lang.Throwable) tooManyIngredientsException69);
        java.lang.Throwable[] throwableArray78 = tooManyIngredientsException69.getSuppressed();
        tooManyIngredientsException48.addSuppressed((java.lang.Throwable) tooManyIngredientsException69);
        tooManyIngredientsException32.addSuppressed((java.lang.Throwable) tooManyIngredientsException69);
        recipeNotFoundException18.addSuppressed((java.lang.Throwable) tooManyIngredientsException69);
        boolean boolean82 = milk4.equals((java.lang.Object) recipeNotFoundException18);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str46, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray70);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
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
        int int24 = cafe15.getIndexNextOrderToServe();
        int int25 = cafe15.getIndexNextOrderToPlace();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=-1, decaf=false]", (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        boolean boolean17 = milk13.equals((java.lang.Object) milk16);
        uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=WHOLE]", (double) 0);
        boolean boolean21 = milk16.equals((java.lang.Object) "Milk [unit=ML, amount=1, type=WHOLE]");
        java.lang.String str22 = milk16.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str22, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = water1.getUnit();
        java.lang.String str14 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water [unit=ML, amount=52]" + "'", str10, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=10]" + "'", str14, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        int int5 = cafe1.getIndexNextOrderToServe();
        int int6 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0]");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
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
        uk.ac.sheffield.com1003.cafe.Order[] orderArray72 = cafe25.getOrders();
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
        org.junit.Assert.assertNotNull(orderArray72);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str7 = order6.toString();
        java.lang.String str8 = order6.toString();
        order6.printReceipt();
        java.lang.String str10 = order6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=ALMOND]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", 1.0d);
        java.lang.String str6 = order5.toString();
        order5.printReceipt();
        java.lang.String str8 = order5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Order: Milk [unit=ML, amount=1, type=ALMOND]; For: Cafe; Paid: 1.0" + "'", str6, "Order: Milk [unit=ML, amount=1, type=ALMOND]; For: Cafe; Paid: 1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Milk [unit=ML, amount=1, type=ALMOND]; For: Cafe; Paid: 1.0" + "'", str8, "Order: Milk [unit=ML, amount=1, type=ALMOND]; For: Cafe; Paid: 1.0");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        int int5 = cafe3.getIndexNextOrderToPlace();
        int int6 = cafe3.getIndexNextOrderToPlace();
        int int7 = cafe3.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe3.placeOrder("Coffee [unit=GR, amount=97, decaf=false]", "Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=52, type=ALMOND]]", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe15.removeRecipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str5 = cafe4.greeting();
        java.lang.String str6 = cafe4.greeting();
        java.lang.String str7 = cafe4.getName();
        java.lang.String str8 = cafe4.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (byte) -1);
        boolean boolean12 = cafe4.addRecipe(recipe11);
        double double13 = recipe11.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]; Paid: 52.0", 97.0d);
        boolean boolean17 = recipe11.isReady();
        boolean boolean18 = cafe1.addRecipe(recipe11);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Syrup [unit=ML, amount=10, flavour=Coffee]", (double) (short) 100, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Cafe" + "'", str7, "Cafe");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Cafe" + "'", str8, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str12 = milk10.toString();
        boolean boolean13 = coffee1.equals((java.lang.Object) str12);
        boolean boolean14 = coffee1.getDecaf();
        boolean boolean15 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException16 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException18 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray19 = tooManyIngredientsException18.getSuppressed();
        java.lang.Throwable[] throwableArray20 = tooManyIngredientsException18.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException21);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException18.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException16.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException28 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray29 = tooManyIngredientsException28.getSuppressed();
        java.lang.Throwable[] throwableArray30 = tooManyIngredientsException28.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException31 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException31.getSuppressed();
        tooManyIngredientsException28.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException16.addSuppressed((java.lang.Throwable) tooManyIngredientsException28);
        boolean boolean35 = coffee1.equals((java.lang.Object) tooManyIngredientsException28);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup37 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe40 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order44 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe40, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean49 = recipe40.isReady();
        boolean boolean50 = syrup37.equals((java.lang.Object) recipe40);
        double double51 = recipe40.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee54 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean55 = coffee54.getDecaf();
        java.lang.String str56 = coffee54.getName();
        recipe40.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee54);
        int int58 = coffee54.getAmount();
        java.lang.String str59 = coffee54.getName();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        boolean boolean61 = coffee54.equals((java.lang.Object) recipeNotFoundException60);
        tooManyIngredientsException28.addSuppressed((java.lang.Throwable) recipeNotFoundException60);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Coffee" + "'", str56, "Coffee");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Coffee" + "'", str59, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        java.lang.String str5 = cafe0.greeting();
        java.lang.String str6 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size11, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) (short) 100, size11, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), true);
        recipe15.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee18);
        boolean boolean20 = cafe0.addRecipe(recipe15);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=100, type=null]", (double) 0);
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe40 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe43 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe43, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean48 = cafe40.addRecipe(recipe43);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray49 = cafe40.getOrders();
        java.lang.String str50 = cafe40.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe51 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe54 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order58 = new uk.ac.sheffield.com1003.cafe.Order(recipe54, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean59 = cafe51.addRecipe(recipe54);
        boolean boolean60 = cafe40.addRecipe(recipe54);
        boolean boolean61 = cafe39.addRecipe(recipe54);
        uk.ac.sheffield.com1003.cafe.Order order64 = new uk.ac.sheffield.com1003.cafe.Order(recipe54, "", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order68 = new uk.ac.sheffield.com1003.cafe.Order(recipe54, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 32.0d, "Welcome to Coffee");
        boolean boolean69 = coffee2.equals((java.lang.Object) "Welcome to Coffee");
        uk.ac.sheffield.com1003.cafe.Cafe cafe70 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe73 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order77 = new uk.ac.sheffield.com1003.cafe.Order(recipe73, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean78 = cafe70.addRecipe(recipe73);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray79 = cafe70.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray80 = cafe70.getMenu();
        int int81 = cafe70.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order82 = cafe70.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray83 = cafe70.getOrders();
        int int84 = cafe70.getIndexNextOrderToServe();
        cafe70.printPendingOrders();
        java.lang.String str86 = cafe70.getName();
        boolean boolean87 = coffee2.equals((java.lang.Object) str86);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(orderArray49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Welcome to Cafe" + "'", str50, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(orderArray79);
        org.junit.Assert.assertNotNull(recipeArray80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNull(order82);
        org.junit.Assert.assertNotNull(orderArray83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Cafe" + "'", str86, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type6);
        boolean boolean8 = coffee1.equals((java.lang.Object) milk7);
        java.lang.String str9 = milk7.toString();
        java.lang.String str10 = milk7.toString();
        java.lang.String str11 = milk7.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water13 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str14 = water13.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean22 = water13.equals((java.lang.Object) recipe17);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean35 = milk27.equals((java.lang.Object) recipe30);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type37 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk38 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type37);
        java.lang.String str39 = milk38.toString();
        int int40 = milk38.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit41 = milk38.getUnit();
        recipe30.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk38);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water43 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str44 = water43.toString();
        java.lang.String str45 = water43.toString();
        java.lang.String str46 = water43.toString();
        boolean boolean47 = milk38.equals((java.lang.Object) water43);
        recipe17.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water43);
        uk.ac.sheffield.com1003.cafe.Order order52 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Welcome to Cafe", 100.0d, "Order: ; For: ; Paid: 100.0");
        uk.ac.sheffield.com1003.cafe.Order order56 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=32, type=WHOLE]", (double) ' ', "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        boolean boolean57 = milk7.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str9, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str10, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=-1, type=null]" + "'", str11, "Milk [unit=ML, amount=-1, type=null]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=52]" + "'", str14, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + type37 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type37.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str39, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + unit41 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit41.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Water [unit=ML, amount=30]" + "'", str44, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Water [unit=ML, amount=30]" + "'", str45, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Water [unit=ML, amount=30]" + "'", str46, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = coffee1.equals((java.lang.Object) str13);
        java.lang.String str15 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = coffee1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe17 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray18 = cafe17.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order19 = cafe17.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe22, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean26 = cafe17.addRecipe(recipe22);
        int int27 = cafe17.getIndexNextOrderToPlace();
        boolean boolean28 = coffee1.equals((java.lang.Object) cafe17);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit29 = coffee1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertNotNull(recipeArray18);
        org.junit.Assert.assertNull(order19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + unit29 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit29.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = milk6.getUnit();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=0, type=WHOLE]", (double) ' ', size8, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to Coffee [unit=GR, amount=1, decaf=false]; Paid: 0.0", (double) 30, size8, 97);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe3.getOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe3.getMenu();
        boolean boolean9 = water1.equals((java.lang.Object) recipeArray8);
        int int10 = water1.getAmount();
        java.lang.Object obj11 = null;
        boolean boolean12 = water1.equals(obj11);
        java.lang.String str13 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit16 = coffee15.getUnit();
        java.lang.String str17 = coffee15.toString();
        java.lang.String str18 = coffee15.toString();
        int int19 = coffee15.getAmount();
        boolean boolean21 = coffee15.equals((java.lang.Object) 0.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = coffee15.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit23 = coffee15.getUnit();
        boolean boolean24 = water1.equals((java.lang.Object) unit23);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(orderArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str7, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=0]" + "'", str13, "Water [unit=ML, amount=0]");
        org.junit.Assert.assertTrue("'" + unit16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + unit23 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit23.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=100]", (double) 8);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        java.lang.String str5 = milk2.toString();
        java.lang.String str6 = milk2.toString();
        java.lang.String str7 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str7, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe3.getOrders();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=-1]" + "'", str5, "Welcome to Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Water [unit=ML, amount=-1]" + "'", str6, "Welcome to Water [unit=ML, amount=-1]");
        org.junit.Assert.assertNotNull(orderArray7);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
        cafe1.printPendingOrders();
        int int3 = cafe1.getIndexNextOrderToServe();
        int int4 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=null]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        boolean boolean3 = coffee2.getDecaf();
        int int4 = coffee2.getAmount();
        java.lang.Class<?> wildcardClass5 = coffee2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException6.getSuppressed();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException6.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException3.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException11 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray12 = tooManyIngredientsException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = tooManyIngredientsException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee21 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', true);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup23 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str24 = syrup23.getFlavour();
        int int25 = syrup23.getAmount();
        java.lang.String str26 = syrup23.toString();
        java.lang.String str27 = syrup23.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException28 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean29 = syrup23.equals((java.lang.Object) tooManyIngredientsException28);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException30 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException28.addSuppressed((java.lang.Throwable) tooManyIngredientsException30);
        boolean boolean32 = coffee21.equals((java.lang.Object) tooManyIngredientsException28);
        tooManyIngredientsException11.addSuppressed((java.lang.Throwable) tooManyIngredientsException28);
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) tooManyIngredientsException28);
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException3.getSuppressed();
        boolean boolean36 = recipe2.equals((java.lang.Object) throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str26, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe49 = null;
        boolean boolean50 = cafe4.addRecipe(recipe49);
        cafe4.printMenu();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
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
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0; Paid: 1.0", (double) 100.0f, "Coffee [unit=GR, amount=32, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Welcome to Coffee [unit=GR, amount=1, decaf=false]; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Welcome to ; Paid: 10.0; Paid: 32.0");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        java.lang.String str4 = coffee1.toString();
        int int5 = coffee1.getAmount();
        int int6 = coffee1.getAmount();
        java.lang.String str7 = coffee1.getName();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee" + "'", str7, "Coffee");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        cafe0.printPendingOrders();
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", (int) (short) 1, (int) ' ');
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit8 = coffee7.getUnit();
        java.lang.String str9 = coffee7.toString();
        java.lang.String str10 = coffee7.toString();
        int int11 = coffee7.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = milk13.getUnit();
        boolean boolean15 = coffee7.equals((java.lang.Object) unit14);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        boolean boolean17 = coffee7.equals((java.lang.Object) size16);
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=WHOLE]", (double) 1, size16, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", (double) 100.0f, size16, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=ALMOND]", (double) 10, size16, 8);
        java.lang.String str24 = recipe23.getName();
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str24, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe4.serveOrder();
        java.lang.String str6 = cafe4.greeting();
        boolean boolean7 = water0.equals((java.lang.Object) str6);
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.getName();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=10, decaf=true]", (int) (short) 1, 32);
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean19 = cafe11.addRecipe(recipe14);
        boolean boolean21 = recipe14.equals((java.lang.Object) 10L);
        boolean boolean22 = cafe7.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        java.lang.String str26 = recipe14.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size33 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe35 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size33, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe37 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size33, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe39 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size33, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk41 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe44 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order48 = new uk.ac.sheffield.com1003.cafe.Order(recipe44, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean49 = milk41.equals((java.lang.Object) recipe44);
        boolean boolean50 = recipe44.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe51 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order52 = cafe51.serveOrder();
        java.lang.String str53 = cafe51.greeting();
        java.lang.String str54 = cafe51.getName();
        uk.ac.sheffield.com1003.cafe.Order order55 = cafe51.serveOrder();
        boolean boolean56 = recipe44.equals((java.lang.Object) cafe51);
        boolean boolean57 = recipe39.equals((java.lang.Object) recipe44);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee59 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit60 = coffee59.getUnit();
        java.lang.String str61 = coffee59.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit62 = coffee59.getUnit();
        java.lang.String str63 = coffee59.toString();
        java.lang.Object obj64 = null;
        boolean boolean65 = coffee59.equals(obj64);
        recipe39.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee59);
        boolean boolean67 = coffee59.getDecaf();
        recipe14.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee59);
        boolean boolean69 = cafe3.addRecipe(recipe14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + size33 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size33.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(order52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Welcome to Cafe" + "'", str53, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Cafe" + "'", str54, "Cafe");
        org.junit.Assert.assertNull(order55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + unit60 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit60.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str61, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit62 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit62.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str63, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=1, decaf=false]", (double) (-1.0f));
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str5 = water4.toString();
        java.lang.String str6 = water4.toString();
        java.lang.String str7 = water4.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type11);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
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
        boolean boolean46 = milk13.equals((java.lang.Object) cafe32);
        int int47 = cafe32.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) 100);
        boolean boolean15 = cafe0.addRecipe(recipe14);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type18 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk19 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type18);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type18);
        java.lang.String str21 = milk20.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee23 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit24 = coffee23.getUnit();
        java.lang.String str25 = coffee23.toString();
        java.lang.String str26 = coffee23.toString();
        int int27 = coffee23.getAmount();
        boolean boolean29 = coffee23.equals((java.lang.Object) 0.0d);
        boolean boolean30 = milk20.equals((java.lang.Object) coffee23);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit31 = coffee23.getUnit();
        boolean boolean32 = recipe14.equals((java.lang.Object) coffee23);
        java.lang.String str33 = coffee23.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit34 = coffee23.getUnit();
        java.lang.String str35 = coffee23.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe38 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str39 = recipe38.getName();
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe38, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 100, "");
        order43.printReceipt();
        order43.printReceipt();
        boolean boolean46 = coffee23.equals((java.lang.Object) order43);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit24 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit24.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + unit31 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit31.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Coffee" + "'", str33, "Coffee");
        org.junit.Assert.assertTrue("'" + unit34 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit34.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str35, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }
}

