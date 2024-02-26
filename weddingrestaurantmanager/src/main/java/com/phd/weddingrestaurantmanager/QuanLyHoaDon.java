/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dat98
 */
public class QuanLyHoaDon {

    private List<HoaDon> ds = new ArrayList<>();

    public void themHoaDon(HoaDon... hoaDon) {
        this.ds.addAll(Arrays.asList(hoaDon));
    }

    public List<HoaDon> tinhDoanhThuQuy(int quy, int nam) {
        return ds.stream()
                .filter(hd -> hd.getBuoiTiec().getNgayThue().getYear() == nam && CauHinh.getQuy(hd.getBuoiTiec().getNgayThue()) == quy)
                .collect(Collectors.toList());
    }

    public List<HoaDon> tinhDoanhThuThang(int thang, int nam) {
        return ds.stream()
                .filter(hd -> hd.getBuoiTiec().getNgayThue().getYear() == nam && hd.getBuoiTiec().getNgayThue().getMonthValue() == thang)
                .collect(Collectors.toList());
    }

    public double tinhDoanhThu(List<HoaDon> h) {
        return h.stream().mapToDouble(x -> x.getTongTien()).sum();
    }

    public void hienThiDanhSachHoaDon() {
        this.ds.forEach(hd -> hd.hienThi());
    }
}
