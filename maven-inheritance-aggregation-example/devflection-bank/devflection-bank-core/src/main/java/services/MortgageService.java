package services;

import com.devflection.bank.models.Mortgage;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

public class MortgageService {

    private MortgageService(){
    }

    public static Mortgage getMortgage(String name, BigDecimal amount, BigDecimal downPayment, int duration) {
        if (StringUtils.isEmpty(name)) {
            throw new IllegalArgumentException("The mortgage must be issued to a name.");
        }

        BigDecimal interestRate = InterestRateService.getInterestRate(amount, downPayment);

        return new Mortgage(name, amount, interestRate, duration);
    }
}
