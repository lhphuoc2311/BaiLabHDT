/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class KhachHang extends Person{
    private String tenCongTy;
    private double triGiaHoaDon;
    /**
     * @param hoTen
     * @param diaChi
     * @param tenCongTy
     * @param triGiaHoaDon
     */

    public KhachHang (){}

    public KhachHang(String hoTen, String diaChi, String tenCongTy, double triGiaHoaDon) {
        super(hoTen, diaChi);
        this.tenCongTy = tenCongTy;
        this.triGiaHoaDon = triGiaHoaDon;
    }

    /**
     * @return the tenCongTy
     */
    public String getTenCongTy() {
        return tenCongTy;
    }

    /**
     * @param tenCongTy the tenCongTy to set
     */
    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    /**
     * @return the triGiaHoaDon
     */
    public double getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    /**
     * @param triGiaHoaDon the triGiaHoaDon to set
     */
    public void setTriGiaHoaDon(double triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    @Override
    public String toString() {
        
        return super.toString() + " Ten Cong ty "  + this.tenCongTy +
        " Tri Gia Hoa Don " + this.triGiaHoaDon;
    }

    

    
}
