/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 15:52:28 GMT 2024
 */

package uk.ac.sheffield.com1003.cafe.ingredients;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;

public class Coffee_ESTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Coffee coffee0 = new Coffee((-4883));
        Coffee coffee1 = new Coffee();
        boolean boolean0 = coffee0.equals(coffee1);
        assertEquals(8, coffee1.getAmount());
        assertEquals("Coffee", coffee1.getName());
        assertFalse(coffee1.equals((Object) coffee0));
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Coffee coffee0 = new Coffee();
        Coffee coffee1 = new Coffee();
        coffee1.name = null;
        // Undeclared exception!
        try {
            coffee1.equals(coffee0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Coffee coffee0 = new Coffee(2097);
        Coffee coffee1 = new Coffee(2097, true);
        boolean boolean0 = coffee0.equals(coffee1);
        assertEquals(2097, coffee1.getAmount());
        assertFalse(boolean0);
        assertEquals("Coffee", coffee1.getName());
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Coffee coffee0 = new Coffee();
        Unit unit0 = Unit.UNDEFINED;
        coffee0.unit = unit0;
        Coffee coffee1 = new Coffee();
        boolean boolean0 = coffee0.equals(coffee1);
        assertEquals(8, coffee1.getAmount());
        assertFalse(boolean0);
        assertEquals("Coffee", coffee1.getName());
    }

    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Coffee coffee0 = new Coffee(0, false);
        assertEquals("Coffee", coffee0.getName());

        coffee0.name = "FPTI";
        Coffee coffee1 = new Coffee(1);
        boolean boolean0 = coffee0.equals(coffee1);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Coffee coffee0 = new Coffee(0, false);
        boolean boolean0 = coffee0.equals(coffee0);
        assertEquals("Coffee", coffee0.getName());
        assertEquals(0, coffee0.getAmount());
        assertTrue(boolean0);
    }

    @Test(timeout = 4000)
    public void test6() throws Throwable {
        Coffee coffee0 = new Coffee(0, false);
        Unit unit0 = Unit.ML;
        boolean boolean0 = coffee0.equals(unit0);
        assertFalse(boolean0);
        assertEquals("Coffee", coffee0.getName());
        assertEquals(0, coffee0.getAmount());
    }

    @Test(timeout = 4000)
    public void test7() throws Throwable {
        Coffee coffee0 = new Coffee(0, false);
        boolean boolean0 = coffee0.equals((Object) null);
        assertEquals(0, coffee0.getAmount());
        assertEquals("Coffee", coffee0.getName());
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test8() throws Throwable {
        Coffee coffee0 = new Coffee(0, false);
        String string0 = coffee0.toString();
        assertEquals("Coffee", coffee0.getName());
        assertEquals("Coffee [unit=GR, amount=0, decaf=false]", string0);
    }

    @Test(timeout = 4000)
    public void test9() throws Throwable {
        Coffee coffee0 = new Coffee();
        Coffee coffee1 = new Coffee((-1805));
        boolean boolean0 = coffee0.equals(coffee1);
        assertFalse(boolean0);
        assertEquals((-1805), coffee1.getAmount());
        assertFalse(coffee1.equals((Object) coffee0));
        assertEquals("Coffee", coffee1.getName());
    }
}
