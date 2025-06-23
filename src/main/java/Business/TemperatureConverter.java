package Business;

public class TemperatureConverter {

    public static  final double FAHRENHEIT_RATIO_TO_CELSIUS = 5.0 / 9.0;
    public static  final double FREEZING_POINT_FAHRENHEIT = 32.0;
    public static final double TOP_DELTA_FAHRENHEIT = 180.0;


    public static double fahrenheitToCelsius (double fahrenheit) {
        return  (FAHRENHEIT_RATIO_TO_CELSIUS * ( fahrenheit - FREEZING_POINT_FAHRENHEIT ));
    }


}
