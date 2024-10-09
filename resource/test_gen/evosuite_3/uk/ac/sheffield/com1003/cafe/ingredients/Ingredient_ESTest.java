/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 09 15:28:15 GMT 2024
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
import uk.ac.sheffield.com1003.cafe.ingredients.Milk;
import uk.ac.sheffield.com1003.cafe.ingredients.Syrup;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

public class Ingredient_ESTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        Syrup syrup0 = new Syrup();
        String string0 = syrup0.toString();
        assertEquals("Syrup [unit=ML, amount=10, flavour=Plain]", string0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Coffee coffee0 = new Coffee(453, false);
        coffee0.name = null;
        String string0 = coffee0.getName();
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        Milk milk0 = new Milk(1);
        milk0.name = "]";
        milk0.name = "";
        String string0 = milk0.getName();
        assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        Water water0 = new Water(0);
        int int0 = water0.getAmount();
        assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        Water water0 = new Water();
        water0.amount = (-1752);
        int int0 = water0.getAmount();
        assertEquals((-1752), int0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        Syrup syrup0 = new Syrup();
        syrup0.name = null;
        // Undeclared exception!
        try {
            syrup0.equals(syrup0);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        Milk milk0 = new Milk();
        String string0 = milk0.getName();
        assertEquals("Milk", string0);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        Syrup syrup0 = new Syrup();
        Object object0 = new Object();
        boolean boolean0 = syrup0.equals(object0);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        Syrup syrup0 = new Syrup();
        boolean boolean0 = syrup0.equals((Object) null);
        assertFalse(boolean0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        Milk milk0 = new Milk();
        Unit unit0 = milk0.getUnit();
        assertEquals(Unit.ML, unit0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        Coffee coffee0 = new Coffee();
        int int0 = coffee0.getAmount();
        assertEquals(8, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        Syrup syrup0 = new Syrup();
        boolean boolean0 = syrup0.equals(syrup0);
        assertTrue(boolean0);
    }
}
