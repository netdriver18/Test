package jdbc.dao.jdbc;

import jdbc.entity.bookEntity;

import java.sql.SQLException;
import java.util.List;

public interface DaoLibrary {


    List<bookEntity> getAllCargos() throws SQLException;

    bookEntity getCargoById(Integer id, String name, String description, Integer count_page) throws SQLException;

    void addCargo(String name,String description, Integer count_page) throws SQLException;

   void updateCargo(Integer id, String name,String description, Integer count_page);

}

