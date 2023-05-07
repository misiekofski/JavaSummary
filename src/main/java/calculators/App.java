package calculators;

public class App {
    public static void main(String[] args) {
        System.out.println("Calc1 stuff");
        Calculator calc1 = new Calculator();
        calc1.add(2, 4);
        calc1.divide(1, 0);
        calc1.printOperations();


        System.out.println("====================");
        System.out.println("Calc2 stuff");
        Calculator calc2 = new Calculator();
        calc2.printOperations();
        calc2.add(3,5);
        calc2.printOperations();

        System.out.println("====================");
        System.out.println("Premium calculator stuff");
        PremiumCalculator premiumCalculator = new PremiumCalculator();
        premiumCalculator.pow(2,3);
        premiumCalculator.printOperations();


        System.out.println("====================");
        System.out.println("Enterprise calculator stuff");
        EnterpriseCalculator enterpriseCalculator = new EnterpriseCalculator();
        enterpriseCalculator.convertToEuro(100);
        enterpriseCalculator.convertToUsd(300);
        enterpriseCalculator.printOperations();
        System.out.println("Number of enterprise usage: " + EnterpriseCalculator.getOperationsAmount());

    }
}
