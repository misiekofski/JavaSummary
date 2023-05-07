package students;

public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getPersonFullName() {
        return name + " " + surname;
    }

    public boolean sameNameAndSurname(Person otherPerson) {
        return (this.name.equalsIgnoreCase(otherPerson.name) && this.surname.equalsIgnoreCase(otherPerson.surname));
    }
}
