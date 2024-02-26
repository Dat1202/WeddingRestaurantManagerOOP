package com.phd.weddingrestaurantmanager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuoiTiec {

    private static int dem;
    private int maBuoiTiec = ++dem;
    private String tenBuoiTiec;
    private LocalDate ngayThue;
    private String thoiDiem;
//    private double gia;
    private Sanh sanh;
    private List<Ban> ban;
    private List<DichVu> dv;

    public BuoiTiec(String tenBuoiTiec, LocalDate ngayThue, String thoiDiem, Sanh sanh) {
//        if (ban.stream().filter(b -> b.getSoLuongBan() <= sanh.getSucChua()).count() <= 0) {
        this.tenBuoiTiec = tenBuoiTiec;
        this.ngayThue = ngayThue;
        this.thoiDiem = thoiDiem;
        this.sanh = sanh;
        this.ban = new ArrayList<>();
        this.dv = new ArrayList<>();
        sanh.getBt().add(this);
//        } else {
//            System.out.print("Vuot qua so ban quy dinh\n");
//        }
    }

    public HoaDon thanhToan(String maSanh, String thoiDiem, boolean cuoiTuan) {
        double tongTien = this.tinhTien(maSanh, thoiDiem, cuoiTuan);
        return new HoaDon(this, tongTien);
    }

    public void hienThi() {
//        System.out.printf("------------------------\nMa tiec: %d\nTen tiec: %s\nNgay thue: %s\n--------------------\n",
//                maBuoiTiec, tenBuoiTiec, ngayThue.format(CauHinh.formatter));
        ban.stream()
                .filter(b -> b.getBuoiTiec().equals(this))
                .forEach(ban -> ban.hienThi());
        dv.forEach(d -> d.hienThi());
    }

    public void themDichVu(DichVu... a) {
        this.dv.addAll(Arrays.asList(a));
    }

    public double tinhTien(String maSanh, String thoiDiem, boolean cuoiTuan) {
        double giaMenu = 0.0;
        for (Ban item : getBan()) {
            giaMenu += item.getMenu().getGia() * item.getSoLuongBan();
        }

        double giaDichVu = 0;
        for (DichVu item : dv) {
            giaDichVu += item.getGiaDichVu();
        }

        double giaThueSanh = sanh.getGiaThue().stream()
                .filter(s -> s.getSanh().getMaSanh().equals(maSanh) && s.getTdt().getThoiDiem().equals(thoiDiem)
                && s.getTdt().isIsCuoiTuan() == cuoiTuan)
                .mapToDouble(GiaThue::getGia)
                .sum();

        return giaMenu + giaDichVu + giaThueSanh;
    }

    public int getMaBuoiTiec() {
        return maBuoiTiec;
    }

    public void setMaBuoiTiec(int maBuoiTiec) {
        this.maBuoiTiec = maBuoiTiec;
    }

    public String getTenBuoiTiec() {
        return tenBuoiTiec;
    }

    public void setTenBuoiTiec(String tenBuoiTiec) {
        this.tenBuoiTiec = tenBuoiTiec;
    }

    public LocalDate getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(LocalDate ngayThue) {
        this.ngayThue = ngayThue;
    }

    public String getThoiDiem() {
        return thoiDiem;
    }

    public void setThoiDiem(String thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

    public Sanh getSanh() {
        return sanh;
    }

    public void setSanh(Sanh sanh) {
        this.sanh = sanh;
    }

//    public double getGia() {
//        return gia;
//    }
//
//    public void setGia(double gia) {
//        this.gia = gia;
//    }
    public List<DichVu> getDv() {
        return dv;
    }

    public void setDv(List<DichVu> dv) {
        this.dv = dv;
    }

    public List<Ban> getBan() {
        return ban;
    }

    public void setBan(List<Ban> ban) {
        this.ban = ban;
    }

}
