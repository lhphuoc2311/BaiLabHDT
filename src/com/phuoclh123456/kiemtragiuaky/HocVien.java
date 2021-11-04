/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class HocVien extends Person{
    private float diemMonHoc1;
    private float diemMonHoc2;
    private static int soLuongHV;


    public HocVien(){}

    

    /**
     * @param hoTen
     * @param diaChi
     * @param diemMonHoc1
     * @param diemMonHoc2
     */
    public HocVien(String hoTen, String diaChi, float diemMonHoc1, float diemMonHoc2) {
        super(hoTen, diaChi);
        this.diemMonHoc1 = diemMonHoc1;
        this.diemMonHoc2 = diemMonHoc2;
    }



    /**
     * @return the diemMonHoc1
     */
    public float getDiemMonHoc1() {
        return diemMonHoc1;
    }
    /**
     * @param diemMonHoc1 the diemMonHoc1 to set
     */
    public void setDiemMonHoc1(float diemMonHoc1) {
        
        if(diemMonHoc1 >= 0 && diemMonHoc1 <= 10){
            this.diemMonHoc1 = diemMonHoc1;
        }else{
            System.out.println("Điểm không hợp lệ!!!");
        }
        
    }
    /**
     * @return the diemMonHoc2
     */
    public float getDiemMonHoc2() {
        return diemMonHoc2;
    }
    /**
     * @param diemMonHoc2 the diemMonHoc2 to set
     */
    public void setDiemMonHoc2(float diemMonHoc2) {
        this.diemMonHoc2 = diemMonHoc2;
    }
    /**
     * @return the soLuongHV
     */
    public static int getSoLuongHV() {
        return soLuongHV;
    }
    /**
     * @param soLuongHV the soLuongHV to set
     */
    public static void setSoLuongHV(int soLuongHV) {
        HocVien.soLuongHV = soLuongHV;
    }

    protected float diemTB(){
        return (this.diemMonHoc1 + this.diemMonHoc2) /2;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return super.toString() +  " HocVien [diemMonHoc1=" + diemMonHoc1 + ", diemMonHoc2=" + diemMonHoc2 + "]" + " Điểm TB: " + this.diemTB();
    }

    
    
    
}
