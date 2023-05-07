package students;

public class Student extends Person {
    private int studentNumber;

    public Student(String name, String surname) {
        super(name, surname);
        studentNumber = 0;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}
