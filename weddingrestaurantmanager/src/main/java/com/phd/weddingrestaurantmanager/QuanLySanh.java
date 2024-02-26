package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySanh {

    private List<Sanh> ds = new ArrayList<>();

    public void themSanh(Sanh... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void xoaSanh(Sanh... a) {
        this.ds.removeAll(Arrays.asList(a));
    }

    public void xoaSanh(String maSanh) {
        this.ds.removeIf(s -> s.getMaSanh().contains(maSanh));
    }

    public Sanh timKiemSanh(String maSanh) {
        return this.ds.stream()
                .filter(s -> s.getMaSanh().contains(maSanh))
                .findFirst()
                .orElse(null);
    }

    public Sanh timKiemSanh(String maSanh, String thoiDiem, boolean isCuoiTuan) {
        return this.ds.stream()
                .filter(s -> s.getMaSanh().contains(maSanh)
                && s.getGiaThue().stream().anyMatch(gt -> gt.getTdt().getThoiDiem().equals(thoiDiem) && gt.getTdt().isIsCuoiTuan()))
                .findFirst()
                .orElse(null);
    }

    public List<Sanh> timKiemSanh(String tenSanh, int viTri, int sucChua) {
        return this.ds.stream().filter(s -> s.getTenSanh().contains(tenSanh) && s.getSucChua() == sucChua
                && s.getViTri() == viTri).collect(Collectors.toList());
    }

    public List<Sanh> timKiemSanh(int sucChua, String thoiDiem) {
        return this.ds.stream().filter(s
                -> s.getGiaThue().stream().anyMatch(gt -> gt.getTdt().getThoiDiem().equals(thoiDiem))
                && s.getSucChua() >= sucChua
        ).collect(Collectors.toList());
    }

    public void hienThiDanhSachSanh() {
        this.ds.forEach(s -> s.hienThi());
    }

    public void hienThiDanhSachSanhSapXep(int nam) {
        this.ds.forEach(s -> s.hienThiSapXep(nam));
    }

    public void sapXepSanhTheoTanSo(int nam) {
        this.ds.sort((s1, s2) -> -(s1.demSoLuongThue(nam) - s2.demSoLuongThue(nam)));
    }

    public void hienThiDanhSachSanhSapXep() {
        this.ds.forEach(s -> s.hienThiSapXep());
    }

    public void sapXepSanhTheoTanSo() {
        this.ds.sort((s1, s2) -> -(s1.demSoLuongThue() - s2.demSoLuongThue()));
    }
}
