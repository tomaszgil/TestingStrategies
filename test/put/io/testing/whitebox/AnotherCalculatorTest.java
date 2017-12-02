package put.io.testing.whitebox;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnotherCalculatorTest {

    private AnotherCalculator calc;

    @Before
    public void setUp() {
        calc = new AnotherCalculator();
    }

    @Test
    public void testCalculate1() {
        calc.setA(10);
        calc.setB(-1);
        calc.setC(-1);
        assertEquals(9, calc.calculate());
    }

    @Test
    public void testCalculate2() {
        calc.setA(-2);
        calc.setB(-1);
        calc.setC(-1);
        assertEquals(-1, calc.calculate());
    }

    @Test
    public void testCalculate3() {
        calc.setA(10);
        calc.setB(5);
        calc.setC(-1);
        assertEquals(10, calc.calculate());
    }

    @Test
    public void testCalculate4() {
        calc.setA(-2);
        calc.setB(5);
        calc.setC(-1);
        assertEquals(0, calc.calculate());
    }

    @Test
    public void testCalculate5() {
        calc.setA(10);
        calc.setB(-1);
        calc.setC(1);
        assertEquals(19, calc.calculate());
    }

    @Test
    public void testCalculate6() {
        calc.setA(-2);
        calc.setB(-1);
        calc.setC(1);
        assertEquals(-3, calc.calculate());
    }

    @Test
    public void testCalculate7() {
        calc.setA(10);
        calc.setB(5);
        calc.setC(1);
        assertEquals(20, calc.calculate());
    }

    @Test
    public void testCalculate8() {
        calc.setA(-2);
        calc.setB(5);
        calc.setC(1);
        assertEquals(-2, calc.calculate());
    }

}