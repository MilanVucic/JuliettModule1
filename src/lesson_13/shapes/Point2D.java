package lesson_13.shapes;

public class Point2D {
    private double x, y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point2D other) {
        double a = (this.y - other.y);
        double b = (this.x - other.x);
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
