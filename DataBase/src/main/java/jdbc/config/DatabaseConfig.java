package jdbc.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.mysql.cj.conf.PropertyKey.PASSWORD;

public class DatabaseConfig {
    //private static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
    //JDBC
    //static final String USER = "postgres";
    //static final String PASSWORD = "123";
    //private static final String URL = "jdbc:postgresql://localhost:5432/Library"; ;

    //public static Connection getConnection() throws ClassNotFoundException, SQLException {
    //  Class.forName(POSTGRESQL_DRIVER);

    //return DriverManager.getConnection(URL, USER, PASSWORD);
    //}

    //JPA

    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;

    private static EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("AppStorePersistence");
        }
        return entityManagerFactory;
    }

    public static EntityManager getEntityManager() {
        if (entityManager == null) {
            entityManager = getEntityManagerFactory().createEntityManager();
        }
        return entityManager;
    }
}
