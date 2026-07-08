package Week_1.TDDLoggingFramework.JUnitBasicTesting.exercise1junit.src.test.java;
package Week_1.TDDLoggingFramework.JUnitBasicTesting.exercise1junit.src.test.java;
//Exercise 1- Setting up JUnit Sample Test

import org.junit.Test;
import static  org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {

        Calculator calculator = new Calculator();

        assertEquals(10, calculator.add(4, 6));

    }


//Exercise-4 AAA Pattern Code
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }

    @Test
    public void testAdd() {

        // Arrange
        int num1 = 5;
        int num2 = 3;

        // Act
        int result = calculator.add(num1, num2);

        // Assert
        assertEquals(8, result);
    }
}


