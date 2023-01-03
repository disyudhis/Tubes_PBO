/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A S U S
 */
public class Order {

    private String nama, pewangi;
    private int jumlahAtasan, jumlahBawahan, total, id;

    public Order(String nama, String pewangi, int jumlahAtasan, int jumlahBawahan, int total) {
        this.nama = nama;
        this.pewangi = pewangi;
        this.jumlahAtasan = jumlahAtasan;
        this.jumlahBawahan = jumlahBawahan;
        this.total = total;
    }

    public Order(int id, String nama, String pewangi, int jumlahAtasan, int jumlahBawahan, int total) {
        this.id = id;
        this.nama = nama;
        this.pewangi = pewangi;
        this.jumlahAtasan = jumlahAtasan;
        this.jumlahBawahan = jumlahBawahan;
        this.total = total;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPewangi() {
        return pewangi;
    }

    public void setPewangi(String pewangi) {
        this.pewangi = pewangi;
    }

    public int getJumlahAtasan() {
        return jumlahAtasan;
    }

    public void setJumlahAtasan(int jumlahAtasan) {
        this.jumlahAtasan = jumlahAtasan;
    }

    public int getJumlahBawahan() {
        return jumlahBawahan;
    }

    public void setJumlahBawahan(int jumlahBawahan) {
        this.jumlahBawahan = jumlahBawahan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
