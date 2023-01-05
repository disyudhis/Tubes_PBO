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
import model.Status;

/**
 *
 * @author AHAN
 */
public class StatusController {
    
    private Connection con;
    private final koneksiController koneksi = new koneksiController();
    
    // tampil data
    public ArrayList<Status> tampilDataStatus() throws SQLException {
        ArrayList<Status> tampilStatus = new ArrayList<>();

        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk lihat biodata
        String kueri = "SELECT s.shipment_id, s.estimate, o.name, o.jumlah_atasan, o.jumlah_bawahan FROM shipments s INNER JOIN orders o ON s.order_id = o.order_id WHERE s.shipment_id = ?";;
        PreparedStatement ps = con.prepareStatement(kueri);

        // mengeksekusi query
        ResultSet rs = ps.executeQuery();

        // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel status
        while (rs.next()) {
            int id = rs.getInt("id");
            String nama = rs.getString("nama");
            int jumlahAtasan = rs.getInt("jumlahAtasan");
            int jumlahBawahan = rs.getInt("jumlahBawahan");
            String estimate = rs.getString("estimate");

            Status listdatastatus = new Status(id, nama, jumlahAtasan, jumlahBawahan, estimate);
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
