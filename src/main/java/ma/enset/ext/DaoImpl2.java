package ma.enset.ext;

import ma.enset.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public String getDate() {
        System.out.println("Version 2 Base de données : ");
        String date="1975-04-12";
        return date;
    }
}
