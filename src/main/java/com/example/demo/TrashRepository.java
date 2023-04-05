package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class TrashRepository {
    @Autowired
    private DataSource dataSource;


    private Trash createTrash(ResultSet rs)throws SQLException {
        return new Trash(rs.getInt("id"),
                rs.getInt("trash_category_id"),
                rs.getString("image"));
    }
    public List<Trash> getTrash() {
        List<Trash> trashes = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id,trash_category_id, image FROM trash")) {

            while (rs.next()){
                trashes.add(createTrash(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return trashes;
    }

    public ArrayList<Trash> getTrash(int number){
        /*Lista med all trash som finns i databasen: */
        List allTrash = getTrash();

        /*Blandar om listan så att trashet ligger huller om buller: */
        Collections.shuffle(allTrash);

        /*Ny lista samt en for-loop som lägger in 5 stycken trash i den nya listan*/
        ArrayList<Trash> fiveTrash = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            fiveTrash.add((Trash) allTrash.get(i));
        }
        return fiveTrash;
    }

    public Trash getOneTrash(){

        return getTrash(1).get(0);
    }


}
