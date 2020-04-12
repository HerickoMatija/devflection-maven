package services;

import com.devflection.bank.models.Mortgage;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class MortgageServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getMortgage_emptyName_expectException() {
        // Expect exception
        expectedException.expect(IllegalArgumentException.class);

        // Execute the call
        MortgageService.getMortgage("", new BigDecimal(10000), new BigDecimal(500), 10);
    }

    @Test
    public void getMortgage_nullName_expectException() {
        // Expect exception
        expectedException.expect(IllegalArgumentException.class);

        // Execute the call
        MortgageService.getMortgage(null, new BigDecimal(10000), new BigDecimal(500), 10);
    }

    @Test
    public void getMortgage_downPaymentLessThan30Percent_expectHigherRate() {
        // Execute the call
        Mortgage mortgage = MortgageService.getMortgage("Dev Flection",
                                                        new BigDecimal(10000),
                                                        new BigDecimal(500),
                                                        10);

        assertEquals(new BigDecimal(0.10), mortgage.getInterestRate());
    }

    @Test
    public void getMortgage_downPaymentExactly30Percent_expectHigherRate() {
        // Execute the call
        Mortgage mortgage = MortgageService.getMortgage("Dev Flection",
                                                        new BigDecimal(1500),
                                                        new BigDecimal(500),
                                                        10);

        assertEquals(new BigDecimal(0.05), mortgage.getInterestRate());
    }

    @Test
    public void getMortgage_downPaymentMoreThan30Percent_expectHigherRate() {
        // Execute the call
        Mortgage mortgage = MortgageService.getMortgage("Dev Flection",
                                                        new BigDecimal(1500),
                                                        new BigDecimal(1000),
                                                        10);

        assertEquals(new BigDecimal(0.05), mortgage.getInterestRate());
    }
}