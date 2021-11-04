/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

public class Person {

    private String hoTen;
    private String diaChi;

    

    /**
     * @param hoTen
     * @param diaChi
     */
    public Person(){}

    protected Person(String hoTen, String diaChi) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the diaChi
     */
    public String getDiaChi() {
        return diaChi;
    }

    /**
     * @param diaChi the diaChi to set
     */
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Person [diaChi=" + diaChi + ", hoTen=" + hoTen + "]";
    }

   
    
}
