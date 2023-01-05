/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author A S U S
 */
public class koneksiController {

    static MysqlDataSource ds = new MysqlDataSource();

    public static Connection getConnection() {
        Connection koneksi = null;

        String DB_NAME = "jdbc:mysql://localhost:3306/clinz_pbo";
        String DB_USER = "root";
        String DB_PASS = "";

        try {
            ds.setUrl(DB_NAME);
            ds.setUser(DB_USER);
            ds.setPassword(DB_PASS);

//            Class.forName("com.mysql.jdbc.Driver");
            koneksi = ds.getConnection();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return koneksi;

    }
}
