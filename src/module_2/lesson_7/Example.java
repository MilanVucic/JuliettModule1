package module_2.lesson_7;

import module_1.lesson_13.Person;

import java.util.Objects;

public class Example {
    private int a;
    private double b;

    public Example(int a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Example e) {
            return this.a == e.a && this.b == e.b;
        }
        return false;
    }
}
