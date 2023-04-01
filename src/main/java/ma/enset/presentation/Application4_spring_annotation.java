package ma.enset.presentation;


import ma.enset.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application4_spring_annotation {

    public static void main(String[] args) {
        //scan de package ma equivalent scan de tous les classes : base package
        //ApplicationContext context=new AnnotationConfigApplicationContext("ma.enset.ao","ma.enset.Metier");
       ApplicationContext context=new AnnotationConfigApplicationContext("ma");
       IMetier metier = context.getBean(IMetier.class);
       // IMetier metier = (IMetier) context.getBean("metier");
       System.out.println("L'age est : " +metier.calcul()+" ans ");



    }
}
