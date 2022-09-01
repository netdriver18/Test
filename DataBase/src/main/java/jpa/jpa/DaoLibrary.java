package jpa.jpa;

import entity.Book;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface DaoLibrary {


    List<Integer > getAllCargos() throws SQLException;

    Optional<Book> getCargoById(Integer id) throws SQLException;

     void addBook(Book bookEntity);

    void  deleteBook(Book bookEntity);
}

