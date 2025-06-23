package Business;

import DAO.IDao;

public class BusinessImplementaionV1 implements IBusiness{

// Loose Coupling
    private  IDao dao;

    /*
    * Methode that get Temperature in (F) from injected dao object methode (getData)
    *  and convert it Celsius
    * */
    @Override
    public double calcul() {
        double tempInFahrenheit = dao.getData();
        System.out.printf("Temperature in Fahrenheit is : %.2f°F\n" , tempInFahrenheit);
        return TemperatureConverter.fahrenheitToCelsius(tempInFahrenheit);
    }

    /*
    * To inject object of class that implements IDao interface
    *  */
    @Override
    public void setDao(IDao dao) {
        this.dao = dao;
    }


}
