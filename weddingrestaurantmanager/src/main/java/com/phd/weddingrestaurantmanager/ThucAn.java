package com.phd.weddingrestaurantmanager;

public class ThucAn extends SanPham {

    private boolean anChay;

    public ThucAn(String tenSanPham, double gia, boolean anChay) {
        super(tenSanPham, gia);
        this.anChay = anChay;
    }

    @Override
    public void them1SanPham() {
        super.them1SanPham(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody

        System.out.print("Co an chay duoc khong?");
        String isAnChay = CauHinh.sc.nextLine();
        Boolean b = false;
        if (isAnChay.equals("1")) {
            b = true;
        }
        System.out.print("------------------------\n");
    }

    @Override
    public void capNhatSanPham() {
        super.capNhatSanPham(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Co an chay duoc khong?");
        String isAnChay = CauHinh.sc.nextLine();
        Boolean b = false;
        if (isAnChay.equals("1")) {
            b = true;
        }
        System.out.print("\n------------------------\n");
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        String s = "An chay";
        if (!this.isAnChay()) {
            s = "Khong chay";
        }
        System.out.printf("Co an chay khong: %s", s);
        System.out.print("\n------------------------\n");
    }

    public boolean isAnChay() {
        return anChay;
    }

    public void setAnChay(boolean isAnChay) {
        this.anChay = isAnChay;
    }

}
