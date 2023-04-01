package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class NewTrashRepository {
        @Autowired
        private DataSource dataSource;

    private NewTrash createNewTrash(ResultSet rs)throws SQLException {
        return new NewTrash(rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("trash_category_id"),
                rs.getString("image"));
    }

        
    public List<NewTrash> getNewTrash() {
        List<NewTrash> newTrashes = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, trash_category_id, image FROM trash")) {

            while (rs.next()){
                newTrashes.add(createNewTrash(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return newTrashes;

    }
}
