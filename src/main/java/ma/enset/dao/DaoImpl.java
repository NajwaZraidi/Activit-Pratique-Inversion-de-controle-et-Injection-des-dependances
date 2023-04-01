package ma.enset.dao;

import org.springframework.stereotype.Component;
//spring annotation
@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public String getDate() {
        System.out.println("Version 1 Base de données : ");

        /*
        Se connecter à la base de données
        pour récupérer la date
        */
        String date="2001-06-18";
        return date;
    }
}
