package put.io.testing.blackbox;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class BoundaryTaxCalculatorText {

    private TaxCalculator tc;

    @Before
    public void setUp() {
        tc = new TaxCalculator();
    }

    @Test
    public void testFirstThreshold() {
        BigDecimal amount = new BigDecimal("2999.94");
        BigDecimal expected = new BigDecimal("0.0");
        BigDecimal result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("3000.0");
        expected = new BigDecimal("0.0");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("3000.06");
        expected = new BigDecimal("0.01");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);
    }

}
