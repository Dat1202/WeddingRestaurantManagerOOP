/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dat98
 */
public class ThoiDiemThue {

    private static int dem;
    private int maThoiDiemThue = ++dem;
    private String thoiDiem;
    private boolean isCuoiTuan = true;
    private List<GiaThue> giaThue = new ArrayList<>();

    public ThoiDiemThue() {
    }

    public ThoiDiemThue(String thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

    public ThoiDiemThue(String thoiDiem, boolean isCuoiTuan) {
        this.thoiDiem = thoiDiem;
        this.isCuoiTuan = isCuoiTuan;
    }

    public void hienThi() {
        System.out.printf("Ma thoi gian thue %d - Thoi diem: %s - Cuoi tuan: %s\n", maThoiDiemThue, thoiDiem, isCuoiTuan);
    }

    public void them1ThoiDiemThue() {
        System.out.print("Ten thoi diem: ");
        this.setThoiDiem(CauHinh.sc.nextLine());
        System.out.print("Cuoi tuan (true/false)");
        this.setIsCuoiTuan(CauHinh.sc.nextBoolean());
    }

    public List<GiaThue> getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(List<GiaThue> giaThue) {
        this.giaThue = giaThue;
    }

    public String getThoiDiem() {
        return thoiDiem;
    }

    public void setThoiDiem(String thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

    public boolean isIsCuoiTuan() {
        return isCuoiTuan;
    }

    public void setIsCuoiTuan(boolean isCuoiTuan) {
        this.isCuoiTuan = isCuoiTuan;
    }

    public int getMaThoiDiemThue() {
        return maThoiDiemThue;
    }

    public void setMaThoiDiemThue(int maThoiDiemThue) {
        this.maThoiDiemThue = maThoiDiemThue;
    }

}
