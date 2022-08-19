import jdbc.config.DatabaseConfig;
import jdbc.dao.DaoLibraryImpl;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConfig.getConnection();
        System.out.println(connection.getMetaData().getURL());

        DaoLibraryImpl daoLibrary = new DaoLibraryImpl();
        System.out.println(daoLibrary.getAllCargos());
        System.out.println(daoLibrary.getCargoById(1));
    }
}
