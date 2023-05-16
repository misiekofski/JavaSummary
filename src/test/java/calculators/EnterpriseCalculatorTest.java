package calculators;

import org.assertj.core.data.Offset;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class EnterpriseCalculatorTest {

    @Test
    public void convertToEuroShouldReturnProperValue() {
        EnterpriseCalculator calc = new EnterpriseCalculator();
        double result = calc.convertToEuro(100);

        // sprawdzamy +/- z dokładnością do 0.01 centa
        assertThat(result)
                .isCloseTo(21.46, Offset.offset(0.01));
    }

    @Test
    public void convertToUsdShouldReturnProperValue() {
        EnterpriseCalculator calc = new EnterpriseCalculator();
        double result = calc.convertToUsd(100);

        // sprawdzamy +/- z dokładnością do 0.01 centa
        assertThat(result)
                .isCloseTo(24.09, Offset.offset(0.01));
    }

    @Test
    public void shouldCountOperationsProperly() {
        EnterpriseCalculator calc = new EnterpriseCalculator();
        calc.convertToUsd(100);
        calc.convertToUsd(200);
        calc.convertToUsd(300);

        // to zadziała wtedy jeżeli wcześniejsze testy odpalą się pierwsze
        // bez zmiany kodu (np. dodanie funkcji która kasuje counter do zera)
        // nie da się tego inaczej przetestować
        assertThat(EnterpriseCalculator.getOperationsCounter())
                .isEqualTo(5);
    }
}
