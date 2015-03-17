package net.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Cal3Test {

private static Cal3 calculator = new Cal3();
    
    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testAdd(){
        calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
    }

    @Test
    public void testSubstract(){
        calculator.add(10);
        calculator.substract(2);
        assertEquals(8, calculator.getResult());
    }

    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply(){
    }

    @Test(expected  =  ArithmeticException. class )

    public void testDivide(){
        calculator.add(8);
        calculator.divide(2);
        assertEquals(4, calculator.getResult());
    }

}

