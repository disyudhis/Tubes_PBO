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

/**
 *
 * @author yudhi
 */
public class OrderController {

    private Connection con;
    private final koneksiController koneksi = new koneksiController();

    public boolean tambahPesanan(Order order) throws SQLException {
        // membuka koneksi ke database
        con = koneksi.getConnection();

        // membuat query untuk tambah data
        String kueri = "INSERT INTO orders (nama, jumlahAtasan, jumlahBawahan, pewangi, total) VALUES (?,?,?,?,?)";

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setString(1, order.getNama());
        ps.setInt(2, order.getJumlahAtasan());
        ps.setInt(3, order.getJumlahBawahan());
        ps.setString(4, order.getPewangi());
        ps.setInt(5, order.getTotal());

        // mengeksekusi query
        int rowAffected = ps.executeUpdate();

        // menutup koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }

//    ubah data pesanan
    public boolean ubahDataBooking(Order order) throws SQLException {

        // membuka koneksi ke database
        con = koneksi.getConnection();

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        String kueri = "UPDATE orders SET nama=?, jumlahAtasan=?, jumlahBawahan=?, pewangi=?, total=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setInt(6, order.getId());
        ps.setString(1, order.getNama());
        ps.setInt(2, order.getJumlahAtasan());
        ps.setInt(3, order.getJumlahBawahan());
        ps.setString(4, order.getPewangi());
        ps.setInt(5, order.getTotal());

        // mengeksekusi query
        int rowAffected = ps.executeUpdate();

        // menutup preparedstatement & koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }

    //hapus data pesanan
    public boolean hapusDataPesanan(String id) throws SQLException {

        // membuka koneksi ke database
        con = koneksiController.getConnection();

        // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
        String kueri = "DELETE FROM booking WHERE idbooking = ?";
        PreparedStatement ps = con.prepareStatement(kueri);
        ps.setString(1, id);

        // mengeksekusi query
        int rowAffected = ps.executeUpdate();

        // menutup preparedstatement & koneksi
        ps.close();
        con.close();

        // mengembalikan nilai data untuk dirubah ke database mysql
        return rowAffected == 1;
    }

    // tampil booking
    public ArrayList<Order> tampilDataOrder() throws SQLException {
        ArrayList<Order> tampilOrder = new ArrayList<>();

        // membuka koneksi
        con = koneksi.getConnection();

        // membuat query untuk lihat biodata
        String kueri = "SELECT * FROM orders";
        PreparedStatement ps = con.prepareStatement(kueri);

        // mengeksekusi query
        ResultSet rs = ps.executeQuery();

        // melakukan perulangan untuk menampilkan seluruh data yang ada di tabel bio
        while (rs.next()) {
            int id = rs.getInt("id");
            String nama = rs.getString("nama");
            int jumlahAtasan = rs.getInt("jumlahAtasan");
            int jumlahBawahan = rs.getInt("jumlahBawahan");
            String pewangi = rs.getString("pewangi");
            int total = rs.getInt("total");

            Order listdataorder = new Order(id, nama, pewangi, jumlahAtasan, jumlahBawahan, total);
            tampilOrder.add(listdataorder);
        }

        // menutup result set, preparedstatement dan koneksi
        rs.close();
        ps.close();
        con.close();

        // mengembalikan nilai
        return tampilOrder;
    }

    // mengecek apakah id barber sudah ada atau belum
//    public boolean cekIdUsers(String nama) {
//        PreparedStatement ps;
//        ResultSet rs;
//        boolean checkId = false;
//
//        // queri sql untuk mengecek nama
//        String query = "SELECT * FROM `users` WHERE `id` =?";
//
//        // melakukan eksepsi untuk mengetahui jika ada error (try & catch)
//        try {
//            // Menyiapkan database / memanipulasi data untuk dikiirm kedatabase untuk dieksekusi
//            ps = Koneksi.getConnection().prepareStatement(query);
//            ps.setString(1, nama);
//
//            // mengeksekusi query
//            rs = ps.executeQuery();
//
//            // pengecekan apakah usernamenya sudah ada atau tidak
//            if (rs.next()) {
//                checkId = true;
//            }
//        } catch (SQLException ex) {
//            System.out.println("Error : " + ex.getMessage());
//        }
//
//        // mengembalikan nilai untuk pengecekan nama
//        return checkId;
//    }
}
