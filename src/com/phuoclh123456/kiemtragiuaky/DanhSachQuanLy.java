/*
*  created date: Nov 04, 2021
*  author: cgm
*/
package com.phuoclh123456.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy {

    private ArrayList<Person> danhSach;

    public DanhSachQuanLy(){
        danhSach = new ArrayList<>();
    }

    /**
     * @return the danhSach
     */
    public ArrayList<Person> getDanhSach() {
        return danhSach;
    }

    /**
     * @param danhSach the danhSach to set
     */
    public void setDanhSach(ArrayList<Person> danhSach) {
        this.danhSach = danhSach;
    }

    public void them(Person person){
        danhSach.add(person);
    }

    public void inDanhSach(){
        for (Person person : danhSach) {

            System.out.println(person.toString());
            
        }
    }
    
}
