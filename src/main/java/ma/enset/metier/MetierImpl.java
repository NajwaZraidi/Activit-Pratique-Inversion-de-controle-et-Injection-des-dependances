package ma.enset.metier;

import ma.enset.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;
@Component("metier")
public class MetierImpl implements IMetier {
    //injection des dependance spring
    //principe de couplage faible
    @Autowired
    @Qualifier("dao")//inject moi l'instance qui s'applle dao
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {}

    @Override
    public int calcul() {
        String date=dao.getDate();
        LocalDate localDate = LocalDate.parse(date);
        //System.out.println(localDate);
        LocalDate curDate = LocalDate.now();
        //System.out.println(Period.between(localDate, curDate).getYears() );
        //curDate.getYear()-localDate.getYear()
        int age=Period.between(localDate, curDate).getYears();
        return age;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
