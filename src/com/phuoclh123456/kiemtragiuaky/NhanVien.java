/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class NhanVien  extends Person{
    private float heSoLuong;

    /**
     * @return the heSoLuong
     */
    public float getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public NhanVien(){}

    /**
     * @param hoTen
     * @param diaChi
     * @param heSoLuong
     */
    public NhanVien(String hoTen, String diaChi, float heSoLuong) {
        super(hoTen, diaChi);
        this.heSoLuong = heSoLuong;
    }

    protected float tinhLuong(){
        return this.heSoLuong * 1_500_000;
    }

    @Override
    public String toString() {
        return super.toString() + " Luong " + this.tinhLuong();
    }

    
}
