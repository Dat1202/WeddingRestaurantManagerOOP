package com.phd.weddingrestaurantmanager;

public abstract class DichVu {

    private static int dem;
    private int maDichVu = ++dem;
    protected String tenDichVu;
    protected double giaDichVu;

    public DichVu() {
    }
    
    public DichVu(String tenDichVu, double giaDichVu) {
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
    }

    public void them1DichVu() {
        System.out.print("Nhap ten dich vu: ");
        this.tenDichVu = (CauHinh.sc.nextLine());
        System.out.print("Nhap gia dich vu: ");
        this.giaDichVu = Double.parseDouble(CauHinh.sc.nextLine());
    }

    public void hienThi() {
        System.out.printf("Ma dich vu: %d\nTen dich vu: %s\nGia dich vu: %.2f\n", maDichVu, tenDichVu, giaDichVu);
    }

    public void capNhatDichVu() {
        System.out.print("Nhap ten dich vu moi: ");
        this.tenDichVu = CauHinh.sc.nextLine();
        System.out.print("\nNhap gia moi\n");
        this.giaDichVu = Double.parseDouble(CauHinh.sc.nextLine());
    }

    public int getMaDichVu() {
        return maDichVu;
    }

    public void setMaDichVu(int maDichVu) {
        this.maDichVu = maDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(int giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

}
