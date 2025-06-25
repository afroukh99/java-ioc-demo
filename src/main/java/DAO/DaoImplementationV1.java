package DAO;

import Business.TemperatureConverter;

import java.util.Random;

public class DaoImplementationV1 implements IDao {
    @Override
    public double getData() {
        double top = TemperatureConverter.TOP_DELTA_FAHRENHEIT;
        double freezing = TemperatureConverter.FREEZING_POINT_FAHRENHEIT;
        Random random = new Random();
        return freezing + (top - freezing) * random.nextDouble();
    }
}
