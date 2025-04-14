package module_2.lesson_7;

import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        printValues(5);
        printValues(3, "asd");
        printValues(4, "asd", "asda", "qwiojehqw");
        String.format("%d %s %d", 1, "hello", 5);
    }

    private static void printValues(int num, Object... values) {
        for (Object value : values) {
            System.out.println(value);
        }
    }

    private static void hashingExample() {
        Example a = new Example(1,3);
        Example b = new Example(1,3);
        Example c = a;

        HashSet<Example> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(new Example(1,523));
        System.out.println(set.size());
    }

    private static void switchExpressionExample() {
        int choice = 50;
        String message;
        message = switch (choice) {
            case 0, 5 -> {
                System.out.println("!!!");
                yield "Info needed";
            }
            case 1 -> "Message sent";
            case 2 -> "Message delivered";
            default -> "Nothing happened";
        };
        System.out.println(message);
    }

    private static void instanceOfExample() {
        ParentClass p = new ChildClass();
        p.parentMethod();
        if (p instanceof ChildClass) {
            ChildClass c = (ChildClass) p;
            c.childMethod();
        }
        if (p instanceof ChildClass anything) {
            anything.childMethod();
        }
    }
}
