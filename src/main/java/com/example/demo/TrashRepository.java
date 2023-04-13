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
    public List<Trash> getAllTrash() {
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


    /**
     *
     * @param number - number of Trash objects to be randomly selected
     * @return
     */
    public List<Trash> getRandomTrash(int number){
        /*Blandar om listan så att trashet ligger huller om buller: */
        List<Trash> trashes = getAllTrash();
        Collections.shuffle(trashes);

        /*Ny lista samt en for-loop som lägger in 5 stycken trash i den nya listan*/
        ArrayList<Trash> newTrash = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            newTrash.add(trashes.get(i));

        }
        return newTrash;
    }


    public Trash getOneTrash(){

        return getRandomTrash(1).get(0);
    }


}
