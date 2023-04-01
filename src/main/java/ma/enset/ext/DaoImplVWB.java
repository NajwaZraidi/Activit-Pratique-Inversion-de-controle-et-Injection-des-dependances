package ma.enset.ext;

import ma.enset.dao.IDao;

public class DaoImplVWB implements IDao {
    @Override
    public String getDate() {
        System.out.println("Version Web Service : ");
        String date="1975-04-12";
        return date;
    }

}
