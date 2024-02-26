package com.phd.weddingrestaurantmanager;

public class Ban {

    private Menu menu;

    private BuoiTiec buoiTiec;

    private int soLuongBan;

    public Ban(Menu menu, BuoiTiec buoiTiec, int soLuongBan) {
        this.menu = menu;
        this.buoiTiec = buoiTiec;
        this.soLuongBan = soLuongBan;

        this.menu.getBan().add(this);
        this.buoiTiec.getBan().add(this);
    }

    public void hienThi() {
        System.out.printf("\nSo luong ban: %d\n", this.soLuongBan);
        menu.hienThi();
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public BuoiTiec getBuoiTiec() {
        return buoiTiec;
    }

    public void setBuoiTiec(BuoiTiec buoiTiec) {
        this.buoiTiec = buoiTiec;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

}
