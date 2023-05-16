package hr;

import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;
public class ManagerTest {
    @Test
    public void managerShouldHaveProperWage() {
        Manager manager = new Manager("John", "Doe", 0.2);
        double yearlyWage = manager.getYearlyWage();

        assertThat(yearlyWage)
                .isEqualTo(240000);
    }
}
