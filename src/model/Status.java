/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AHAN
 */
public class Status {
    private String nama,status,estimate;
    private int no,jumlahAtasan,jumlahBawahan;

    public Status(int no,String nama,int jumlahAtasan, int jumlahBawahan, String status, String estimate  ) {
        this.no = no;
        this.nama = nama;        
        this.jumlahAtasan = jumlahAtasan;
        this.jumlahBawahan = jumlahBawahan;
        this.status = status;
        this.estimate = estimate;
    }
    
    public Status(int no,String nama,int jumlahAtasan, int jumlahBawahan, String estimate  ) {
        this.no = no;
        this.nama = nama;        
        this.jumlahAtasan = jumlahAtasan;
        this.jumlahBawahan = jumlahBawahan;
        this.estimate = estimate;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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
    
    
    
    
}
