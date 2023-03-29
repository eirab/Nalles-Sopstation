package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.awt.print.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TrashRepository {
    @Autowired
    private DataSource dataSource;

    private Trash createTrash(ResultSet rs)throws SQLException {
        return new Trash(rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("trash_category_id"));
    }
    public List<Trash> getTrash() {
        List<Trash> trashes = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name, trash_category_id FROM trash")) {

            while (rs.next()){
                trashes.add(createTrash(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trashes;
    }
}