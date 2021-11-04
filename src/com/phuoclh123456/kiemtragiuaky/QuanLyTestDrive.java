/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class QuanLyTestDrive {
    public static void main(String[] args) {
        DanhSachQuanLy danhSachQuanLy = new DanhSachQuanLy();

        NhanVien nhanVien = new NhanVien("Tèo", "TPHCM", 4.0f);

        //học viên

        //Khách hàng

        KhachHang khachHang = new KhachHang("Tý", "Cà Mau", "XYZ", 100_000_000);


        danhSachQuanLy.them(nhanVien);
        danhSachQuanLy.them(khachHang);

        danhSachQuanLy.inDanhSach();

    }
    
}
