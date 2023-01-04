/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.User;

/**
 *
 * @author A S U S
 */
public class userController {

    private Connection con;
    private final koneksiController koneksi = new koneksiController();

    //fungsi cekId
    public boolean cekUsername(String username) {
        PreparedStatement ps;
        ResultSet rs;
        boolean cekUser = false;

        String queryCek = "SELECT * FROM users WHERE username = ?";

        try {
            ps = koneksi.getConnection().prepareStatement(queryCek);
            ps.setString(1, username);
//            ps.setString(2, password);

            //result set
            rs = ps.executeQuery();

            if (rs.next()) {
                cekUser = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cekUser;
    }

    //ubah data
    public boolean ubahData(User user) throws SQLException {

        // membuka koneksi ke database
        con = koneksi.getConnection();

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        String kueri = "UPDATE orders SET password=?, noTelp=?, email=?, alamat=? WHERE username=?";
        PreparedStatement ps = con.prepareStatement(kueri);
//        ps.setInt(6, order.getId());
        ps.setString(5, user.getUsername());
        ps.setString(1, user.getPassword());
        ps.setString(2, user.getNoTelp());
        ps.setString(3, user.getEmail());
        ps.setString(4, user.getAlamat());


        // mengeksekusi query
        int rowAffected = ps.executeUpdate();

        // menutup preparedstatement & koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }

    // TAMPIL DATA 
    public ArrayList<User> tampilData() throws SQLException {
        ArrayList<User> tampil = new ArrayList<>();

        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk tampil data biodata
        String kueri = "SELECT * FROM users";
        PreparedStatement ps = con.prepareStatement(kueri);

        // mengeksekusi query
        ResultSet rs = ps.executeQuery();

        // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel data
        while (rs.next()) {
            int id = rs.getInt("id");
            String username = rs.getString("username");
            String noTelp = rs.getString("noTelp");
            String email = rs.getString("email");
//            String password = rs.getString("password");
            String alamat = rs.getString("alamat");

            User listdata = new User(id, username, noTelp, email, alamat);
            tampil.add(listdata);
        }

        // menutup result set, preparedstatement dan koneksi
        rs.close();
        ps.close();
        con.close();

        // mengembalikan nilai
        return tampil;
    }

    //fungsi tambahdata
    //Biodata dari model
    public boolean tambahData(User user) throws SQLException {

        con = koneksi.getConnection();
        String queryTambah = "insert into users (username,noTelp,email,password,alamat) values(?,?,?,?,?)";

        //prepared Statement
        PreparedStatement ps = con.prepareStatement(queryTambah);

//        ps.setInt(1, user.getId());
        ps.setString(1, user.getUsername());
        ps.setString(2, user.getNoTelp());
        ps.setString(3, user.getEmail());
        ps.setString(4, user.getPassword());
        ps.setString(5, user.getAlamat());

        int rowAffected = ps.executeUpdate();

        ps.close();
        con.close();

        return rowAffected == 1;
    }

}
