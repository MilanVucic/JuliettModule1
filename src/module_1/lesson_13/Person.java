package module_1.lesson_13;

public class Person {
    private static int NEXT_ID = 1;

    private int id = NEXT_ID++;
    private int age;
    private String firstName;

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            // Throw an exception instead of this
            System.out.println("Error! Age is negative.");
        } else {
            this.age = age;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.age == other.age && this.firstName.equals(other.firstName);
        }
        return false;
    }
}
