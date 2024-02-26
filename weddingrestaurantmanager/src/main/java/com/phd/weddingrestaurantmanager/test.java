/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phd.weddingrestaurantmanager;

import static com.phd.weddingrestaurantmanager.CauHinh.isWeekend;
import static com.phd.weddingrestaurantmanager.WeddingRestaurantManager.xuatMenu;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dat98
 */
public class test {

    public static void main(String[] args) {
        Sanh s1 = new Sanh("Sanh 001", 1, 100);
        Sanh s2 = new Sanh("Sanh 002", 1, 50);
//        Sanh s3 = new Sanh("Sanh 003", 2, 70);
//        Sanh s4 = new Sanh("Sanh 004", 3, 60);
//        Sanh s5 = new Sanh("Sanh 005", 2, 50);

//        BuoiTiec b = new BuoiTiec("we", LocalDate.now(), "toi", s5);
        BuoiTiec b1 = new BuoiTiec("we", LocalDate.now(), "toi", s1);
        BuoiTiec b2 = new BuoiTiec("we", LocalDate.now(), "toi", s2);
//        BuoiTiec b3 = new BuoiTiec("we", LocalDate.now(), "toi", s3);
//        BuoiTiec b4 = new BuoiTiec("we", LocalDate.now(), "toi", s5);
//        BuoiTiec b5 = new BuoiTiec("we", LocalDate.now(), "toi", s4);
        BuoiTiec b6 = new BuoiTiec("we", LocalDate.now(), "sang", s1);
//        BuoiTiec b7 = new BuoiTiec("we", LocalDate.now(), "toi", s5);

        ThoiDiemThue tdt1 = new ThoiDiemThue("sang", false);
        ThoiDiemThue tdt2 = new ThoiDiemThue("toi", false);
        ThoiDiemThue tdt3 = new ThoiDiemThue("chieu", false);
        ThoiDiemThue tdt4 = new ThoiDiemThue("sang");
        ThoiDiemThue tdt5 = new ThoiDiemThue("toi");
        ThoiDiemThue tdt6 = new ThoiDiemThue("chieu");

        s1.themThoiGianVaGia(tdt1, 100000);
        s1.themThoiGianVaGia(tdt2, 20000);
        s1.themThoiGianVaGia(tdt3, 150000);
        s1.themThoiGianVaGia(tdt4, 100000);
        s1.themThoiGianVaGia(tdt5, 120000);
        s1.themThoiGianVaGia(tdt6, 100000);
        s2.themThoiGianVaGia(tdt1, 14000);
        s2.themThoiGianVaGia(tdt2, 15000);
//        s3.themThoiGianVaGia(tdt5, 12000);
//        s3.themThoiGianVaGia(tdt1, 12000);
//        s3.themThoiGianVaGia(tdt3, 12000);
//
//        s4.themThoiGianVaGia(tdt4, 111110);
//
//        s5.themThoiGianVaGia(tdt3, 111110);
        QuanLySanh danhSachSanh = new QuanLySanh();
        danhSachSanh.themSanh(s1, s2);
        System.out.println(s1.demSoLuongThue(23));
        danhSachSanh.sapXepSanhTheoTanSo(2024);
        danhSachSanh.hienThiDanhSachSanhSapXep(2024);

        DichVu dv1 = new DichVuKaraoke("ca", 2000, 1.5);
        DichVu dv2 = new DichVuThueCaSi("thue ca si", 200000, "dat", 10);

        QuanLyDichVu qldv = new QuanLyDichVu();
        qldv.themDichVu(dv1, dv2);

        SanPham sp1 = new ThucAn("Ga", 2000, false);
        SanPham sp2 = new ThucAn("Heo", 4000, false);

        QuanLySanPham qlsp = new QuanLySanPham();
        qlsp.themSanPham(sp1, sp2);

        Sanh s10 = danhSachSanh.timKiemSanh("S001", "toi", true);
        BuoiTiec b = new BuoiTiec("fwefrw", LocalDate.now(), "toi", s10);
        b.themDichVu(dv1);
        Menu menu = new Menu();
        menu.themSanPhamVaoMenu(sp1);
        Ban ban = new Ban(menu, b, 10);
        ban.hienThi();

        System.out.printf("Tong thanh tien to chuc tiec cuoi %.2f\n---------------------\n", b.tinhTien("S001", "toi", true));
        b.thanhToan("S001", "toi", true).hienThi();
        b.hienThi();

        String ngayThue = "2024/04/02";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(ngayThue, formatter);
        Sanh s11 = danhSachSanh.timKiemSanh("S001", "sang", true);
        BuoiTiec b5 = new BuoiTiec("fwefrw", localDate, "sang", s11);
        b.themDichVu(dv1);
        Menu menu1 = new Menu();
        menu1.themSanPhamVaoMenu(sp1);
        Ban ban1 = new Ban(menu1, b5, 20);
        ban1.hienThi();

        System.out.printf("Tong thanh tien to chuc tiec cuoi %.2f\n---------------------\n", b.tinhTien("S001", "sang", true));
        b5.thanhToan("S001", "sang", true).hienThi();
        b5.hienThi();

        QuanLyHoaDon dshd = new QuanLyHoaDon();
        System.out.println("Danh sách");
        dshd.themHoaDon(b.thanhToan("S001", "toi", true));
        dshd.themHoaDon(b5.thanhToan("S001", "sang", true));

        System.out.println(dshd.tinhDoanhThu(dshd.tinhDoanhThuQuy(2, 2024)));

//tìm kiếm danh sách phù hợp
        //        List<Sanh> ds = danhSachSanh.timKiemSanh(50, "toi");
        //        ds.forEach(s -> s.hienThi());
        //        Sanh s10 = danhSachSanh.timKiemSanh("S001", "toi", true);
        //        s10.hienThi();
        //        boolean loop = true;
        //        String[] menu4 = {
        //            "Them dich vu cho buoi tiec",
        //            "Them thuc an/nuoc uong cho buoi tiec",
        //            "Xuat hoa don"
        //        };
        //        System.out.print("Nhap ten buoi tiec: ");
        //        String tenBuoiTiec = CauHinh.sc.nextLine();
        //        System.out.print("Nhap thoi diem thue: ");
        //        String thoiDiem = CauHinh.sc.nextLine();
        //        System.out.print("Nhap so ban: ");
        //        int sucChua = Integer.parseInt(CauHinh.sc.nextLine());
        //        List<Sanh> ds = danhSachSanh.timKiemSanh(sucChua, thoiDiem);
        //        ds.forEach(s -> s.hienThi());
        //        System.out.print("Nhap ma sanh: ");
        //        String maSanh = CauHinh.sc.nextLine();
        //        System.out.print("Nhập ngày tháng (dd/MM/yyyy): ");
        //        String input = CauHinh.sc.nextLine();
        //        LocalDate date = LocalDate.parse(input, CauHinh.formatter);
        //        boolean isWeekend = isWeekend(date);
        //        Sanh s10 = danhSachSanh.timKiemSanh(maSanh, thoiDiem, isWeekend);
        //        BuoiTiec b = new BuoiTiec(tenBuoiTiec, date, thoiDiem, s10);
        //        do {
        //            xuatMenu(menu4);
        //            String mainChoose = CauHinh.sc.nextLine();
        //
        //            switch (mainChoose) {
        //                case "1" -> {
        //                    qldv.hienThiDanhSachDichVu();
        //                    System.out.print("Nhap ma Dich Vu: ");
        //                    int maDichVu = Integer.parseInt(CauHinh.sc.nextLine());
        //                    DichVu dv = qldv.timDichVu(maDichVu);
        //                    b.themDichVu(dv);
        //                }
        //
        //                case "2" -> {
        //                    String choose1 = "";
        //                    boolean exitLoop = false;
        //                    Menu menu = new Menu();
        //
        //                    do {
        //                        qlsp.hienThiDanhSachSanPham();
        //                        System.out.print("Nhap ten san pham muon chon: ");
        //                        String tenSanPham = CauHinh.sc.nextLine();
        //                        SanPham sp = qlsp.timSanPham(tenSanPham);
        //                        menu.themSanPhamVaoMenu(sp);
        //
        //                        System.out.print("Nhap 0 de thoat hoac nhan phim bat ki de tiep tuc them thuc an/do uong: ");
        //                        choose1 = CauHinh.sc.nextLine();
        //
        //                        if (choose1.equals("0")) {
        //                            exitLoop = true;
        //                        }
        //                    } while (!exitLoop);
        //                    System.out.print("Nhap so luong ban: ");
        //                    int soLuongBan = Integer.parseInt(CauHinh.sc.nextLine());
        //                    System.out.print("------------------");
        //                    Ban ban = new Ban(menu, b, soLuongBan);
        //                    ban.hienThi();
        //                }
        //
        //                case "3" -> {
        //                    b.hienThi();
        //                    System.out.printf("Tong thanh tien to chuc tiec cuoi %.2f\n---------------------\n", b.tinhTien(maSanh, thoiDiem, isWeekend));
        //                }
        //                case "0" -> {
        //                    loop = false;
        //                    System.out.print("Xin cam on");
        //                }
        //
        //            }
        //        } while (loop);
        //        System.out.print("Nhap ten buoi tiec: ");
        //        String tenBuoiTiec = CauHinh.sc.nextLine();
        //        System.out.print("Nhap so ban: ");
        //        int sucChua = Integer.parseInt(CauHinh.sc.nextLine());
        //        System.out.print("Nhap thoi diem thue: ");
        //        String thoiDiem = CauHinh.sc.nextLine();
        //        List<Sanh> ds = danhSachSanh.timKiemSanh(sucChua, thoiDiem);
        //        ds.forEach(s -> s.hienThi());
        //        System.out.print("Nhap ma sanh: ");
        //        String maSanh = CauHinh.sc.nextLine();
        //        System.out.print("Nhập ngày tháng (dd/MM/yyyy): ");
        //        String input = CauHinh.sc.nextLine();
        //        LocalDate date = LocalDate.parse(input, CauHinh.formatter);
        //        boolean isWeekend = isWeekend(date);
        //        qldv.hienThiDanhSachDichVu();
        //        System.out.print("Nhap ma Dich Vu: ");
        //        int maDichVu = Integer.parseInt(CauHinh.sc.nextLine());
        //        DichVu dv = qldv.timDichVu(maDichVu);
        //
        //        SanPham sp1 = new ThucAn("Gà", 2000, false);
        //        SanPham sp2 = new ThucAn("Heo", 4000, false);
        //        Menu m = new Menu(sp1, sp2);
        //
        //        Ban b1 = new Ban(m, b, 10);
        //        b.hienThi();
        //        System.out.println(b.tinhTien(s10.getMaSanh(), "toi", true));
        //
        //        b.hienThi();
        //        qltdt.hienThiDanhSachDichVu();
        //        System.out.print("Nhap ma thoi gian thue ");
        //        int ma = Integer.parseInt(CauHinh.sc.nextLine());
        //        ThoiDiemThue tdt = qltdt.timThoiDiemThue(ma);
        ////      s1.themThoiGianVaGia(tdt);
        //
        //        System.out.println("Them thanh cong!!!!!!!\n");
        //        DichVu dv2 = new DichVuThueCaSi("dattt", 2000, "Yeu", 1);
        //        DichVu dv3 = new DichVuThueCaSi("dattt1", 2000, "Yeu", 1);
        //        DichVu dv4 = new DichVuThueCaSi("dattt2", 2000, "Yeu", 1);
        //        DichVu dv5 = new DichVuThueCaSi("dattt", 2000, "Yeu", 1);
        //        DichVu dv6 = new DichVuThueCaSi("dat", 2000, "Yeu", 1);
        //
        ////        try {
        ////            qldv.themDichVu("com.phd.weddingrestaurantmanager.DichVuKaraoke");
        ////        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
        ////            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        ////        }
        //        QuanLyDichVu qldv = new QuanLyDichVu();
        //        qldv.themDichVu(dv1, dv2,dv3,dv4,dv5,dv6);
        ////        DichVu d = qldv.timDichVu("dattt");
        ////        d.hienThi();
        ////        qldv.hienThiDanhSachDichVu();
        //        
        //        List<DichVu> ds2 = qldv.timKiemDichVu("dattt");
        //        ds2.forEach(s -> s.hienThi());
        //
        ////        m.hienThi();
        //        System.out.println("------------");
        //
        //        Ban b1 = new Ban(m);
        //        Ban b2 = new Ban(m2);
        //        Ban b3 = new Ban(m);
        //        Ban b4 = new Ban(m);
        //
        //        b1.hienThi();
        //        b2.hienThi();
    }
}
