/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import View.Dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yudhi
 */
public class AuthController {

    private Connection con;
    private final koneksiController koneksi = new koneksiController();

    public boolean Login(String username, String password) {
        PreparedStatement ps;
        ResultSet rs;

        boolean cekLogin = false;

        // queri untuk mengecek apakah username & password ada di database di table autentikasi
        String query = "SELECT * FROM `users` WHERE `username` =? AND `password` =?";

        // kodingan untuk pengecekan (jika user tidak mengisi field)
        if (username.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan Username!");
        } else if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Masukan Kata Sandi!");
        } else {
            try {
                ps = koneksi.getConnection().prepareStatement(query);

                ps.setString(1, username);
                ps.setString(2, password);

                // mengeksekusi queri
                rs = ps.executeQuery();

                // jika ada & dicek, maka akan berhasil login dan masuk ke halaman selanjutnya
                if (rs.next()) {

                    // Jika Admin Sudah Bayar ke Marikost
                    if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                        Dashboard dashboard = new Dashboard();
                        dashboard.setVisible(true);
                        cekLogin = true;

                        // jika tidak berhasil / tidak terdaftar maka akan muncul dialog jika user belom terdaftar & salah
                    } else {
                        JOptionPane.showMessageDialog(null, "Akun Belum Terdaftar / Nama Pengguna atau Kata Sandi Salah!", "Login Gagal!", 2);
                        cekLogin = false;
                    }
                }

            } catch (SQLException ex) {
                System.out.println("Error : " + ex.getMessage());
            }
        }
        return cekLogin;
    }
}
