package module_2.lesson_18;

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car("BMW", "320d", 23, 300);
        Car c2 = new Car("Audi", "A5", 2012, 50);
        Person p1 = new Person("Milan", 31, 177);
        try {
            RangeLimitProcessor.validate(c1);
            RangeLimitProcessor.validate(c2);
            RangeLimitProcessor.validate(p1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
