package lesson_12;

public class Student extends Person {
    double gradeAverage = 5.0; // grade point average

    public void displayInfo() {
        super.displayInfo();
        System.out.println(gradeAverage);
    }
}
