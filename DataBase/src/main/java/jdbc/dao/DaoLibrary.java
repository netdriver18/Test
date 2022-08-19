package jdbc.dao;

import jdbc.entity.LibraryEntity;

import java.sql.SQLException;
import java.util.List;

public interface DaoLibrary {


    List<LibraryEntity> getAllCargos() throws SQLException;

    LibraryEntity getCargoById(Integer id) throws SQLException;

    //void addCargo(String description, Double volume) throws SQLException;

   // void updateCargo(Integer cargoId, String description, Double volume);

}

