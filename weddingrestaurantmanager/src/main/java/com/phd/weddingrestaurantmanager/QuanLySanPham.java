/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import static java.lang.reflect.Array.get;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dat98
 */
public class QuanLySanPham {

    private List<SanPham> ds = new ArrayList<>();

    public void themSanPham(SanPham... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themSanPham(String classPath) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class c = Class.forName(classPath);
        SanPham sp = (SanPham) c.getConstructor().newInstance();
        sp.them1SanPham();
        this.ds.add(sp);
    }

    public void hienThiDanhSachSanPham() {
        this.ds.forEach(sp -> sp.hienThi());
    }

    public void hienThiDanhSachSanPhamThucAn() {
        for (SanPham sp : this.ds) {
            if (sp instanceof ThucAn) {
                sp.hienThi();
            }
        }
    }

    public void hienThiDanhSachSanPhamDoUong() {
        for (SanPham sp : this.ds) {
            if (sp instanceof DoUong) {
                sp.hienThi();
            }
        }
    }

    public void xoaSanPham(String tenSanPham) {
        this.ds.removeIf(sp -> sp.getTenSanPham().contains(tenSanPham));
    }

    public void xoaSanPham(SanPham... a) {
        this.ds.removeAll(Arrays.asList(a));
    }

    public SanPham timSanPham(String tenSanPham) {
        return this.ds.stream()
                .filter(s -> s.getTenSanPham().contains(tenSanPham))
                .findFirst()
                .orElse(null);
    }

    public SanPham timThucAn(String tenThucAn) {
        for (SanPham sp : this.ds) {
            if (sp instanceof ThucAn && sp.getTenSanPham().equals(tenThucAn)) {
                return (SanPham) sp;
            }
        }
        return null;
    }

    public SanPham timDoUong(String tenDoUong) {
        for (SanPham sp : this.ds) {
            if (sp instanceof DoUong && sp.getTenSanPham().equals(tenDoUong)) {
                return (SanPham) sp;
            }
        }
        return null;
    }
}
