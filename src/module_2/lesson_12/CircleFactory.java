package module_2.lesson_12;

public class CircleFactory implements ShapeFactory{
    @Override
    public Shape produce() {
        return new Circle();
    }
}
