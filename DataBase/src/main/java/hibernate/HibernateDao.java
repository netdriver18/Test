package hibernate;

import com.mysql.cj.xdevapi.SessionFactory;
import entity.Book;
import entity.Fio;
import hibernate.config.HibernateSessionConfiguration;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class HibernateDao implements DaoLibraryBook {
    private static SessionFactory sessionFactory = (SessionFactory) HibernateSessionConfiguration.getSessionFactory();

    @Override
    public List<Fio> getAllCargos() throws SQLException {
        //try (Session session = sessionFactory.openSession()){
            return null;

       // }
    }

    @Override
    public Book getCargoById(Integer id, String name, String description, Integer count_page) throws SQLException {
        return null;
    }

    @Override
    public void addCargo(String name, String description, Integer count_page) throws SQLException {

    }

    @Override
    public void updateCargo(Integer id, String name, String description, Integer count_page) {

    }
}
