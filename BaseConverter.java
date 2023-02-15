package Lesson7_tasks;

public class BaseConverter {
    private double celsius;

    public BaseConverter(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double toKelvin() {
        return celsius + 273.15;
    }

    public double toFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public double toRankine() {
        return (celsius + 273.15) * 9.0 / 5.0;
    }

    public double convert(String toUnit) {
        switch (toUnit) {
            case "K":
                return toKelvin();
            case "F":
                return toFahrenheit();
            case "R":
                return toRankine();
            default:
                return celsius;
        }
    }
}
