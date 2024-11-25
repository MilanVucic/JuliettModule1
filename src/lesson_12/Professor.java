package lesson_12;

public class Professor extends Person {
    String subject = "math";
    int yearsOfExperience = 10;

    public void displayInfo() {
        super.displayInfo();
        System.out.println(subject + " " + yearsOfExperience);
    }
}
