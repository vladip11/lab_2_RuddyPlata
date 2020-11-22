
package com.example.service;

import com.example.model.OperationModel;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author VladimirP11
 */
public class CalculateSimpleTest {
    private OperationModel om=new OperationModel();
    private CalculateSimple calc=new CalculateSimple();

    @Test
    public void testSomeMethodAdd() {
        om.setA(5);
        om.setB(6);
        assertEquals( 11, calc.add(om));
    }
    @Test
    public void testSomeMethodSubtract() {
        om.setA(7);
        om.setB(8);
        assertEquals( -1, calc.subtract(om));
    }
    @Test
    public void testSomeMethodMultiply() {
        om.setA(3);
        om.setB(2);
        assertEquals(6, calc.multiply(om));
    }
   
    @Test
    public void testSomeMethodDivide() {
        om.setA(11);
        om.setB(3);
        double r=3.6666666666666665;
        assertEquals( r , calc.divide(om),0.00000000000);
    }
   
    @Test
    public void testSomeMethodFibonacci() {
        om.setC(8);
        assertEquals(21,calc.fibonacci(om));
    }
    @Test
    public void testSomeMethodFactorial() {
        om.setC(7);
        assertEquals(5040, calc.factorial(om));
    }
    @Test
    public void testSomeMethodSqrt() {
        om.setC(63);
        assertEquals( 7.937253933193772, calc.sqrt(om),0.00000000000);
    }
    @Test
    public void testSomeMethodPower() {
        om.setC(4);
        assertEquals(16, calc.power(om));
    }
    @Test
    public void testSomeMethodClearSimple() {
        om.setA(0);
        om.setB(0);
        assertEquals(om, calc.clearSimple(om));
    }
    @Test
    public void testSomeMethodClearAdvanced() {
        om.setC(0);
        assertEquals(om, calc.clearAdvanced(om));
    }
    
}
