package jpa.jpa;

import config.DatabaseConfig;
import entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class JPA_DaoLibrary implements DaoLibrary {
    private static EntityManager entityManager;

    static {
        entityManager = DatabaseConfig.getEntityManager();
    }

    public JPA_DaoLibrary() {
    }

    @Override
    public void addBook(Book bookEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(bookEntity);
        transaction.commit();

    }

    @Override
    public void deleteBook(Book bookEntity) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(bookEntity);
        transaction.commit();
    }

    @Override
    public List<Integer> getAllCargos() throws SQLException {
        return entityManager.createQuery("SELECT book.id FROM bookEntity book", Integer.class).getResultList();
    }

    @Override
    public Optional<Book> getCargoById(Integer id) throws SQLException {
        return  entityManager.createQuery("SELECT book FROM bookEntity book WHERE book.id=: id", Book.class)
                .setParameter("id", id)
                .getResultList()
                .stream()
                .findFirst();
    }

}
