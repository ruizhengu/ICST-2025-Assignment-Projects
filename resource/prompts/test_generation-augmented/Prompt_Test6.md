The task is to augment an existing test suite to make it cover as many cases as possible.

There are the classes that the test suite interact with:

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public abstract class Ingredient {
    protected String name = "";
    protected Unit unit = Unit.UNDEFINED;
    protected int amount;

    public String getName() {
        return this.name;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "Ingredient [name=" + name + ", unit=" + unit + ", amount=" + amount + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || ! (another instanceof Ingredient))
            return false;
        return name.equals(((Ingredient)another).getName());
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Water extends Ingredient {

    public Water() {
        this(30);
    }

    public Water(int amount) {
        this.name = "Water";
        this.amount = amount;
        this.unit = Unit.ML;
    }

    @Override
    public String toString() {
        return "Water [unit=" + unit + ", amount=" + amount + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || !(another instanceof Water))
            return false;
        Water w = (Water) another;
        return name.equals(w.name) && amount == w.amount && unit == w.unit;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public class Coffee extends Ingredient {
    private boolean decaf;

    public Coffee() {
        this(8);
    }

    public Coffee(int amount) {
        this(amount, false);
    }

    public Coffee(int amount, boolean decaf) {
        this.name = "Coffee";
        this.amount = amount;
        this.unit = Unit.GR;
        this.decaf = decaf;
    }

    @Override
    public String toString() {
        return "Coffee [unit=" + unit + ", amount=" + amount + ", decaf=" + decaf + "]";
    }

    @Override
    public boolean equals(Object another) {
        if (another == null || !(another instanceof Coffee))
            return false;
        Coffee coffee = (Coffee) another;
        return name.equals(coffee.getName()) && amount == coffee.amount && unit == coffee.unit && decaf == coffee.decaf;
    }
}
```

```
package uk.ac.sheffield.com1003.cafe.ingredients;

public enum Unit {
    UNDEFINED, GR, ML;
}
```

Here is the existing test suite.

```
package uk.ac.sheffield.com1003.cafe;

import org.apache.commons.lang3.reflect.ConstructorUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import uk.ac.sheffield.com1003.cafe.exceptions.TooManyIngredientsException;
import uk.ac.sheffield.com1003.cafe.ingredients.Coffee;
import uk.ac.sheffield.com1003.cafe.ingredients.Unit;
import uk.ac.sheffield.com1003.cafe.ingredients.Water;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;
import static uk.ac.sheffield.com1003.cafe.ingredients.Unit.ML;

public class TestCafeTask6 {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void testSyrupExists() throws Exception {
        try {
            Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        } catch (ClassNotFoundException e) {
            throw new Exception("Class Syrup does not exist");
        }
    }

    @Test
    public void testSyrupDefaultConstructor() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass);
        assertTrue(syrupClass.isInstance(o));
    }

    @Test
    public void testSyrupDefaultConstructorSetsUnit() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass);
        Unit unit = (Unit) FieldUtils.readField(o, "unit", true);
        assertEquals(ML, unit);
    }

    @Test
    public void testSyrupContainsFlavourField() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass);

        Object flavour = FieldUtils.readField(o, "flavour", true);
        assertNotNull(flavour);
    }

    @Test
    public void testSyrupOverloadedConstructor() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
        assertTrue(syrupClass.isInstance(o));

        String flavour = (String) FieldUtils.readField(o, "flavour", true);
        assertEquals("caramel", flavour);
    }

    @Test
    public void testSyrupOverloadedConstructorSetsUnit() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
        assertTrue(syrupClass.isInstance(o));

        String flavour = (String) FieldUtils.readField(o, "flavour", true);
        assertEquals("caramel", flavour);
        Unit unit = (Unit) FieldUtils.readField(o, "unit", true);
        assertEquals(ML, unit);
    }

    @Test
    public void testSyrupToString() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
        assertTrue(syrupClass.isInstance(o));
        int amount = (int) FieldUtils.readField(o, "amount", true);
        Unit unit = (Unit) FieldUtils.readField(o, "unit", true);
        String s = (String) MethodUtils.invokeMethod(o, "toString");
        assertEquals("Syrup [unit=" + unit + ", amount=" + amount + ", flavour=caramel]", s);
    }

    @Test
    public void testSyrupToStringRelaxed() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        Class<?> syrupClass = Class.forName("uk.ac.sheffield.com1003.cafe.ingredients.Syrup");
        Object o = ConstructorUtils.invokeConstructor(syrupClass, "caramel");
        assertTrue(syrupClass.isInstance(o));
        int amount = (int) FieldUtils.readField(o, "amount", true);
        Unit unit = (Unit) FieldUtils.readField(o, "unit", true);
        String s = (String) MethodUtils.invokeMethod(o, "toString");
        assertTrue(s.toUpperCase().matches("SYRUP.*UNIT.*" + unit + ".*AMOUNT.*" + amount + ".*FLAVOUR.*CARAMEL.*"));
    }
}
```

Please keep the orginal test suite, and augment it by creating more tests into it.

Please do not create objects that are not included in the clasess.

Please do not add tests targeting the constructors of the classes.