package jdbc;

import entity.Book;

import java.sql.*;
import java.util.List;

public class DaoLibraryImpl implements DaoLibrary {
    //private static Connection connection;

    // static {
    //    try {
    //        connection = DatabaseConfig.getConnection();
    //    } catch (ClassNotFoundException | SQLException e) {
    //        e.printStackTrace();
    //    }

    // }

    @Override
    public void addCargo(String name, String description, Integer count_page) throws SQLException {
        // try (PreparedStatement preparedStatement =
        //              connection.prepareStatement("INSERT INTO BOOK (name,description, count_page) VALUES (?,?,?)")) {
        //     preparedStatement.setString(1, name);
        //     preparedStatement.setString(2, description);
        //     preparedStatement.setInt(3, count_page);
        //     System.out.println(preparedStatement.executeUpdate());
        // } catch (SQLException e) {
        //     e.printStackTrace();
        // }

    }

    @Override
    public void updateCargo(Integer id, String name, String description, Integer count_page) {

        //  try (PreparedStatement preparedStatement =
        //               connection.prepareStatement("UPDATE book SET name = ?, description = ?, count_page = ?  WHERE id = ?")) {
        //      preparedStatement.setString(1, name);
        //      preparedStatement.setString(2, description);
        //      preparedStatement.setInt(3, count_page);
        //      preparedStatement.setInt(4, id);
        //      System.out.println(preparedStatement.executeUpdate());
        //  } catch (SQLException e) {
        //      e.printStackTrace();
        //  }
    }

    @Override
    public Book getCargoById(Integer book_id, String name_book, String descriptions_book, Integer count_page_book) throws SQLException {
        // try (PreparedStatement statement =
        //              connection.prepareStatement("SELECT * FROM BOOK WHERE id = ?AND name =?AND description = ?AND count_page=?")) {
        //    statement.setInt(1, book_id);
        //    ResultSet resultSet = statement.executeQuery();

        //      if (resultSet.next()) {
        //         int id = resultSet.getInt(book_id);
        //         String descriptions = resultSet.getString(descriptions_book);
        //         Integer count_page = resultSet.getInt(count_page_book);
        //         String name = resultSet.getString(name_book);
        //         return new book(id, name_book, descriptions, count_page);
        //     }
        //  } catch (SQLException e) {
        //      e.printStackTrace();
        //  }
        return null;
    }

    @Override
    public List<Book> getAllCargos() {
        //  List<book> cargoEntities = new ArrayList<>();
        //  try (Statement statement = connection.createStatement()) {
        //      ResultSet resultSet = statement.executeQuery("SELECT * FROM book");
        //      while (resultSet.next()) {
        //          String name = resultSet.getString("name");
        //          String description = resultSet.getString("description");
        //          int id = resultSet.getInt("id");
        //          int count_page = resultSet.getInt("count_page");
        //          cargoEntities.add(new book(id, name, description, count_page));
        //      }
        //  } catch (SQLException e) {
        //      e.printStackTrace();
        //  }

        return List.of();
    }
}

