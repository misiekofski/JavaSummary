package calculators;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PremiumCalculatorTest {

    @Test
    public void shouldPowerWorkProperly() {
        PremiumCalculator pc = new PremiumCalculator();
        double result = pc.pow(2,3);
        assertThat(result)
                .isEqualTo(8);
    }

    @Test
    public void shouldAddDateToOperations() {
        PremiumCalculator pc = new PremiumCalculator();
        pc.pow(2,3);

        List<String> actualOperations = pc.returnOperations();

        // ten test będzie zepsuty jeżeli pomiędzy dodaniem do listy operacji tekstu
        // a asercją zmieni się data... ;)
        assertThat(actualOperations)
                .contains("[2023-05-16] 2.0 to the power of 3.0 is 8.0");
    }
}
