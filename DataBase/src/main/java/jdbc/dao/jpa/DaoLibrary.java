package jdbc.dao.jpa;

import jdbc.entity.bookEntity;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DaoLibrary {


    List<Integer > getAllCargos() throws SQLException;

    Optional<bookEntity> getCargoById(Integer id) throws SQLException;

     void addBook(bookEntity bookEntity);

    void  deleteBook(bookEntity bookEntity);
}

