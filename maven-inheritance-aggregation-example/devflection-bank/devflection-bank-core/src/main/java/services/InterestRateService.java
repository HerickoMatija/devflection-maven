package services;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class InterestRateService {

    private static final MathContext PRECISION = new MathContext(2);

    private static final BigDecimal LOWER_RATE_LIMIT = new BigDecimal(0.3);

    private static final BigDecimal LOWER_RATE = new BigDecimal(0.05, PRECISION);
    private static final BigDecimal HIGHER_RATE = new BigDecimal(0.10, PRECISION);


    private InterestRateService() {
    }

    public static BigDecimal getInterestRate(BigDecimal totalAmount, BigDecimal downPayment) {
        BigDecimal percentage = downPayment.divide(totalAmount, new MathContext(3, RoundingMode.HALF_UP));

        if (LOWER_RATE_LIMIT.compareTo(percentage) < 0) {
            return LOWER_RATE;
        } else {
            return HIGHER_RATE;
        }
    }
}
