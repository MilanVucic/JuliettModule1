package lesson_20;

import lesson_21.CloseableExample;

public class Triangle extends CloseableExample{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        CloseableExample.a = 50;
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("All triangle sides must be positive.");
        }
        if (a >= b + c || b >= a + c || c >= b + a) {
            throw new NonExistentTriangleException(a, b, c);
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
