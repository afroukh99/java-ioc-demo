package Business;

public class TemperatureConverter {

    public static  final double CELSIUS_TO_FAHRENHEIT_RATIO = 9.0 / 5.0;
    public static  final double FREEZING_POINT_FAHRENHEIT = 32.0;
    public static final double TOP_DELTA_FAHRENHEIT = 180.0;


    public static double fahrenheitToCelsius (double fahrenheit) {
        return  (CELSIUS_TO_FAHRENHEIT_RATIO * ( fahrenheit - FREEZING_POINT_FAHRENHEIT ));
    }


}
