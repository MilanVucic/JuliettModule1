package lesson_13;

import lesson_13.shapes.Circle;
import lesson_13.shapes.Point2D;

public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(3, 4);
        Point2D p2 = new Point2D(0, 0);
        Point2D p3 = new Point2D(5, 12);
        Circle c1 = new Circle(2, 0, 3);
        Circle c2 = new Circle(1);
        Circle c3 = new Circle(2.01, 0, 3);
        System.out.println(c1.intersects(c2));
        System.out.println(c3.intersects(c2));
    }

    private static void innerClasses() {
        Example.StaticInnerClass e = new Example.StaticInnerClass();
        Example example = new Example();
        Example.InnerClass inner = example.new InnerClass();
    }

    private static void peopleWithIds() {
        Person p1 = new Person(30, "Milan");
        Person p2 = new Person(99, "Donny");
        Person p3 = new Person(19, "Richard");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }

    private static void helper() {
        Example e1 = new Example();
        Example e2 = new Example();
        e1.normalMethod();
        Example.doSomething();
        Example.b = 3000;
        System.out.println(Example.b);
        e1.doSomething();
    }
}
