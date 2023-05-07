package students;

public class Manager extends Person implements IEmployable {
    private double successShare;

    public Manager(String name, String surname, double successShare) {
        super(name, surname);
        this.successShare = successShare;
    }

    public double getYearlyWage() {
        return 200_000 * (1+successShare);
    }
}
