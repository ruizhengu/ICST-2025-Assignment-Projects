package uk.ac.sheffield.com1003.cafe.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("hi!", (double) 0, size2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "hi!", (double) (byte) -1, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = order4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.Class<?> wildcardClass4 = cafe1.getClass();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        uk.ac.sheffield.com1003.cafe.App app0 = new uk.ac.sheffield.com1003.cafe.App();
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.String str1 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.String str1 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        java.lang.Class<?> wildcardClass10 = order9.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Coffee [unit=GR, amount=8, decaf=false]", "", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        java.lang.String str4 = recipeNotFoundException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        java.lang.String str9 = order8.toString();
        java.lang.Class<?> wildcardClass10 = order8.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str9, "Order: ; For: Welcome to Cafe; Paid: 10.0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=0, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.String str1 = recipeNotFoundException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        order12.serve();
        order12.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        boolean boolean5 = milk1.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.Class<?> wildcardClass3 = coffee2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        java.lang.String str6 = milk1.toString();
        java.lang.Object obj7 = null;
        boolean boolean8 = milk1.equals(obj7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.String str7 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        java.lang.String str4 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        java.lang.String str2 = water0.toString();
        java.lang.String str3 = water0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("hi!", "Milk [unit=ML, amount=-1, type=WHOLE]", (double) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        java.lang.String str9 = order8.toString();
        order8.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Welcome to Cafe; Paid: 10.0" + "'", str9, "Order: ; For: Welcome to Cafe; Paid: 10.0");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Welcome to Cafe; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        java.lang.Class<?> wildcardClass5 = size2.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
        java.lang.String str10 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        java.lang.Class<?> wildcardClass4 = recipeNotFoundException1.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.Class<?> wildcardClass15 = order14.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = coffee1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type3);
        java.lang.String str6 = milk5.toString();
        java.lang.Class<?> wildcardClass7 = milk5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str6, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size2, 0);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=100, type=WHOLE]", (double) 'a', "Order: ; For: ; Paid: 10.0");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str11 = milk10.toString();
        java.lang.String str12 = milk10.toString();
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str11, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("", "Water", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", "Welcome to Cafe", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=0, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) 10, 100);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        double double7 = recipe6.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size13, 0);
        boolean boolean16 = recipe6.equals((java.lang.Object) size13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Welcome to Cafe; Paid: 10.0", (double) (short) 1, size13, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = milk1.getUnit();
        java.lang.String str3 = milk1.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=30, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=30, type=WHOLE]");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to ", 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("Water [unit=ML, amount=30]", "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        int int2 = milk1.getAmount();
        java.lang.Class<?> wildcardClass3 = milk1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        java.lang.String str14 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Class<?> wildcardClass1 = tooManyIngredientsException0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size4, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Plain]", (double) '#', size4, 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str10 = coffee9.toString();
        java.lang.String str11 = coffee9.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit12 = coffee9.getUnit();
        java.lang.String str13 = coffee9.toString();
        // The following exception was thrown during execution in test generation
        try {
            recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("", "Water [unit=ML, amount=0]", 1.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(8);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean6 = coffee2.equals((java.lang.Object) cafe5);
        // The following exception was thrown during execution in test generation
        try {
            cafe5.removeRecipe("Order: ; For: hi!; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=10, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = milk3.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (-1.0f), "Welcome to ");
        java.lang.Class<?> wildcardClass9 = order8.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.String str21 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Order: ; For: Water; Paid: 1.0", "", (double) 30);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        boolean boolean8 = water0.equals((java.lang.Object) (byte) -1);
        java.lang.String str9 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup11 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str12 = syrup11.toString();
        java.lang.String str13 = syrup11.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit14 = syrup11.getUnit();
        boolean boolean15 = water0.equals((java.lang.Object) syrup11);
        java.lang.String str16 = syrup11.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str12, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean3 = milk1.equals((java.lang.Object) type2);
        java.lang.Class<?> wildcardClass4 = milk1.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!", (int) (short) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Water [unit=ML, amount=0]", "Welcome to Cafe", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cafe1.placeOrder("Water [unit=ML, amount=0]", "Milk", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cafe" + "'", str15, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.String str2 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str2, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean3 = milk1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe4.printPendingOrders();
        java.lang.String str6 = cafe4.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        java.lang.String str12 = recipe11.getName();
        boolean boolean13 = cafe4.addRecipe(recipe11);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size16, (int) '4');
        boolean boolean19 = cafe4.addRecipe(recipe18);
        cafe4.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size23 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe25 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size23, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str30 = coffee29.toString();
        boolean boolean31 = recipe25.equals((java.lang.Object) str30);
        java.lang.String str32 = recipe25.getName();
        boolean boolean33 = cafe4.addRecipe(recipe25);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe25, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) '#', "Milk [unit=ML, amount=1, type=WHOLE]");
        boolean boolean38 = milk1.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + size23 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size23.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str30, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        java.lang.String str12 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
        java.lang.String str14 = recipeNotFoundException10.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]", (double) (byte) 10, "Coffee [unit=GR, amount=0, decaf=false]");
        java.lang.String str20 = order19.toString();
        java.lang.String str21 = order19.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str20, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0" + "'", str21, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Order: ; For: Welcome to Cafe; Paid: 10.0", "Water", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException3.getSuppressed();
        boolean boolean7 = water0.equals((java.lang.Object) recipeNotFoundException3);
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        java.lang.String str10 = water0.getName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        order13.serve();
        java.lang.Class<?> wildcardClass15 = order13.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Plain]", (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=30, type=WHOLE]", 8, 0);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = recipe7.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.lang.String str21 = recipeNotFoundException16.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException3.getSuppressed();
        boolean boolean7 = water0.equals((java.lang.Object) recipeNotFoundException3);
        java.lang.String str8 = recipeNotFoundException3.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Milk [unit=ML, amount=0, type=SKIMMED]", "Welcome to ", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cafe0.placeOrder("Welcome to Cafe", "Milk [unit=ML, amount=1, type=WHOLE]", (double) 30);
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
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException2.getSuppressed();
        java.lang.Class<?> wildcardClass8 = throwableArray7.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=0, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        boolean boolean13 = milk9.equals((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=10, type=SKIMMED]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.String str10 = recipeNotFoundException3.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        boolean boolean11 = cafe0.addRecipe(recipe8);
        double double12 = recipe8.getPrice();
        java.lang.Class<?> wildcardClass13 = recipe8.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=10, type=WHOLE]");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.String str2 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to ");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to ]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Welcome to ]");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str3 = water2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean6 = water2.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water2.getUnit();
        java.lang.Class<?> wildcardClass8 = unit7.getClass();
        boolean boolean9 = milk1.equals((java.lang.Object) wildcardClass8);
        java.lang.Class<?> wildcardClass10 = milk1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size10, 1);
        boolean boolean13 = cafe3.addRecipe(recipe12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cafe3.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", "", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.String str7 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: hi!; Paid: 0.0", (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        boolean boolean8 = water0.equals((java.lang.Object) cafe7);
        java.lang.String str9 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("Order: ; For: hi!; Paid: 0.0", "Milk", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe0.placeOrder("Milk [unit=ML, amount=10, type=WHOLE]", "Water [unit=ML, amount=100]", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = milk2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        int int6 = milk5.getAmount();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException1.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException1.getSuppressed();
        java.lang.String str6 = recipeNotFoundException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException2.getSuppressed();
        java.lang.String str8 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        java.lang.String str18 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str18, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!", (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        cafe1.printMenu();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.String str27 = recipeNotFoundException16.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str27, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe0.placeOrder("Milk [unit=ML, amount=1, type=WHOLE]", "", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Welcome to Cafe");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe0.placeOrder("Milk [unit=ML, amount=-1, type=SKIMMED]", "Water [unit=ML, amount=30]", (double) '4');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        java.lang.String str11 = water10.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean14 = water10.equals((java.lang.Object) 30);
        java.lang.String str15 = water10.toString();
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
        boolean boolean30 = water10.equals((java.lang.Object) recipeNotFoundException26);
        cafeOutOfCapacityException7.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        java.lang.String str32 = cafeOutOfCapacityException7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=30]" + "'", str15, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str32, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("", "Welcome to ", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe12.removeRecipe("Milk [unit=ML, amount=10, type=SKIMMED]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str16, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str17, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 100, false);
        int int3 = coffee2.getAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order32 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double33 = recipe29.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe29, "Syrup", 0.0d, "Order: ; For: ; Paid: 10.0");
        boolean boolean38 = water13.equals((java.lang.Object) "Order: ; For: ; Paid: 10.0");
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=30]" + "'", str14, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water" + "'", str22, "Water");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        boolean boolean13 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        boolean boolean16 = recipe4.equals((java.lang.Object) 100);
        java.lang.String str17 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        boolean boolean11 = water3.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str15 = syrup14.toString();
        java.lang.String str16 = syrup14.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = syrup14.getUnit();
        boolean boolean18 = water3.equals((java.lang.Object) syrup14);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water3);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee22 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, false);
        boolean boolean23 = water3.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) -1, size2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type1);
        java.lang.Class<?> wildcardClass3 = milk2.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        java.lang.String str7 = cafe3.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", "Syrup [unit=ML, amount=10, flavour=Water]", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk4);
        java.lang.String str6 = milk4.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        java.lang.String str2 = milk1.toString();
        int int3 = milk1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cafe0.placeOrder("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", (double) (-1L));
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        java.lang.String str5 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=10, type=SKIMMED]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10, true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to ]", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.lang.String str15 = cafe9.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = cafe9.placeOrder("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", "Milk [unit=ML, amount=0, type=SKIMMED]", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        boolean boolean11 = water3.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str15 = syrup14.toString();
        java.lang.String str16 = syrup14.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = syrup14.getUnit();
        boolean boolean18 = water3.equals((java.lang.Object) syrup14);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water3);
        java.lang.String str20 = water3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
        java.lang.String str14 = recipeNotFoundException7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size2, 0);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", (double) 1.0f, "Coffee [unit=GR, amount=0, decaf=false]");
        order8.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException18 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray19 = cafeOutOfCapacityException18.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException18);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.String str23 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str23, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
        cafe0.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(order18);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a', false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Welcome to Cafe; Paid: 10.0");
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
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size56 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe58 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size56, (int) (short) 10);
        boolean boolean60 = recipe58.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order63 = new uk.ac.sheffield.com1003.cafe.Order(recipe58, "hi!", (double) 0L);
        boolean boolean64 = recipe9.equals((java.lang.Object) "hi!");
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
        org.junit.Assert.assertTrue("'" + size56 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size56.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        java.lang.String str21 = recipeNotFoundException13.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        boolean boolean8 = water0.equals((java.lang.Object) (byte) -1);
        java.lang.String str9 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str5 = coffee4.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean7 = coffee4.equals((java.lang.Object) type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.getName();
        java.lang.String str4 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size9, (int) '4');
        boolean boolean13 = recipe11.equals((java.lang.Object) 10.0d);
        boolean boolean14 = milk6.equals((java.lang.Object) recipe11);
        boolean boolean15 = milk1.equals((java.lang.Object) boolean14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=1, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cafe9.placeOrder("Order: ; For: ; Paid: 10.0", "Welcome to ", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str7, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (byte) 100);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Coffee [unit=GR, amount=0, decaf=false]" + "'", str4, "Welcome to Coffee [unit=GR, amount=0, decaf=false]");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        int int2 = coffee0.getAmount();
        java.lang.String str3 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        double double9 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str18 = water17.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water17);
        boolean boolean20 = coffee0.equals((java.lang.Object) water17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        cafe1.printMenu();
        cafe1.printPendingOrders();
        java.lang.String str8 = cafe1.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=30, type=WHOLE]", (double) (short) 10, size2, (int) '#');
        java.lang.Class<?> wildcardClass5 = recipe4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        boolean boolean16 = recipe14.isReady();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException0.getSuppressed();
        java.lang.String str10 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=10, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 0, 100);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=SKIMMED]");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean8 = cafe4.addRecipe(recipe7);
        boolean boolean9 = syrup1.equals((java.lang.Object) recipe7);
        java.lang.Class<?> wildcardClass10 = syrup1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean6 = coffee2.equals((java.lang.Object) cafe5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe5.placeOrder("Syrup", "Water [unit=ML, amount=0]", (double) 10L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0", (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        double double11 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean16 = cafe3.addRecipe(recipe8);
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 1.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]", 8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: hi!; Paid: 0.0", 0.0d);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk", (double) (byte) 0);
        boolean boolean18 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        uk.ac.sheffield.com1003.cafe.Recipe.Size size30 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size30, 0);
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Milk [unit=ML, amount=100, type=WHOLE]", (double) 'a', "Order: ; For: ; Paid: 10.0");
        boolean boolean37 = coffee16.equals((java.lang.Object) recipe32);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk39 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        // The following exception was thrown during execution in test generation
        try {
            recipe32.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk39);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + size30 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size30.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = cafe1.placeOrder("Coffee [unit=GR, amount=30, decaf=false]", "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) (byte) 1);
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
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup1.getUnit();
        java.lang.String str5 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup1.getUnit();
        int int7 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        boolean boolean12 = recipe10.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean21 = recipe10.equals((java.lang.Object) 10);
        boolean boolean22 = cafe0.addRecipe(recipe10);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=100, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException1);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException7 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException7.getSuppressed();
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException7);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        recipeNotFoundException13.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException18 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray19 = cafeOutOfCapacityException18.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException18);
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException0.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.String str30 = milk1.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str30, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        java.lang.String str5 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double12 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean17 = coffee15.equals((java.lang.Object) 10L);
        boolean boolean19 = coffee15.equals((java.lang.Object) (-1.0f));
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee15);
        double double21 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Water [unit=ML, amount=0]", (double) (byte) 100, "Coffee [unit=GR, amount=0, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk27 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj28 = null;
        boolean boolean29 = milk27.equals(obj28);
        java.lang.String str30 = milk27.toString();
        java.lang.String str31 = milk27.getName();
        int int32 = milk27.getAmount();
        boolean boolean34 = milk27.equals((java.lang.Object) "Water [unit=ML, amount=100]");
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk27);
        java.lang.String str36 = milk27.toString();
        boolean boolean37 = recipe2.equals((java.lang.Object) milk27);
        java.lang.String str38 = milk27.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str30, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Milk" + "'", str31, "Milk");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str36, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str38, "Milk [unit=ML, amount=10, type=WHOLE]");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean12 = water0.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee14 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1));
        boolean boolean15 = water0.equals((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        boolean boolean12 = recipe10.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean21 = recipe10.equals((java.lang.Object) 10);
        boolean boolean22 = cafe0.addRecipe(recipe10);
        java.lang.String str23 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order24 = cafe0.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertNull(order24);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) (short) 1, (int) (short) 100);
        cafe3.printPendingOrders();
        java.lang.String str5 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Water; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", "Coffee [unit=GR, amount=0, decaf=false]", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        java.lang.Class<?> wildcardClass5 = cafe0.getClass();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException8 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray9 = cafeOutOfCapacityException8.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str16 = water15.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean19 = water15.equals((java.lang.Object) 30);
        java.lang.String str20 = water15.toString();
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
        boolean boolean35 = water15.equals((java.lang.Object) recipeNotFoundException31);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        java.lang.String str38 = recipeNotFoundException31.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water" + "'", str16, "Water");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str38, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) -1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        java.lang.String str7 = order6.toString();
        order6.printReceipt();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0" + "'", str7, "Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.getName();
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = milk3.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size10, (int) '4');
        boolean boolean14 = recipe12.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Welcome to Cafe", 0.0d);
        order17.printReceipt();
        boolean boolean19 = milk7.equals((java.lang.Object) order17);
        java.lang.String str20 = order17.toString();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str20, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) 10.0f);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str13 = order12.toString();
        java.lang.String str14 = order12.toString();
        order12.serve();
        order12.printReceipt();
        java.lang.String str17 = order12.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str13, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str14, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str17, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        java.lang.String str14 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Water]");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Welcome to Cafe; Paid: 10.0", 8, 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 1L, size2, (int) 'a');
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size8, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size8, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: -1.0", 1.0d, size8, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=0]", (double) '#', size8, (int) (short) 0);
        java.lang.String str17 = recipe16.getName();
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=0]" + "'", str17, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) (byte) 10, "Water [unit=ML, amount=30]");
        boolean boolean9 = recipe4.isReady();
        boolean boolean10 = recipe4.isReady();
        java.lang.Class<?> wildcardClass11 = recipe4.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = coffee0.getUnit();
        java.lang.String str4 = coffee0.toString();
        java.lang.String str5 = coffee0.toString();
        int int6 = coffee0.getAmount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int22 = water21.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException24.getSuppressed();
        boolean boolean28 = water21.equals((java.lang.Object) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        int int28 = coffee16.getAmount();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str20 = syrup19.toString();
        boolean boolean21 = milk16.equals((java.lang.Object) str20);
        boolean boolean23 = milk16.equals((java.lang.Object) (-1));
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        java.lang.String str25 = milk16.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit26 = milk16.getUnit();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str25, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        java.lang.String str22 = recipeNotFoundException11.toString();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str22, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Welcome to Cafe; Paid: 10.0", (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.lang.String str40 = cafeOutOfCapacityException34.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str40, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
        java.lang.Class<?> wildcardClass21 = recipeNotFoundException6.getClass();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.Class<?> wildcardClass14 = recipeNotFoundException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) (byte) 100, (int) '4');
        cafe3.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=-1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException2);
        java.lang.Class<?> wildcardClass6 = recipeNotFoundException2.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=-1, type=WHOLE]]", (double) (-1));
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        java.lang.String str2 = cafe1.greeting();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Milk" + "'", str2, "Welcome to Milk");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee", (double) 1L, size6, 1);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 1.0f, size6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=-1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.String str30 = coffee1.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str12, "Coffee [unit=GR, amount=30, decaf=false]");
        org.junit.Assert.assertTrue("'" + size15 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size15.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coffee" + "'", str30, "Coffee");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        boolean boolean11 = water3.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str15 = syrup14.toString();
        java.lang.String str16 = syrup14.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = syrup14.getUnit();
        boolean boolean18 = water3.equals((java.lang.Object) syrup14);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water3);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str26 = coffee25.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type27 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean28 = coffee25.equals((java.lang.Object) type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk31 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type27);
        boolean boolean32 = water21.equals((java.lang.Object) type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str35 = milk34.toString();
        java.lang.String str36 = milk34.getName();
        boolean boolean37 = water21.equals((java.lang.Object) milk34);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        uk.ac.sheffield.com1003.cafe.Cafe cafe39 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe39.printPendingOrders();
        java.lang.String str41 = cafe39.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray42 = cafe39.getMenu();
        boolean boolean43 = milk34.equals((java.lang.Object) recipeArray42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str35, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk" + "'", str36, "Milk");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Welcome to Cafe" + "'", str41, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException3.getSuppressed();
        boolean boolean7 = water0.equals((java.lang.Object) recipeNotFoundException3);
        java.lang.String str8 = water0.toString();
        java.lang.String str9 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = water0.getUnit();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=30]" + "'", str9, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        boolean boolean11 = cafe0.addRecipe(recipe8);
        double double12 = recipe8.getPrice();
        java.lang.String str13 = recipe8.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass31 = recipeNotFoundException19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Welcome to Cafe" + "'", str2, "Welcome to Welcome to Cafe");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=100, type=null]");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size4, 0);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=10, type=SKIMMED]", (double) 'a', size4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]", (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
            boolean boolean19 = cafe1.placeOrder("Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", "", (double) (byte) 100);
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=32, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        int int31 = water13.getAmount();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 30 + "'", int31 == 30);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        order17.serve();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean6 = coffee2.equals((java.lang.Object) cafe5);
        // The following exception was thrown during execution in test generation
        try {
            cafe5.removeRecipe("Milk [unit=ML, amount=32, type=ALMOND]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 10, true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.Class<?> wildcardClass1 = cafe0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean6 = coffee2.equals((java.lang.Object) cafe5);
        cafe5.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe5.removeRecipe("Coffee [unit=GR, amount=-1, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size4, 0);
        boolean boolean7 = water1.equals((java.lang.Object) "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean9 = water1.equals((java.lang.Object) '#');
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=30, type=WHOLE]", (double) (short) 10, size2, (int) '#');
        boolean boolean5 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        boolean boolean11 = water3.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str15 = syrup14.toString();
        java.lang.String str16 = syrup14.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = syrup14.getUnit();
        boolean boolean18 = water3.equals((java.lang.Object) syrup14);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water3);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee25 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str26 = coffee25.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type27 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean28 = coffee25.equals((java.lang.Object) type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk29 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk30 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk31 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type27);
        boolean boolean32 = water21.equals((java.lang.Object) type27);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk34 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str35 = milk34.toString();
        java.lang.String str36 = milk34.getName();
        boolean boolean37 = water21.equals((java.lang.Object) milk34);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk34);
        java.lang.String str39 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type27.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str35, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk" + "'", str36, "Milk");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str39, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#');
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
        java.lang.String str33 = recipeNotFoundException18.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str33, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException13.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=ALMOND]", (double) (-1), size6, 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", 1.0d, size6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0", (double) 100.0f, size6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Coffee [unit=GR, amount=100, decaf=true]", "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Welcome to hi!" + "'", str3, "Welcome to Welcome to hi!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.String str19 = milk5.toString();
        java.lang.String str20 = milk5.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str19, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str20, "Milk [unit=ML, amount=10, type=SKIMMED]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe11.printPendingOrders();
        java.lang.String str13 = cafe11.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size16, (int) (short) 10);
        java.lang.String str19 = recipe18.getName();
        boolean boolean20 = cafe11.addRecipe(recipe18);
        boolean boolean21 = recipe4.equals((java.lang.Object) boolean20);
        boolean boolean22 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.lang.String str21 = recipeNotFoundException6.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
        java.lang.Object obj33 = null;
        boolean boolean34 = recipe10.equals(obj33);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException11 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        cafeOutOfCapacityException7.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException11);
        java.lang.String str13 = cafeOutOfCapacityException11.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str13, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        java.lang.String str3 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Coffee [unit=GR, amount=8, decaf=false]", "Milk [unit=ML, amount=32, type=WHOLE]", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) ' ', size6, 30);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) 10L, size6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        boolean boolean13 = water1.equals((java.lang.Object) order12);
        java.lang.String str14 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=100]" + "'", str2, "Water [unit=ML, amount=100]");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=100]" + "'", str14, "Water [unit=ML, amount=100]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0", "", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        boolean boolean4 = water0.equals((java.lang.Object) "Milk");
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]");
        boolean boolean7 = water0.equals((java.lang.Object) cafe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water9 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        boolean boolean10 = water0.equals((java.lang.Object) '4');
        uk.ac.sheffield.com1003.cafe.Recipe.Size size13 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size13, (int) '4');
        boolean boolean17 = recipe15.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Welcome to Cafe", 0.0d);
        java.lang.String str21 = recipe15.getName();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean26 = recipe15.isReady();
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe15, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 0.0f);
        boolean boolean30 = water0.equals((java.lang.Object) order29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + size13 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size13.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water [unit=ML, amount=30]" + "'", str21, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to hi!");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Welcome to Cafe" + "'", str3, "Welcome to Welcome to Cafe");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        java.lang.Object obj7 = null;
        boolean boolean8 = recipe4.equals(obj7);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        java.lang.Throwable[] throwableArray16 = recipeNotFoundException14.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException19 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        recipeNotFoundException19.addSuppressed((java.lang.Throwable) recipeNotFoundException20);
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException19);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException24 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray25 = cafeOutOfCapacityException24.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException27.getSuppressed();
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        java.lang.String str33 = recipeNotFoundException14.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str33, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Coffee [unit=GR, amount=-1, decaf=true]", "Syrup [unit=ML, amount=10, flavour=]", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Coffee", "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=100, type=SKIMMED]", 8, (int) (byte) 100);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        java.lang.String str13 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup15 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("hi!");
        java.lang.String str16 = syrup15.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup15);
        java.lang.String str18 = syrup15.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=hi!]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=hi!]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Syrup [unit=ML, amount=10, flavour=hi!]" + "'", str18, "Syrup [unit=ML, amount=10, flavour=hi!]");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type1);
        java.lang.String str3 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean5 = milk2.equals((java.lang.Object) coffee4);
        java.lang.String str6 = coffee4.toString();
        int int7 = coffee4.getAmount();
        java.lang.Class<?> wildcardClass8 = coffee4.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) ' ', (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0d);
        double double11 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        boolean boolean16 = cafe3.addRecipe(recipe8);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) ' ');
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        boolean boolean9 = recipe7.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "hi!", (double) 0L);
        boolean boolean13 = cafe1.addRecipe(recipe7);
        java.lang.String str14 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cafe1.placeOrder("Coffee [unit=GR, amount=100, decaf=false]", "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) 35);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=32, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee", (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        java.lang.Object obj14 = null;
        boolean boolean15 = water2.equals(obj14);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size20, (int) '4');
        boolean boolean24 = recipe22.equals((java.lang.Object) 10.0d);
        boolean boolean25 = milk17.equals((java.lang.Object) recipe22);
        boolean boolean26 = water2.equals((java.lang.Object) recipe22);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee28 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1);
        java.lang.String str29 = coffee28.toString();
        boolean boolean30 = recipe22.equals((java.lang.Object) str29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str29, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Milk [unit=ML, amount=100, type=null]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = coffee5.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type7);
        boolean boolean12 = water1.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size17, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size17, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray24 = cafe23.getMenu();
        boolean boolean25 = recipe21.equals((java.lang.Object) cafe23);
        boolean boolean26 = water1.equals((java.lang.Object) cafe23);
        cafe23.printMenu();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(recipeArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Coffee [unit=GR, amount=1, decaf=false]", "Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) 100, size6, (int) (byte) 100);
        boolean boolean13 = recipe12.isReady();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double11 = recipe4.getPrice();
        boolean boolean12 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray17 = cafe16.getMenu();
        boolean boolean18 = recipe4.equals((java.lang.Object) recipeArray17);
        boolean boolean19 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(recipeArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        uk.ac.sheffield.com1003.cafe.Order order41 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", 0.0d, "Syrup [unit=ML, amount=10, flavour=Welcome to ]");
        order41.printReceipt();
        java.lang.String str43 = order41.toString();
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Order: ; For: ; Paid: 0.0" + "'", str43, "Order: ; For: ; Paid: 0.0");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "hi!", (double) (byte) -1, "");
        order4.serve();
        order4.serve();
        order4.serve();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = order4.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk0 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk();
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        boolean boolean8 = milk0.equals((java.lang.Object) cafe1);
        java.lang.String str9 = milk0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str9, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Milk [unit=ML, amount=-1, type=SKIMMED]", "Order: ; For: hi!; Paid: 0.0", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 10);
        order11.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
        order19.serve();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Water" + "'", str10, "Water");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + unit14 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit14.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = cafe14.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0]", "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
            cafe1.removeRecipe("Milk [unit=ML, amount=10, type=SKIMMED]");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException0.getSuppressed();
        java.lang.Class<?> wildcardClass22 = recipeNotFoundException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        java.lang.String str11 = recipeNotFoundException7.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", 10, (int) (short) 100);
        cafe3.printMenu();
        java.lang.Class<?> wildcardClass5 = cafe3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        java.lang.Object obj14 = null;
        boolean boolean15 = water2.equals(obj14);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size20 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe22 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size20, (int) '4');
        boolean boolean24 = recipe22.equals((java.lang.Object) 10.0d);
        boolean boolean25 = milk17.equals((java.lang.Object) recipe22);
        boolean boolean26 = water2.equals((java.lang.Object) recipe22);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee29 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4', true);
        boolean boolean31 = coffee29.equals((java.lang.Object) 10L);
        boolean boolean33 = coffee29.equals((java.lang.Object) (-1.0f));
        java.lang.Object obj34 = null;
        boolean boolean35 = coffee29.equals(obj34);
        boolean boolean36 = water2.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water" + "'", str8, "Water");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water" + "'", str11, "Water");
        org.junit.Assert.assertTrue("'" + unit12 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit12.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + size20 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size20.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size6, (int) '4');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=10, decaf=true]", (double) (byte) 100, size6, 8);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Coffee [unit=GR, amount=0, decaf=false]", (double) 0L, size6, 10);
        boolean boolean13 = recipe12.isReady();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.Class<?> wildcardClass2 = cafe0.getClass();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int22 = water21.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException24.getSuppressed();
        boolean boolean28 = water21.equals((java.lang.Object) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.String str31 = recipeNotFoundException2.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Coffee [unit=GR, amount=8, decaf=false]", 0.0d, "Order: ; For: Water; Paid: 1.0");
        order12.serve();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) 10L, size6, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) (short) 1, size6, 1);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=35, type=WHOLE]", (double) 100.0f, size6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str20 = syrup19.toString();
        boolean boolean21 = milk16.equals((java.lang.Object) str20);
        boolean boolean23 = milk16.equals((java.lang.Object) (-1));
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        java.lang.String str25 = milk16.toString();
        java.lang.String str26 = milk16.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str25, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str26, "Milk [unit=ML, amount=10, type=WHOLE]");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 35);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray2);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.String str23 = recipe9.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size26 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size26, (int) (short) 10);
        boolean boolean30 = recipe28.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe28, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        boolean boolean38 = recipe9.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str23, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + size26 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size26.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size6, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 0, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", 0.0d, size6, (int) (byte) 1);
        java.lang.String str13 = recipe12.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str13, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=-1, decaf=false]");
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
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee20 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1);
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee20);
        java.lang.String str22 = coffee20.getName();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=30]" + "'", str16, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee" + "'", str22, "Coffee");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, false);
        java.lang.String str3 = coffee2.getName();
        java.lang.String str4 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee" + "'", str3, "Coffee");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean3 = coffee0.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException4.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException5.getSuppressed();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException5.getSuppressed();
        boolean boolean10 = coffee0.equals((java.lang.Object) throwableArray9);
        uk.ac.sheffield.com1003.cafe.Cafe cafe12 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        boolean boolean13 = coffee0.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str14 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        java.lang.String str2 = coffee1.getName();
        java.lang.String str3 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee" + "'", str2, "Coffee");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size7 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size7, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "hi!", (double) (byte) 10, "Water [unit=ML, amount=30]");
        boolean boolean14 = recipe9.isReady();
        boolean boolean15 = cafe0.addRecipe(recipe9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size7 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size7.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        cafe3.printPendingOrders();
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str13 = coffee12.toString();
        boolean boolean14 = recipe8.equals((java.lang.Object) str13);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Syrup", (double) '#', "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        double double19 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) 8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        boolean boolean24 = coffee2.equals((java.lang.Object) "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0");
        int int25 = coffee2.getAmount();
        java.lang.String str26 = coffee2.toString();
        java.lang.String str27 = coffee2.toString();
        java.lang.Object obj28 = null;
        boolean boolean29 = coffee2.equals(obj28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str26, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException0.getSuppressed();
        java.lang.Class<?> wildcardClass10 = throwableArray9.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = coffee5.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type7);
        boolean boolean12 = water1.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1));
        java.lang.String str15 = milk14.toString();
        java.lang.String str16 = milk14.getName();
        boolean boolean17 = water1.equals((java.lang.Object) milk14);
        java.lang.String str18 = milk14.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str15, "Milk [unit=ML, amount=-1, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk" + "'", str16, "Milk");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=-1, type=WHOLE]" + "'", str18, "Milk [unit=ML, amount=-1, type=WHOLE]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.Class<?> wildcardClass2 = cafe1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water14 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str15 = water14.toString();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water14);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=30]" + "'", str15, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=100, type=SKIMMED]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water21 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int22 = water21.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException23 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException24 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException24.getSuppressed();
        boolean boolean28 = water21.equals((java.lang.Object) recipeNotFoundException24);
        java.lang.Throwable[] throwableArray29 = recipeNotFoundException24.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException24);
        java.lang.String str31 = recipeNotFoundException24.toString();
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str31, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str16 = water15.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean19 = water15.equals((java.lang.Object) 30);
        java.lang.String str20 = water15.toString();
        java.lang.String str21 = water15.getName();
        java.lang.String str22 = water15.getName();
        java.lang.String str23 = water15.toString();
        java.lang.String str24 = water15.toString();
        boolean boolean25 = recipe2.equals((java.lang.Object) str24);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water" + "'", str16, "Water");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water" + "'", str21, "Water");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Water" + "'", str22, "Water");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Water [unit=ML, amount=30]" + "'", str23, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Coffee [unit=GR, amount=0, decaf=false]", 30, (int) (short) 100);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        java.lang.String str10 = order9.toString();
        order9.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str10, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        double double16 = recipe4.getPrice();
        double double17 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        java.lang.String str2 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=30, decaf=false]");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        java.lang.String str14 = order13.toString();
        order13.printReceipt();
        order13.serve();
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0" + "'", str14, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean5 = cafe1.addRecipe(recipe4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Water", "Order: Welcome to Welcome to Cafe; For: Water [unit=ML, amount=10]; Paid: 1.0", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Cafe cafe6 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str7 = cafe6.getName();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe6.serveOrder();
        java.lang.String str9 = cafe6.getName();
        cafe6.printPendingOrders();
        boolean boolean11 = recipe4.equals((java.lang.Object) cafe6);
        // The following exception was thrown during execution in test generation
        try {
            cafe6.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str7, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str9, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        java.lang.String str7 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to hi!");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = coffee5.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type7);
        boolean boolean12 = water1.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size17 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size17, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size17, 0);
        uk.ac.sheffield.com1003.cafe.Cafe cafe23 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray24 = cafe23.getMenu();
        boolean boolean25 = recipe21.equals((java.lang.Object) cafe23);
        boolean boolean26 = water1.equals((java.lang.Object) cafe23);
        java.lang.String str27 = water1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + size17 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size17.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(recipeArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Water [unit=ML, amount=0]" + "'", str27, "Water [unit=ML, amount=0]");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=]", "Milk", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.String str24 = water18.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water" + "'", str19, "Water");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water" + "'", str24, "Water");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 10L);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str4 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean7 = water3.equals((java.lang.Object) 30);
        java.lang.String str8 = water3.toString();
        java.lang.String str9 = water3.getName();
        boolean boolean11 = water3.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = water3.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup14 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Cafe; Paid: 10.0");
        java.lang.String str15 = syrup14.toString();
        java.lang.String str16 = syrup14.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = syrup14.getUnit();
        boolean boolean18 = water3.equals((java.lang.Object) syrup14);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException20 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray21 = recipeNotFoundException20.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException22 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException22.getSuppressed();
        java.lang.Throwable[] throwableArray24 = recipeNotFoundException22.getSuppressed();
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException22);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException26);
        boolean boolean34 = water3.equals((java.lang.Object) recipeNotFoundException20);
        java.lang.String str35 = recipeNotFoundException20.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water" + "'", str4, "Water");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Water" + "'", str12, "Water");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]" + "'", str16, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]");
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str35, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        java.lang.String str36 = recipeNotFoundException7.toString();
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        uk.ac.sheffield.com1003.cafe.Cafe cafe11 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe11.printPendingOrders();
        java.lang.String str13 = cafe11.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size16 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size16, (int) (short) 10);
        java.lang.String str19 = recipe18.getName();
        boolean boolean20 = cafe11.addRecipe(recipe18);
        boolean boolean21 = recipe4.equals((java.lang.Object) boolean20);
        java.lang.String str22 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size16 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size16.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size9 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe11 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size9, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe11, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk16 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe11.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup19 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str20 = syrup19.toString();
        boolean boolean21 = milk16.equals((java.lang.Object) str20);
        boolean boolean23 = milk16.equals((java.lang.Object) (-1));
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk16);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water26 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '#');
        boolean boolean27 = milk16.equals((java.lang.Object) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit28 = milk16.getUnit();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + unit28 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit28.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, true);
        java.lang.String str3 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=true]");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe5.printPendingOrders();
        boolean boolean7 = water1.equals((java.lang.Object) cafe5);
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        boolean boolean10 = water1.equals((java.lang.Object) cafe9);
        cafe9.printMenu();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]", 8, (int) (short) 0);
        java.lang.String str4 = cafe3.greeting();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Coffee [unit=GR, amount=1, decaf=false]" + "'", str4, "Welcome to Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size2, 0);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", (double) 1.0f, "Coffee [unit=GR, amount=0, decaf=false]");
        double double9 = recipe4.getPrice();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        order25.printReceipt();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        java.lang.String str15 = coffee12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Water [unit=ML, amount=30]" + "'", str11, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee" + "'", str15, "Coffee");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Cafe", (double) (byte) 0, "Water");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean4 = milk2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        java.lang.String str6 = milk5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;
        boolean boolean8 = milk5.equals((java.lang.Object) unit7);
        java.lang.Class<?> wildcardClass9 = milk5.getClass();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=0, type=SKIMMED]" + "'", str6, "Milk [unit=ML, amount=0, type=SKIMMED]");
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = cafe0.placeOrder("Water [unit=ML, amount=97]", "Coffee [unit=GR, amount=8, decaf=false]", (double) 30);
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        double double16 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size19 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe21 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size19, (int) (short) 10);
        boolean boolean23 = recipe21.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order26 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "hi!", (double) 0L);
        boolean boolean27 = recipe21.isReady();
        uk.ac.sheffield.com1003.cafe.Order order30 = new uk.ac.sheffield.com1003.cafe.Order(recipe21, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        order30.serve();
        order30.printReceipt();
        order30.serve();
        boolean boolean34 = recipe4.equals((java.lang.Object) order30);
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
        uk.ac.sheffield.com1003.cafe.ingredients.Water water49 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str50 = water49.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk52 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean53 = water49.equals((java.lang.Object) 30);
        java.lang.String str54 = water49.toString();
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
        boolean boolean69 = water49.equals((java.lang.Object) recipeNotFoundException65);
        recipeNotFoundException45.addSuppressed((java.lang.Throwable) recipeNotFoundException65);
        boolean boolean71 = recipe4.equals((java.lang.Object) recipeNotFoundException45);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + size19 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size19.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray46);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Water" + "'", str50, "Water");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Water [unit=ML, amount=30]" + "'", str54, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0", (double) (-1), "Milk [unit=ML, amount=-1, type=WHOLE]");
        java.lang.String str15 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Water [unit=ML, amount=0]; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
            cafe13.removeRecipe("Milk [unit=ML, amount=32, type=SKIMMED]");
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.getName();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=97, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Cafe" + "'", str1, "Cafe");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Coffee [unit=GR, amount=32, decaf=false]", (double) (-1), "Milk [unit=ML, amount=0, type=SKIMMED]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 0);
        java.lang.String str2 = coffee1.toString();
        java.lang.Class<?> wildcardClass3 = coffee1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(35);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        boolean boolean11 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        boolean boolean16 = recipe4.equals((java.lang.Object) (short) 10);
        java.lang.String str17 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.getName();
        java.lang.String str5 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size8, (int) (short) 10);
        boolean boolean12 = recipe10.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean21 = recipe10.equals((java.lang.Object) 10);
        boolean boolean22 = cafe0.addRecipe(recipe10);
        uk.ac.sheffield.com1003.cafe.Order order23 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(order23);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        order13.serve();
        java.lang.String str15 = order13.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0" + "'", str15, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Welcome to Cafe", "Welcome to Welcome to Cafe", (double) '4');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = coffee2.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.String str20 = recipeNotFoundException3.toString();
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) (byte) 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        order5.printReceipt();
        java.lang.Class<?> wildcardClass7 = order5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
        java.lang.Class<?> wildcardClass28 = order21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) -1);
        java.lang.String str2 = coffee1.getName();
        java.lang.Class<?> wildcardClass3 = coffee1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee" + "'", str2, "Coffee");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException14 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException14.getSuppressed();
        recipeNotFoundException10.addSuppressed((java.lang.Throwable) recipeNotFoundException14);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException17 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray18 = recipeNotFoundException17.getSuppressed();
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException17.getSuppressed();
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
        recipeNotFoundException17.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException14.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        boolean boolean36 = syrup1.equals((java.lang.Object) recipeNotFoundException14);
        java.lang.String str37 = recipeNotFoundException14.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str37, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean7 = recipe6.isReady();
        java.lang.String str8 = recipe6.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe6.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee9);
        boolean boolean11 = coffee3.equals((java.lang.Object) recipe6);
        boolean boolean12 = water1.equals((java.lang.Object) recipe6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, true);
        java.lang.String str16 = coffee15.toString();
        boolean boolean17 = water1.equals((java.lang.Object) coffee15);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size24 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe26 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size24, (int) '4');
        boolean boolean28 = recipe26.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order31 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Welcome to Cafe", 0.0d);
        java.lang.String str32 = recipe26.getName();
        uk.ac.sheffield.com1003.cafe.Order order36 = new uk.ac.sheffield.com1003.cafe.Order(recipe26, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 1, "Coffee [unit=GR, amount=8, decaf=false]");
        boolean boolean37 = cafe21.addRecipe(recipe26);
        java.lang.String str38 = cafe21.getName();
        boolean boolean39 = coffee15.equals((java.lang.Object) cafe21);
        uk.ac.sheffield.com1003.cafe.Order order40 = cafe21.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Water [unit=ML, amount=30]" + "'", str8, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=10, decaf=true]" + "'", str16, "Coffee [unit=GR, amount=10, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + size24 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size24.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Water [unit=ML, amount=30]" + "'", str32, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Syrup" + "'", str38, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(order40);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        java.lang.String str8 = cafe3.getName();
        cafe3.printPendingOrders();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit25 = coffee19.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        java.lang.String str27 = coffee19.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe30 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        boolean boolean31 = recipe30.isReady();
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe30, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0", (double) (byte) 1);
        order34.serve();
        boolean boolean36 = coffee19.equals((java.lang.Object) order34);
        int int37 = coffee19.getAmount();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str27, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) 0.0f, "Welcome to Cafe");
        java.lang.String str10 = order9.toString();
        java.lang.String str11 = order9.toString();
        java.lang.String str12 = order9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0" + "'", str10, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0" + "'", str11, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0" + "'", str12, "Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean5 = coffee2.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type4);
        java.lang.String str8 = milk7.toString();
        java.lang.Class<?> wildcardClass9 = milk7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk [unit=ML, amount=52, type=SKIMMED]" + "'", str8, "Milk [unit=ML, amount=52, type=SKIMMED]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", 1.0d);
        java.lang.Class<?> wildcardClass3 = recipe2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup", (int) (short) 10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Milk [unit=ML, amount=-1, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 1, size6, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) 100, size6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str4, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) -1);
        boolean boolean9 = cafe3.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size12, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str19 = coffee18.toString();
        boolean boolean20 = recipe14.equals((java.lang.Object) str19);
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe21.printPendingOrders();
        java.lang.String str23 = cafe21.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size26 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe28 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size26, (int) (short) 10);
        java.lang.String str29 = recipe28.getName();
        boolean boolean30 = cafe21.addRecipe(recipe28);
        boolean boolean31 = recipe14.equals((java.lang.Object) boolean30);
        boolean boolean32 = recipe8.equals((java.lang.Object) boolean30);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + size26 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size26.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean3 = recipe2.isReady();
        java.lang.String str4 = recipe2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee5);
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) 0);
        boolean boolean10 = coffee5.equals((java.lang.Object) recipe9);
        java.lang.String str11 = recipe9.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=30, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=30, decaf=false]");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        java.lang.String str10 = order9.toString();
        java.lang.String str11 = order9.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str10, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0" + "'", str11, "Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Water]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        boolean boolean10 = recipe4.isReady();
        java.lang.Class<?> wildcardClass11 = recipe4.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=8, decaf=false]");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = milk9.equals((java.lang.Object) str13);
        java.lang.String str15 = milk9.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str15, "Milk [unit=ML, amount=10, type=WHOLE]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=ALMOND]", (double) (-1), size2, 100);
        java.lang.Class<?> wildcardClass5 = size2.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        java.lang.String str2 = water0.toString();
        java.lang.String str3 = water0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=0, decaf=false]", 0.0d);
        java.lang.String str13 = order12.toString();
        java.lang.String str14 = order12.toString();
        order12.serve();
        java.lang.String str16 = order12.toString();
        java.lang.String str17 = order12.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str13, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str14, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str16, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0" + "'", str17, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean3 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean6 = recipe2.equals((java.lang.Object) water5);
        java.lang.String str7 = water5.getName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water" + "'", str7, "Water");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        double double6 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee8);
        int int10 = coffee8.getAmount();
        java.lang.String str11 = coffee8.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type4);
        java.lang.String str6 = milk5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean8 = milk5.equals((java.lang.Object) coffee7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0);
        boolean boolean11 = coffee7.equals((java.lang.Object) milk10);
        boolean boolean12 = recipe2.equals((java.lang.Object) boolean11);
        boolean boolean13 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order17 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "hi!", 100.0d, "Coffee [unit=GR, amount=10, decaf=false]");
        order17.serve();
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ', false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.String str82 = cafeOutOfCapacityException66.toString();
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
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str82, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray1 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = cafeOutOfCapacityException0.getSuppressed();
        java.lang.String str3 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str3, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
        order36.serve();
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 0.0d);
        boolean boolean11 = recipe4.equals((java.lang.Object) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 100L, "Order: ; For: Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0; Paid: -1.0");
        java.lang.Class<?> wildcardClass16 = order15.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        java.lang.Throwable[] throwableArray25 = recipeNotFoundException23.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException26 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray27 = recipeNotFoundException26.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException28 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException29 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray30 = recipeNotFoundException29.getSuppressed();
        recipeNotFoundException28.addSuppressed((java.lang.Throwable) recipeNotFoundException29);
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException28);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException33 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray34 = cafeOutOfCapacityException33.getSuppressed();
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException33);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException36 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray37 = recipeNotFoundException36.getSuppressed();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException36.getSuppressed();
        recipeNotFoundException26.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException36);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException41 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray42 = recipeNotFoundException41.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        java.lang.Throwable[] throwableArray45 = recipeNotFoundException43.getSuppressed();
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException49);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException23.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException56 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray57 = recipeNotFoundException56.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException58 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException58.getSuppressed();
        java.lang.Throwable[] throwableArray60 = recipeNotFoundException58.getSuppressed();
        recipeNotFoundException56.addSuppressed((java.lang.Throwable) recipeNotFoundException58);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException62 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray64 = recipeNotFoundException63.getSuppressed();
        recipeNotFoundException62.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        recipeNotFoundException58.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException67 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray68 = recipeNotFoundException67.getSuppressed();
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException67);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException70 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray71 = recipeNotFoundException70.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException72 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray73 = recipeNotFoundException72.getSuppressed();
        java.lang.Throwable[] throwableArray74 = recipeNotFoundException72.getSuppressed();
        recipeNotFoundException70.addSuppressed((java.lang.Throwable) recipeNotFoundException72);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException76 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException77 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray78 = recipeNotFoundException77.getSuppressed();
        recipeNotFoundException76.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        recipeNotFoundException72.addSuppressed((java.lang.Throwable) recipeNotFoundException77);
        java.lang.Throwable[] throwableArray81 = recipeNotFoundException72.getSuppressed();
        recipeNotFoundException67.addSuppressed((java.lang.Throwable) recipeNotFoundException72);
        recipeNotFoundException41.addSuppressed((java.lang.Throwable) recipeNotFoundException67);
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException41);
        java.lang.Throwable[] throwableArray85 = tooManyIngredientsException0.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray27);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray37);
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray42);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray45);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray60);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray68);
        org.junit.Assert.assertNotNull(throwableArray71);
        org.junit.Assert.assertNotNull(throwableArray73);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertNotNull(throwableArray81);
        org.junit.Assert.assertNotNull(throwableArray85);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe1.placeOrder("Order: Water [unit=ML, amount=30]; For: Syrup [unit=ML, amount=10, flavour=Plain]; Paid: -1.0", "Water [unit=ML, amount=0]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", 30, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.getName();
        boolean boolean8 = water0.equals((java.lang.Object) (byte) -1);
        java.lang.String str9 = water0.getName();
        java.lang.Object obj10 = null;
        boolean boolean11 = water0.equals(obj10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water" + "'", str6, "Water");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water" + "'", str9, "Water");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]", 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=8, decaf=false]", (double) (-1), size2, 0);
        boolean boolean5 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str9 = coffee8.toString();
        boolean boolean10 = recipe4.equals((java.lang.Object) str9);
        boolean boolean11 = recipe4.isReady();
        double double12 = recipe4.getPrice();
        boolean boolean13 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException11.getSuppressed();
        java.lang.String str24 = recipeNotFoundException11.toString();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d, size8, (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) ' ', size8, 30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) 1.0f, size8, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=52, type=WHOLE]", (double) 1L, size8, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", (double) 1);
        double double3 = recipe2.getPrice();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) 100.0f, size2, 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type6);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee9 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        boolean boolean10 = milk7.equals((java.lang.Object) 30);
        java.lang.String str11 = milk7.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup13 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]");
        boolean boolean14 = milk7.equals((java.lang.Object) syrup13);
        // The following exception was thrown during execution in test generation
        try {
            recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup13);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Milk [unit=ML, amount=100, type=null]" + "'", str11, "Milk [unit=ML, amount=100, type=null]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]", 8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(30);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 0);
        boolean boolean5 = recipe4.isReady();
        java.lang.String str6 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee7);
        boolean boolean9 = coffee1.equals((java.lang.Object) recipe4);
        java.lang.String str10 = coffee1.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: ; Paid: 10.0]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Water [unit=ML, amount=97]", "Welcome to Milk", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Coffee [unit=GR, amount=1, decaf=false]", (double) 0.0f);
        order3.serve();
        // The following exception was thrown during execution in test generation
        try {
            order3.printReceipt();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!");
        java.lang.String str2 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Coffee [unit=GR, amount=30, decaf=false]", "Syrup [unit=ML, amount=10, flavour=Order: ; For: Water; Paid: 1.0]", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to hi!" + "'", str2, "Welcome to hi!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (int) (short) 10, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Welcome to Order: ; For: hi!; Paid: 0.0", "Order: ; For: Welcome to Cafe; Paid: 10.0", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.Class<?> wildcardClass7 = cafe0.getClass();
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.Class<?> wildcardClass3 = cafe1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Welcome to Cafe" + "'", str2, "Welcome to Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj2 = null;
        boolean boolean3 = milk1.equals(obj2);
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        java.lang.String str6 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) 100);
        boolean boolean10 = milk1.equals((java.lang.Object) recipe9);
        boolean boolean11 = recipe9.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water12 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str13 = water12.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk15 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean16 = water12.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit17 = water12.getUnit();
        java.lang.Object obj18 = null;
        boolean boolean19 = water12.equals(obj18);
        java.lang.String str20 = water12.toString();
        java.lang.String str21 = water12.toString();
        recipe9.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water12);
        java.lang.Class<?> wildcardClass23 = recipe9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str6, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + unit17 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit17.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Water [unit=ML, amount=30]" + "'", str21, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit0 = uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR;
        java.lang.Class<?> wildcardClass1 = unit0.getClass();
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit0.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=0]", (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("hi!");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
        java.lang.String str15 = water0.getName();
        int int16 = water0.getAmount();
        java.lang.String str17 = water0.toString();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water" + "'", str15, "Water");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Water [unit=ML, amount=30]" + "'", str17, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        java.lang.String str4 = cafe1.getName();
        java.lang.Class<?> wildcardClass5 = cafe1.getClass();
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe3.placeOrder("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", "", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean4 = water0.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = water0.getUnit();
        int int6 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe();
        boolean boolean8 = water0.equals((java.lang.Object) cafe7);
        cafe7.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe7.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cafe7.placeOrder("Syrup [unit=ML, amount=10, flavour=Welcome to ]", "Milk [unit=ML, amount=10, type=WHOLE]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30 + "'", int6 == 30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(order10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(30);
        java.lang.String str2 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size2, 1);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) 10L, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        order8.printReceipt();
        order8.printReceipt();
        java.lang.String str11 = order8.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Order: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; For: ; Paid: 10.0" + "'", str11, "Order: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; For: ; Paid: 10.0");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: hi!; Paid: 0.0", 10.0d);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 10L, "Syrup [unit=ML, amount=10, flavour=Water]");
        order6.serve();
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        java.lang.String str52 = recipeNotFoundException2.toString();
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        java.lang.String str8 = order7.toString();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0" + "'", str8, "Order: ; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: -1.0");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.WHOLE));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printMenu();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe0.getMenu();
        java.lang.Class<?> wildcardClass8 = recipeArray7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException13 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException13.getSuppressed();
        java.lang.Throwable[] throwableArray15 = recipeNotFoundException13.getSuppressed();
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException13);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
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
        java.lang.Throwable[] throwableArray29 = cafeOutOfCapacityException25.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException25);
        java.lang.Throwable[] throwableArray31 = recipeNotFoundException0.getSuppressed();
        java.lang.String str32 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str32, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) 'a', 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water]", (double) 10.0f);
        boolean boolean7 = recipe6.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Welcome to Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) -1, "Order: Water [unit=ML, amount=30]; For: Milk [unit=ML, amount=10, type=WHOLE]; Paid: 1.0");
        boolean boolean12 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe3.getMenu();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(recipeArray13);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        uk.ac.sheffield.com1003.cafe.Recipe recipe32 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order35 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean40 = recipe32.isReady();
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe32, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException", (double) ' ');
        boolean boolean44 = cafe0.addRecipe(recipe32);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        java.lang.String str8 = recipe7.getName();
        boolean boolean9 = cafe0.addRecipe(recipe7);
        java.lang.String str10 = cafe0.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = cafe0.placeOrder("Milk [unit=ML, amount=100, type=null]", "Coffee [unit=GR, amount=0, decaf=true]", (double) (-1));
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Syrup [unit=ML, amount=10, flavour=Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0]]");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str6 = coffee5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = coffee5.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 100, type7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        java.lang.String str4 = cafe0.greeting();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Welcome to Cafe; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        int int26 = milk21.getAmount();
        boolean boolean28 = milk21.equals((java.lang.Object) "Water [unit=ML, amount=100]");
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk21);
        java.lang.String str30 = milk21.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup32 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str33 = syrup32.toString();
        java.lang.Class<?> wildcardClass34 = syrup32.getClass();
        boolean boolean35 = milk21.equals((java.lang.Object) syrup32);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str24, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk" + "'", str25, "Milk");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str30, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str33, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
        java.lang.String str28 = water0.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Water [unit=ML, amount=30]" + "'", str28, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", (double) 1L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (byte) 10, "Milk [unit=ML, amount=32, type=WHOLE]");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", (double) 100L);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Milk [unit=ML, amount=35, type=WHOLE]", "Order: Water [unit=ML, amount=30]; For: ; Paid: -1.0", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=32, decaf=false]", (double) 1.0f, size2, 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
        java.lang.String str51 = recipeNotFoundException39.toString();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str51, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.toString();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        java.lang.String str4 = coffee0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee7 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, false);
        boolean boolean8 = coffee0.equals((java.lang.Object) false);
        int int9 = coffee0.getAmount();
        java.lang.String str10 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str1, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str4, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        java.lang.String str41 = cafeOutOfCapacityException34.toString();
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
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str41, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Cafe", (double) 0.0f, "Welcome to Cafe");
        boolean boolean12 = water0.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str13 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water" + "'", str1, "Water");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=30]" + "'", str13, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        double double5 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 10);
        java.lang.String str12 = order11.toString();
        order11.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0" + "'", str12, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 10.0");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=null]", (double) 10L);
        java.lang.String str3 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=100, type=null]" + "'", str3, "Milk [unit=ML, amount=100, type=null]");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", (int) 'a', (int) (short) 10);
        java.lang.String str4 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=-1, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0" + "'", str4, "Welcome to Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: ; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water", 100.0d);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        boolean boolean15 = recipe4.equals((java.lang.Object) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup17 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup17);
        java.lang.Object obj19 = null;
        boolean boolean20 = recipe4.equals(obj19);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit42 = coffee19.getUnit();
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
        org.junit.Assert.assertTrue("'" + unit42 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit42.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str3 = water2.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean6 = water2.equals((java.lang.Object) 30);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit7 = water2.getUnit();
        java.lang.Class<?> wildcardClass8 = unit7.getClass();
        boolean boolean9 = milk1.equals((java.lang.Object) wildcardClass8);
        uk.ac.sheffield.com1003.cafe.Recipe.Size size12 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size12, (int) (short) 10);
        boolean boolean16 = recipe14.equals((java.lang.Object) 10.0f);
        double double17 = recipe14.getPrice();
        boolean boolean18 = milk1.equals((java.lang.Object) recipe14);
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", 0.0d, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water" + "'", str3, "Water");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + unit7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + size12 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size12.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size2, 1);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) 10L, "Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0");
        order8.printReceipt();
        order8.printReceipt();
        order8.printReceipt();
        order8.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: ; Paid: 10.0");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=8, decaf=false]; For: Milk [unit=ML, amount=100, type=WHOLE]; Paid: 97.0", "Syrup [unit=ML, amount=10, flavour=Welcome to ]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]", (int) '#', (int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        java.lang.String str5 = cafe3.getName();
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException37 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray38 = recipeNotFoundException37.getSuppressed();
        java.lang.Throwable[] throwableArray39 = recipeNotFoundException37.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException43 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException43.getSuppressed();
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException43);
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException47 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray48 = cafeOutOfCapacityException47.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException50 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray51 = recipeNotFoundException50.getSuppressed();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException50.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException50);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException55 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray56 = recipeNotFoundException55.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException57.getSuppressed();
        java.lang.Throwable[] throwableArray59 = recipeNotFoundException57.getSuppressed();
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException61 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException61.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException63 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException64 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray65 = recipeNotFoundException64.getSuppressed();
        recipeNotFoundException63.addSuppressed((java.lang.Throwable) recipeNotFoundException64);
        recipeNotFoundException61.addSuppressed((java.lang.Throwable) recipeNotFoundException63);
        recipeNotFoundException55.addSuppressed((java.lang.Throwable) recipeNotFoundException61);
        recipeNotFoundException37.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        recipeNotFoundException20.addSuppressed((java.lang.Throwable) recipeNotFoundException55);
        java.lang.String str71 = recipeNotFoundException55.toString();
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
        org.junit.Assert.assertNotNull(throwableArray38);
        org.junit.Assert.assertNotNull(throwableArray39);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray51);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray56);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray59);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str71, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException0.getSuppressed();
        java.lang.String str11 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk" + "'", str6, "Milk");
        org.junit.Assert.assertTrue("'" + size9 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size9.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str24, "Milk [unit=ML, amount=10, type=SKIMMED]");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Ingredient ingredient33 = null;
        recipe12.addIngredient(ingredient33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str25, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type26.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]" + "'", str30, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        java.lang.String str2 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Welcome to Welcome to Cafe", "Welcome to Welcome to ", (double) 10L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type7 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean8 = milk6.equals((java.lang.Object) type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type7);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type7);
        boolean boolean12 = water1.equals((java.lang.Object) type7);
        java.lang.String str13 = water1.getName();
        org.junit.Assert.assertTrue("'" + type7 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type7.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water" + "'", str13, "Water");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk");
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Water]", "Syrup [unit=ML, amount=10, flavour=hi!]", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        boolean boolean7 = cafe3.addRecipe(recipe6);
        boolean boolean8 = cafe1.addRecipe(recipe6);
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        int int11 = milk9.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size14 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size14, (int) (short) 10);
        boolean boolean18 = recipe16.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "hi!", (double) 0L);
        boolean boolean22 = recipe16.isReady();
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe16, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 0L);
        boolean boolean26 = milk9.equals((java.lang.Object) "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + size14 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size14.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException1 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException1.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException4 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException4.getSuppressed();
        recipeNotFoundException3.addSuppressed((java.lang.Throwable) recipeNotFoundException4);
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException8 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.Throwable[] throwableArray9 = cafeOutOfCapacityException8.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) cafeOutOfCapacityException8);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException11 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray12 = recipeNotFoundException11.getSuppressed();
        java.lang.Throwable[] throwableArray13 = recipeNotFoundException11.getSuppressed();
        recipeNotFoundException1.addSuppressed((java.lang.Throwable) recipeNotFoundException11);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water15 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str16 = water15.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk18 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(30);
        boolean boolean19 = water15.equals((java.lang.Object) 30);
        java.lang.String str20 = water15.toString();
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
        boolean boolean35 = water15.equals((java.lang.Object) recipeNotFoundException31);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException31);
        java.lang.String str38 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water" + "'", str16, "Water");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Water [unit=ML, amount=30]" + "'", str20, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str38, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = cafe1.addRecipe(recipe7);
        cafe1.printMenu();
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Milk [unit=ML, amount=30, type=WHOLE]]", "Welcome to Milk [unit=ML, amount=-1, type=SKIMMED]", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.String str24 = water18.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Water" + "'", str19, "Water");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Water [unit=ML, amount=30]" + "'", str24, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 10, size2, (int) '4');
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0d);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: ; For: Water; Paid: 1.0", (double) (short) 1, "Order: ; For: uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException; Paid: 0.0");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Water [unit=ML, amount=0]", (double) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=10, type=WHOLE]", (double) (short) 0, "Coffee [unit=GR, amount=0, decaf=true]");
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Water [unit=ML, amount=30]; For: Order: ; For: Water; Paid: 1.0; Paid: 1.0", (double) 1.0f);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe24 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray25 = cafe24.getMenu();
        cafe24.printPendingOrders();
        boolean boolean27 = recipe2.equals((java.lang.Object) cafe24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = cafe24.placeOrder("Order: ; For: Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; Paid: 1.0", "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=0, decaf=false]]", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Water [unit=ML, amount=30]" + "'", str7, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(recipeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee3 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1));
        boolean boolean4 = water0.equals((java.lang.Object) (-1));
        java.lang.String str5 = water0.toString();
        java.lang.String str6 = water0.toString();
        int int7 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10);
        java.lang.Object obj10 = null;
        boolean boolean11 = milk9.equals(obj10);
        java.lang.String str12 = milk9.toString();
        java.lang.String str13 = milk9.getName();
        java.lang.String str14 = milk9.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=30, decaf=false]", (double) (short) 100);
        boolean boolean18 = milk9.equals((java.lang.Object) recipe17);
        boolean boolean19 = recipe17.isReady();
        boolean boolean20 = water0.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=30]" + "'", str6, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 30 + "'", int7 == 30);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Milk" + "'", str13, "Milk");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=10, type=WHOLE]" + "'", str14, "Milk [unit=ML, amount=10, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        java.lang.String str19 = milk5.toString();
        java.lang.String str20 = milk5.getName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=SKIMMED]" + "'", str19, "Milk [unit=ML, amount=10, type=SKIMMED]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk" + "'", str20, "Milk");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (short) 100, (int) '#');
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        java.lang.String str7 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size10, 1);
        boolean boolean13 = cafe3.addRecipe(recipe12);
        java.lang.Class<?> wildcardClass14 = cafe3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L, "Milk [unit=ML, amount=10, type=WHOLE]");
        java.lang.String str12 = order11.toString();
        order11.serve();
        java.lang.Class<?> wildcardClass14 = order11.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: hi!; Paid: 0.0" + "'", str12, "Order: ; For: hi!; Paid: 0.0");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException3.getSuppressed();
        boolean boolean7 = water0.equals((java.lang.Object) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException3.getSuppressed();
        java.lang.String str10 = recipeNotFoundException3.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray2 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size5 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size5, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=10, type=WHOLE]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#');
        recipe7.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk12);
        boolean boolean14 = cafe1.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee15 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str16 = coffee15.toString();
        java.lang.String str17 = coffee15.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe21 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", 10, (int) (short) 100);
        cafe21.printMenu();
        boolean boolean23 = coffee15.equals((java.lang.Object) cafe21);
        boolean boolean24 = recipe7.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertNotNull(recipeArray2);
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Coffee [unit=GR, amount=0, decaf=false]; Paid: 0.0]", 100, (int) (byte) 0);
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe3.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray8 = cafe3.getMenu();
        org.junit.Assert.assertNull(order5);
        org.junit.Assert.assertNull(order6);
        org.junit.Assert.assertNotNull(recipeArray7);
        org.junit.Assert.assertNotNull(recipeArray8);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        int int1 = water0.getAmount();
        int int2 = water0.getAmount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        order9.serve();
        order9.serve();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        java.lang.Class<?> wildcardClass10 = recipeNotFoundException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        double double7 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "hi!", (double) 0L, "Milk [unit=ML, amount=10, type=WHOLE]");
        java.lang.String str12 = order11.toString();
        order11.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: hi!; Paid: 0.0" + "'", str12, "Order: ; For: hi!; Paid: 0.0");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
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
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = cafe1.placeOrder("Order: Coffee; For: Milk [unit=ML, amount=8, type=SKIMMED]; Paid: 10.0", "Welcome to Order: ; For: Water; Paid: 1.0", (double) 1L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 0);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 1);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED;
        boolean boolean9 = milk7.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) -1, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk11 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk12 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type8);
        boolean boolean13 = water2.equals((java.lang.Object) type8);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk14 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type8);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size2, (int) (short) 10);
        boolean boolean6 = recipe4.equals((java.lang.Object) 10.0f);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Cafe", 1.0d, "Water [unit=ML, amount=30]");
        order13.printReceipt();
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.String str40 = recipeNotFoundException11.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str40, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        java.lang.Class<?> wildcardClass53 = water13.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.String str52 = recipeNotFoundException18.toString();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str52, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size4, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, 0);
        double double9 = recipe8.getPrice();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1);
        int int2 = milk1.getAmount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Milk [unit=ML, amount=100, type=WHOLE]; For: Cafe; Paid: 0.0", (double) (short) -1);
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit25 = coffee19.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        uk.ac.sheffield.com1003.cafe.Cafe cafe28 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe28.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe28.getMenu();
        java.lang.String str31 = cafe28.getName();
        java.lang.String str32 = cafe28.getName();
        uk.ac.sheffield.com1003.cafe.Order order33 = cafe28.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe36 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=100, type=WHOLE]", (double) 0);
        uk.ac.sheffield.com1003.cafe.Order order39 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "Order: ; For: Welcome to Cafe; Paid: 10.0", 1.0d);
        uk.ac.sheffield.com1003.cafe.Order order43 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "Cafe", (double) 0.0f, "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Order order47 = new uk.ac.sheffield.com1003.cafe.Order(recipe36, "Water", (double) 100.0f, "Milk");
        double double48 = recipe36.getPrice();
        boolean boolean49 = cafe28.addRecipe(recipe36);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water51 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(8);
        recipe36.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water51);
        boolean boolean53 = recipe2.equals((java.lang.Object) recipe36);
        java.lang.Class<?> wildcardClass54 = recipe36.getClass();
        org.junit.Assert.assertTrue("'" + size5 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size5.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED + "'", type21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SKIMMED));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertTrue("'" + unit25 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit25.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertNotNull(recipeArray30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(order33);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException40 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray41 = recipeNotFoundException40.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        java.lang.Throwable[] throwableArray44 = recipeNotFoundException42.getSuppressed();
        recipeNotFoundException40.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException46 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException47 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray48 = recipeNotFoundException47.getSuppressed();
        recipeNotFoundException46.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        recipeNotFoundException42.addSuppressed((java.lang.Throwable) recipeNotFoundException47);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException51 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray52 = recipeNotFoundException51.getSuppressed();
        recipeNotFoundException47.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException56 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray57 = recipeNotFoundException56.getSuppressed();
        java.lang.Throwable[] throwableArray58 = recipeNotFoundException56.getSuppressed();
        recipeNotFoundException54.addSuppressed((java.lang.Throwable) recipeNotFoundException56);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException60 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException61 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray62 = recipeNotFoundException61.getSuppressed();
        recipeNotFoundException60.addSuppressed((java.lang.Throwable) recipeNotFoundException61);
        recipeNotFoundException56.addSuppressed((java.lang.Throwable) recipeNotFoundException61);
        java.lang.Throwable[] throwableArray65 = recipeNotFoundException56.getSuppressed();
        recipeNotFoundException51.addSuppressed((java.lang.Throwable) recipeNotFoundException56);
        recipeNotFoundException11.addSuppressed((java.lang.Throwable) recipeNotFoundException51);
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
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray44);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray57);
        org.junit.Assert.assertNotNull(throwableArray58);
        org.junit.Assert.assertNotNull(throwableArray62);
        org.junit.Assert.assertNotNull(throwableArray65);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.String str32 = cafeOutOfCapacityException16.toString();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str32, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, false);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        java.lang.String str5 = cafe4.getName();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe4.getMenu();
        boolean boolean7 = coffee2.equals((java.lang.Object) recipeArray6);
        java.lang.String str8 = coffee2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=-1, decaf=false]");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1, false);
        int int3 = coffee2.getAmount();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        double double9 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str18 = water17.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water17);
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe20.printPendingOrders();
        java.lang.String str22 = cafe20.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe20.getMenu();
        cafe20.printMenu();
        boolean boolean25 = water17.equals((java.lang.Object) cafe20);
        java.lang.String str26 = water17.getName();
        boolean boolean27 = coffee2.equals((java.lang.Object) water17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Welcome to Cafe" + "'", str22, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water" + "'", str26, "Water");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0, false);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        boolean boolean6 = coffee2.equals((java.lang.Object) cafe5);
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe5.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe5.removeRecipe("Milk [unit=ML, amount=35, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=0, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=0, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(order7);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to hi!", (int) (short) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Milk [unit=ML, amount=32, type=ALMOND]", "Order: ; For: Coffee [unit=GR, amount=30, decaf=false]; Paid: 0.0", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe0.getMenu();
        java.lang.String str6 = cafe0.greeting();
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Cafe" + "'", str6, "Welcome to Cafe");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", (int) ' ', (int) (byte) 1);
        cafe3.printMenu();
        cafe3.printMenu();
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4', size6, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size6, 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: ; Paid: 10.0", (double) 1L, size6, (int) (short) 1);
        double double13 = recipe12.getPrice();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        boolean boolean10 = recipe8.equals((java.lang.Object) 10.0f);
        boolean boolean11 = cafe0.addRecipe(recipe8);
        java.lang.String str12 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Order: Water [unit=ML, amount=30]; For: Welcome to Cafe; Paid: 0.0", "Welcome to Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: ; For: Welcome to Cafe; Paid: 10.0]; Paid: 10.0", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Welcome to Cafe" + "'", str12, "Welcome to Cafe");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Water; Paid: 1.0");
        java.lang.String str2 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        java.lang.String str4 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=hi!]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str2, "Order: ; For: Water; Paid: 1.0");
        org.junit.Assert.assertNull(order3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Order: ; For: Water; Paid: 1.0" + "'", str4, "Order: ; For: Water; Paid: 1.0");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ', type1);
        java.lang.String str3 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10, size6, (int) (short) 10);
        double double9 = recipe8.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Welcome to Cafe", (double) 10);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (short) 10, "Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water17 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str18 = water17.toString();
        recipe8.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water17);
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe20.printPendingOrders();
        java.lang.String str22 = cafe20.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray23 = cafe20.getMenu();
        cafe20.printMenu();
        boolean boolean25 = water17.equals((java.lang.Object) cafe20);
        java.lang.String str26 = water17.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe29 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=30]", (double) 1.0f);
        boolean boolean30 = water17.equals((java.lang.Object) 1.0f);
        uk.ac.sheffield.com1003.cafe.Cafe cafe32 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray33 = cafe32.getMenu();
        boolean boolean34 = water17.equals((java.lang.Object) recipeArray33);
        boolean boolean35 = milk2.equals((java.lang.Object) boolean34);
        java.lang.String str36 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk" + "'", str3, "Milk");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Water [unit=ML, amount=30]" + "'", str18, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Welcome to Cafe" + "'", str22, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Water" + "'", str26, "Water");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(recipeArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Milk [unit=ML, amount=32, type=ALMOND]" + "'", str36, "Milk [unit=ML, amount=32, type=ALMOND]");
    }
}

