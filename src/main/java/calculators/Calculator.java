package calculators;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<String> operations;

    public Calculator() {
        this.operations = new ArrayList<>();
    }

    public void printOperations() {
        if (operations.size()==0) {
            System.out.println("Operation list is empty.");
        }
        for(String o : operations) {
            System.out.println(o);
        }
    }

    public void addOperation(String operation) {
        operations.add(operation);
    }

    public void resetOperations() {
        this.operations = new ArrayList<>();
    }

    public double add(double x, double y) {
        double result = x+y;
        addOperation("Added " + x + " to " + y + " got result " + result);
        return result;
    }

    public double subtract(double x, double y) {
        double result = x-y;
        addOperation("Subtracted " + y + " from " + x + " got result " + result);
        return result;
    }

    public double multiply(double x, double y) {
        double result = x*y;
        addOperation("Multiplied " + x + " by " + y + " got result " + result);
        return result;
    }

    public double divide(double x, double y) {
        double result = x/y;
        addOperation("Divided " + x + " by " + y + " got result " + result);
        return result;
    }
}
