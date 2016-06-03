package ro.tekin.jpa.exam2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by tekin.omer on 11/7/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exam2");
        EntityManager em = emf.createEntityManager();


    }
}
