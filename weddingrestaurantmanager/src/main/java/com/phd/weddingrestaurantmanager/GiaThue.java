package com.phd.weddingrestaurantmanager;

public class GiaThue {

    private Sanh sanh;

    private ThoiDiemThue tdt;

    private double gia;

    public void taoGiaThueVaThoiGian(Sanh sanh, ThoiDiemThue tdt, double gia) {
        this.sanh = sanh;
        this.tdt = tdt;
        this.gia = gia;

        this.sanh.getGiaThue().add(this);
        this.tdt.getGiaThue().add(this);
    }

    public void hienThi() {
//        System.out.printf("Ma sanh: %s\n",sanh.getMaSanh());
        System.out.printf("Ma sanh: %s\nTen sanh: %s\nTang: %d\nSuc chua: %d ban\nGia: %.2f\nThoi diem: %s\nCuoi tuan: %s\n--------------------------\n",
                sanh.getMaSanh(), sanh.getTenSanh(), sanh.getViTri(), sanh.getSucChua(),
                this.gia, tdt.getThoiDiem(), tdt.isIsCuoiTuan(), this.gia);
    }

    public Sanh getSanh() {
        return sanh;
    }

    public void setSanh(Sanh sanh) {
        this.sanh = sanh;
    }

    public ThoiDiemThue getTdt() {
        return tdt;
    }

    public void setTdt(ThoiDiemThue tdt) {
        this.tdt = tdt;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
