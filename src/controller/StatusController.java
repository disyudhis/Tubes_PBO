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
import model.Order;
import model.Shipment;
import model.Status;

/**
 *
 * @author AHAN
 */
public class StatusController {

    private Connection con;
    private final koneksiController koneksi = new koneksiController();

    // tampil data
    public boolean tambahStatus(Status status) throws SQLException {
        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk tambah data
        String kueri = "INSERT INTO status (no, nama, alamat, region, estimate, status) VALUES (?,?,?,?,?,?)";

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setInt(1, status.getNo());
        ps.setString(2, status.getNama());
        ps.setString(3, status.getAlamat());
        ps.setString(4, status.getRegion());
        ps.setString(5, status.getEstimate());
        ps.setString(6, status.getStatus());

        // mengeksekusi query
        int rowAffected = ps.executeUpdate();
        // menutup koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }
    
    // tampil booking
    public ArrayList<Status> tampilDataStatus() throws SQLException {
        ArrayList<Status> tampilStatus = new ArrayList<>();

        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk lihat biodata
        String kueri = "SELECT * FROM status";
        PreparedStatement ps = con.prepareStatement(kueri);

        // mengeksekusi query
        ResultSet rs = ps.executeQuery();

        // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel bio
        while (rs.next()) {
            int no = rs.getInt("no");
            String nama = rs.getString("nama");
            String alamat = rs.getString("alamat");
            String region = rs.getString("region");
            String estimate = rs.getString("estimate");
            String status = rs.getString("status");

            Status listdatastatus = new Status(no, nama, alamat, region, estimate, status);
            tampilStatus.add(listdatastatus);
        }

        // menutup result set, preparedstatement dan koneksi
        rs.close();
        ps.close();
        con.close();

        // mengembalikan nilai
        return tampilStatus;
    }
}
