package lesson_20;

public class NonExistentTriangleException extends IllegalArgumentException {
    private double a, b, c;

    public NonExistentTriangleException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getMessage() {
        return "Triangle with sides:" + a + " " + b + " " + c + " cannot exist.";
    }
}
