package DAO;

import Business.TemperatureConverter;

import java.util.Random;

public class DaoImplementaionV1 implements IDao {
    @Override
    public double getData() {
        double TOP_DELTA_FAHRENHEIT = TemperatureConverter.TOP_DELTA_FAHRENHEIT;
        double FREEZING_POINT_FAHRENHEIT = TemperatureConverter.FREEZING_POINT_FAHRENHEIT;
        Random randomDouble = new Random();
        return  randomDouble.nextDouble(FREEZING_POINT_FAHRENHEIT) * TOP_DELTA_FAHRENHEIT;
    }
}
