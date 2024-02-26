/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

/**
 *
 * @author zedmo
 */
public class HoaDon {

    private BuoiTiec buoiTiec;
    private double tongTien = 0;

    public HoaDon(BuoiTiec buoiTiec, double tongTien) {
        this.buoiTiec = buoiTiec;
        this.tongTien = tongTien;
    }

    public void hienThi() {
        System.out.printf("Ten sanh: %s\nVi tri: %d\nTen buoi tiec: %s\nNgay thue %s\nThoi diem thue: %s\nTong tien: %,.2f\n-----------------------\n",
                this.getBuoiTiec().getSanh().getTenSanh(), this.getBuoiTiec().getSanh().getViTri(),
                this.getBuoiTiec().getTenBuoiTiec(), this.getBuoiTiec().getNgayThue(),
                this.getBuoiTiec().getThoiDiem(), getTongTien());
    }

    public BuoiTiec getBuoiTiec() {
        return buoiTiec;
    }

    public void setBuoiTiec(BuoiTiec buoiTiec) {
        this.buoiTiec = buoiTiec;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

}
