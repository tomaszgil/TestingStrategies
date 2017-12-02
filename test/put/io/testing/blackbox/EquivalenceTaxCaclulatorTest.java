package put.io.testing.blackbox;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class EquivalenceTaxCaclulatorTest {

    private TaxCalculator tc;

    @Before
    public void setUp() {
        tc = new TaxCalculator();
    }

    @Test
    public void testTaxFree() {
        BigDecimal amount = new BigDecimal("2312.12");
        BigDecimal expected = new BigDecimal("0.0");
        BigDecimal result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("3000.0");
        expected = new BigDecimal("0.0");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);
    }

    @Test
    public void testUnderFirstThreshold() {
        BigDecimal amount = new BigDecimal("13000.0");
        BigDecimal expected = new BigDecimal("1000.0");
        BigDecimal result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("20000.0");
        expected = new BigDecimal("1700.0");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);
    }

    @Test
    public void testAboveFirstUnderSecondThreshold() {
        BigDecimal amount = new BigDecimal("23000.0");
        BigDecimal expected = new BigDecimal("2300.0");
        BigDecimal result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("30000.0");
        expected = new BigDecimal("3700.0");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);
    }

    @Test
    public void testAboveSecondThreshold() {
        BigDecimal amount = new BigDecimal("100000.0");
        BigDecimal expected = new BigDecimal("17700.0");
        BigDecimal result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);

        amount = new BigDecimal("200000.0");
        expected = new BigDecimal("32700.0");
        result = tc.calculate(amount);
        assertTrue(result.compareTo(expected) == 0);
    }
}
