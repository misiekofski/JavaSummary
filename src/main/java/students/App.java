package students;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.out.println("Kadry...");
        List<ICompensable> peopleList = new ArrayList<>();

        // let's create new different types of employees
        Teacher t1 = new Teacher("Jan", "Kowalski", 6666);
        Teacher t2 = new Teacher("Grazyna", "Nowak", 7777);
        Manager m1 = new Manager("Michal", "Menadżerski", 0.2);

        peopleList.add(t1);
        peopleList.add(t2);
        peopleList.add(m1);

        // yearly wages of people working in our company, one by one
        peopleList.forEach(p -> {
            System.out.print(p.getPersonFullName() + " gets yearly: ");
            System.out.println(p.getYearlyWage());
        });

        // how much do we pay to all employees in our company
        double howMuchDoWePay = peopleList
                .stream()
                .mapToDouble(ICompensable::getYearlyWage)
                .sum();

        System.out.println("In summary we pay: " + howMuchDoWePay + " yearly to all employees.");

    }
}
