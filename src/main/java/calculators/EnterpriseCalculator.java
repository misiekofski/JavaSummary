package calculators;

public class EnterpriseCalculator extends PremiumCalculator {
    private static int operationsCounter;

    public double convertToUsd(double pln) {
        operationsCounter++;
        double result = pln / 4.15;
        addOperation("Converted PLN: " + pln + "to USD, got: " + result);
        return result;
    }

    public double convertToEuro(double pln) {
        operationsCounter++;
        double result = pln / 4.66;
        addOperation("Converted PLN: " + pln + "to USD, got: " + result);
        return result;
    }

    public static int getOperationsCounter() {
        return operationsCounter;
    }
}
