package hr;

public class Teacher extends Person implements IEmployable {
    private double monthlyWage;
    public Teacher(String name, String surname) {
        super(name, surname);
        monthlyWage = 8000.00;
    }

    public Teacher(String name, String surname, double monthlyWage) {
        super(name, surname);
        this.monthlyWage = monthlyWage;
    }

    public double getYearlyWage() {
        return 12 * monthlyWage;
    }
}
