/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.phd.weddingrestaurantmanager;

import static com.phd.weddingrestaurantmanager.CauHinh.isWeekend;
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
public class WeddingRestaurantManager {

    public static void xuatMenu(String[] menu) {
        int i = 1;
        for (String s : menu) {
            System.out.printf("%d. %s\n", i++, s);
        }
        System.out.println("0. Thoat");
        System.out.print("Choose the number: ");
    }

    public static void main(String[] args) throws InvocationTargetException {
        Sanh s1 = new Sanh("Sanh 001", 1, 100);
        Sanh s2 = new Sanh("Sanh 002", 1, 50);
        Sanh s3 = new Sanh("Sanh 003", 2, 50);

        QuanLySanh danhSachSanh = new QuanLySanh();
        danhSachSanh.themSanh(s1, s2, s3);

        ThoiDiemThue tdt1 = new ThoiDiemThue("sang", false);
        ThoiDiemThue tdt2 = new ThoiDiemThue("toi", false);
        ThoiDiemThue tdt3 = new ThoiDiemThue("chieu", false);
        ThoiDiemThue tdt4 = new ThoiDiemThue("sang");
        ThoiDiemThue tdt5 = new ThoiDiemThue("toi");
        ThoiDiemThue tdt6 = new ThoiDiemThue("chieu");
        QuanLyThoiDiemThue qltdt = new QuanLyThoiDiemThue();
        qltdt.themThoiDiemThue(tdt1, tdt2, tdt3, tdt4, tdt5, tdt6);

        s1.themThoiGianVaGia(tdt1, 1000);
        s1.themThoiGianVaGia(tdt2, 2000);
        s1.themThoiGianVaGia(tdt3, 1500);
        s1.themThoiGianVaGia(tdt4, 1000);
        s1.themThoiGianVaGia(tdt5, 1200);
        s1.themThoiGianVaGia(tdt6, 1000);
        s2.themThoiGianVaGia(tdt4, 1400);
        s2.themThoiGianVaGia(tdt2, 1500);
        s3.themThoiGianVaGia(tdt5, 1200);
        s3.themThoiGianVaGia(tdt1, 1500);
        s3.themThoiGianVaGia(tdt3, 1000);

        QuanLyDichVu qldv = new QuanLyDichVu();
        DichVu dv1 = new DichVuKaraoke("Karaoke", 2000, 1.5);
        DichVu dv2 = new DichVuThueCaSi("Thue Ca Si", 2000, "MTP", 5);
        DichVu dv3 = new DichVuTrangTri("Trang Tri", 15000, "Ghi chu");
        qldv.themDichVu(dv1, dv2, dv3);

        SanPham sp1 = new ThucAn("Sup Ga", 200, false);
        SanPham sp2 = new ThucAn("Heo", 170, false);
        SanPham sp3 = new ThucAn("Tom su", 220, false);
        SanPham sp4 = new ThucAn("Bo xao", 240, false);
        SanPham sp8 = new ThucAn("Lau", 240, false);
        SanPham sp9 = new ThucAn("Lau chay", 200, true);

        SanPham sp5 = new DoUong("Pessi", 100, "Cola");
        SanPham sp6 = new DoUong("CoCa", 120, "Cola");
        SanPham sp7 = new DoUong("Bia", 200, "Cola");

        QuanLySanPham qlsp = new QuanLySanPham();
        qlsp.themSanPham(sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9);
        QuanLyHoaDon dshd = new QuanLyHoaDon();

//        Sanh s101 = danhSachSanh.timKiemSanh("S0001", "toi", true);
//        BuoiTiec b11 = new BuoiTiec("fwefrw", LocalDate.now(), "toi", s101);
//        b11.themDichVu(dv1);
//        Menu menu12 = new Menu();
//        menu12.themSanPhamVaoMenu(sp1);
//        menu12.themSanPhamVaoMenu(sp4);
//        menu12.themSanPhamVaoMenu(sp5);

//        Ban ban12 = new Ban(menu12, b11, 10);

//        String ngayThue = "2023/02/02";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//        LocalDate localDate = LocalDate.parse(ngayThue, formatter);
//        Sanh s111 = danhSachSanh.timKiemSanh("S002", "sang", true);
//        BuoiTiec b51 = new BuoiTiec("fwefrw", localDate, "sang", s111);
//        b11.themDichVu(dv1);
//        Menu menu121 = new Menu();
//        menu121.themSanPhamVaoMenu(sp1);
//        menu121.themSanPhamVaoMenu(sp2);
//        menu121.themSanPhamVaoMenu(sp3);

//        Ban ban1 = new Ban(menu121, b51, 20);
//
//        dshd.themHoaDon(b11.thanhToan("S001", "toi", true));
//        dshd.themHoaDon(b51.thanhToan("S002", "sang", true));

        //Menu
        String[] mainMenu = {"Quan ly sanh cuoi",
            "Quan ly dich vu",//
            "Quan ly thuc an, nuoc uong",
            "Quan li cho thue tiec",
            "Sap xep tan so thue sanh",//
            "Thong ke doanh thu"};//

        String[] menu1 = {"Xem danh sach sanh",
            "Them sanh",
            "Cap nhat thong tin sanh",
            "Xoa thong tin sanh theo ma",
            "Tra cuu sanh theo ma",
            "Tra cuu sanh theo ten, suc chua, vi tri",
            "Them thoi diem thue cho sanh"};

        String[] menu2 = {"Xem danh sach dich vu",
            "Them dich vu Karaoke",
            "Them dich vu Thue Ca Si",
            "Them dich vu Trang Tri",
            "Cap nhat thong tin dich vu",
            "Xoa thong tin dich vu theo ten",
            "Tra cuu theo ten dich vu"
        };

        String[] menu3 = {"Xem danh sach thuc an/nuoc uong",
            "Them thuc an",
            "Them do uong",
            "Xoa thuc an/nuoc uong",
            "Cap nhat thong tin thuc an/nuoc uong",
            "Tra cuu thuc an theo ten",
            "Tra cuu nuoc uong theo ten"
        };

        String[] menu4 = {
            "Them dich vu cho buoi tiec",
            "Them thuc an/nuoc uong cho buoi tiec",
            "Xuat hoa don"
        };

        String[] menu5 = {
            "Sap xep danh sach sanh theo so lan duoc thue",
            "Sap xep danh sach sanh theo so lan duoc thue theo nam"
        };

        String[] menu6 = {
            "Thong ke doanh thu theo quy",
            "Thong ke doanh thu theo thang"
        };

        boolean loop = true;
        boolean loop1 = true;

        do {
            xuatMenu(mainMenu);
            String mainChoose = CauHinh.sc.nextLine();
            switch (mainChoose) {
                case "1" -> {
                    xuatMenu(menu1);
                    String subChoose = CauHinh.sc.nextLine();
                    switch (subChoose) {
                        case "1" ->
                            danhSachSanh.hienThiDanhSachSanh();
                        case "2" -> {
                            System.out.print("Nhap ten sanh: ");
                            String tenSanh = CauHinh.sc.nextLine();
                            System.out.print("Nhap vi tri cua sanh(tang): ");
                            int viTri = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.print("Nhap suc chua cua sanh(ban): ");
                            int sucChua = Integer.parseInt(CauHinh.sc.nextLine());
                            Sanh s = new Sanh(tenSanh, viTri, sucChua);
                            danhSachSanh.themSanh(s);
                            System.out.print("Them thoi gian cua sanh\n");
                            qltdt.hienThi();
                            System.out.print("Nhap ma thoi gian thue ");
                            int ma = Integer.parseInt(CauHinh.sc.nextLine());
                            ThoiDiemThue tdt = qltdt.timThoiDiemThue(ma);
                            if (tdt != null) {
                                System.out.printf("Nhap gia thue sanh cua %s: ", s.getTenSanh());
                                double gia = Double.parseDouble(CauHinh.sc.nextLine());
                                s.themThoiGianVaGia(tdt, gia);

                            } else {
                                System.out.print("Thoi gian thue khong hop le!\n------------\n");
                            }
                        }

                        case "3" -> {
                            danhSachSanh.hienThiDanhSachSanh();
                            System.out.print("\nNhap ma sanh muon cap nhat: ");
                            String maSanh = CauHinh.sc.nextLine();
                            Sanh sanh = danhSachSanh.timKiemSanh(maSanh);
                            if (sanh != null) {
                                sanh.capNhatSanh();
                                sanh.hienThi();
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "4" -> {
                            danhSachSanh.hienThiDanhSachSanh();
                            System.out.print("\nNhap ma sanh muon xoa: ");
                            String maSanh = CauHinh.sc.nextLine();
                            danhSachSanh.xoaSanh(maSanh);
                            System.out.println("Xoa sanh thanh cong!!!!!!!\n");
                        }

                        case "5" -> {
                            danhSachSanh.hienThiDanhSachSanh();
                            System.out.print("\nNhap ma sanh muon tim: ");
                            String maSanh = CauHinh.sc.nextLine();
                            Sanh sanh = danhSachSanh.timKiemSanh(maSanh);

                            if (sanh != null) {
                                sanh.hienThi();
                                System.out.println("Tim thanh cong!!!!!!!\n");
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "6" -> {
                            danhSachSanh.hienThiDanhSachSanh();
                            System.out.print("Nhap ten sanh: ");
                            String tenSanh = CauHinh.sc.nextLine();
                            System.out.print("\nNhap vi tri cua sanh(tang): ");
                            int viTri = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.print("Nhap suc chua cua sanh(ban): ");
                            int sucChua = Integer.parseInt(CauHinh.sc.nextLine());
                            List<Sanh> sanh = danhSachSanh.timKiemSanh(tenSanh, viTri, sucChua);
                            if (sanh != null) {
                                for (Sanh s : sanh) {
                                    s.hienThi();
                                }
                                System.out.println("Tim thanh cong!!!!!!!\n");
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "7" -> {
                            boolean isRunning = true;
                            do {
                                danhSachSanh.hienThiDanhSachSanh();
                                System.out.print("Nhap ma sanh muon them thoi gian: ");
                                String maSanh = CauHinh.sc.nextLine();

                                Sanh sanh = danhSachSanh.timKiemSanh(maSanh);

                                if (sanh != null) {
                                    sanh.hienThi();
                                    System.out.print("Them thoi gian cua sanh\n");
                                    qltdt.hienThi();
                                    System.out.print("Nhap ma thoi gian thue: ");
                                    int ma = Integer.parseInt(CauHinh.sc.nextLine());
                                    ThoiDiemThue tdt = qltdt.timThoiDiemThue(ma);

                                    if (tdt != null) {
                                        System.out.print("Nhap gia thue sanh cua " + sanh.getTenSanh() + ": ");
                                        double gia = Double.parseDouble(CauHinh.sc.nextLine());
                                        sanh.themThoiGianVaGia(tdt, gia);
                                    } else {
                                        System.out.println("Thoi gian thue khong hop le!");
                                    }
                                } else {
                                    System.out.println("Khong tim thay sanh!");
                                }
                                System.out.print("Nhap \"y\" de thoat hoac nhan phim bat ki de tiep tuc them ");
                                String out = CauHinh.sc.nextLine();
                                if (out.equals("y")) {
                                    isRunning = false;
                                }
                            } while (isRunning);

                        }
                    }
                }

                case "2" -> {
                    xuatMenu(menu2);
                    String subChoose = CauHinh.sc.nextLine();
                    switch (subChoose) {
                        case "1" ->
                            qldv.hienThiDanhSachDichVu();
                        case "2" -> {
                            try {
                                qldv.themDichVu("com.phd.weddingrestaurantmanager.DichVuKaraoke");
                            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException ex) {
                                Logger.getLogger(WeddingRestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        case "3" -> {
                            try {
                                qldv.themDichVu("com.phd.weddingrestaurantmanager.DichVuThueCaSi");
                            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException ex) {
                                Logger.getLogger(WeddingRestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        case "4" -> {
                            try {
                                qldv.themDichVu("com.phd.weddingrestaurantmanager.DichVuTrangTri");
                            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException ex) {
                                Logger.getLogger(WeddingRestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        case "5" -> {
                            qldv.hienThiDanhSachDichVu();
                            System.out.print("\nNhap ten dich vu muon cap nhat: ");
                            String maDichVu = CauHinh.sc.nextLine();
                            DichVu dv = qldv.timDichVu(maDichVu);
                            if (dv != null) {
                                dv.capNhatDichVu();
                                dv.hienThi();
                            } else {
                                System.out.print("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "6" -> {
                            qldv.hienThiDanhSachDichVu();
                            System.out.print("Nhap ten dich vu can xoa : ");
                            String tenDichVu = CauHinh.sc.nextLine();

                            qldv.xoaDichVu(tenDichVu);
                        }

                        case "7" -> {
                            qldv.hienThiDanhSachDichVu();

                            System.out.print("Nhap ten dich vu can tim : ");
                            String tenDichVu = CauHinh.sc.nextLine();
                            DichVu ds = qldv.timDichVu(tenDichVu);
                            ds.hienThi();
                        }
                    }
                }

                case "3" -> {
                    xuatMenu(menu3);
                    String subChoose = CauHinh.sc.nextLine();
                    switch (subChoose) {
                        case "1" ->
                            qlsp.hienThiDanhSachSanPham();
                        case "2" -> {
                            try {
                                qlsp.themSanPham("com.phd.weddingrestaurantmanager.ThucAn");
                            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException ex) {
                                Logger.getLogger(WeddingRestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        case "3" -> {
                            try {
                                qlsp.themSanPham("com.phd.weddingrestaurantmanager.DoUong");
                            } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException ex) {
                                Logger.getLogger(WeddingRestaurantManager.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }

                        case "4" -> {
                            qlsp.hienThiDanhSachSanPham();
                            System.out.print("Nhap ten san pham can xoa : ");
                            String tenSanPham = CauHinh.sc.nextLine();

                            qlsp.xoaSanPham(tenSanPham);
                            System.out.println("Xoa san pham thanh cong!!!");
                        }

                        case "5" -> {
                            qlsp.hienThiDanhSachSanPham();
                            System.out.print("\nNhap ten san pham muon cap nhat: ");
                            String maSanPham = CauHinh.sc.nextLine();
                            SanPham sp = qlsp.timSanPham(maSanPham);
                            if (sp != null) {
                                sp.capNhatSanPham();
                                sp.hienThi();
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "6" -> {
                            System.out.print("Nhap ten thuc an can tim : ");
                            String tenThucAn = CauHinh.sc.nextLine();
                            SanPham sp = qlsp.timThucAn(tenThucAn);
                            if (sp != null) {
                                sp.hienThi();
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }

                        case "7" -> {
                            System.out.print("Nhap ten do uong can tim : ");
                            String tenDoUong = CauHinh.sc.nextLine();
                            SanPham sp = qlsp.timDoUong(tenDoUong);
                            if (sp != null) {
                                sp.hienThi();
                            } else {
                                System.out.println("Tim ko thanh cong!!!!!!!\n");
                            }
                        }
                    }
                }

                case "4" -> {
                    System.out.print("Nhap ten buoi tiec: ");
                    String tenBuoiTiec = CauHinh.sc.nextLine();
                    System.out.print("Nhap thoi diem thue: ");
                    String thoiDiem = CauHinh.sc.nextLine();
                    System.out.print("Nhap so ban: ");
                    int sucChua = Integer.parseInt(CauHinh.sc.nextLine());
                    List<Sanh> ds = danhSachSanh.timKiemSanh(sucChua, thoiDiem);
                    ds.forEach(s -> s.hienThi());
                    System.out.print("Nhap ma sanh: ");
                    String maSanh = CauHinh.sc.nextLine();
                    System.out.print("Nhập ngày tháng (dd/MM/yyyy): ");
                    String input = CauHinh.sc.nextLine();
                    LocalDate date = LocalDate.parse(input, CauHinh.formatter);
                    boolean isWeekend = isWeekend(date);
                    Sanh s10 = danhSachSanh.timKiemSanh(maSanh, thoiDiem, isWeekend);
                    BuoiTiec b = new BuoiTiec(tenBuoiTiec, date, thoiDiem, s10);

                    do {
                        xuatMenu(menu4);
                        String subChoose = CauHinh.sc.nextLine();

                        switch (subChoose) {
                            case "1" -> {
                                loop1 = true;
                                qldv.hienThiDanhSachDichVu();
                                System.out.print("Nhap ma dich Vu: ");
                                int maDichVu = Integer.parseInt(CauHinh.sc.nextLine());
                                DichVu dv = qldv.timDichVu(maDichVu);
                                b.themDichVu(dv);
                            }

                            case "2" -> {
                                String choose10 = "";
                                boolean exitLoop = false;
                                Menu menu = new Menu();
                                loop1 = true;

                                do {
                                    qlsp.hienThiDanhSachSanPham();
                                    System.out.print("Nhap ten san pham muon chon: ");
                                    String tenSanPham = CauHinh.sc.nextLine();
                                    SanPham sp = qlsp.timSanPham(tenSanPham);
                                    menu.themSanPhamVaoMenu(sp);

                                    System.out.print("Nhap \"y\" de thoat hoac nhan phim bat ki de tiep tuc them thuc an/do uong: ");
                                    choose10 = CauHinh.sc.nextLine();

                                    if (choose10.equals("y")) {
                                        exitLoop = true;
                                    }
                                } while (!exitLoop);

                                System.out.print("Nhap so luong ban: ");
                                int soLuongBan = Integer.parseInt(CauHinh.sc.nextLine());
                                System.out.print("------------------");
                                Ban ban = new Ban(menu, b, soLuongBan);
                                ban.hienThi();
                            }

                            case "3" -> {
                                loop1 = true;
                                b.thanhToan(maSanh, thoiDiem, isWeekend).hienThi();
                                b.hienThi();
                                dshd.themHoaDon(b.thanhToan(maSanh, thoiDiem, isWeekend));
                            }
                            case "0" -> {
                                loop1 = false;
                                System.out.print("Xin cam on");
                            }
                        }
                    } while (loop1);
                }

                case "5" -> {
                    xuatMenu(menu5);
                    String subChoose = CauHinh.sc.nextLine();
                    switch (subChoose) {
                        case "1" -> {
                            danhSachSanh.sapXepSanhTheoTanSo();
                            danhSachSanh.hienThiDanhSachSanhSapXep();
                        }
                        case "2" -> {
                            System.out.print("Nhap nam can sap xep: ");
                            int nam = Integer.parseInt(CauHinh.sc.nextLine());
                            danhSachSanh.sapXepSanhTheoTanSo(nam);
                            danhSachSanh.hienThiDanhSachSanhSapXep(nam);
                        }
                    }
                }

                case "6" -> {
                    xuatMenu(menu6);
                    String subChoose = CauHinh.sc.nextLine();
                    switch (subChoose) {
                        case "1" -> {
                            System.out.print("Nhap quy: ");
                            int quy = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.print("Nhap nam: ");
                            int nam = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.printf("Tong tien thong ke cua quy %d nam %d la: %.2f\n",
                                    quy, nam, dshd.tinhDoanhThu(dshd.tinhDoanhThuThang(quy, nam)));
                        }
                        case "2" -> {
                            System.out.print("Nhap thang: ");
                            int thang = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.print("Nhap nam: ");
                            int nam = Integer.parseInt(CauHinh.sc.nextLine());
                            System.out.printf("Tong tien thong ke cua thang %d nam %d la: %.2f\n",
                                    thang, nam, dshd.tinhDoanhThu(dshd.tinhDoanhThuThang(thang, nam)));
                        }
                    }
                }

                case "0" -> {
                    loop = false;
                    System.out.print("Xin cam on");
                }
            }

        } while (loop);

    }

}
