package calculators;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    @Test
    public void shouldAddTwoNumbersProperly() {
        Calculator c1 = new Calculator();
        double result = c1.add(10, 20);
        assertThat(result).isEqualTo(30);
    }

    @Test
    public void shouldSubtractTwoNumbersProperly() {
        Calculator c1 = new Calculator();
        double result = c1.subtract(20, 7);
        assertThat(result).isEqualTo(13);
    }

    @Test
    public void shouldMultiplyTwoNumbersProperly() {
        Calculator c1 = new Calculator();
        double result = c1.multiply(3, 7);
        assertThat(result).isEqualTo(21);
    }


    @Test
    public void shouldDivideTwoNumbersProperly() {
        Calculator c1 = new Calculator();
        double result = c1.divide(20, 2);
        assertThat(result).isEqualTo(10);
    }

    @Test
    public void shouldStoreOperationsInProperOrderWhenDoingOperations() {
        Calculator c1 = new Calculator();
        c1.divide(20, 2);
        c1.add(20, 2);

        List<String> actualOperations = c1.returnOperations();
        assertThat(actualOperations)
                .hasSize(2)
                .last().isEqualTo("Added 20.0 to 2.0 got result 22.0");

        assertThat(actualOperations)
                .first().isEqualTo("Divided 20.0 by 2.0 got result 10.0");
    }


    @Test
    public void shouldDeleteOperationsHistory() {
        Calculator c1 = new Calculator();
        c1.divide(20, 2);
        c1.add(20, 2);
        c1.resetOperations();

        List<String> actualOperations = c1.returnOperations();
        assertThat(actualOperations)
                .hasSize(0);
    }

}
