package students;

public class Manager extends Person implements ICompensable {
    private double successShare;
    private double monthlyWage;

    public Manager(String name, String surname, double successShare) {
        super(name, surname);
        this.successShare = successShare;
    }

    public double getYearlyWage() {
        return (12 * monthlyWage) * (1+successShare);
    }
}
