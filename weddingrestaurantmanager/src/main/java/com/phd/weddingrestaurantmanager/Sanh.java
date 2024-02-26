package com.phd.weddingrestaurantmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sanh {

    private static int dem;
    private String maSanh;
    private String tenSanh;
    private int viTri;
    private int sucChua;
    private List<GiaThue> giaThue = new ArrayList<>();
    private List<BuoiTiec> bt = new ArrayList<>();

    {
        setMaSanh(String.format("S%04d", ++dem));
    }

    public Sanh(String tenSanh, int viTri, int sucChua) {
        this.tenSanh = tenSanh;
        this.viTri = viTri;
        this.sucChua = sucChua;
    }

    public void capNhatSanh() {
        System.out.print("Nhap ten sanh moi: ");
        this.setTenSanh(CauHinh.sc.nextLine());
        System.out.print("\nNhap vi tri cua sanh(tang) moi\n");
        this.setViTri(Integer.parseInt(CauHinh.sc.nextLine()));
        System.out.print("Nhap suc chua cua sanh(ban) moi: ");
        this.setSucChua(Integer.parseInt(CauHinh.sc.nextLine()));
        System.out.println("---------------------\nCap nhat thanh cong!!!");
    }

    public void themThoiGianVaGia(ThoiDiemThue tdt, double gia) {
        GiaThue gt = new GiaThue();
        List<GiaThue> g = this.giaThue.stream().filter(s -> s.getTdt().getMaThoiDiemThue() == tdt.getMaThoiDiemThue()).collect(Collectors.toList());
        if (!g.isEmpty()) {
            System.out.print("Thoi gian nay da co cho Sanh nay roi!\n");
        } else {
            gt.taoGiaThueVaThoiGian(this, tdt, gia);
        }
    }

    public int demSoLuongThue() {
        return (int) this.bt.stream().count();
    }

    public int demSoLuongThue(int nam) {
        return (int) this.bt.stream().filter(b -> b.getNgayThue().getYear() == nam).count();
    }

    public void hienThi() {
        this.giaThue.forEach(s -> s.hienThi());
    }

    public void hienThiSapXep(int nam) {
        System.out.printf("Ma sanh: %s\nTen sanh: %s\nSo lan duoc thue: %d\n----------------------\n",
                maSanh, tenSanh, this.demSoLuongThue(nam));
    }

    public void hienThiSapXep() {
        System.out.printf("Ma sanh: %s\nTen sanh: %s\nSo lan duoc thue: %d\n----------------------\n",
                maSanh, tenSanh, this.demSoLuongThue());
    }

    public String getMaSanh() {
        return maSanh;
    }

    public void setMaSanh(String maSanh) {
        this.maSanh = maSanh;
    }

    public String getTenSanh() {
        return tenSanh;
    }

    public void setTenSanh(String tenSanh) {
        this.tenSanh = tenSanh;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }

    public int getSucChua() {
        return sucChua;
    }

    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    public List<GiaThue> getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(List<GiaThue> giaThue) {
        this.giaThue = giaThue;
    }

    public List<BuoiTiec> getBt() {
        return bt;
    }

    public void setBt(List<BuoiTiec> bt) {
        this.bt = bt;
    }

}
