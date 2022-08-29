package jdbc.dao.jpa;

import jdbc.entity.bookEntity;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        JPA_DaoLibrary jpa_daoLibrary = new JPA_DaoLibrary();
        jpa_daoLibrary.getAllCargos().forEach(System.out::println);
        System.out.println(jpa_daoLibrary.getCargoById(10));
        bookEntity bookEntity = new bookEntity("Book for child", "about world ", 567);
        jpa_daoLibrary.addBook(bookEntity);
        Integer id = bookEntity.getId();
        System.out.println(jpa_daoLibrary.getCargoById(id));

        bookEntity.setDescriptions("main");
        jpa_daoLibrary.addBook(bookEntity);
        System.out.println(jpa_daoLibrary.getCargoById(id));

        jpa_daoLibrary.deleteBook(bookEntity);
        System.out.println(jpa_daoLibrary.getCargoById(id));
    }

}
