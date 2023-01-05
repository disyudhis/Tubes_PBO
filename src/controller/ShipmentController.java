/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Shipment;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Order;
import model.Status;

/**
 *
 * @author yudhi
 */
public class ShipmentController {

    private Connection con;
    private final koneksiController koneksi = new koneksiController();

    public boolean tambahShipment(Shipment shipment) throws SQLException {
        // membuka koneksi ke database
        con = koneksi.getConnection();

        // membuat query untuk tambah data
        String kueri = "INSERT INTO shipments (order_id, alamat, region, estimate) VALUES (?,?,?,?)";

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setInt(1, shipment.getOrder_id());
        ps.setString(2, shipment.getAlamat());
        ps.setString(3, shipment.getRegion());
        ps.setString(4, shipment.getEstimate());

        // mengeksekusi query
        int rowAffected = ps.executeUpdate();

        // menutup koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }

    public ArrayList<Shipment> tampilDataStatus() throws SQLException {
        ArrayList<Shipment> tampilStatus = new ArrayList<>();

        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk lihat biodata
        String kueri = "SELECT * from shipments";;
        PreparedStatement ps = con.prepareStatement(kueri);

        // mengeksekusi query
        ResultSet rs = ps.executeQuery();

        // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel status
        while (rs.next()) {
            int id = rs.getInt("id");
            int nama = rs.getInt("order_id");
            String jumlahAtasan = rs.getString("alamat");
            String jumlahBawahan = rs.getString("region");
            String estimate = rs.getString("estimate");

            Shipment ship = new Shipment(id, nama, jumlahAtasan, jumlahBawahan, estimate);
            tampilStatus.add(ship);
        }

        // menutup result set, preparedstatement dan koneksi
        rs.close();
        ps.close();
        con.close();

        // mengembalikan nilai
        return tampilStatus;
    }

}
