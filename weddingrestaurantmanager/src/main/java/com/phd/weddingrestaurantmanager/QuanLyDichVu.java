/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dat98
 */
public class QuanLyDichVu {

    private List<DichVu> ds = new ArrayList<>();

    public void themDichVu(DichVu... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themDichVu(String classPath) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName(classPath);
        DichVu dv = (DichVu) c.getConstructor().newInstance();
        dv.them1DichVu();
        this.ds.add(dv);
    }

    public void hienThiDanhSachDichVu() {
        this.ds.forEach(dv -> dv.hienThi());
    }

    public DichVu timDichVu(String tenDichVu) {
        return this.ds.stream()
                .filter(s -> s.getTenDichVu().contains(tenDichVu))
                .findFirst()
                .orElse(null);
    }

    public DichVu timDichVu(int maDichVu) {
        return this.ds.stream()
                .filter(s -> s.getMaDichVu() == (maDichVu))
                .findFirst()
                .orElse(null);
    }

    public void xoaDichVu(String tenDichVu) {
        this.ds.removeIf(dv -> dv.getTenDichVu().contains(tenDichVu));
    }

    public void xoaDichVu(DichVu... a) {
        this.ds.removeAll(Arrays.asList(a));
    }

}
