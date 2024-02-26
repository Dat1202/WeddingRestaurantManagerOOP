package com.phd.weddingrestaurantmanager;

public class DoUong extends SanPham {

    private String hangSanXuat;

    public DoUong(String tenSanPham, double gia, String hangSanXuat) {
        super(tenSanPham, gia);
        this.hangSanXuat = hangSanXuat;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Hang san xuat: %s", hangSanXuat);
        System.out.print("\n------------------------\n");

    }

    @Override
    public void them1SanPham() {
        super.them1SanPham(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap hang san xuat: ");
        this.hangSanXuat = CauHinh.sc.nextLine();
        System.out.print("------------------------\n");
    }

    @Override
    public void capNhatSanPham() {
        super.capNhatSanPham(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap hang san xuat moi: ");
        this.hangSanXuat = CauHinh.sc.nextLine();
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

}
