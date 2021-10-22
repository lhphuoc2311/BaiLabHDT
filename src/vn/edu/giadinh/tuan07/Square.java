/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07;

public class Square {

    String sound;// biên object .aif

    public Square(){}

    public Square(String s){
        sound = s;
    }

    void rotate(){

        //code xử lý cho các hình xoay 360
        //giống kim đồng hồ
        //1. xác định tâm
        //2. xoay theo tâm
        System.out.println("Xoay quanh 360 độ");

    }

    void playSound(){

        //code xử lý file .aif để phát ra thâm thanh
        //của 1 tâm tin .aif

        System.out.println("Phát ra file âm thanh có tên " + sound);
    }

    
    
}
