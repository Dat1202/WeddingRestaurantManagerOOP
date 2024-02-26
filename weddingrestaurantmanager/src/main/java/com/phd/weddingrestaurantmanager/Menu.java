package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static int dem;

    private int maMenu = ++dem;
    private double gia;
    private List<SanPham> sanPham;
    private List<Ban> ban;

    public Menu() {
        this.gia = 0;
        this.ban = new ArrayList<>();
        this.sanPham = new ArrayList<>();
    }

    public Menu(double gia) {
        this.gia = gia;
        this.ban = new ArrayList<>();
        this.sanPham = new ArrayList<>();
    }

    public void themSanPhamVaoMenu(SanPham sp) {
//        for (SanPham sanPham : sp) {
//            this.gia += sanPham.getGia();
//        }
        sp.addMenu(this);
        this.sanPham.add(sp);

        this.gia = this.sanPham.stream()
                .mapToDouble(SanPham::getGia)
                .sum();
    }

    public void hienThi() {
        System.out.printf("Ma menu: %d\nGia menu: %.2f\n", this.maMenu, this.gia);
        this.sanPham.forEach(s -> s.hienThi());
    }

    public int getMaMenu() {
        return maMenu;
    }

    public void setMaMenu(int maMenu) {
        this.maMenu = maMenu;
    }

    public double getGia() {
        double giaMenu = 0;
        for (SanPham item : sanPham) {
            giaMenu += item.getGia();
        }
        return giaMenu;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public List<SanPham> getSp() {
        return sanPham;
    }

    public void setSp(List<SanPham> sp) {
        this.sanPham = sp;
    }

    public List<Ban> getBan() {
        return ban;
    }

    public void setBan(List<Ban> ban) {
        this.ban = ban;
    }

}
