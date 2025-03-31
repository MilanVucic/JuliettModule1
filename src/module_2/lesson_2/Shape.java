package module_2.lesson_2;

public abstract class Shape {
    private static int NEXT_ID = 1;
    private String color;
    private int id;

    public Shape(String color) {
        this.color = color;
        this.id = NEXT_ID++;
    }

    public String getColor() {
        return color;
    }

    public int getId() {
        return id;
    }

    public abstract double getArea();

    public abstract double getCircumference();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ID: " + getId() +
                "\nArea: " + getArea() + "\nCircumference: " + getCircumference();
    }
}
