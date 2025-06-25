package presentation;

import Business.IBusiness;
import DAO.IDao;

import java.io.File;
import java.util.Scanner;

public class AppV2 {
    public static void main(String[] args) {

        IDao dao;
        IBusiness businessImplementation;

        try {
            Scanner sc = new Scanner(new File("config.txt"));

            String daoClassName = sc.nextLine();
            String businessClassName = sc.nextLine();

            dao = (IDao) Class
                    .forName(daoClassName)
                    .getConstructor()
                    .newInstance();

            businessImplementation = (IBusiness) Class
                    .forName(businessClassName)
                    .getConstructor(IDao.class)
                    .newInstance(dao);

            System.out.printf("Temperature in Celsius is : %.2f°C\n"
                    , businessImplementation.calcul());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
