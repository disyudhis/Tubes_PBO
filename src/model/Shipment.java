/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author AHAN
 */
public class Shipment {

    private int id, order_id;
    private String alamat, region, estimate, tanggal;

    public Shipment(int order_id, String alamat, String region, String estimate) {
        this.order_id = order_id;
        this.alamat = alamat;
        this.region = region;
        this.estimate = estimate;
    }

    public Shipment(int id, int order_id, String alamat, String region, String estimate) {
        this.id = id;
        this.order_id = order_id;
        this.alamat = alamat;
        this.region = region;
        this.estimate = estimate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
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

}
