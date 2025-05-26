package module_2.lesson_18;

@Stringify(includeClassName = false, fieldSeparator = ", ")
public class Person {
    private String name;
    @StringifyFieldName("your age")
    private int age;
    @RangeLimit(min = 20, max = 272)
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
