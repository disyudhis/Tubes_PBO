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

    private String nama, alamat, region, estimate, status;
    private int no;
    
    

    public Status(int no, String nama, String alamat, String region, String estimate, String status) {
        this.no = no;
        this.nama = nama;
        this.alamat = alamat;
        this.region = region;
        this.estimate = estimate;
        this.status = status;

    }
    
    
    public String getNama() {
        return nama;
    }

    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

}
