package jpa.jpa;

import entity.Book;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JPA_DaoLibrary jpa_daoLibrary = new JPA_DaoLibrary();
        jpa_daoLibrary.getAllCargos().forEach(System.out::println);
        System.out.println(jpa_daoLibrary.getCargoById(10));
        Book Book = new Book("Book for child", "about world ", 567);
        jpa_daoLibrary.addBook(Book);
        Integer id = Book.getId();
        System.out.println(jpa_daoLibrary.getCargoById(id));

        Book.setName("Test");
        jpa_daoLibrary.addBook(Book);
        System.out.println(jpa_daoLibrary.getCargoById(id));

        jpa_daoLibrary.deleteBook(Book);
        System.out.println(jpa_daoLibrary.getCargoById(id));
    }

}
