package com.phd.weddingrestaurantmanager;

public class DichVuThueCaSi extends DichVu {

    private String tenCaSi;

    private int soLuongBai;

    public DichVuThueCaSi(String tenDichVu, int giaDichVu, String tenCaSi, int soLuongBai) {
        super(tenDichVu, giaDichVu);
        this.tenCaSi = tenCaSi;
        this.soLuongBai = soLuongBai;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Ten ca si: %s\nSo luong bai: %d\n--------------------\n", tenCaSi, soLuongBai);
    }

    @Override
    public void them1DichVu() {
        super.them1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap ten ca si: ");
        this.tenCaSi = CauHinh.sc.nextLine();
        System.out.print("Nhap so luong bai: ");
        this.soLuongBai = Integer.parseInt(CauHinh.sc.nextLine());
    }

    @Override
    public void capNhatDichVu() {
        super.capNhatDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhap ten ca si moi: ");
        this.tenCaSi = CauHinh.sc.nextLine();
        System.out.println("Nhap so luong bai moi: ");
        this.soLuongBai = Integer.parseInt(CauHinh.sc.nextLine());
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public int getSoLuongBai() {
        return soLuongBai;
    }

    public void setSoLuongBai(int soLuongBai) {
        this.soLuongBai = soLuongBai;
    }

}
