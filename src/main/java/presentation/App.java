package presentation;

import Business.BusinessImplementationV1;
import DAO.DaoImplementationV2;
import DAO.IDao;

public class App {
    public static void main (String[] args) {
        IDao dao = new DaoImplementationV2();
        BusinessImplementationV1 businessImplementaionV1 = new BusinessImplementationV1(dao); // Injection via of dependencies Setter
        //businessImplementaionV1.setDao(dao); // Injection of dependencies via Setter
        System.out.printf("Temperature in Celsius is : %.2f°C\n"
                , businessImplementaionV1.calcul());
    }
}
