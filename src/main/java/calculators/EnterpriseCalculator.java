package calculators;

public class EnterpriseCalculator extends PremiumCalculator {
    private static int operationsAmount;

    public double convertToUsd(double pln) {
        operationsAmount++;
        double result = pln / 4.15;
        addOperation("Converted PLN: " + pln + "to USD, got: " + result);
        return result;
    }

    public double convertToEuro(double pln) {
        operationsAmount++;
        double result = pln / 4.15;
        addOperation("Converted PLN: " + pln + "to USD, got: " + result);
        return result;
    }
}
