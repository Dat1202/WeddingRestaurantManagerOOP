/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

/**
 *
 * @author dat98
 */
public class DichVuTrangTri extends DichVu {

    private String ghiChu;

    public DichVuTrangTri(String tenDichVu, double giaDichVu, String ghiChu) {
        super(tenDichVu, giaDichVu);
        this.ghiChu = ghiChu;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Ghi chu %s\n--------------------\n", ghiChu);

    }

    @Override
    public void them1DichVu() {
        super.them1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap ghi chu: ");
        this.ghiChu = CauHinh.sc.nextLine();
    }

    @Override
    public void capNhatDichVu() {
        super.capNhatDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhap ghi chu moi: ");
        this.ghiChu = CauHinh.sc.nextLine();
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
