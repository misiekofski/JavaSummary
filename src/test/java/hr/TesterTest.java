package hr;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TesterTest {

    @Test
    public void testerShouldHaveProperYearlyWage() {
        Tester tester = new Tester("John", "Doe", 10000);
        double yearlyWage = tester.getYearlyWage();

        assertThat(yearlyWage)
                .isEqualTo(120000);
    }

    @Test
    public void testerWithoutMonthlyWageShouldHaveProperYearlyWage() {
        Tester tester = new Tester("John", "Doe");
        double yearlyWage = tester.getYearlyWage();

        assertThat(yearlyWage)
                .isEqualTo(96000);
    }
}
