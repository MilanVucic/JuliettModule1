package module_2.lesson_18;

@Stringify(fieldSeparator = "---", equalSign = ':')
public class Car {
    private String maker;
    private String model;
    @StringifyFieldName("year made")
    @RangeLimit(min = 1800, max = 2025)
    private int yearOfProd;
    @StringifyIgnore
    private boolean rented;
    @RangeLimit(min = 10, max = 5000)
    private double horsePower;

    public Car(String maker, String model, int yearOfProd, double horsePower) {
        this.maker = maker;
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.horsePower = horsePower;
    }
}
