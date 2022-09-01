package hibernate;

import entity.Book;
import entity.Fio;

import java.sql.SQLException;
import java.util.List;

public interface DaoLibraryBook {


    List<Fio> getAllCargos() throws SQLException;

    Book getCargoById(Integer id, String name, String description, Integer count_page) throws SQLException;

    void addCargo(String name,String description, Integer count_page) throws SQLException;

   void updateCargo(Integer id, String name,String description, Integer count_page);

}

