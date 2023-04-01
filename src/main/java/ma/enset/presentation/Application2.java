package ma.enset.presentation;

import ma.enset.dao.IDao;
import ma.enset.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws Exception {
     //la lecteur de ficher text
        Scanner scanner=new Scanner(new File("C:\\Users\\najwa\\OneDrive\\Desktop\\cours GLSID2 S4\\JEE\\TPs_JEE\\Devoir1\\config.txt"));
        // lire la premire fichier text pour recuperer la 1ere classe
        String daoClassName=scanner.nextLine();
        //System.out.println(daoClassName);
        //instanciation dynamique
        Class cDao=Class.forName(daoClassName);
        //System.out.println(cDao);
        //instanciation de class
        IDao Dao = (IDao) cDao.newInstance();
        //System.out.println(Dao.getDate());
    //=> DaoImpl dao=new DaoImpl();
        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.newInstance();
        //=> MetierImpl dao=new MetierImpl();
        //methode setDao maniere dynamique contient un seul parametre de type Idao
        Method method=cMetier.getMethod("setDao",IDao.class);
        //execution de methode
        //metier.setDao invoke methode sur l'objet metier et tranmettre par dao
        method.invoke(metier,Dao);
        System.out.println("L\'age est : " +metier.calcul()+" ans ");

    }
}
