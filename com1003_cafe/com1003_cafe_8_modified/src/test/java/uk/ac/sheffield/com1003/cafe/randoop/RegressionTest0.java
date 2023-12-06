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
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type0 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type0.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit0 = uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit0.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit0 = uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR;
        org.junit.Assert.assertTrue("'" + unit0 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit0.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.String str1 = recipeNotFoundException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup", (double) (short) -1, size2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe0.placeOrder("Syrup", "Coffee [unit=GR, amount=1, decaf=false]", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = cafe0.placeOrder("Syrup", "Water [unit=ML, amount=30]", (double) 'a');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) 0L, size2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.String str2 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = order3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.String str1 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=]", "Milk [unit=ML, amount=1, type=SEMI]", (double) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        java.lang.String str5 = milk2.getName();
        java.lang.Class<?> wildcardClass6 = milk2.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.String str2 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str2, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe0.placeOrder("hi!", "Syrup", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Milk [unit=ML, amount=0, type=SEMI]", "Milk [unit=ML, amount=32, type=WHOLE]", (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.String str6 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 10, size2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.String str8 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        java.lang.String str11 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0", "Water [unit=ML, amount=10]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Coffee [unit=GR, amount=100, decaf=false]", "Syrup [unit=ML, amount=10, flavour=]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean12 = recipe2.equals((java.lang.Object) 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
        java.lang.String str23 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str23, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
        java.time.LocalDateTime localDateTime4 = order3.getOrderServed();
        java.time.LocalDateTime localDateTime5 = order3.getOrderServed();
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        java.lang.String str14 = recipeNotFoundException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Water [unit=ML, amount=30]", "", (double) ' ');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", "Water [unit=ML, amount=10]", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee4 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee4.getUnit();
        java.lang.String str6 = coffee4.toString();
        java.lang.String str7 = coffee4.toString();
        int int8 = coffee4.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit11 = milk10.getUnit();
        boolean boolean12 = coffee4.equals((java.lang.Object) unit11);
        boolean boolean13 = coffee2.equals((java.lang.Object) unit11);
        boolean boolean14 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + unit11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("", (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Coffee [unit=GR, amount=8, decaf=false]", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 100L);
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((-1));
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) boolean12);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", "Coffee [unit=GR, amount=10, decaf=false]", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=1, decaf=true]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.String str8 = recipeNotFoundException6.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printPendingOrders();
        int int5 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Milk [unit=ML, amount=100, type=WHOLE]", "hi!", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe13, "Water [unit=ML, amount=52]", (double) (short) 100, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        order22.serve();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.Throwable[] throwableArray6 = tooManyIngredientsException0.getSuppressed();
        java.lang.String str7 = tooManyIngredientsException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water3 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean5 = water3.equals((java.lang.Object) type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(10, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        java.lang.String str3 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Water [unit=ML, amount=-1]", "Cafe", (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean47 = cafe0.placeOrder("Coffee", "Milk [unit=ML, amount=1, type=SEMI]", (double) 100);
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
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        order5.printReceipt();
        java.time.LocalDateTime localDateTime7 = order5.getOrderServed();
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean9 = cafe0.addRecipe(recipe5);
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: ; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
        int int23 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
        java.lang.String str11 = recipeNotFoundException8.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str11, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        java.lang.Class<?> wildcardClass12 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.String str6 = recipeNotFoundException3.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str6, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("", "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: ; For: ; Paid: 100.0", "Coffee [unit=GR, amount=8, decaf=false]", (double) 100L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=97, decaf=false]");
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
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(0);
        boolean boolean2 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        java.lang.Throwable[] throwableArray17 = tooManyIngredientsException8.getSuppressed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        java.lang.Throwable[] throwableArray5 = recipeNotFoundException3.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        java.lang.String str7 = recipeNotFoundException3.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str7, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=8, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.String str9 = recipeNotFoundException5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str9, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        java.lang.Throwable[] throwableArray8 = tooManyIngredientsException6.getSuppressed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        java.lang.String str10 = milk8.toString();
        int int11 = milk8.getAmount();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str10, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Milk [unit=ML, amount=32, type=WHOLE]", "Order: ; For: ; Paid: 100.0", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
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
        java.lang.String str22 = coffee18.toString();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee" + "'", str20, "Coffee");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str22, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Cafe", (double) 52);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=52, type=ALMOND]", (double) (short) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str12 = order11.toString();
        java.time.LocalDateTime localDateTime13 = order11.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0" + "'", str12, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        int int3 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
        java.lang.Throwable throwable19 = null;
        // The following exception was thrown during execution in test generation
        try {
            recipeNotFoundException5.addSuppressed(throwable19);
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
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException0.getSuppressed();
        java.lang.String str10 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.String str24 = recipe12.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNull(order12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=52]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=false]", (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertNotNull(orderArray12);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray21 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (double) '4');
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
        org.junit.Assert.assertNotNull(recipeArray21);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Coffee [unit=GR, amount=100, decaf=true]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        java.lang.String str8 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10, false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk2.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str13 = order12.toString();
        order12.printReceipt();
        java.time.LocalDateTime localDateTime15 = order12.getOrderServed();
        order12.printReceipt();
        boolean boolean17 = milk2.equals((java.lang.Object) order12);
        java.time.LocalDateTime localDateTime18 = order12.getOrderServed();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        java.lang.Class<?> wildcardClass16 = milk13.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        java.lang.String str4 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Welcome to Cafe" + "'", str4, "Welcome to Welcome to Cafe");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Coffee [unit=GR, amount=35, decaf=false]", "Water [unit=ML, amount=52]", (double) (-1L));
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
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        java.lang.String str3 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order10.serve();
        boolean boolean12 = water1.equals((java.lang.Object) order10);
        order10.serve();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=52]" + "'", str3, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size6, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) (-1L), size6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Milk [unit=ML, amount=-1, type=SOY]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0", (-1.0d));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.lang.String str7 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        java.lang.String str2 = water0.toString();
        java.lang.String str3 = water0.toString();
        java.lang.String str4 = water0.toString();
        java.lang.String str5 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=30]" + "'", str2, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Water [unit=ML, amount=30]" + "'", str5, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) 1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water5 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str6 = water5.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean14 = water5.equals((java.lang.Object) recipe9);
        boolean boolean15 = water1.equals((java.lang.Object) water5);
        java.lang.Class<?> wildcardClass16 = water5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=52]" + "'", str6, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        java.lang.String str17 = cafe3.getName();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.String str12 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str7 = order6.toString();
        java.lang.String str8 = order6.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str7, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str8, "Order: ; For: ; Paid: 100.0");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]", (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 10);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
            cafe7.removeRecipe("Coffee [unit=GR, amount=0, decaf=false]");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        int int2 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", "Syrup [unit=ML, amount=10, flavour=]", (double) '4');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (short) 100);
        java.lang.Class<?> wildcardClass11 = order10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order11.printReceipt();
        java.time.LocalDateTime localDateTime13 = order11.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Water [unit=ML, amount=52]", (double) 100.0f, size4, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=97, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee0.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe3.getMenu();
        int int14 = cafe3.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order15 = cafe3.serveOrder();
        boolean boolean16 = coffee0.equals((java.lang.Object) order15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = recipe3.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        boolean boolean5 = coffee1.equals((java.lang.Object) cafe3);
        java.lang.String str6 = coffee1.toString();
        boolean boolean7 = coffee1.getDecaf();
        boolean boolean8 = coffee1.getDecaf();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str6, "Coffee [unit=GR, amount=100, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printMenu();
        int int2 = cafe0.getIndexNextOrderToServe();
        java.lang.Class<?> wildcardClass3 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("Milk [unit=ML, amount=0, type=ALMOND]", "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=100, decaf=true]", (double) (byte) -1);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str2 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.String str30 = recipeNotFoundException19.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str30, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.String str23 = recipeNotFoundException10.toString();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str23, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        java.lang.Class<?> wildcardClass7 = cafe1.getClass();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray8 = tooManyIngredientsException0.getSuppressed();
        java.lang.Class<?> wildcardClass9 = throwableArray8.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        int int5 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("", "Syrup", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        java.lang.String str3 = milk2.toString();
        int int4 = milk2.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk2.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.lang.String str13 = order12.toString();
        order12.printReceipt();
        java.time.LocalDateTime localDateTime15 = order12.getOrderServed();
        order12.printReceipt();
        boolean boolean17 = milk2.equals((java.lang.Object) order12);
        java.lang.Class<?> wildcardClass18 = order12.getClass();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        int int5 = cafe3.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe3.placeOrder("Milk [unit=ML, amount=52, type=ALMOND]", "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        int int2 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Milk [unit=ML, amount=100, type=WHOLE]", "Plain", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (-1.0d));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe3.getOrders();
        java.lang.String str13 = cafe3.greeting();
        boolean boolean14 = water1.equals((java.lang.Object) str13);
        java.lang.String str15 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean19 = coffee18.getDecaf();
        boolean boolean20 = water1.equals((java.lang.Object) coffee18);
        java.lang.String str21 = coffee18.toString();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=52]" + "'", str15, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=10, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=10, decaf=false]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", "Milk [unit=ML, amount=100, type=WHOLE]", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Coffee");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Water [unit=ML, amount=30]" + "'", str3, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        java.lang.Class<?> wildcardClass11 = order10.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = cafe0.placeOrder("Water [unit=ML, amount=-1]", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        int int4 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Milk [unit=ML, amount=1, type=SEMI]", "Water [unit=ML, amount=10]", (double) 10L);
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", "Water [unit=ML, amount=30]", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=52]]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        java.lang.Class<?> wildcardClass26 = recipe15.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(52, false);
        java.lang.Class<?> wildcardClass3 = coffee2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str2 = coffee1.toString();
        java.lang.Class<?> wildcardClass3 = coffee1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=97, decaf=false]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = null;
        boolean boolean4 = cafe1.addRecipe(recipe3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        java.lang.Class<?> wildcardClass19 = recipe13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 0);
        int int2 = milk1.getAmount();
        java.lang.String str3 = milk1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=0, type=WHOLE]");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
        int int23 = cafe0.getIndexNextOrderToPlace();
        java.lang.Class<?> wildcardClass24 = cafe0.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(orderArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Welcome to Cafe" + "'", str11, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean6 = water4.equals((java.lang.Object) type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '#', type5);
        boolean boolean9 = coffee1.equals((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass10 = coffee1.getClass();
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        java.lang.String str4 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Cafe", "Coffee [unit=GR, amount=10, decaf=false]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        java.lang.String str37 = recipeNotFoundException0.toString();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str37, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean10 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Cafe", (double) (-1L));
        order13.serve();
        java.lang.String str15 = order13.toString();
        order13.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: ; For: Cafe; Paid: -1.0" + "'", str15, "Order: ; For: Cafe; Paid: -1.0");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", "Water [unit=ML, amount=-1]", (double) 100L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order11.serve();
        boolean boolean13 = coffee1.equals((java.lang.Object) order11);
        order11.serve();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Plain");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException0 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        java.lang.String str1 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str1, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException1.getSuppressed();
        java.lang.String str15 = recipeNotFoundException1.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str15, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to ");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int2 = cafe1.getIndexNextOrderToServe();
        int int3 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Welcome to ", "Welcome to Water [unit=ML, amount=30]", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) -1);
        boolean boolean3 = water1.equals((java.lang.Object) "Welcome to Cafe");
        boolean boolean5 = water1.equals((java.lang.Object) "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
        java.lang.String str16 = order11.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str3, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str16, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup0 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup();
        java.lang.String str1 = syrup0.getFlavour();
        java.lang.String str2 = syrup0.getName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Plain" + "'", str1, "Plain");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException6.getSuppressed();
        java.lang.String str35 = tooManyIngredientsException6.toString();
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
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str35, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order3 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "", 0.0d);
        java.time.LocalDateTime localDateTime4 = order3.getOrderServed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = order3.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        int int25 = syrup1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        uk.ac.sheffield.com1003.cafe.Cafe cafe26 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe26.printMenu();
        boolean boolean28 = coffee7.equals((java.lang.Object) cafe26);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Plain");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Syrup", "Coffee [unit=GR, amount=100, decaf=false]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Cafe");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        int int5 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe1.getOrders();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Order: ; For: ; Paid: 100.0", "Coffee [unit=GR, amount=97, decaf=false]", (double) 8);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printMenu();
        int int2 = cafe0.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
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
        boolean boolean22 = cafe4.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order25 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 1);
        java.lang.Class<?> wildcardClass26 = order25.getClass();
        boolean boolean27 = recipe2.equals((java.lang.Object) order25);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        cafe3.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe3.getOrders();
        int int6 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
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
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        java.lang.Class<?> wildcardClass21 = recipeNotFoundException5.getClass();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order5 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", "Coffee [unit=GR, amount=100, decaf=false]", (double) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to " + "'", str3, "Welcome to ");
        org.junit.Assert.assertNull(order5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        cafe7.printMenu();
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water1.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str7 = milk6.toString();
        boolean boolean8 = water1.equals((java.lang.Object) str7);
        java.lang.String str9 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=10]" + "'", str2, "Water [unit=ML, amount=10]");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Water [unit=ML, amount=10]" + "'", str9, "Water [unit=ML, amount=10]");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0", "Coffee", (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.String str15 = coffee7.getName();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee" + "'", str15, "Coffee");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        double double17 = recipe4.getPrice();
        boolean boolean18 = recipe4.isReady();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Cafe" + "'", str14, "Cafe");
        org.junit.Assert.assertNull(order15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", "Order: ; For: Cafe; Paid: -1.0", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        int int2 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = order3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Plain");
        java.lang.Class<?> wildcardClass2 = cafe1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        java.lang.Class<?> wildcardClass4 = cafe1.getClass();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        int int5 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Coffee", "", 32.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        java.lang.Class<?> wildcardClass4 = cafe0.getClass();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water2 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean4 = water2.equals((java.lang.Object) type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 10, type3);
        java.lang.String str7 = milk6.toString();
        java.lang.String str8 = milk6.getName();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Milk" + "'", str8, "Milk");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        java.lang.String str7 = order6.toString();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str2 = syrup1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 100);
        java.lang.String str7 = order6.toString();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        java.lang.Object obj5 = null;
        boolean boolean6 = milk1.equals(obj5);
        java.lang.String str7 = milk1.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str7, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        uk.ac.sheffield.com1003.cafe.Order order43 = cafe0.serveOrder();
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
        org.junit.Assert.assertNull(order43);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean11 = recipe2.isReady();
        java.lang.Object obj12 = null;
        boolean boolean13 = recipe2.equals(obj12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Coffee [unit=GR, amount=1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        java.lang.String str52 = recipeNotFoundException27.toString();
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
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str52, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        boolean boolean4 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee1.getUnit();
        boolean boolean6 = coffee1.getDecaf();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        java.lang.Class<?> wildcardClass16 = order15.getClass();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str2, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=0, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int3 = coffee2.getAmount();
        boolean boolean4 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=SOY]", (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray13 = cafe0.getMenu();
        java.lang.Class<?> wildcardClass14 = recipeArray13.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertNotNull(recipeArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=-1, type=SOY]");
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
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Water [unit=ML, amount=30]", (double) (short) -1, "Milk [unit=ML, amount=32, type=WHOLE]");
        order15.serve();
        order15.serve();
        order15.printReceipt();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.String str25 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str25, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException19.getSuppressed();
        java.lang.String str24 = recipeNotFoundException19.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str24, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        uk.ac.sheffield.com1003.cafe.Recipe recipe0 = null;
        uk.ac.sheffield.com1003.cafe.Order order4 = new uk.ac.sheffield.com1003.cafe.Order(recipe0, "Milk [unit=ML, amount=1, type=WHOLE]", (double) 10, "Milk [unit=ML, amount=32, type=WHOLE]");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        java.lang.String str30 = recipeNotFoundException6.toString();
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = water1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Coffee [unit=GR, amount=1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        java.lang.String str5 = cafe1.greeting();
        java.lang.String str6 = cafe1.getName();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray7 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]", "Welcome to Coffee", 0.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Cafe" + "'", str6, "Cafe");
        org.junit.Assert.assertNotNull(orderArray7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (byte) -1, size2, (int) (byte) 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.getName();
        java.lang.String str5 = syrup1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup1.getUnit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size8 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size8, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size8, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) (byte) 10, size8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) (short) -1, size8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size8 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size8.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        java.lang.String str5 = milk4.toString();
        java.lang.String str6 = milk4.toString();
        java.lang.Class<?> wildcardClass7 = milk4.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str6, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size6, (int) '#');
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=1, type=SEMI]", (double) 10, size6, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = recipe12.getClass();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 1, 0);
        int int4 = cafe3.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Water [unit=ML, amount=10]", "Milk [unit=ML, amount=100, type=SOY]", 32.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = cafe0.placeOrder("Plain", "Welcome to Milk [unit=ML, amount=100, type=WHOLE]", (double) '#');
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
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = coffee1.getUnit();
        java.lang.String str3 = coffee1.toString();
        int int4 = coffee1.getAmount();
        boolean boolean5 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Cafe", (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe10, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type16 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type16);
        java.lang.String str18 = milk17.toString();
        recipe10.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk17);
        java.lang.String str21 = recipe2.getName();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str18, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, true);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe7.serveOrder();
        int int9 = cafe7.getIndexNextOrderToPlace();
        boolean boolean10 = coffee2.equals((java.lang.Object) int9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=100, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=100, decaf=true]");
        org.junit.Assert.assertNull(order8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.String str53 = recipeNotFoundException27.toString();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str53, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        java.lang.String str3 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = coffee2.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = coffee2.getUnit();
        int int6 = coffee2.getAmount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
        boolean boolean16 = coffee7.equals((java.lang.Object) "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        boolean boolean17 = coffee7.getDecaf();
        java.lang.Class<?> wildcardClass18 = coffee7.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.String str17 = tooManyIngredientsException8.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str17, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("hi!");
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
        org.junit.Assert.assertNotNull(recipeArray24);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.Class<?> wildcardClass25 = type20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe14, "Milk [unit=ML, amount=1, type=SEMI]", (double) 100.0f);
        order23.printReceipt();
        order23.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        java.lang.String str9 = cafe0.greeting();
        uk.ac.sheffield.com1003.cafe.Order order10 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order11 = cafe0.serveOrder();
        int int12 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = cafe0.placeOrder("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", "Milk [unit=ML, amount=10, type=ALMOND]", 32.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNull(order10);
        org.junit.Assert.assertNull(order11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        java.lang.Class<?> wildcardClass51 = recipe49.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean16 = cafe3.addRecipe(recipe7);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "Syrup", (double) 0, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException21 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray22 = recipeNotFoundException21.getSuppressed();
        java.lang.Throwable[] throwableArray23 = recipeNotFoundException21.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) tooManyIngredientsException24);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException33 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException33.getSuppressed();
        java.lang.Throwable[] throwableArray35 = recipeNotFoundException33.getSuppressed();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException33.getSuppressed();
        recipeNotFoundException21.addSuppressed((java.lang.Throwable) recipeNotFoundException33);
        boolean boolean38 = recipe7.equals((java.lang.Object) recipeNotFoundException21);
        java.lang.String str39 = recipeNotFoundException21.toString();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(throwableArray22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray25);
        org.junit.Assert.assertNotNull(throwableArray26);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str39, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean8 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Water water10 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type11 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean12 = water10.equals((java.lang.Object) type11);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type11);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        boolean boolean15 = milk1.equals((java.lang.Object) milk13);
        java.lang.String str16 = milk13.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk" + "'", str16, "Milk");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        order13.serve();
        order13.serve();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=1, type=WHOLE]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=1, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=1, type=WHOLE]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size6, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size6, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size6, (int) 'a');
        boolean boolean13 = recipe12.isReady();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", (double) 100);
        order28.serve();
        java.lang.String str30 = order28.toString();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; Paid: 100.0" + "'", str30, "Order: ; For: Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]; Paid: 100.0");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", (double) 100L);
        boolean boolean3 = recipe2.isReady();
        java.lang.Class<?> wildcardClass4 = recipe2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit22 = milk9.getUnit();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Welcome to Cafe" + "'", str18, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Welcome to Cafe" + "'", str19, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str21, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit22 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit22.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit13 = coffee12.getUnit();
        boolean boolean14 = recipe2.equals((java.lang.Object) unit13);
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 1, "Coffee [unit=GR, amount=1, decaf=true]");
        java.lang.String str19 = order18.toString();
        org.junit.Assert.assertTrue("'" + unit13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0" + "'", str19, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 1.0");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.lang.String str31 = recipe17.getName();
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(order25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Welcome to Cafe" + "'", str26, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Cafe" + "'", str27, "Cafe");
        org.junit.Assert.assertNull(order28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("hi!", 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=1, decaf=false]");
        cafe1.printPendingOrders();
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit5 = milk4.getUnit();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + unit5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", (double) '4', size2, 1);
        java.lang.String str5 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0" + "'", str5, "Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        java.lang.String str41 = recipeNotFoundException0.toString();
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 32);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        java.lang.String str2 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = water1.equals((java.lang.Object) recipe5);
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Coffee [unit=GR, amount=100, decaf=false]", (double) 100L);
        order13.serve();
        java.lang.String str15 = order13.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=52]" + "'", str2, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 100.0");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe7, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        java.lang.String str12 = order11.toString();
        boolean boolean13 = milk1.equals((java.lang.Object) order11);
        java.lang.String str14 = order11.toString();
        java.time.LocalDateTime localDateTime15 = order11.getOrderServed();
        order11.serve();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str12, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str14, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0);
        java.lang.String str2 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        boolean boolean5 = milk1.equals((java.lang.Object) "Coffee");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=0, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=0, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe1.placeOrder("Order: ; For: Cafe; Paid: -1.0", "Plain", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order9.printReceipt();
        java.time.LocalDateTime localDateTime11 = order9.getOrderServed();
        java.time.LocalDateTime localDateTime12 = order9.getOrderServed();
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        int int47 = cafe0.getIndexNextOrderToPlace();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk17 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100);
        boolean boolean18 = recipe4.equals((java.lang.Object) milk17);
        java.lang.String str19 = milk17.toString();
        java.lang.String str20 = milk17.toString();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str19, "Milk [unit=ML, amount=100, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Milk [unit=ML, amount=100, type=WHOLE]" + "'", str20, "Milk [unit=ML, amount=100, type=WHOLE]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str10 = order9.toString();
        java.lang.Class<?> wildcardClass11 = order9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        boolean boolean16 = coffee7.equals((java.lang.Object) "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0");
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order23.serve();
        java.lang.String str25 = order23.toString();
        java.time.LocalDateTime localDateTime26 = order23.getOrderServed();
        boolean boolean27 = coffee7.equals((java.lang.Object) localDateTime26);
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=0, type=SEMI]" + "'", str5, "Milk [unit=ML, amount=0, type=SEMI]");
        org.junit.Assert.assertTrue("'" + unit8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str10, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str25, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1);
        boolean boolean2 = coffee1.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        java.lang.String str3 = cafe1.getName();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe1.getOrders();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=WHOLE]");
        java.lang.Class<?> wildcardClass2 = cafe1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) '#');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", "Order: ; For: Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]; Paid: 10.0", (double) 10);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Cafe; Paid: -1.0");
        java.lang.Class<?> wildcardClass2 = syrup1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.Class<?> wildcardClass18 = water0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee17 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#');
        java.lang.String str18 = coffee17.toString();
        java.lang.String str19 = coffee17.toString();
        boolean boolean20 = milk13.equals((java.lang.Object) coffee17);
        java.lang.String str21 = coffee17.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str14, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str19, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=35, decaf=false]");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size4, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Cafe", (double) (short) -1, size4, (int) '#');
        java.lang.String str9 = recipe8.getName();
        java.lang.Class<?> wildcardClass10 = recipe8.getClass();
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Welcome to Cafe" + "'", str9, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk3 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type2);
        boolean boolean6 = milk4.equals((java.lang.Object) 100.0f);
        int int7 = milk4.getAmount();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray1 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe0.serveOrder();
        java.lang.String str3 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray1);
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Milk [unit=ML, amount=100, type=WHOLE]", "Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        int int5 = cafe0.getIndexNextOrderToPlace();
        int int6 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Welcome to Water [unit=ML, amount=30]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException2 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray3 = recipeNotFoundException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        java.lang.Throwable[] throwableArray7 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.Throwable[] throwableArray9 = recipeNotFoundException5.getSuppressed();
        java.lang.Throwable[] throwableArray10 = recipeNotFoundException5.getSuppressed();
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        java.lang.String str12 = recipeNotFoundException5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Plain", (double) 1.0f, size2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = size2.getClass();
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.LARGE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        java.lang.String str5 = milk4.toString();
        java.lang.String str6 = milk4.toString();
        java.lang.String str7 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str6, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str7, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        boolean boolean8 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean13 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order19 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) '4');
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        java.lang.String str8 = order6.toString();
        java.lang.Class<?> wildcardClass9 = order6.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: ; For: ; Paid: 100.0" + "'", str8, "Order: ; For: ; Paid: 100.0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        java.lang.String str20 = tooManyIngredientsException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str20, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = milk1.getUnit();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type6 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type6);
        boolean boolean8 = milk1.equals((java.lang.Object) milk7);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup10 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit11 = syrup10.getUnit();
        boolean boolean12 = milk1.equals((java.lang.Object) syrup10);
        java.lang.Class<?> wildcardClass13 = milk1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + type6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + unit11 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit11.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean10 = coffee1.equals((java.lang.Object) "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str13 = syrup12.toString();
        boolean boolean14 = coffee1.equals((java.lang.Object) str13);
        java.lang.String str15 = coffee1.toString();
        int int16 = coffee1.getAmount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str13, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order3 = cafe1.serveOrder();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNull(order3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(32, false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Coffee [unit=GR, amount=0, decaf=false]");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cafe" + "'", str21, "Cafe");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        int int20 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", "Coffee [unit=GR, amount=1, decaf=true]", 97.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        java.lang.String str54 = recipeNotFoundException31.toString();
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
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str54, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Welcome to Cafe; For: Water; Paid: 0.0", (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.String str12 = recipeNotFoundException0.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup6 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        java.lang.String str7 = syrup6.getFlavour();
        java.lang.String str8 = syrup6.toString();
        boolean boolean9 = milk2.equals((java.lang.Object) str8);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0" + "'", str7, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        int int24 = cafe0.getIndexNextOrderToPlace();
        java.lang.String str25 = cafe0.greeting();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str21, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Welcome to Cafe" + "'", str23, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Welcome to Cafe" + "'", str25, "Welcome to Cafe");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        java.lang.String str2 = milk1.toString();
        java.lang.String str3 = milk1.toString();
        java.lang.String str4 = milk1.toString();
        java.lang.String str5 = milk1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee8 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str9 = coffee8.toString();
        java.lang.String str10 = coffee8.getName();
        boolean boolean11 = milk1.equals((java.lang.Object) coffee8);
        uk.ac.sheffield.com1003.cafe.Cafe cafe15 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=-1]", (int) 'a', 100);
        java.lang.String str16 = cafe15.getName();
        boolean boolean17 = milk1.equals((java.lang.Object) str16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str2, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str4, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str9, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Coffee" + "'", str10, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str16, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) ' ', false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.String str14 = cafeOutOfCapacityException0.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException" + "'", str14, "uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order6.serve();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        java.lang.String str49 = water1.toString();
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
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Water [unit=ML, amount=97]" + "'", str49, "Water [unit=ML, amount=97]");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0", (double) 100.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int6 = coffee5.getAmount();
        java.lang.String str7 = coffee5.toString();
        java.lang.String str8 = coffee5.toString();
        boolean boolean9 = recipe2.equals((java.lang.Object) str8);
        double double10 = recipe2.getPrice();
        java.lang.Class<?> wildcardClass11 = recipe2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str7, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str8, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size10 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size10, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe14 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size10, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe16 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) (short) 1, size10, (int) 'a');
        uk.ac.sheffield.com1003.cafe.Recipe recipe18 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) 100L, size10, 52);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe20 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]", (double) (short) 10, size10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size10 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size10.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean3 = coffee2.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1, true);
        int int7 = coffee6.getAmount();
        boolean boolean8 = coffee2.equals((java.lang.Object) int7);
        java.lang.String str9 = coffee2.getName();
        boolean boolean10 = coffee2.getDecaf();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Coffee" + "'", str9, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        int int24 = cafe1.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order25 = cafe1.serveOrder();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertNotNull(orderArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(order25);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        java.lang.String str25 = recipeNotFoundException2.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str25, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        boolean boolean4 = milk1.equals((java.lang.Object) cafe3);
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (byte) 10);
        boolean boolean8 = cafe3.addRecipe(recipe7);
        cafe3.printPendingOrders();
        int int10 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) '4');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit2 = water1.getUnit();
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe3.getOrders();
        java.lang.String str13 = cafe3.greeting();
        boolean boolean14 = water1.equals((java.lang.Object) str13);
        java.lang.String str15 = water1.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee18 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean19 = coffee18.getDecaf();
        boolean boolean20 = water1.equals((java.lang.Object) coffee18);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee22 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#');
        java.lang.String str23 = coffee22.toString();
        java.lang.String str24 = coffee22.toString();
        boolean boolean25 = coffee18.equals((java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + unit2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(orderArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Welcome to Cafe" + "'", str13, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Water [unit=ML, amount=52]" + "'", str15, "Water [unit=ML, amount=52]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str23, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=35, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        java.time.LocalDateTime localDateTime7 = order6.getOrderServed();
        order6.printReceipt();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        org.junit.Assert.assertNull(localDateTime7);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        java.lang.String str3 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Coffee" + "'", str3, "Welcome to Coffee");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.getFlavour();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.toString();
        java.lang.String str6 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        boolean boolean1 = coffee0.getDecaf();
        java.lang.String str2 = coffee0.toString();
        java.lang.String str3 = coffee0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=8, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = cafe1.placeOrder("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) 0);
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
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        double double26 = recipe6.getPrice();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str19, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str24, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) (short) 100, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        order6.serve();
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Water [unit=ML, amount=-1]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Syrup", "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean8 = recipe4.isReady();
        double double9 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]", (double) 10L, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        order13.serve();
        boolean boolean15 = water1.equals((java.lang.Object) order13);
        order13.serve();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        int int4 = cafe3.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe3.placeOrder("Water [unit=ML, amount=30]", "Coffee [unit=GR, amount=1, decaf=false]", (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) 0);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", (double) 100);
        order6.printReceipt();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        int int3 = cafe1.getIndexNextOrderToServe();
        cafe1.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Syrup", "", (double) '4');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee]");
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
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        order10.serve();
        order10.printReceipt();
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Water [unit=ML, amount=30]");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Water [unit=ML, amount=30]" + "'", str4, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.Throwable[] throwableArray14 = recipeNotFoundException11.getSuppressed();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        java.lang.String str22 = cafe0.getName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Welcome to Cafe" + "'", str20, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Cafe" + "'", str21, "Cafe");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Cafe" + "'", str22, "Cafe");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        int int9 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str5, "Welcome to Water [unit=ML, amount=30]");
        org.junit.Assert.assertNotNull(recipeArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(recipeArray10);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(52);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        java.time.LocalDateTime localDateTime45 = order44.getOrderServed();
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
        org.junit.Assert.assertNull(localDateTime45);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.getName();
        java.lang.String str4 = syrup1.getName();
        java.lang.String str5 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup" + "'", str3, "Syrup");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=true]", (double) 10.0f);
        double double3 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup5 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit6 = syrup5.getUnit();
        java.lang.String str7 = syrup5.toString();
        java.lang.String str8 = syrup5.toString();
        java.lang.String str9 = syrup5.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit10 = syrup5.getUnit();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup5);
        java.lang.String str12 = syrup5.getFlavour();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit6 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit6.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str8, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertTrue("'" + unit10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        java.time.LocalDateTime localDateTime17 = order16.getOrderServed();
        java.lang.String str18 = order16.toString();
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0" + "'", str18, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Water [unit=ML, amount=30]", (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean2 = water0.equals((java.lang.Object) type1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = water0.getUnit();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        int int24 = cafe1.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(32, type3);
        uk.ac.sheffield.com1003.cafe.Recipe recipe9 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order13 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean14 = recipe9.isReady();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Water [unit=ML, amount=30]", (double) (byte) 10, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        uk.ac.sheffield.com1003.cafe.Order order22 = new uk.ac.sheffield.com1003.cafe.Order(recipe9, "Welcome to Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]", (double) 10, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        boolean boolean23 = milk6.equals((java.lang.Object) "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0");
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
        java.lang.Class<?> wildcardClass15 = cafeOutOfCapacityException0.getClass();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", "Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=]; Paid: 52.0", (double) 'a');
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.String str19 = recipeNotFoundException5.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str19, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException32 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray33 = tooManyIngredientsException32.getSuppressed();
        java.lang.Throwable[] throwableArray34 = tooManyIngredientsException32.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException35 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray36 = recipeNotFoundException35.getSuppressed();
        tooManyIngredientsException32.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        recipeNotFoundException30.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException39 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray40 = tooManyIngredientsException39.getSuppressed();
        java.lang.Throwable[] throwableArray41 = tooManyIngredientsException39.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException42 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray43 = recipeNotFoundException42.getSuppressed();
        tooManyIngredientsException39.addSuppressed((java.lang.Throwable) recipeNotFoundException42);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException45 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException39.addSuppressed((java.lang.Throwable) recipeNotFoundException45);
        java.lang.Throwable[] throwableArray47 = tooManyIngredientsException39.getSuppressed();
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) tooManyIngredientsException39);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException49 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray50 = recipeNotFoundException49.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException51 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray52 = tooManyIngredientsException51.getSuppressed();
        java.lang.Throwable[] throwableArray53 = tooManyIngredientsException51.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException54 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray55 = recipeNotFoundException54.getSuppressed();
        tooManyIngredientsException51.addSuppressed((java.lang.Throwable) recipeNotFoundException54);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException57 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException51.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException57);
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
        recipeNotFoundException49.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        recipeNotFoundException35.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        recipeNotFoundException6.addSuppressed((java.lang.Throwable) recipeNotFoundException35);
        java.lang.Throwable throwable74 = null;
        // The following exception was thrown during execution in test generation
        try {
            recipeNotFoundException6.addSuppressed(throwable74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(throwableArray36);
        org.junit.Assert.assertNotNull(throwableArray40);
        org.junit.Assert.assertNotNull(throwableArray41);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNotNull(throwableArray47);
        org.junit.Assert.assertNotNull(throwableArray50);
        org.junit.Assert.assertNotNull(throwableArray52);
        org.junit.Assert.assertNotNull(throwableArray53);
        org.junit.Assert.assertNotNull(throwableArray55);
        org.junit.Assert.assertNotNull(throwableArray61);
        org.junit.Assert.assertNotNull(throwableArray63);
        org.junit.Assert.assertNotNull(throwableArray64);
        org.junit.Assert.assertNotNull(throwableArray66);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) -1, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=100, type=WHOLE]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type2 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        boolean boolean3 = water1.equals((java.lang.Object) type2);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) '4', type2);
        java.lang.Class<?> wildcardClass5 = milk4.getClass();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((-1), false);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=-1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=-1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee" + "'", str4, "Coffee");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = null;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type1);
        int int3 = milk2.getAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 10);
        int int2 = coffee1.getAmount();
        boolean boolean3 = coffee1.getDecaf();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee6 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) '#', false);
        boolean boolean7 = coffee6.getDecaf();
        boolean boolean8 = coffee1.equals((java.lang.Object) boolean7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.getFlavour();
        int int3 = syrup1.getAmount();
        java.lang.String str4 = syrup1.toString();
        java.lang.String str5 = syrup1.getFlavour();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException6 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        boolean boolean7 = syrup1.equals((java.lang.Object) tooManyIngredientsException6);
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException8 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) tooManyIngredientsException8);
        java.lang.String str10 = tooManyIngredientsException6.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str10, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=0, type=SEMI]", (int) (short) 10, 10);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe3.removeRecipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cafe0.placeOrder("hi!", "Welcome to Water [unit=ML, amount=30]", (double) (-1L));
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
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("hi!", (double) 0.0f);
        uk.ac.sheffield.com1003.cafe.ingredients.Water water4 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((-1));
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) water4);
        java.lang.String str6 = water4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str6, "Water [unit=ML, amount=-1]");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(100);
        java.lang.String str2 = water1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Water [unit=ML, amount=100]" + "'", str2, "Water [unit=ML, amount=100]");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        double double16 = recipe4.getPrice();
        boolean boolean17 = recipe4.isReady();
        java.lang.String str18 = recipe4.getName();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str18, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        order44.serve();
        java.lang.String str46 = order44.toString();
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0" + "'", str46, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        order6.serve();
        java.lang.String str8 = order6.toString();
        java.lang.String str9 = order6.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str8, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0" + "'", str9, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee");
        java.lang.String str2 = syrup1.getFlavour();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee" + "'", str2, "Coffee");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Coffee]");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        int int12 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = null;
        boolean boolean14 = cafe3.addRecipe(recipe13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = cafe3.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", "Milk [unit=ML, amount=10, type=SOY]", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (int) (short) 100, (int) (byte) 100);
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.lang.String str16 = milk4.toString();
        org.junit.Assert.assertTrue("'" + type2 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type2.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str5, "Milk [unit=ML, amount=52, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str13, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str16, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        java.lang.String str5 = cafe1.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe1.placeOrder("Water [unit=ML, amount=97]", "Milk [unit=ML, amount=1, type=WHOLE]", (double) (byte) 1);
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=]", (double) 1.0f, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order14 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=0, type=ALMOND]", (double) (byte) 100, "Water");
        java.lang.String str15 = order14.toString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0" + "'", str15, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=0, type=ALMOND]; Paid: 100.0");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        java.lang.String str2 = syrup1.toString();
        java.lang.String str3 = syrup1.toString();
        java.lang.Class<?> wildcardClass4 = syrup1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str2, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size2, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe.Size size11 = uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL;
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = new uk.ac.sheffield.com1003.cafe.Recipe("Milk [unit=ML, amount=32, type=WHOLE]", 0.0d, size11, (int) (short) 0);
        uk.ac.sheffield.com1003.cafe.Recipe recipe15 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) '4', size11, (int) (short) 10);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=35, decaf=false]]", 100.0d, size11, (int) 'a');
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee19 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) 'a');
        java.lang.String str20 = coffee19.toString();
        recipe17.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee19);
        org.junit.Assert.assertTrue("'" + size2 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size2.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
        org.junit.Assert.assertTrue("'" + size11 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL + "'", size11.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.SMALL));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Coffee [unit=GR, amount=97, decaf=false]" + "'", str20, "Coffee [unit=GR, amount=97, decaf=false]");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=-1, type=null]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Water [unit=ML, amount=100]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size6, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Water [unit=ML, amount=30]; Paid: -1.0", (double) 10, size6, (int) (short) 100);
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe12, "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 100, "Syrup [unit=ML, amount=10, flavour=Welcome to Water [unit=ML, amount=30]]");
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException5 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
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
        java.lang.Throwable[] throwableArray17 = recipeNotFoundException6.getSuppressed();
        cafeOutOfCapacityException5.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray19 = recipeNotFoundException6.getSuppressed();
        boolean boolean20 = coffee2.equals((java.lang.Object) recipeNotFoundException6);
        java.lang.String str21 = recipeNotFoundException6.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=]; Paid: 52.0");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        boolean boolean55 = coffee7.getDecaf();
        boolean boolean56 = coffee7.getDecaf();
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(100);
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        java.lang.String str12 = milk10.toString();
        boolean boolean13 = coffee1.equals((java.lang.Object) str12);
        boolean boolean14 = coffee1.getDecaf();
        java.lang.String str15 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=100, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=100, decaf=false]");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = syrup1.getUnit();
        java.lang.String str4 = syrup1.toString();
        java.lang.Class<?> wildcardClass5 = syrup1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str4, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean13 = recipe4.isReady();
        boolean boolean14 = syrup1.equals((java.lang.Object) recipe4);
        java.lang.String str15 = recipe4.getName();
        uk.ac.sheffield.com1003.cafe.Order order18 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Welcome to Water [unit=ML, amount=30]", (double) (-1L));
        order18.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str15, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.Class<?> wildcardClass23 = order22.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type13.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee" + "'", str17, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Water", (double) (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        java.lang.String str25 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Syrup" + "'", str4, "Syrup");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]" + "'", str25, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=8, decaf=false]]");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        cafe0.printPendingOrders();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        cafe3.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe3.placeOrder("Coffee [unit=GR, amount=100, decaf=false]", "Water [unit=ML, amount=97]", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        java.lang.String str8 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Order: ; For: Water [unit=ML, amount=30]; Paid: 10.0", 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        cafe1.printMenu();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Cafe" + "'", str20, "Cafe");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Welcome to Cafe" + "'", str21, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(orderArray22);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean8 = recipe2.isReady();
        java.lang.String str9 = recipe2.getName();
        java.lang.String str10 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup3 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit4 = syrup3.getUnit();
        boolean boolean5 = water1.equals((java.lang.Object) syrup3);
        java.lang.String str6 = syrup3.getName();
        java.lang.String str7 = syrup3.toString();
        java.lang.String str8 = syrup3.getFlavour();
        java.lang.String str9 = syrup3.toString();
        java.lang.String str10 = syrup3.getName();
        org.junit.Assert.assertTrue("'" + unit4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup" + "'", str6, "Syrup");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str7, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str8, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]" + "'", str9, "Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Syrup" + "'", str10, "Syrup");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean11 = cafe3.addRecipe(recipe6);
        int int12 = cafe3.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Recipe recipe13 = null;
        boolean boolean14 = cafe3.addRecipe(recipe13);
        cafe3.printPendingOrders();
        cafe3.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee [unit=GR, amount=1, decaf=false]; Paid: 1.0", (double) 32);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk8);
        boolean boolean11 = milk8.equals((java.lang.Object) (byte) 0);
        java.lang.String str12 = milk8.toString();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe20 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Recipe recipe23 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean28 = cafe20.addRecipe(recipe23);
        boolean boolean30 = recipe23.equals((java.lang.Object) 10L);
        boolean boolean31 = cafe16.addRecipe(recipe23);
        uk.ac.sheffield.com1003.cafe.Order order34 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Coffee [unit=GR, amount=100, decaf=false]", (double) (byte) 10);
        uk.ac.sheffield.com1003.cafe.Order order37 = new uk.ac.sheffield.com1003.cafe.Order(recipe23, "Welcome to uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup39 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("");
        uk.ac.sheffield.com1003.cafe.Recipe recipe42 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order46 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.Order order50 = new uk.ac.sheffield.com1003.cafe.Order(recipe42, "Coffee [unit=GR, amount=8, decaf=false]", (double) (short) 10, "hi!");
        boolean boolean51 = recipe42.isReady();
        boolean boolean52 = syrup39.equals((java.lang.Object) recipe42);
        double double53 = recipe42.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee56 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(10, false);
        boolean boolean57 = coffee56.getDecaf();
        java.lang.String str58 = coffee56.getName();
        recipe42.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee56);
        uk.ac.sheffield.com1003.cafe.Recipe recipe62 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order66 = new uk.ac.sheffield.com1003.cafe.Order(recipe62, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order70 = new uk.ac.sheffield.com1003.cafe.Order(recipe62, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) '4', "Milk [unit=ML, amount=32, type=WHOLE]");
        boolean boolean71 = coffee56.equals((java.lang.Object) '4');
        recipe23.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee56);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit73 = coffee56.getUnit();
        boolean boolean74 = milk8.equals((java.lang.Object) unit73);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str12, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Coffee" + "'", str58, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + unit73 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit73.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=0, type=ALMOND]");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException24 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray25 = tooManyIngredientsException24.getSuppressed();
        java.lang.Throwable[] throwableArray26 = tooManyIngredientsException24.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException27 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray28 = recipeNotFoundException27.getSuppressed();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException27);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException30 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException24.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray32 = recipeNotFoundException30.getSuppressed();
        tooManyIngredientsException6.addSuppressed((java.lang.Throwable) recipeNotFoundException30);
        java.lang.Throwable[] throwableArray34 = recipeNotFoundException30.getSuppressed();
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
        org.junit.Assert.assertNotNull(throwableArray32);
        org.junit.Assert.assertNotNull(throwableArray34);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        int int2 = cafe0.getIndexNextOrderToPlace();
        cafe0.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe0.placeOrder("Syrup", "Syrup", (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order order8 = cafe3.serveOrder();
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertNull(order8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=10]", 100, (int) (short) 1);
        int int4 = cafe3.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int10 = cafe9.getIndexNextOrderToServe();
        int int11 = cafe9.getIndexNextOrderToServe();
        java.lang.String str12 = cafe9.getName();
        boolean boolean13 = recipe2.equals((java.lang.Object) cafe9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = cafe9.placeOrder("hi!", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) (-1));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
            cafe3.removeRecipe("Coffee [unit=GR, amount=8, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Milk [unit=ML, amount=32, type=ALMOND]");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", 0.0d);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("", "", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type1);
        java.lang.String str3 = milk2.toString();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee5 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) -1);
        boolean boolean6 = milk2.equals((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=0, type=ALMOND]" + "'", str3, "Milk [unit=ML, amount=0, type=ALMOND]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee1 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        java.lang.String str2 = coffee1.toString();
        java.lang.String str3 = coffee1.toString();
        int int4 = coffee1.getAmount();
        java.lang.String str5 = coffee1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str5, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray11 = cafe0.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray12 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Cafe; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertNotNull(recipeArray11);
        org.junit.Assert.assertNotNull(orderArray12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk1 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean9 = milk1.equals((java.lang.Object) recipe4);
        boolean boolean10 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup12 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Water [unit=ML, amount=30]");
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) syrup12);
        java.lang.String str14 = syrup12.getFlavour();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str14, "Welcome to Water [unit=ML, amount=30]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.getName();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        java.lang.String str8 = cafe3.greeting();
        int int9 = cafe3.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = cafe3.placeOrder("Syrup [unit=ML, amount=10, flavour=Coffee]", "Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0", (double) '4');
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type3);
        java.lang.String str7 = milk6.getName();
        int int8 = milk6.getAmount();
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Milk" + "'", str7, "Milk");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Water [unit=ML, amount=30]");
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe1.getOrders();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        cafe1.printMenu();
        java.lang.String str6 = cafe1.greeting();
        cafe1.printMenu();
        org.junit.Assert.assertNotNull(orderArray2);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Water [unit=ML, amount=30]" + "'", str6, "Welcome to Water [unit=ML, amount=30]");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        java.lang.String str1 = cafe0.greeting();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Milk [unit=ML, amount=0, type=SEMI]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Welcome to Cafe" + "'", str1, "Welcome to Cafe");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order11 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (-1), "Water");
        order11.printReceipt();
        java.lang.String str13 = order11.toString();
        order11.serve();
        java.lang.Class<?> wildcardClass15 = order11.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0" + "'", str13, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        java.lang.String str36 = tooManyIngredientsException16.toString();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str36, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray10 = cafe0.getMenu();
        int int11 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        java.lang.String str13 = cafe0.getName();
        cafe0.printPendingOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertNotNull(recipeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Cafe" + "'", str13, "Cafe");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Plain");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Coffee [unit=GR, amount=10, decaf=false]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water(10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe3 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe3, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean8 = cafe0.addRecipe(recipe3);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray9 = cafe0.getOrders();
        java.lang.String str10 = cafe0.greeting();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order order12 = cafe0.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray13 = cafe0.getOrders();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(orderArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Welcome to Cafe" + "'", str10, "Welcome to Cafe");
        org.junit.Assert.assertNull(order12);
        org.junit.Assert.assertNotNull(orderArray13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
        double double26 = recipe10.getPrice();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 32.0d + "'", double26 == 32.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Coffee" + "'", str39, "Coffee");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        java.lang.String str21 = milk18.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY + "'", type10.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SOY));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type16.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str19, "Milk [unit=ML, amount=10, type=ALMOND]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Milk [unit=ML, amount=10, type=ALMOND]" + "'", str21, "Milk [unit=ML, amount=10, type=ALMOND]");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (byte) 1);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        java.lang.String str3 = cafe1.greeting();
        java.lang.String str4 = cafe1.getName();
        java.lang.String str5 = cafe1.greeting();
        cafe1.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray7 = cafe1.getMenu();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Cafe" + "'", str4, "Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray7);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type4 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) 'a', type4);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type4);
        org.junit.Assert.assertTrue("'" + type4 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type4.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        java.lang.String str5 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = cafe1.placeOrder("Coffee [unit=GR, amount=0, decaf=false]", "Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Cafe" + "'", str5, "Welcome to Cafe");
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        java.lang.String str4 = cafe3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str4, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            cafe0.removeRecipe("Order: ; For: Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray2);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=32, decaf=false]");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]");
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double9 = recipe4.getPrice();
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee12 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (byte) 100, false);
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee14 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee(1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit15 = coffee14.getUnit();
        java.lang.String str16 = coffee14.toString();
        java.lang.String str17 = coffee14.toString();
        int int18 = coffee14.getAmount();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk20 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit21 = milk20.getUnit();
        boolean boolean22 = coffee14.equals((java.lang.Object) unit21);
        boolean boolean23 = coffee12.equals((java.lang.Object) unit21);
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) coffee12);
        boolean boolean25 = cafe1.addRecipe(recipe4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + unit15 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit15.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str16, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str17, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + unit21 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit21.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("hi!", (double) 0.0f);
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double10 = recipe5.getPrice();
        boolean boolean11 = recipe5.isReady();
        uk.ac.sheffield.com1003.cafe.Order order15 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean16 = recipe5.isReady();
        boolean boolean17 = recipe2.equals((java.lang.Object) boolean16);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=ALMOND]", 52.0d, "Water [unit=ML, amount=97]");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        java.lang.String str3 = cafe1.greeting();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray6 = cafe1.getMenu();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Cafe" + "'", str3, "Welcome to Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertNotNull(recipeArray6);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe1.getOrders();
        cafe1.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean7 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Cafe cafe9 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        int int10 = cafe9.getIndexNextOrderToServe();
        int int11 = cafe9.getIndexNextOrderToServe();
        java.lang.String str12 = cafe9.getName();
        boolean boolean13 = recipe2.equals((java.lang.Object) cafe9);
        // The following exception was thrown during execution in test generation
        try {
            cafe9.removeRecipe("Coffee [unit=GR, amount=-1, decaf=false]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str12, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
        uk.ac.sheffield.com1003.cafe.Cafe cafe7 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str8 = cafe7.greeting();
        int int9 = cafe7.getIndexNextOrderToServe();
        boolean boolean10 = milk2.equals((java.lang.Object) cafe7);
        int int11 = cafe7.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe7.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: ; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0]");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=8, decaf=false]", (double) 10);
        order10.printReceipt();
        java.lang.String str12 = order10.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0" + "'", str12, "Order: ; For: Coffee [unit=GR, amount=8, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Welcome to Syrup [unit=ML, amount=10, flavour=]; Paid: 52.0");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        java.lang.String str20 = syrup14.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type9.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str20, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size4 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=35, decaf=true]", (double) (short) 0, size4, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size4 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size4.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Welcome to Cafe");
        java.lang.String str2 = syrup1.getName();
        java.lang.String str3 = syrup1.toString();
        java.lang.String str4 = syrup1.getFlavour();
        java.lang.String str5 = syrup1.getName();
        java.lang.String str6 = syrup1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Syrup" + "'", str2, "Syrup");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str3, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Welcome to Cafe" + "'", str4, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Syrup" + "'", str5, "Syrup");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]" + "'", str6, "Syrup [unit=ML, amount=10, flavour=Welcome to Cafe]");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.String str27 = recipeNotFoundException12.toString();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str27, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (-1.0d));
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (double) 'a');
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        java.lang.String str3 = cafe1.greeting();
        cafe1.printPendingOrders();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Welcome to Coffee" + "'", str3, "Welcome to Coffee");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        cafe0.printPendingOrders();
        int int3 = cafe0.getIndexNextOrderToPlace();
        cafe0.printMenu();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray5 = cafe0.getOrders();
        uk.ac.sheffield.com1003.cafe.Order order6 = cafe0.serveOrder();
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(orderArray5);
        org.junit.Assert.assertNull(order6);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        cafe1.printPendingOrders();
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe1.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0", "Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]", 52.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = cafe3.placeOrder("Water [unit=ML, amount=100]", "Milk [unit=ML, amount=100, type=SOY]", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException0 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray1 = recipeNotFoundException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException2 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray3 = tooManyIngredientsException2.getSuppressed();
        java.lang.Throwable[] throwableArray4 = tooManyIngredientsException2.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException5 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray6 = recipeNotFoundException5.getSuppressed();
        tooManyIngredientsException2.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
        recipeNotFoundException0.addSuppressed((java.lang.Throwable) recipeNotFoundException5);
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
        recipeNotFoundException5.addSuppressed((java.lang.Throwable) recipeNotFoundException17);
        java.lang.String str21 = recipeNotFoundException17.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str21, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray3 = cafe1.getOrders();
        org.junit.Assert.assertNull(order2);
        org.junit.Assert.assertNotNull(orderArray3);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order5 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) '#');
        boolean boolean6 = recipe2.isReady();
        double double7 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: ; Paid: 100.0", (double) (short) 100);
        java.time.LocalDateTime localDateTime11 = order10.getOrderServed();
        order10.printReceipt();
        order10.printReceipt();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type3 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk4 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk5 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type3);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 100, type3);
        org.junit.Assert.assertTrue("'" + type3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Syrup [unit=ML, amount=10, flavour=Coffee [unit=GR, amount=1, decaf=false]]", (double) 100);
        java.time.LocalDateTime localDateTime29 = order28.getOrderServed();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str17, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
        java.lang.String str17 = syrup12.getName();
        java.lang.String str18 = syrup12.getName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Syrup [unit=ML, amount=10, flavour=]" + "'", str15, "Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Syrup" + "'", str17, "Syrup");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Syrup" + "'", str18, "Syrup");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.serve();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        java.time.LocalDateTime localDateTime9 = order6.getOrderServed();
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk", 52, (int) (short) 100);
        int int4 = cafe3.getIndexNextOrderToPlace();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee0 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee();
        java.lang.String str1 = coffee0.getName();
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order8 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) ' ');
        recipe4.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk10);
        boolean boolean12 = recipe4.isReady();
        boolean boolean13 = coffee0.equals((java.lang.Object) recipe4);
        java.lang.String str14 = coffee0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coffee" + "'", str1, "Coffee");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Coffee [unit=GR, amount=8, decaf=false]" + "'", str14, "Coffee [unit=GR, amount=8, decaf=false]");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printMenu();
        uk.ac.sheffield.com1003.cafe.Recipe recipe5 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe5, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        boolean boolean10 = recipe5.isReady();
        java.lang.String str11 = recipe5.getName();
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk13 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100);
        recipe5.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk13);
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double22 = recipe17.getPrice();
        boolean boolean23 = recipe17.isReady();
        uk.ac.sheffield.com1003.cafe.Order order27 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 1.0", (double) (byte) 1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        boolean boolean28 = milk13.equals((java.lang.Object) recipe17);
        boolean boolean29 = cafe1.addRecipe(recipe17);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray30 = cafe1.getMenu();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str11, "Coffee [unit=GR, amount=1, decaf=false]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(recipeArray30);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Coffee [unit=GR, amount=35, decaf=false]");
        java.lang.String str2 = syrup1.getFlavour();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coffee [unit=GR, amount=35, decaf=false]" + "'", str2, "Coffee [unit=GR, amount=35, decaf=false]");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        java.lang.String str2 = cafe0.greeting();
        int int3 = cafe0.getIndexNextOrderToPlace();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe0.placeOrder("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 100.0", "Milk [unit=ML, amount=10, type=SOY]", 100.0d);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("");
        cafe1.printPendingOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe1.placeOrder("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=Water [unit=ML, amount=30]]; Paid: 100.0]", "Coffee [unit=GR, amount=100, decaf=true]", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe", (int) (byte) 1, 1);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray5 = cafe3.getMenu();
        cafe3.printMenu();
        java.lang.String str7 = cafe3.greeting();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = cafe3.placeOrder("Plain", "Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0", (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(orderArray4);
        org.junit.Assert.assertNotNull(recipeArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Welcome to Cafe" + "'", str7, "Welcome to Cafe");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        boolean boolean38 = recipe4.isReady();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Welcome to Plain");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
        java.lang.String str19 = tooManyIngredientsException12.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str19, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException65 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray66 = tooManyIngredientsException65.getSuppressed();
        java.lang.Throwable[] throwableArray67 = tooManyIngredientsException65.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException68 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray69 = recipeNotFoundException68.getSuppressed();
        tooManyIngredientsException65.addSuppressed((java.lang.Throwable) recipeNotFoundException68);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException71 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray72 = recipeNotFoundException71.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException73 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray74 = tooManyIngredientsException73.getSuppressed();
        java.lang.Throwable[] throwableArray75 = tooManyIngredientsException73.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException76 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray77 = recipeNotFoundException76.getSuppressed();
        tooManyIngredientsException73.addSuppressed((java.lang.Throwable) recipeNotFoundException76);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException79 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException73.addSuppressed((java.lang.Throwable) recipeNotFoundException79);
        recipeNotFoundException71.addSuppressed((java.lang.Throwable) recipeNotFoundException79);
        uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException cafeOutOfCapacityException82 = new uk.ac.sheffield.com1003.cafe.exceptions.CafeOutOfCapacityException();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException83 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray84 = recipeNotFoundException83.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException85 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray86 = tooManyIngredientsException85.getSuppressed();
        java.lang.Throwable[] throwableArray87 = tooManyIngredientsException85.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException88 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray89 = recipeNotFoundException88.getSuppressed();
        tooManyIngredientsException85.addSuppressed((java.lang.Throwable) recipeNotFoundException88);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException91 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException85.addSuppressed((java.lang.Throwable) recipeNotFoundException91);
        recipeNotFoundException83.addSuppressed((java.lang.Throwable) recipeNotFoundException91);
        java.lang.Throwable[] throwableArray94 = recipeNotFoundException83.getSuppressed();
        cafeOutOfCapacityException82.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        java.lang.Throwable[] throwableArray96 = recipeNotFoundException83.getSuppressed();
        recipeNotFoundException79.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        tooManyIngredientsException65.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
        recipeNotFoundException36.addSuppressed((java.lang.Throwable) recipeNotFoundException83);
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
        org.junit.Assert.assertNotNull(throwableArray66);
        org.junit.Assert.assertNotNull(throwableArray67);
        org.junit.Assert.assertNotNull(throwableArray69);
        org.junit.Assert.assertNotNull(throwableArray72);
        org.junit.Assert.assertNotNull(throwableArray74);
        org.junit.Assert.assertNotNull(throwableArray75);
        org.junit.Assert.assertNotNull(throwableArray77);
        org.junit.Assert.assertNotNull(throwableArray84);
        org.junit.Assert.assertNotNull(throwableArray86);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertNotNull(throwableArray89);
        org.junit.Assert.assertNotNull(throwableArray94);
        org.junit.Assert.assertNotNull(throwableArray96);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        java.lang.String str20 = tooManyIngredientsException9.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(throwableArray17);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str20, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        java.lang.String str30 = tooManyIngredientsException9.toString();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException" + "'", str30, "uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type8 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type8);
        java.lang.String str10 = milk9.toString();
        recipe2.addIngredient((uk.ac.sheffield.com1003.cafe.ingredients.Ingredient) milk9);
        double double12 = recipe2.getPrice();
        uk.ac.sheffield.com1003.cafe.Order order16 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (short) 0, "Order: ; For: ; Paid: 100.0");
        boolean boolean17 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order21 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0", (double) 100L, "");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type8.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str10, "Milk [unit=ML, amount=1, type=SEMI]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Cafe");
        java.lang.String str2 = cafe1.greeting();
        int int3 = cafe1.getIndexNextOrderToPlace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size2 = null;
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("Welcome to Syrup [unit=ML, amount=10, flavour=]", (double) (short) 0, size2, (int) '4');
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=52, type=ALMOND]; Paid: 1.0", (double) 100L);
        order7.printReceipt();
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        java.lang.String str1 = water0.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe4 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str5 = recipe4.getName();
        boolean boolean6 = recipe4.isReady();
        uk.ac.sheffield.com1003.cafe.Order order9 = new uk.ac.sheffield.com1003.cafe.Order(recipe4, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean10 = recipe4.isReady();
        double double11 = recipe4.getPrice();
        boolean boolean12 = water0.equals((java.lang.Object) double11);
        java.lang.String str13 = water0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Water [unit=ML, amount=30]" + "'", str1, "Water [unit=ML, amount=30]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Water [unit=ML, amount=30]" + "'", str13, "Water [unit=ML, amount=30]");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
        uk.ac.sheffield.com1003.cafe.Order order28 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=35, decaf=true]", (double) 32, "Coffee [unit=GR, amount=52, decaf=false]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Milk [unit=ML, amount=32, type=WHOLE]" + "'", str3, "Milk [unit=ML, amount=32, type=WHOLE]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + unit18 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR + "'", unit18.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.GR));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type5 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk6 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((-1), type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk7 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(100, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk8 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 10, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk9 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk(0, type5);
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk10 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (short) 0, type5);
        org.junit.Assert.assertTrue("'" + type5 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND + "'", type5.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.ALMOND));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=]", (int) (short) 10, 1);
        cafe3.printMenu();
        java.lang.String str5 = cafe3.greeting();
        java.lang.String str6 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order7 = cafe3.serveOrder();
        java.lang.String str8 = cafe3.greeting();
        uk.ac.sheffield.com1003.cafe.Order order9 = cafe3.serveOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str5, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str6, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Syrup [unit=ML, amount=10, flavour=]" + "'", str8, "Welcome to Syrup [unit=ML, amount=10, flavour=]");
        org.junit.Assert.assertNull(order9);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray28 = cafe6.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe6.removeRecipe("Order: Coffee [unit=GR, amount=1, decaf=false]; For: Order: ; For: ; Paid: 100.0; Paid: -1.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(recipeArray28);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.String str33 = milk4.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Milk [unit=ML, amount=52, type=ALMOND]" + "'", str33, "Milk [unit=ML, amount=52, type=ALMOND]");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=-1, decaf=false]");
        uk.ac.sheffield.com1003.cafe.Order order2 = cafe1.serveOrder();
        cafe1.printPendingOrders();
        org.junit.Assert.assertNull(order2);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        uk.ac.sheffield.com1003.cafe.ingredients.Syrup syrup1 = new uk.ac.sheffield.com1003.cafe.ingredients.Syrup("Order: ; For: Coffee [unit=GR, amount=100, decaf=false]; Paid: 10.0");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        int int13 = cafe7.getIndexNextOrderToServe();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Welcome to Cafe" + "'", str8, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
        java.lang.String str25 = recipe10.getName();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]", (double) 10L);
        java.time.LocalDateTime localDateTime8 = order7.getOrderServed();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException tooManyIngredientsException0 = new uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException();
        java.lang.Throwable[] throwableArray1 = tooManyIngredientsException0.getSuppressed();
        java.lang.Throwable[] throwableArray2 = tooManyIngredientsException0.getSuppressed();
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException3 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        java.lang.Throwable[] throwableArray4 = recipeNotFoundException3.getSuppressed();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException3);
        uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException recipeNotFoundException6 = new uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException();
        tooManyIngredientsException0.addSuppressed((java.lang.Throwable) recipeNotFoundException6);
        java.lang.Throwable[] throwableArray8 = recipeNotFoundException6.getSuppressed();
        java.lang.String str9 = recipeNotFoundException6.toString();
        org.junit.Assert.assertNotNull(throwableArray1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException" + "'", str9, "uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        java.lang.String str3 = recipe2.getName();
        boolean boolean4 = recipe2.isReady();
        uk.ac.sheffield.com1003.cafe.Order order7 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "Coffee [unit=GR, amount=1, decaf=false]", (double) 10L);
        boolean boolean8 = recipe2.isReady();
        java.lang.Object obj9 = null;
        boolean boolean10 = recipe2.equals(obj9);
        java.lang.String str11 = recipe2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee");
        int int2 = cafe1.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray3 = cafe1.getMenu();
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe1.getMenu();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = cafe1.placeOrder("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: ; Paid: 0.0", (double) 100L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(recipeArray3);
        org.junit.Assert.assertNotNull(recipeArray4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type type1 = uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI;
        uk.ac.sheffield.com1003.cafe.ingredients.Milk milk2 = new uk.ac.sheffield.com1003.cafe.ingredients.Milk((int) (byte) 1, type1);
        boolean boolean4 = milk2.equals((java.lang.Object) "Welcome to Cafe");
        java.lang.String str5 = milk2.getName();
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
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray25 = cafe6.getMenu();
        boolean boolean26 = milk2.equals((java.lang.Object) recipeArray25);
        java.lang.String str27 = milk2.toString();
        org.junit.Assert.assertTrue("'" + type1 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI + "'", type1.equals(uk.ac.sheffield.com1003.cafe.ingredients.Milk.Type.SEMI));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Milk" + "'", str5, "Milk");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(orderArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Welcome to Cafe" + "'", str16, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(recipeArray25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Milk [unit=ML, amount=1, type=SEMI]" + "'", str27, "Milk [unit=ML, amount=1, type=SEMI]");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        cafe0.printPendingOrders();
        int int5 = cafe0.getIndexNextOrderToPlace();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = cafe0.placeOrder("Milk [unit=ML, amount=1, type=SEMI]", "", (double) 0.0f);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Order order1 = cafe0.serveOrder();
        java.lang.String str2 = cafe0.greeting();
        java.lang.String str3 = cafe0.getName();
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe0.serveOrder();
        java.lang.String str5 = cafe0.getName();
        cafe0.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Recipe recipe7 = null;
        boolean boolean8 = cafe0.addRecipe(recipe7);
        org.junit.Assert.assertNull(order1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Welcome to Cafe" + "'", str2, "Welcome to Cafe");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Cafe" + "'", str3, "Cafe");
        org.junit.Assert.assertNull(order4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Cafe" + "'", str5, "Cafe");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        uk.ac.sheffield.com1003.cafe.Cafe cafe1 = new uk.ac.sheffield.com1003.cafe.Cafe("Coffee [unit=GR, amount=8, decaf=false]");
        // The following exception was thrown during execution in test generation
        try {
            cafe1.removeRecipe("Order: ; For: Order: ; For: ; Paid: 100.0; Paid: 100.0");
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.String str38 = recipe25.getName();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Coffee [unit=GR, amount=1, decaf=false]" + "'", str38, "Coffee [unit=GR, amount=1, decaf=false]");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water0 = new uk.ac.sheffield.com1003.cafe.ingredients.Water();
        boolean boolean2 = water0.equals((java.lang.Object) (short) -1);
        uk.ac.sheffield.com1003.cafe.ingredients.Unit unit3 = water0.getUnit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + unit3 + "' != '" + uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML + "'", unit3.equals(uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        uk.ac.sheffield.com1003.cafe.Recipe.Size size6 = uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR;
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", 1.0d, size6, (int) ' ');
        uk.ac.sheffield.com1003.cafe.Recipe recipe10 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=97, decaf=false]", (double) (short) -1, size6, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            uk.ac.sheffield.com1003.cafe.Recipe recipe12 = new uk.ac.sheffield.com1003.cafe.Recipe("Order: ; For: Syrup [unit=ML, amount=10, flavour=Order: Coffee [unit=GR, amount=1, decaf=false]; For: Syrup [unit=ML, amount=10, flavour=]; Paid: 35.0]; Paid: 10.0", (double) 10L, size6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + size6 + "' != '" + uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR + "'", size6.equals(uk.ac.sheffield.com1003.cafe.Recipe.Size.REGULAR));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Syrup [unit=ML, amount=10, flavour=Welcome to Welcome to Cafe]", (int) 'a', (int) 'a');
        uk.ac.sheffield.com1003.cafe.Order order4 = cafe3.serveOrder();
        org.junit.Assert.assertNull(order4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Milk [unit=ML, amount=1, type=SEMI]", 0, (int) (byte) 0);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray4 = cafe3.getOrders();
        org.junit.Assert.assertNotNull(orderArray4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException", (int) (byte) 1, (int) (short) 1);
        uk.ac.sheffield.com1003.cafe.Cafe cafe4 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Cafe cafe5 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe8 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order12 = new uk.ac.sheffield.com1003.cafe.Order(recipe8, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean13 = cafe5.addRecipe(recipe8);
        uk.ac.sheffield.com1003.cafe.Order[] orderArray14 = cafe5.getOrders();
        java.lang.String str15 = cafe5.greeting();
        uk.ac.sheffield.com1003.cafe.Cafe cafe16 = new uk.ac.sheffield.com1003.cafe.Cafe();
        uk.ac.sheffield.com1003.cafe.Recipe recipe19 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order23 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        boolean boolean24 = cafe16.addRecipe(recipe19);
        boolean boolean25 = cafe5.addRecipe(recipe19);
        boolean boolean26 = cafe4.addRecipe(recipe19);
        uk.ac.sheffield.com1003.cafe.Order order29 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order33 = new uk.ac.sheffield.com1003.cafe.Order(recipe19, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0", 32.0d, "Welcome to Coffee");
        boolean boolean34 = cafe3.addRecipe(recipe19);
        boolean boolean35 = recipe19.isReady();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(orderArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Welcome to Cafe" + "'", str15, "Welcome to Cafe");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        uk.ac.sheffield.com1003.cafe.Recipe recipe2 = new uk.ac.sheffield.com1003.cafe.Recipe("", (double) ' ');
        uk.ac.sheffield.com1003.cafe.Order order6 = new uk.ac.sheffield.com1003.cafe.Order(recipe2, "", (double) (byte) 100, "Coffee [unit=GR, amount=1, decaf=false]");
        order6.printReceipt();
        java.time.LocalDateTime localDateTime8 = order6.getOrderServed();
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        uk.ac.sheffield.com1003.cafe.ingredients.Coffee coffee2 = new uk.ac.sheffield.com1003.cafe.ingredients.Coffee((int) (short) 1, true);
        java.lang.String str3 = coffee2.toString();
        java.lang.String str4 = coffee2.toString();
        boolean boolean5 = coffee2.getDecaf();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str3, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coffee [unit=GR, amount=1, decaf=true]" + "'", str4, "Coffee [unit=GR, amount=1, decaf=true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        uk.ac.sheffield.com1003.cafe.ingredients.Water water1 = new uk.ac.sheffield.com1003.cafe.ingredients.Water((int) (byte) -1);
        java.lang.Object obj2 = null;
        boolean boolean3 = water1.equals(obj2);
        uk.ac.sheffield.com1003.cafe.Recipe recipe6 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order10 = new uk.ac.sheffield.com1003.cafe.Order(recipe6, "Milk [unit=ML, amount=1, type=SEMI]", (double) 0, "");
        double double11 = recipe6.getPrice();
        boolean boolean12 = recipe6.isReady();
        boolean boolean13 = water1.equals((java.lang.Object) recipe6);
        java.lang.String str14 = water1.toString();
        uk.ac.sheffield.com1003.cafe.Recipe recipe17 = new uk.ac.sheffield.com1003.cafe.Recipe("Coffee [unit=GR, amount=1, decaf=false]", (double) (short) 10);
        uk.ac.sheffield.com1003.cafe.Order order20 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Syrup [unit=ML, amount=10, flavour=]", (double) '#');
        uk.ac.sheffield.com1003.cafe.Order order24 = new uk.ac.sheffield.com1003.cafe.Order(recipe17, "Coffee", (double) (byte) -1, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=1, type=SEMI]; Paid: 0.0");
        java.lang.String str25 = order24.toString();
        order24.serve();
        boolean boolean27 = water1.equals((java.lang.Object) order24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Water [unit=ML, amount=-1]" + "'", str14, "Water [unit=ML, amount=-1]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0" + "'", str25, "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Coffee; Paid: -1.0");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        uk.ac.sheffield.com1003.cafe.Cafe cafe3 = new uk.ac.sheffield.com1003.cafe.Cafe("Welcome to Milk [unit=ML, amount=0, type=ALMOND]", (int) (byte) 0, 8);
        uk.ac.sheffield.com1003.cafe.Recipe[] recipeArray4 = cafe3.getMenu();
        cafe3.printPendingOrders();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray6 = cafe3.getOrders();
        org.junit.Assert.assertNotNull(recipeArray4);
        org.junit.Assert.assertNotNull(orderArray6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        uk.ac.sheffield.com1003.cafe.Cafe cafe0 = new uk.ac.sheffield.com1003.cafe.Cafe();
        int int1 = cafe0.getIndexNextOrderToServe();
        uk.ac.sheffield.com1003.cafe.Order[] orderArray2 = cafe0.getOrders();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = cafe0.placeOrder("Welcome to Water [unit=ML, amount=-1]", "Order: Coffee [unit=GR, amount=1, decaf=false]; For: Milk [unit=ML, amount=32, type=WHOLE]; Paid: 32.0", (double) 0L);
            org.junit.Assert.fail("Expected exception of type uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException; message: null");
        } catch (uk.ac.sheffield.com1003.cafe.exceptions.RecipeNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(orderArray2);
    }
}

