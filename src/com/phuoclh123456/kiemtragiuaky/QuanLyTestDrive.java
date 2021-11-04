/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy danhSachQuanLy = new DanhSachQuanLy();

        NhanVien nhanVien = new NhanVien("Tèo", "TPHCM", 4.0f);

        HocVien hocVien = new HocVien("Tửng", "Phú Quốc", 10.0f, 10.0f);

        HocVien hocVien2 = new HocVien();

        //học viên

        //Khách hàng

        KhachHang khachHang = new KhachHang("Tý", "Cà Mau", "XYZ", 100_000_000);


        danhSachQuanLy.them(nhanVien);
        danhSachQuanLy.them(khachHang);
        danhSachQuanLy.them(hocVien);

        danhSachQuanLy.inDanhSach();

        System.out.println("so luong hoc vien " + HocVien.getSoLuongHV() );

    }
    
}
