package jdbc.dao;

import jdbc.config.DatabaseConfig;
import jdbc.entity.LibraryEntity;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoLibraryImpl implements DaoLibrary {
    private static Connection connection;

    static {
        try {
            connection = DatabaseConfig.getConnection();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public LibraryEntity getCargoById(Integer book_id) throws SQLException {
        try (PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM BOOK WHERE id = ?")) {
            statement.setInt(1, book_id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt(book_id);

                return new LibraryEntity(id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<LibraryEntity> getAllCargos() {
        List<LibraryEntity> cargoEntities = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM book");
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String description = resultSet.getString("description");
                int id = resultSet.getInt("id");
                int count_page = resultSet.getInt("count_page");
                cargoEntities.add(new LibraryEntity(id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cargoEntities;
    }
}

