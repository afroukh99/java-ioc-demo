package presentation;

import Business.BusinessImplementaionV1;
import DAO.DaoImplementaionV1;

public class App {
    public static void main (String[] args) {

        BusinessImplementaionV1 businessImplementaionV1 = new BusinessImplementaionV1();
        businessImplementaionV1.setDao(new DaoImplementaionV1());
        System.out.printf("Temperature in Celsius is : %.2f°F\n"
                , businessImplementaionV1.calcul());
    }
}
