package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.List;

public abstract class SanPham {

    private static int dem;

    protected int maSanPham = ++dem;

    protected String tenSanPham;

    protected double gia;
    private List<Menu> menus;

    public SanPham(String tenSanPham, double gia) {
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.menus = new ArrayList<>();
    }

    public void hienThi() {
        System.out.printf("Ma san pham: %d - Ten san pham: %s - Gia: %.2f\n", maSanPham, tenSanPham, gia);
    }

    public void them1SanPham() {
        System.out.print("Nhap ten San Pham: ");
        this.tenSanPham = (CauHinh.sc.nextLine());
        System.out.print("Nhap gia San Pham: ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
    }

    public void addMenu(Menu m) {
//        m.themSanPhamVaoMenu(this);
        this.menus.add(m);
    }

    public void capNhatSanPham() {
        System.out.print("Nhap ten San Pham moi: ");
        this.tenSanPham = (CauHinh.sc.nextLine());
        System.out.print("Nhap gia San Pham moi: ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public List<Menu> getMenu() {
        return menus;
    }

    public void setMenu(List<Menu> menu) {
        this.menus = menu;
    }

}
