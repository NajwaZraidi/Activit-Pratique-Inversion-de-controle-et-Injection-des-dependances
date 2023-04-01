package ma.enset.presentation;

import ma.enset.dao.DaoImpl;
import ma.enset.metier.MetierImpl;
import ma.enset.ext.DaoImpl2;
import ma.enset.ext.DaoImplVWB;

public class Application1 {
    public static void main(String[] args) {
        /*
        injection des dépendances
        par instanciation statique
        => new -> couplage forte
         */
        DaoImpl dao=new DaoImpl();
        DaoImpl2 daoImpl2=new DaoImpl2();
        DaoImplVWB daoImplVWB=new DaoImplVWB();
        //injection via constructeur
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("L\'age est : " +metier.calcul()+" ans ");
        metier.setDao(daoImpl2);
        System.out.println("L\'age est : " +metier.calcul()+" ans ");
        metier.setDao(daoImplVWB);
        System.out.println("L\'age est : " +metier.calcul()+" ans ");

    }
}