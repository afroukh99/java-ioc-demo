package Business;

import DAO.IDao;

public interface IBusiness {
    double calcul();
    void setDao(IDao dao);
}
