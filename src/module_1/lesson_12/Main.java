package module_1.lesson_12;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "320d");

        Vehicle v2 = new Vehicle();
        System.out.println(v1.maker);
        System.out.println(v2.maker);
    }

    private static void oopExample() {
        Person p1 = new Person();
        p1.name = "Milan";
        p1.email = "something@email.com";
        Person p2 = new Person();
        p2.name = "Richard";
        p2.email = "rich@email.com";

        Person s1 = new Student();
        s1.name = "Mikhail";
        s1.email = "asdasd@asdaew.com";
        Person s2 = new Professor();
        s2.name = "Bijay";
        s2.email = "asdasd@asd.com";
        Person[] people = {p1, p2, s1, s2};
        for (int i = 0; i < people.length; i++) {
            people[i].displayInfo();
        }
    }
}
