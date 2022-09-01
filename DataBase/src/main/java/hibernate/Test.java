package hibernate;

import entity.Fio;
import hibernate.config.HibernateSessionConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateSessionConfiguration.getSessionFactory();
        Session currentSession = sessionFactory.getCurrentSession();
        Transaction transaction = currentSession.beginTransaction();
        System.out.println(currentSession.createQuery("SELECT fio From Fio fio WHERE fio.id_author =: fio_id", Fio.class)
                .setParameter("fio_id", 3)
                .getResultList());
        transaction.commit();
        currentSession.close();
    }
}
