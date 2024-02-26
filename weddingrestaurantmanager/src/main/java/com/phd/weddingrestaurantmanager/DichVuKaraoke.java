package com.phd.weddingrestaurantmanager;

public class DichVuKaraoke extends DichVu {

    private double thoiGianThue;


    public DichVuKaraoke(String tenDichVu, double giaDichVu, double thoiGianThue) {
//        super(tenDichVu, giaDichVu);
        this.thoiGianThue = thoiGianThue;
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.printf("Thoi gian thue %.2f\n--------------------\n", thoiGianThue);
    }

    @Override
    public void them1DichVu() {
        super.them1DichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("Nhap thoi gian thue(gio): ");
        this.thoiGianThue = Double.parseDouble(CauHinh.sc.nextLine());
    }

    @Override
    public void capNhatDichVu() {
        super.capNhatDichVu(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print("\nThoi gian thue moi\n");
        this.thoiGianThue = Double.parseDouble(CauHinh.sc.nextLine());
    }

    public double getThoiGianThue() {
        return thoiGianThue;
    }

    public void setThoiGianThue(double thoiGianThue) {
        this.thoiGianThue = thoiGianThue;
    }

}
