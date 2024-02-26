/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dat98
 */
public class QuanLyThoiDiemThue {

    private List<ThoiDiemThue> ds = new ArrayList<>();

    public void themThoiDiemThue(ThoiDiemThue... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void themThoiDiemThue() {
        ThoiDiemThue tdt = new ThoiDiemThue();
        tdt.them1ThoiDiemThue();
        this.ds.add(tdt);
    }

    public ThoiDiemThue timThoiDiemThue(int maThoiDiemThue) {
        return this.ds.stream()
                .filter(s -> s.getMaThoiDiemThue() == maThoiDiemThue)
                .findFirst()
                .orElse(null);
    }

    public void hienThi() {
        for (ThoiDiemThue tdt : ds) {
            tdt.hienThi();
        }
    }
}
