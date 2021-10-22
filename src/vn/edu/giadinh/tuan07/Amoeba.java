/*
*  created date: Oct 21, 2021
*  author: cgm
*/
package vn.edu.giadinh.tuan07;

public class Amoeba {

    String sound; //.hif

    int x;
    int y;

    Amoeba(){}

    public Amoeba(String s){
        sound = s;
    }

    public Amoeba(String s, int xx, int yy){
        sound = s;
        x = xx;
        y = yy;
    }

    void rotate(){

        //code xử lý cho các hình xoay 360
        //giống kim đồng hồ
        //1. xác tọa độ x, y
        //2. xoay theo x, y
        System.out.println("Xoay theo tọa độ x = " + x + " và y = " + y);

    }

    void playSound(){

        //code xử lý file .hif để phát ra thâm thanh
        //của 1 tâm tin .hif

        //khác với code xử lý file .aif

        System.out.println("Phát ra file âm thanh có tên " + sound);
    }
    
}
