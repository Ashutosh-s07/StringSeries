import java.util.Arrays;

public class ConverttheTemperature {
    public static double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        return new double[]{kelvin,fahrenheit};
    }
    public static void main(String[] args) {
        double celsius = 122.11;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
}
